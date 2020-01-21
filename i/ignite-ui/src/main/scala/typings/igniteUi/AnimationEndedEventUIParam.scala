package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationEndedEventUIParam extends js.Object {
  /**
  	 * Gets the name of the action, which triggered the animation.
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

object AnimationEndedEventUIParam {
  @scala.inline
  def apply(
    action: String = null,
    button: String = null,
    oldPinned: js.UndefOr[Boolean] = js.undefined,
    oldState: String = null,
    owner: js.Any = null
  ): AnimationEndedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (!js.isUndefined(oldPinned)) __obj.updateDynamic("oldPinned")(oldPinned.asInstanceOf[js.Any])
    if (oldState != null) __obj.updateDynamic("oldState")(oldState.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEndedEventUIParam]
  }
}

