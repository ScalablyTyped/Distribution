package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateMediationReportRequest extends StObject {
  
  /** Network report specification. */
  var reportSpec: js.UndefOr[MediationReportSpec] = js.undefined
}
object GenerateMediationReportRequest {
  
  inline def apply(): GenerateMediationReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateMediationReportRequest]
  }
  
  extension [Self <: GenerateMediationReportRequest](x: Self) {
    
    inline def setReportSpec(value: MediationReportSpec): Self = StObject.set(x, "reportSpec", value.asInstanceOf[js.Any])
    
    inline def setReportSpecUndefined: Self = StObject.set(x, "reportSpec", js.undefined)
  }
}
