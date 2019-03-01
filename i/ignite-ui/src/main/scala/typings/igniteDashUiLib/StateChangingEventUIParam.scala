package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateChangingEventUIParam extends js.Object {
  /**
  	 * Gets the name of the action. That can be one of the following: "open" - request to open the dialog. "close" - request to close the dialog. "minimize" - request to minimize the dialog. "maximize" - request to maximize the dialog. "restore" - request to restore the dialog from minimized or maximized state. "pin" - request to pin the dialog. "unpin" - request to unpin the dialog.
  	 */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the name of the button, which triggered the event. Note: if the state was modified from the code, then "button" is undefined.
  	 */
  var button: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the boolean value of the old pin state of the dialog.
  	 */
  var oldPinned: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the old state of the dialog, which can be one of the following: "opened", "minimized", "maximized", "closed".
  	 */
  var oldState: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the igDialog widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object StateChangingEventUIParam {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    button: java.lang.String = null,
    oldPinned: js.UndefOr[scala.Boolean] = js.undefined,
    oldState: java.lang.String = null,
    owner: js.Any = null
  ): StateChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (button != null) __obj.updateDynamic("button")(button)
    if (!js.isUndefined(oldPinned)) __obj.updateDynamic("oldPinned")(oldPinned)
    if (oldState != null) __obj.updateDynamic("oldState")(oldState)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[StateChangingEventUIParam]
  }
}

