package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentDeletingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the appointment which is going to be deleted.
  	 */
  var appointment: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the scheduler.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object AppointmentDeletingEventUIParam {
  @scala.inline
  def apply(appointment: js.Any = null, owner: js.Any = null): AppointmentDeletingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (appointment != null) __obj.updateDynamic("appointment")(appointment)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[AppointmentDeletingEventUIParam]
  }
}

