package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateChangedEventUIParam extends js.Object {
  /**
  	 * Gets the name of the action. That can be one of the following: "open" - the dialog was opened. Note: the event is raised before a possible "openAnimation" started. "close" - the dialog was closed. Note: the event is raised before a possible "closeAnimation" started. "minimize" - the dialog was minimized. "maximize" - the dialog was maximized. "restore" - the dialog was restored from minimized or maximized state. "pin" - the dialog was pinned. "unpin" - the dialog was unpinned.
  	 */
  var action: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the name of the button, which triggered the event. Note: if the state was modified from the code, then "button" is undefined.
  	 */
  var button: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the boolean value of the old pin state of the dialog.
  	 */
  var oldPinned: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets the old state of the dialog, which can be one of the following: "opened", "minimized", "maximized", "closed".
  	 */
  var oldState: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the igDialog widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object StateChangedEventUIParam {
  @scala.inline
  def apply(
    action: String = null,
    button: String = null,
    oldPinned: js.UndefOr[Boolean] = js.undefined,
    oldState: String = null,
    owner: js.Any = null
  ): StateChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (button != null) __obj.updateDynamic("button")(button)
    if (!js.isUndefined(oldPinned)) __obj.updateDynamic("oldPinned")(oldPinned)
    if (oldState != null) __obj.updateDynamic("oldState")(oldState)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[StateChangedEventUIParam]
  }
}

