package typings
package igniteDashUiLib

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

