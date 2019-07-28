package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentCreatedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the created appointment.
  	 */
  var appointment: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the scheduler.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object AppointmentCreatedEventUIParam {
  @scala.inline
  def apply(appointment: js.Any = null, owner: js.Any = null): AppointmentCreatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (appointment != null) __obj.updateDynamic("appointment")(appointment)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[AppointmentCreatedEventUIParam]
  }
}

