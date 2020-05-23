package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridCellMergingColumnSetting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Column index. This is a required property in every column setting if columnKey is not set.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
    * Column key. This is a required property in every column setting if columnIndex is not set.
    *
    */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
    * Defines when merging should be applied.
    *
    *
    * Valid values:
    * "sorting" The column will only be merged when sorted
    * "always" The column will always be merged
    * "never" No merging will be applied
    */
  var mergeOn: js.UndefOr[String] = js.undefined
  /**
    * Defines the rules merging is based on.
    *
    *
    * Valid values:
    * "duplicate" Duplicate values in the column will be merged together.
    * "null" Merging will be applied for each subsequent null value after a non-null value.
    */
  var mergeStrategy: js.UndefOr[String | js.Function] = js.undefined
}

object IgGridCellMergingColumnSetting {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    columnIndex: js.UndefOr[Double] = js.undefined,
    columnKey: String = null,
    mergeOn: String = null,
    mergeStrategy: String | js.Function = null
  ): IgGridCellMergingColumnSetting = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (mergeOn != null) __obj.updateDynamic("mergeOn")(mergeOn.asInstanceOf[js.Any])
    if (mergeStrategy != null) __obj.updateDynamic("mergeStrategy")(mergeStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridCellMergingColumnSetting]
  }
}

