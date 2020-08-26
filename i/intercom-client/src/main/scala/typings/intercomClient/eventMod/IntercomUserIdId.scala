package typings.intercomClient.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntercomUserIdId extends EventIdentifier {
  var intercom_user_id: String = js.native
}

object IntercomUserIdId {
  @scala.inline
  def apply(intercom_user_id: String): IntercomUserIdId = {
    val __obj = js.Dynamic.literal(intercom_user_id = intercom_user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntercomUserIdId]
  }
  @scala.inline
  implicit class IntercomUserIdIdOps[Self <: IntercomUserIdId] (val x: Self) extends AnyVal {
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
    def setIntercom_user_id(value: String): Self = this.set("intercom_user_id", value.asInstanceOf[js.Any])
  }
  
}

