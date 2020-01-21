package typings.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequest[RequestType] extends js.Object {
  var request: RequestType | Null
}

object AnonRequest {
  @scala.inline
  def apply[RequestType](request: RequestType = null): AnonRequest[RequestType] = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequest[RequestType]]
  }
}

