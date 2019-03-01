package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowingEventUIParam extends js.Object {
  /**
  	 * Gets or set the content to be shown as a string.
  	 */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the element the popover will show for.
  	 */
  var element: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the %%WidgetName%% widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the popover element showing.
  	 */
  var popover: js.UndefOr[java.lang.String] = js.undefined
}

object ShowingEventUIParam {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    element: java.lang.String = null,
    owner: js.Any = null,
    popover: java.lang.String = null
  ): ShowingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (element != null) __obj.updateDynamic("element")(element)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (popover != null) __obj.updateDynamic("popover")(popover)
    __obj.asInstanceOf[ShowingEventUIParam]
  }
}

