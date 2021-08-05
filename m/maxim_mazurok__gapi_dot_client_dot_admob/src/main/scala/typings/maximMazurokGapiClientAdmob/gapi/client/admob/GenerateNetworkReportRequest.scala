package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateNetworkReportRequest extends StObject {
  
  /** Network report specification. */
  var reportSpec: js.UndefOr[NetworkReportSpec] = js.undefined
}
object GenerateNetworkReportRequest {
  
  inline def apply(): GenerateNetworkReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateNetworkReportRequest]
  }
  
  extension [Self <: GenerateNetworkReportRequest](x: Self) {
    
    inline def setReportSpec(value: NetworkReportSpec): Self = StObject.set(x, "reportSpec", value.asInstanceOf[js.Any])
    
    inline def setReportSpecUndefined: Self = StObject.set(x, "reportSpec", js.undefined)
  }
}
