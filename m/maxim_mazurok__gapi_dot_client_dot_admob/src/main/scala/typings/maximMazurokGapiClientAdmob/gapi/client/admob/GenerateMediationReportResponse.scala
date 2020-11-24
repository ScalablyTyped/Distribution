package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateMediationReportResponse extends js.Object {
  
  /** Additional information about the generated report, such as warnings about the data. */
  var footer: js.UndefOr[ReportFooter] = js.native
  
  /** Report generation settings that describes the report contents, such as the report date range and localization settings. */
  var header: js.UndefOr[ReportHeader] = js.native
  
  /** Actual report data. */
  var row: js.UndefOr[ReportRow] = js.native
}
object GenerateMediationReportResponse {
  
  @scala.inline
  def apply(): GenerateMediationReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateMediationReportResponse]
  }
  
  @scala.inline
  implicit class GenerateMediationReportResponseOps[Self <: GenerateMediationReportResponse] (val x: Self) extends AnyVal {
    
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
    def setFooter(value: ReportFooter): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHeader(value: ReportHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setRow(value: ReportRow): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
  }
}
