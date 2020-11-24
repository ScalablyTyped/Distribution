package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateMediationReportRequest extends js.Object {
  
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
  implicit class GenerateMediationReportRequestOps[Self <: GenerateMediationReportRequest] (val x: Self) extends AnyVal {
    
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
    def setReportSpec(value: MediationReportSpec): Self = this.set("reportSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportSpec: Self = this.set("reportSpec", js.undefined)
  }
}
