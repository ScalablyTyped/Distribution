package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportFooter extends js.Object {
  
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
  implicit class ReportFooterOps[Self <: ReportFooter] (val x: Self) extends AnyVal {
    
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
    def setMatchingRowCount(value: String): Self = this.set("matchingRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchingRowCount: Self = this.set("matchingRowCount", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: ReportWarning*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[ReportWarning]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
}
