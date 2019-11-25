package typings.atGrpcGrpcDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request[RequestType] extends js.Object {
  var request: RequestType | Null
}

object Anon_Request {
  @scala.inline
  def apply[RequestType](request: RequestType = null): Anon_Request[RequestType] = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Request[RequestType]]
  }
}

