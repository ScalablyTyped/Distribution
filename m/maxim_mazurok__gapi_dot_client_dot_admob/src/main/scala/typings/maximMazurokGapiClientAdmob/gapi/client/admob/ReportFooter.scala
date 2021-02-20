package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportFooter extends StObject {
  
  /**
    * Total number of rows that matched the request. Warning: This count does NOT always match the number of rows in the response. Do not make that assumption when processing the
    * response.
    */
  var matchingRowCount: js.UndefOr[String] = js.native
  
  /** Warnings associated with generation of the report. */
  var warnings: js.UndefOr[js.Array[ReportWarning]] = js.native
}
object ReportFooter {
  
  @scala.inline
  def apply(): ReportFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportFooter]
  }
  
  @scala.inline
  implicit class ReportFooterMutableBuilder[Self <: ReportFooter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchingRowCount(value: String): Self = StObject.set(x, "matchingRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchingRowCountUndefined: Self = StObject.set(x, "matchingRowCount", js.undefined)
    
    @scala.inline
    def setWarnings(value: js.Array[ReportWarning]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: ReportWarning*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
