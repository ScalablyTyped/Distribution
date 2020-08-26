package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppointmentEditingEventUIParam extends js.Object {
  /**
    * Gets a reference to the original appointment.
    */
  var appointment: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the appointment with the edited values.
    */
  var newAppointment: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object AppointmentEditingEventUIParam {
  @scala.inline
  def apply(): AppointmentEditingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentEditingEventUIParam]
  }
  @scala.inline
  implicit class AppointmentEditingEventUIParamOps[Self <: AppointmentEditingEventUIParam] (val x: Self) extends AnyVal {
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
    def setAppointment(value: js.Any): Self = this.set("appointment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppointment: Self = this.set("appointment", js.undefined)
    @scala.inline
    def setNewAppointment(value: js.Any): Self = this.set("newAppointment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewAppointment: Self = this.set("newAppointment", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

