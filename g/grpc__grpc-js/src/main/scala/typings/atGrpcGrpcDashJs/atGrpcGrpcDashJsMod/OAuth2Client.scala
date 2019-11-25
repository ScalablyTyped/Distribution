package typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod

import typings.atGrpcGrpcDashJs.Anon_Authorization
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2Client extends js.Object {
  def getRequestHeaders(): js.Promise[Anon_Authorization] = js.native
  def getRequestHeaders(url: String): js.Promise[Anon_Authorization] = js.native
  def getRequestMetadata(
    url: String,
    callback: js.Function2[/* err */ Error | Null, /* headers */ js.UndefOr[Anon_Authorization], Unit]
  ): Unit = js.native
}

