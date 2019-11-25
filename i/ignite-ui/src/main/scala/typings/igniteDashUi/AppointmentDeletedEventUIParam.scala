package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentDeletedEventUIParam extends js.Object {
  /**
  	 * Gets the id of the deleted appointment.
  	 */
  var appointmentId: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the scheduler.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object AppointmentDeletedEventUIParam {
  @scala.inline
  def apply(appointmentId: js.Any = null, owner: js.Any = null): AppointmentDeletedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (appointmentId != null) __obj.updateDynamic("appointmentId")(appointmentId.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentDeletedEventUIParam]
  }
}

