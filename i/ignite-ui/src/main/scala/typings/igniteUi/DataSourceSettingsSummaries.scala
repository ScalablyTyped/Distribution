package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceSettingsSummaries
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * A list of column settings that specifies custom summaries options per column basis
    *
    */
  var columnSettings: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Key for retrieving data from the summaries response - used only when summaries are remote
    *
    */
  var summariesResponseKey: js.UndefOr[String] = js.native
  
  /**
    * Determines when the summary values are calculated
    *
    *
    * Valid values:
    * "priortofilteringandpaging"
    * "afterfilteringbeforepaging"
    * "afterfilteringandpaging"
    */
  var summaryExecution: js.UndefOr[String] = js.native
  
  /**
    * Url key for retrieving data from response - used only when summaries are remote
    *
    */
  var summaryExprUrlKey: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether summaries will be applied locally or remotely (via a remote request)
    *
    *
    * Valid values:
    * "remote" A remote request is done and URL params encoded
    * "local" Data is paged client-side.
    */
  var `type`: js.UndefOr[String] = js.native
}
object DataSourceSettingsSummaries {
  
  @scala.inline
  def apply(): DataSourceSettingsSummaries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsSummaries]
  }
  
  @scala.inline
  implicit class DataSourceSettingsSummariesMutableBuilder[Self <: DataSourceSettingsSummaries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnSettings(value: js.Array[_]): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    @scala.inline
    def setColumnSettingsVarargs(value: js.Any*): Self = StObject.set(x, "columnSettings", js.Array(value :_*))
    
    @scala.inline
    def setSummariesResponseKey(value: String): Self = StObject.set(x, "summariesResponseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummariesResponseKeyUndefined: Self = StObject.set(x, "summariesResponseKey", js.undefined)
    
    @scala.inline
    def setSummaryExecution(value: String): Self = StObject.set(x, "summaryExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryExecutionUndefined: Self = StObject.set(x, "summaryExecution", js.undefined)
    
    @scala.inline
    def setSummaryExprUrlKey(value: String): Self = StObject.set(x, "summaryExprUrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryExprUrlKeyUndefined: Self = StObject.set(x, "summaryExprUrlKey", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
