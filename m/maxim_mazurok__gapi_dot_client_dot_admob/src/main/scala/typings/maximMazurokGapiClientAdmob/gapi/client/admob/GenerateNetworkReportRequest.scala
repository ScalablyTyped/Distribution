package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateNetworkReportRequest extends StObject {
  
  /** Network report specification. */
  var reportSpec: js.UndefOr[NetworkReportSpec] = js.native
}
object GenerateNetworkReportRequest {
  
  @scala.inline
  def apply(): GenerateNetworkReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateNetworkReportRequest]
  }
  
  @scala.inline
  implicit class GenerateNetworkReportRequestMutableBuilder[Self <: GenerateNetworkReportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportSpec(value: NetworkReportSpec): Self = StObject.set(x, "reportSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportSpecUndefined: Self = StObject.set(x, "reportSpec", js.undefined)
  }
}
