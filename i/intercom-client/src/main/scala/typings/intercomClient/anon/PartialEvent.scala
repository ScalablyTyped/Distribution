package typings.intercomClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<intercom-client.intercom-client/Event.Event> */
@js.native
trait PartialEvent extends js.Object {
  var created_at: js.UndefOr[Double] = js.native
  var email: js.UndefOr[String] = js.native
  var event_name: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var intercom_user_id: js.UndefOr[String] = js.native
  var metadata: js.UndefOr[js.Any] = js.native
  var user_id: js.UndefOr[String] = js.native
}

object PartialEvent {
  @scala.inline
  def apply(): PartialEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEvent]
  }
  @scala.inline
  implicit class PartialEventOps[Self <: PartialEvent] (val x: Self) extends AnyVal {
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
    def setCreated_at(value: Double): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEvent_name(value: String): Self = this.set("event_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent_name: Self = this.set("event_name", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIntercom_user_id(value: String): Self = this.set("intercom_user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntercom_user_id: Self = this.set("intercom_user_id", js.undefined)
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_id: Self = this.set("user_id", js.undefined)
  }
  
}

