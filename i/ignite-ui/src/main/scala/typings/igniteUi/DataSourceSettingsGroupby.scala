package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSettingsGroupby
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
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
  var summaries: js.UndefOr[js.Array[js.Any]] = js.undefined
  
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
  def apply(): DataSourceSettingsGroupby = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsGroupby]
  }
  
  @scala.inline
  implicit class DataSourceSettingsGroupbyMutableBuilder[Self <: DataSourceSettingsGroupby] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultCollapseState(value: Boolean): Self = StObject.set(x, "defaultCollapseState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCollapseStateUndefined: Self = StObject.set(x, "defaultCollapseState", js.undefined)
    
    @scala.inline
    def setGroupRecordKey(value: String): Self = StObject.set(x, "groupRecordKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupRecordKeyUndefined: Self = StObject.set(x, "groupRecordKey", js.undefined)
    
    @scala.inline
    def setGroupSummaryRecordKey(value: String): Self = StObject.set(x, "groupSummaryRecordKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSummaryRecordKeyUndefined: Self = StObject.set(x, "groupSummaryRecordKey", js.undefined)
    
    @scala.inline
    def setPagingMode(value: String): Self = StObject.set(x, "pagingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingModeUndefined: Self = StObject.set(x, "pagingMode", js.undefined)
    
    @scala.inline
    def setSummaries(value: js.Array[js.Any]): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummariesPosition(value: String): Self = StObject.set(x, "summariesPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummariesPositionUndefined: Self = StObject.set(x, "summariesPosition", js.undefined)
    
    @scala.inline
    def setSummariesUndefined: Self = StObject.set(x, "summaries", js.undefined)
    
    @scala.inline
    def setSummariesVarargs(value: js.Any*): Self = StObject.set(x, "summaries", js.Array(value :_*))
  }
}
