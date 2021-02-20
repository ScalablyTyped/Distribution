package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateMediationReportRequest extends StObject {
  
  /** Network report specification. */
  var reportSpec: js.UndefOr[MediationReportSpec] = js.native
}
object GenerateMediationReportRequest {
  
  @scala.inline
  def apply(): GenerateMediationReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateMediationReportRequest]
  }
  
  @scala.inline
  implicit class GenerateMediationReportRequestMutableBuilder[Self <: GenerateMediationReportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportSpec(value: MediationReportSpec): Self = StObject.set(x, "reportSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportSpecUndefined: Self = StObject.set(x, "reportSpec", js.undefined)
  }
}
