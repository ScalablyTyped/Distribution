package typings
package jsonrpcDashSerializerLib.jsonrpcDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationPayloadObject extends PayloadObject {
  @JSName("method")
  var method_NotificationPayloadObject: java.lang.String
}

object NotificationPayloadObject {
  @scala.inline
  def apply(
    method: java.lang.String,
    params: js.Any,
    error: SerializerError = null,
    id: java.lang.String | scala.Double = null,
    result: js.Any = null
  ): NotificationPayloadObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("params")(params)
    if (error != null) __obj.updateDynamic("error")(error)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[NotificationPayloadObject]
  }
}

