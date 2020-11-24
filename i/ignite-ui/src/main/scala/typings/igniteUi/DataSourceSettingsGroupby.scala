package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceSettingsGroupby
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Default collapse state
    *
    */
  var defaultCollapseState: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the property that determines whether a record from the group data view is a group record.
    *
    */
  var groupRecordKey: js.UndefOr[String] = js.native
  
  /**
    * The name of the property that determines whether a record from the group data view is a summary group record.
    *
    */
  var groupSummaryRecordKey: js.UndefOr[String] = js.native
  
  /**
    * . Specifies how paging should be applied when there is at least one grouped column
    *
    *
    * Valid values:
    * "allRecords" Paging is applied for all records - data and non-data records(like group-by records)
    * "dataRecordsOnly" Paging is applied ONLY for data records. Non-data records are disregarded in paging calculations.
    */
  var pagingMode: js.UndefOr[String] = js.native
  
  /**
    * Array of objects containing the summaries for each field.
    * Each summary object has the following format { field:"fieldName", summaryFunctions: [] }, where the summaryFunctions arrays can contain either a summary name (avg, sum, count etc.) or a custom function for caclulating a custom summary.
    *
    */
  var summaries: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Specifies the postion for the summaries for each field inside each group.
    *
    *
    * Valid values:
    * "top" One summary row will be displayed at the top for each group
    * "bottom"  One summary row will be displayed at the bottom for each group
    * "both" Two summary rows will be be display for each group. One on the top and one on the bottom.
    */
  var summariesPosition: js.UndefOr[String] = js.native
}
object DataSourceSettingsGroupby {
  
  @scala.inline
  def apply(): DataSourceSettingsGroupby = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsGroupby]
  }
  
  @scala.inline
  implicit class DataSourceSettingsGroupbyOps[Self <: DataSourceSettingsGroupby] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultCollapseState(value: Boolean): Self = this.set("defaultCollapseState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCollapseState: Self = this.set("defaultCollapseState", js.undefined)
    
    @scala.inline
    def setGroupRecordKey(value: String): Self = this.set("groupRecordKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupRecordKey: Self = this.set("groupRecordKey", js.undefined)
    
    @scala.inline
    def setGroupSummaryRecordKey(value: String): Self = this.set("groupSummaryRecordKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupSummaryRecordKey: Self = this.set("groupSummaryRecordKey", js.undefined)
    
    @scala.inline
    def setPagingMode(value: String): Self = this.set("pagingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagingMode: Self = this.set("pagingMode", js.undefined)
    
    @scala.inline
    def setSummariesVarargs(value: js.Any*): Self = this.set("summaries", js.Array(value :_*))
    
    @scala.inline
    def setSummaries(value: js.Array[_]): Self = this.set("summaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaries: Self = this.set("summaries", js.undefined)
    
    @scala.inline
    def setSummariesPosition(value: String): Self = this.set("summariesPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummariesPosition: Self = this.set("summariesPosition", js.undefined)
  }
}
