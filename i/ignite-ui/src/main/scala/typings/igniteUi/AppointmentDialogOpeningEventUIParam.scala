package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentDialogOpeningEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the appointment dialog.
  	 */
  var element: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets whether we are creating or updating an appointment.
  	 */
  var isAppointmentNew: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets a reference to the scheduler.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object AppointmentDialogOpeningEventUIParam {
  @scala.inline
  def apply(element: js.Any = null, isAppointmentNew: js.UndefOr[Boolean] = js.undefined, owner: js.Any = null): AppointmentDialogOpeningEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(isAppointmentNew)) __obj.updateDynamic("isAppointmentNew")(isAppointmentNew.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentDialogOpeningEventUIParam]
  }
}

