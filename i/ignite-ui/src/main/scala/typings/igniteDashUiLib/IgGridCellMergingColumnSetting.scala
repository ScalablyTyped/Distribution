package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridCellMergingColumnSetting
  extends /**
	 * Option for IgGridCellMergingColumnSetting
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Column index. This is a required property in every column setting if columnKey is not set.
  	 *
  	 */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Column key. This is a required property in every column setting if columnIndex is not set.
  	 *
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Defines when merging should be applied.
  	 *
  	 *
  	 * Valid values:
  	 * "sorting" The column will only be merged when sorted
  	 * "always" The column will always be merged
  	 * "never" No merging will be applied
  	 */
  var mergeOn: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Defines the rules merging is based on.
  	 *
  	 *
  	 * Valid values:
  	 * "duplicate" Duplicate values in the column will be merged together.
  	 * "null" Merging will be applied for each subsequent null value after a non-null value.
  	 */
  var mergeStrategy: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

object IgGridCellMergingColumnSetting {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridCellMergingColumnSetting
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    columnIndex: scala.Int | scala.Double = null,
    columnKey: java.lang.String = null,
    mergeOn: java.lang.String = null,
    mergeStrategy: java.lang.String | js.Function = null
  ): IgGridCellMergingColumnSetting = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (mergeOn != null) __obj.updateDynamic("mergeOn")(mergeOn)
    if (mergeStrategy != null) __obj.updateDynamic("mergeStrategy")(mergeStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridCellMergingColumnSetting]
  }
}

