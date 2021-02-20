package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsDataimportDeleteUploadDataRequest extends StObject {
  
  /** A list of upload UIDs. */
  var customDataImportUids: js.UndefOr[js.Array[String]] = js.native
}
object AnalyticsDataimportDeleteUploadDataRequest {
  
  @scala.inline
  def apply(): AnalyticsDataimportDeleteUploadDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsDataimportDeleteUploadDataRequest]
  }
  
  @scala.inline
  implicit class AnalyticsDataimportDeleteUploadDataRequestMutableBuilder[Self <: AnalyticsDataimportDeleteUploadDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomDataImportUids(value: js.Array[String]): Self = StObject.set(x, "customDataImportUids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataImportUidsUndefined: Self = StObject.set(x, "customDataImportUids", js.undefined)
    
    @scala.inline
    def setCustomDataImportUidsVarargs(value: String*): Self = StObject.set(x, "customDataImportUids", js.Array(value :_*))
  }
}
