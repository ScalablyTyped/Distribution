package typings.jsonrpcSerializer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationPayloadObject extends PayloadObject {
  @JSName("method")
  var method_NotificationPayloadObject: String = js.native
}

object NotificationPayloadObject {
  @scala.inline
  def apply(method: String): NotificationPayloadObject = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationPayloadObject]
  }
  @scala.inline
  implicit class NotificationPayloadObjectOps[Self <: NotificationPayloadObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
  }
  
}

