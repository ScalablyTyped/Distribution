package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HidingEventUIParam extends js.Object {
  /**
  	 * Gets the current content displayed in the popover as a string.
  	 */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the element the popover will hide for.
  	 */
  var element: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets reference to the %%WidgetName%% widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the popover element hiding.
  	 */
  var popover: js.UndefOr[java.lang.String] = js.undefined
}

object HidingEventUIParam {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    element: java.lang.String = null,
    owner: js.Any = null,
    popover: java.lang.String = null
  ): HidingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (element != null) __obj.updateDynamic("element")(element)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (popover != null) __obj.updateDynamic("popover")(popover)
    __obj.asInstanceOf[HidingEventUIParam]
  }
}

