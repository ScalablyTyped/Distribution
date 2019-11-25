package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShownEventUIParam extends js.Object {
  /**
  	 * Gets the content that was shown as a string.
  	 */
  var content: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the element the popover showed for.
  	 */
  var element: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the %%WidgetName%% widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the popover element showing.
  	 */
  var popover: js.UndefOr[String] = js.undefined
}

object ShownEventUIParam {
  @scala.inline
  def apply(content: String = null, element: String = null, owner: js.Any = null, popover: String = null): ShownEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (popover != null) __obj.updateDynamic("popover")(popover.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShownEventUIParam]
  }
}

