package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateMediationReportResponse extends StObject {
  
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
  implicit class GenerateMediationReportResponseMutableBuilder[Self <: GenerateMediationReportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFooter(value: ReportFooter): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setHeader(value: ReportHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setRow(value: ReportRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
