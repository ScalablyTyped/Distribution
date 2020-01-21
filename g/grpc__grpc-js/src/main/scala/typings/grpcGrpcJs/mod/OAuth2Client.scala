package typings.grpcGrpcJs.mod

import typings.grpcGrpcJs.AnonAuthorization
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2Client extends js.Object {
  def getRequestHeaders(): js.Promise[AnonAuthorization] = js.native
  def getRequestHeaders(url: String): js.Promise[AnonAuthorization] = js.native
  def getRequestMetadata(
    url: String,
    callback: js.Function2[/* err */ Error | Null, /* headers */ js.UndefOr[AnonAuthorization], Unit]
  ): Unit = js.native
}

