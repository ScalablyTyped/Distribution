package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateNetworkReportResponse extends StObject {
  
  /** Additional information about the generated report, such as warnings about the data. */
  var footer: js.UndefOr[ReportFooter] = js.undefined
  
  /** Report generation settings that describes the report contents, such as the report date range and localization settings. */
  var header: js.UndefOr[ReportHeader] = js.undefined
  
  /** Actual report data. */
  var row: js.UndefOr[ReportRow] = js.undefined
}
object GenerateNetworkReportResponse {
  
  inline def apply(): GenerateNetworkReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateNetworkReportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateNetworkReportResponse] (val x: Self) extends AnyVal {
    
    inline def setFooter(value: ReportFooter): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeader(value: ReportHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setRow(value: ReportRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
