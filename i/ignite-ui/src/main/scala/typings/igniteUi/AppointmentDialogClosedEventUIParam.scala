package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppointmentDialogClosedEventUIParam extends js.Object {
  /**
    * Gets a reference to the appointment dialog.
    */
  var element: js.UndefOr[js.Any] = js.native
  /**
    * Gets whether we are creating or updating an appointment.
    */
  var isAppointmentNew: js.UndefOr[Boolean] = js.native
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object AppointmentDialogClosedEventUIParam {
  @scala.inline
  def apply(): AppointmentDialogClosedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentDialogClosedEventUIParam]
  }
  @scala.inline
  implicit class AppointmentDialogClosedEventUIParamOps[Self <: AppointmentDialogClosedEventUIParam] (val x: Self) extends AnyVal {
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
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setIsAppointmentNew(value: Boolean): Self = this.set("isAppointmentNew", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAppointmentNew: Self = this.set("isAppointmentNew", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

