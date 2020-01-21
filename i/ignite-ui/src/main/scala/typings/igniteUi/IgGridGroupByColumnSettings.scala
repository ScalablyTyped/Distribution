package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridGroupByColumnSettings
  extends /**
	 * Option for IgGridGroupByColumnSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Enables/disables grouping a column from the UI. By default all columns can be grouped.
  	 *
  	 */
  var allowGrouping: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Reference/name of a function (string or function) used for custom comparison.
  	 * The function accepts the following arguments:
  	 * val1 - the first value to compare
  	 * val2 - the second value to compare
  	 * recordsData - an object having three properties: fieldName - the name of the sorted field; record1 - first record to compare; record2 - second record to compare
  	 * The function returns the following numeric value:
  	 * 0 - indicating that values are equal
  	 * 1 - indicating that val1 > val2
  	 * -1 - indicating that val1 < val2
  	 *
  	 *
  	 * Valid values:
  	 * "string" the name of the function as a string located in the global window object.
  	 * "function" function which will be used for custom comparison.
  	 */
  var compareFunc: js.UndefOr[String | js.Function] = js.undefined
  /**
  	 * Specifies the sort order - ascending or descending when the column is initially grouped ([isGroupBy](ui.iggridgroupby#options:columnSettings.isGroupBy) = true).
  	 *
  	 */
  var dir: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Specifies a custom group by function, which accepts the column setting, the first and the second value to compare and returns bool. This option is deprecated - please use option [compareFunc](ui.iggridgroupby#options:columnSettings.compareFunc) instead.
  	 */
  var groupComparerFunction: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Reference/name of a function (string or function) which will be used for formatting the cell values. The function should accept a value from the grouped column and return the new formatted value in the label of the row.
  	 *
  	 *
  	 * Valid values:
  	 * "string" the name of the function as a string located in the global window object.
  	 * "function" which will be used for formatting the cell values.
  	 */
  var groupLabelFormatter: js.UndefOr[String | js.Function] = js.undefined
  /**
  	 * Enables/disables default summaries per group data island or specifies summaries that are applied to specific column no matter the group.
  	 *
  	 */
  var groupSummaries: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Specifies the initial column grouped state.
  	 *
  	 */
  var isGroupBy: js.UndefOr[Boolean] = js.undefined
  /**
  	 * A list of aggregation functions to calculate on the column values for each group. When not specified the default aggregate function is "count".
  	 *
  	 */
  var summaries: js.UndefOr[IgGridGroupByColumnSettingsSummaries] = js.undefined
}

object IgGridGroupByColumnSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridGroupByColumnSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowGrouping: js.UndefOr[Boolean] = js.undefined,
    compareFunc: String | js.Function = null,
    dir: js.Any = null,
    groupComparerFunction: js.Function = null,
    groupLabelFormatter: String | js.Function = null,
    groupSummaries: js.Any = null,
    isGroupBy: js.UndefOr[Boolean] = js.undefined,
    summaries: IgGridGroupByColumnSettingsSummaries = null
  ): IgGridGroupByColumnSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowGrouping)) __obj.updateDynamic("allowGrouping")(allowGrouping.asInstanceOf[js.Any])
    if (compareFunc != null) __obj.updateDynamic("compareFunc")(compareFunc.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (groupComparerFunction != null) __obj.updateDynamic("groupComparerFunction")(groupComparerFunction.asInstanceOf[js.Any])
    if (groupLabelFormatter != null) __obj.updateDynamic("groupLabelFormatter")(groupLabelFormatter.asInstanceOf[js.Any])
    if (groupSummaries != null) __obj.updateDynamic("groupSummaries")(groupSummaries.asInstanceOf[js.Any])
    if (!js.isUndefined(isGroupBy)) __obj.updateDynamic("isGroupBy")(isGroupBy.asInstanceOf[js.Any])
    if (summaries != null) __obj.updateDynamic("summaries")(summaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridGroupByColumnSettings]
  }
}

