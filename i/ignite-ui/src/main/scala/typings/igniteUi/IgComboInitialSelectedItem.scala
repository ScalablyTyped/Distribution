package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgComboInitialSelectedItem
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Optional="true" Index of item in the list. The index should be greater than -1 and less than the count of the [items](ui.igcombo#methods:items) in the list (rows in dataSource).
    *
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * Optional="true" Value matching the [valueKey](ui.igcombo#options:valueKey) property of the item.
    *
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IgComboInitialSelectedItem {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    index: js.UndefOr[Double] = js.undefined,
    value: js.Any = null
  ): IgComboInitialSelectedItem = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgComboInitialSelectedItem]
  }
}

