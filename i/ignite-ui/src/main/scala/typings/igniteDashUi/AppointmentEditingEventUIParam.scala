package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentEditingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the original appointment.
  	 */
  var appointment: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the appointment with the edited values.
  	 */
  var newAppointment: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the scheduler.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object AppointmentEditingEventUIParam {
  @scala.inline
  def apply(appointment: js.Any = null, newAppointment: js.Any = null, owner: js.Any = null): AppointmentEditingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (appointment != null) __obj.updateDynamic("appointment")(appointment.asInstanceOf[js.Any])
    if (newAppointment != null) __obj.updateDynamic("newAppointment")(newAppointment.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentEditingEventUIParam]
  }
}

