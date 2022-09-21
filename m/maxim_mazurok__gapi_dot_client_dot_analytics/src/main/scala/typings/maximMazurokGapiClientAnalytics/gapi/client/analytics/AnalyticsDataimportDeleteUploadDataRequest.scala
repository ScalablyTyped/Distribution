package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsDataimportDeleteUploadDataRequest extends StObject {
  
  /** A list of upload UIDs. */
  var customDataImportUids: js.UndefOr[js.Array[String]] = js.undefined
}
object AnalyticsDataimportDeleteUploadDataRequest {
  
  inline def apply(): AnalyticsDataimportDeleteUploadDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsDataimportDeleteUploadDataRequest]
  }
  
  extension [Self <: AnalyticsDataimportDeleteUploadDataRequest](x: Self) {
    
    inline def setCustomDataImportUids(value: js.Array[String]): Self = StObject.set(x, "customDataImportUids", value.asInstanceOf[js.Any])
    
    inline def setCustomDataImportUidsUndefined: Self = StObject.set(x, "customDataImportUids", js.undefined)
    
    inline def setCustomDataImportUidsVarargs(value: String*): Self = StObject.set(x, "customDataImportUids", js.Array(value*))
  }
}
