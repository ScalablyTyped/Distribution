package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSettingsSummaries
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * A list of column settings that specifies custom summaries options per column basis
    *
    */
  var columnSettings: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Key for retrieving data from the summaries response - used only when summaries are remote
    *
    */
  var summariesResponseKey: js.UndefOr[String] = js.undefined
  
  /**
    * Determines when the summary values are calculated
    *
    *
    * Valid values:
    * "priortofilteringandpaging"
    * "afterfilteringbeforepaging"
    * "afterfilteringandpaging"
    */
  var summaryExecution: js.UndefOr[String] = js.undefined
  
  /**
    * Url key for retrieving data from response - used only when summaries are remote
    *
    */
  var summaryExprUrlKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether summaries will be applied locally or remotely (via a remote request)
    *
    *
    * Valid values:
    * "remote" A remote request is done and URL params encoded
    * "local" Data is paged client-side.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object DataSourceSettingsSummaries {
  
  inline def apply(): DataSourceSettingsSummaries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsSummaries]
  }
  
  extension [Self <: DataSourceSettingsSummaries](x: Self) {
    
    inline def setColumnSettings(value: js.Array[Any]): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    inline def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    inline def setColumnSettingsVarargs(value: Any*): Self = StObject.set(x, "columnSettings", js.Array(value*))
    
    inline def setSummariesResponseKey(value: String): Self = StObject.set(x, "summariesResponseKey", value.asInstanceOf[js.Any])
    
    inline def setSummariesResponseKeyUndefined: Self = StObject.set(x, "summariesResponseKey", js.undefined)
    
    inline def setSummaryExecution(value: String): Self = StObject.set(x, "summaryExecution", value.asInstanceOf[js.Any])
    
    inline def setSummaryExecutionUndefined: Self = StObject.set(x, "summaryExecution", js.undefined)
    
    inline def setSummaryExprUrlKey(value: String): Self = StObject.set(x, "summaryExprUrlKey", value.asInstanceOf[js.Any])
    
    inline def setSummaryExprUrlKeyUndefined: Self = StObject.set(x, "summaryExprUrlKey", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
