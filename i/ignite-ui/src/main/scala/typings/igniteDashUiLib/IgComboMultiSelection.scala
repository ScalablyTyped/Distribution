package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgComboMultiSelection
  extends /**
	 * Option for IgComboMultiSelection
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Set addWithKeyModifier to true to disable the additive selection, then additive selection can be done by ctrl + mouse click / enter.
  	 *
  	 */
  var addWithKeyModifier: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set enabled to true to turn multi selection on. Set to true by default when target element for the combo is a select with the multiple attribute set.
  	 *
  	 */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Use itemSeparator to set what string to be rendered between items in field.
  	 *
  	 */
  var itemSeparator: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set showCheckboxes to true to render check boxes in front of each drop down item.
  	 *
  	 */
  var showCheckboxes: js.UndefOr[scala.Boolean] = js.undefined
}

object IgComboMultiSelection {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgComboMultiSelection
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    addWithKeyModifier: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    itemSeparator: java.lang.String = null,
    showCheckboxes: js.UndefOr[scala.Boolean] = js.undefined
  ): IgComboMultiSelection = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(addWithKeyModifier)) __obj.updateDynamic("addWithKeyModifier")(addWithKeyModifier)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (itemSeparator != null) __obj.updateDynamic("itemSeparator")(itemSeparator)
    if (!js.isUndefined(showCheckboxes)) __obj.updateDynamic("showCheckboxes")(showCheckboxes)
    __obj.asInstanceOf[IgComboMultiSelection]
  }
}

