package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataSourceSettingsGroupby
  extends /**
	 * Option for DataSourceSettingsGroupby
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Default collapse state
  	 *
  	 */
  var defaultCollapseState: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The name of the property that determines whether a record from the group data view is a group record.
  	 *
  	 */
  var groupRecordKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The name of the property that determines whether a record from the group data view is a summary group record.
  	 *
  	 */
  var groupSummaryRecordKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * . Specifies how paging should be applied when there is at least one grouped column
  	 *
  	 *
  	 * Valid values:
  	 * "allRecords" Paging is applied for all records - data and non-data records(like group-by records)
  	 * "dataRecordsOnly" Paging is applied ONLY for data records. Non-data records are disregarded in paging calculations.
  	 */
  var pagingMode: js.UndefOr[java.lang.String] = js.undefined
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
  var summariesPosition: js.UndefOr[java.lang.String] = js.undefined
}

