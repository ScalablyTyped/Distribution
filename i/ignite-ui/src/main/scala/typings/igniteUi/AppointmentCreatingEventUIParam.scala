package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentCreatingEventUIParam extends js.Object {
  /**
    * Gets a reference to the appointment which is going to be created.
    */
  var appointment: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object AppointmentCreatingEventUIParam {
  @scala.inline
  def apply(appointment: js.Any = null, owner: js.Any = null): AppointmentCreatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (appointment != null) __obj.updateDynamic("appointment")(appointment.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentCreatingEventUIParam]
  }
}

