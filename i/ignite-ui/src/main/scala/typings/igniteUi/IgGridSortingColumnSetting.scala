package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridSortingColumnSetting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Enables/disables sorting on the specified column. By default all columns are sortable.
    *
    */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /**
    * Identifies the grid column by index. Either key or index must be set in every column setting.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
    * Identifies the grid column by key. Either key or index must be set in every column setting.
    *
    */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
    * Reference to a function (string or function) used for custom comparison.
    * The function accepts the following arguments:
    * val1 - the first value to compare,
    * val2 - the second value to compare,
    * recordsData (optional) - an object having three properties: fieldName - the name of the sorted field; record1 - first record to compare; record2 - second record to compare.
    * The function returns the following numeric value:
    * 0 - indicating that values are equal,
    * 1 - indicating that val1 > val2,
    * -1 - indicating that val1 < val2.
    *
    *
    * Valid values:
    * "string" The name of the function as a string located in the global window object.
    * "function" Function which will be used for custom comparison.
    */
  var compareFunc: js.UndefOr[String | js.Function] = js.undefined
  /**
    * The current (or default) sort direction. If this setting is specified, the column will be rendered sorted according to this option.
    *
    *
    * Valid values:
    * "asc" The initial sort of the column data will be in ascending order.
    * "desc" The initial sort of the column data will be in descending order.
    */
  var currentSortDirection: js.UndefOr[String] = js.undefined
  /**
    * This will be the first sort direction when the column hasn't been sorted before.
    *
    *
    * Valid values:
    * "asc" The first sort of the column data will be in ascending order.
    * "desc" The first sort of the column data will be in descending order.
    */
  var firstSortDirection: js.UndefOr[String] = js.undefined
}

object IgGridSortingColumnSetting {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    allowSorting: js.UndefOr[Boolean] = js.undefined,
    columnIndex: js.UndefOr[Double] = js.undefined,
    columnKey: String = null,
    compareFunc: String | js.Function = null,
    currentSortDirection: String = null,
    firstSortDirection: String = null
  ): IgGridSortingColumnSetting = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (compareFunc != null) __obj.updateDynamic("compareFunc")(compareFunc.asInstanceOf[js.Any])
    if (currentSortDirection != null) __obj.updateDynamic("currentSortDirection")(currentSortDirection.asInstanceOf[js.Any])
    if (firstSortDirection != null) __obj.updateDynamic("firstSortDirection")(firstSortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridSortingColumnSetting]
  }
}

