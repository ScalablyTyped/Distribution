package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTooltipEventUIParam extends js.Object {
  /**
  	 * Used to obtain reference to jquery object which represents tooltip. Value of that member can be replaced by custom element.
  	 */
  var element: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain reference to item. Value of that member can be modified or replaced by custom item.
  	 */
  var item: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain reference to chart widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain html of tooltip. Value of that member can be modified. If modified value is null or empty string, then current content of tooltip keeps old value.
  	 */
  var text: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain left position of tooltip in pixels relative to widget. Value of that member can be modified.
  	 */
  var x: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain top position of tooltip in pixels relative to widget. Value of that member can be modified.
  	 */
  var y: js.UndefOr[js.Any] = js.undefined
}

object UpdateTooltipEventUIParam {
  @scala.inline
  def apply(
    element: js.Any = null,
    item: js.Any = null,
    owner: js.Any = null,
    text: js.Any = null,
    x: js.Any = null,
    y: js.Any = null
  ): UpdateTooltipEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTooltipEventUIParam]
  }
}

