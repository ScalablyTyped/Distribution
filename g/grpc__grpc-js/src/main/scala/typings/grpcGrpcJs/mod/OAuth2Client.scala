package typings.grpcGrpcJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2Client extends js.Object {
  def getRequestHeaders(): js.Promise[StringDictionary[String]] = js.native
  def getRequestHeaders(url: String): js.Promise[StringDictionary[String]] = js.native
  def getRequestMetadata(
    url: String,
    callback: js.Function2[/* err */ Error | Null, /* headers */ js.UndefOr[StringDictionary[String]], Unit]
  ): Unit = js.native
}

