package typings.jsonrpcDashSerializer.jsonrpcDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationPayloadObject extends PayloadObject {
  @JSName("method")
  var method_NotificationPayloadObject: String
}

object NotificationPayloadObject {
  @scala.inline
  def apply(
    method: String,
    params: js.Any,
    error: SerializerError = null,
    id: String | Double = null,
    result: js.Any = null
  ): NotificationPayloadObject = {
    val __obj = js.Dynamic.literal(method = method, params = params)
    if (error != null) __obj.updateDynamic("error")(error)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[NotificationPayloadObject]
  }
}

