package typings.jsonrpcSerializer.mod

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
    error: SerializerError = null,
    id: String | Double = null,
    params: js.Any = null,
    result: js.Any = null
  ): NotificationPayloadObject = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationPayloadObject]
  }
}

