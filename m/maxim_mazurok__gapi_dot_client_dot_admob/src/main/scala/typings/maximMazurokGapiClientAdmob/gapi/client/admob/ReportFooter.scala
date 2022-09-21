package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportFooter extends StObject {
  
  /**
    * Total number of rows that matched the request. Warning: This count does NOT always match the number of rows in the response. Do not make that assumption when processing the
    * response.
    */
  var matchingRowCount: js.UndefOr[String] = js.undefined
  
  /** Warnings associated with generation of the report. */
  var warnings: js.UndefOr[js.Array[ReportWarning]] = js.undefined
}
object ReportFooter {
  
  inline def apply(): ReportFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportFooter]
  }
  
  extension [Self <: ReportFooter](x: Self) {
    
    inline def setMatchingRowCount(value: String): Self = StObject.set(x, "matchingRowCount", value.asInstanceOf[js.Any])
    
    inline def setMatchingRowCountUndefined: Self = StObject.set(x, "matchingRowCount", js.undefined)
    
    inline def setWarnings(value: js.Array[ReportWarning]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: ReportWarning*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
