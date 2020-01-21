package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSettingsGroupby
  extends /**
	 * Option for DataSourceSettingsGroupby
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Default collapse state
  	 *
  	 */
  var defaultCollapseState: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The name of the property that determines whether a record from the group data view is a group record.
  	 *
  	 */
  var groupRecordKey: js.UndefOr[String] = js.undefined
  /**
  	 * The name of the property that determines whether a record from the group data view is a summary group record.
  	 *
  	 */
  var groupSummaryRecordKey: js.UndefOr[String] = js.undefined
  /**
  	 * . Specifies how paging should be applied when there is at least one grouped column
  	 *
  	 *
  	 * Valid values:
  	 * "allRecords" Paging is applied for all records - data and non-data records(like group-by records)
  	 * "dataRecordsOnly" Paging is applied ONLY for data records. Non-data records are disregarded in paging calculations.
  	 */
  var pagingMode: js.UndefOr[String] = js.undefined
  /**
  	 * Array of objects containing the summaries for each field.
  	 * Each summary object has the following format { field:"fieldName", summaryFunctions: [] }, where the summaryFunctions arrays can contain either a summary name (avg, sum, count etc.) or a custom function for caclulating a custom summary.
  	 *
  	 */
  var summaries: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Specifies the postion for the summaries for each field inside each group.
  	 *
  	 *
  	 * Valid values:
  	 * "top" One summary row will be displayed at the top for each group
  	 * "bottom"  One summary row will be displayed at the bottom for each group
  	 * "both" Two summary rows will be be display for each group. One on the top and one on the bottom.
  	 */
  var summariesPosition: js.UndefOr[String] = js.undefined
}

object DataSourceSettingsGroupby {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for DataSourceSettingsGroupby
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    defaultCollapseState: js.UndefOr[Boolean] = js.undefined,
    groupRecordKey: String = null,
    groupSummaryRecordKey: String = null,
    pagingMode: String = null,
    summaries: js.Array[_] = null,
    summariesPosition: String = null
  ): DataSourceSettingsGroupby = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(defaultCollapseState)) __obj.updateDynamic("defaultCollapseState")(defaultCollapseState.asInstanceOf[js.Any])
    if (groupRecordKey != null) __obj.updateDynamic("groupRecordKey")(groupRecordKey.asInstanceOf[js.Any])
    if (groupSummaryRecordKey != null) __obj.updateDynamic("groupSummaryRecordKey")(groupSummaryRecordKey.asInstanceOf[js.Any])
    if (pagingMode != null) __obj.updateDynamic("pagingMode")(pagingMode.asInstanceOf[js.Any])
    if (summaries != null) __obj.updateDynamic("summaries")(summaries.asInstanceOf[js.Any])
    if (summariesPosition != null) __obj.updateDynamic("summariesPosition")(summariesPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSettingsGroupby]
  }
}

