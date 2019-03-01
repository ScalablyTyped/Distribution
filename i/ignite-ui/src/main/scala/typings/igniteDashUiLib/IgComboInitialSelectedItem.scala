package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgComboInitialSelectedItem
  extends /**
	 * Option for IgComboInitialSelectedItem
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Optional="true" Index of item in the list. The index should be greater than -1 and less than the count of the [items](ui.igcombo#methods:items) in the list (rows in dataSource).
  	 *
  	 */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Optional="true" Value matching the [valueKey](ui.igcombo#options:valueKey) property of the item.
  	 *
  	 */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IgComboInitialSelectedItem {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgComboInitialSelectedItem
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    index: scala.Int | scala.Double = null,
    value: js.Any = null
  ): IgComboInitialSelectedItem = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IgComboInitialSelectedItem]
  }
}

