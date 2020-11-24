package typings.gulpTslint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportOptions extends js.Object {
  
  var allowWarnings: js.UndefOr[Boolean] = js.native
  
  var emitError: js.UndefOr[Boolean] = js.native
  
  var reportLimit: js.UndefOr[Double] = js.native
  
  var summarizeFailureOutput: js.UndefOr[Boolean] = js.native
}
object ReportOptions {
  
  @scala.inline
  def apply(): ReportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportOptions]
  }
  
  @scala.inline
  implicit class ReportOptionsOps[Self <: ReportOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowWarnings(value: Boolean): Self = this.set("allowWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowWarnings: Self = this.set("allowWarnings", js.undefined)
    
    @scala.inline
    def setEmitError(value: Boolean): Self = this.set("emitError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitError: Self = this.set("emitError", js.undefined)
    
    @scala.inline
    def setReportLimit(value: Double): Self = this.set("reportLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportLimit: Self = this.set("reportLimit", js.undefined)
    
    @scala.inline
    def setSummarizeFailureOutput(value: Boolean): Self = this.set("summarizeFailureOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummarizeFailureOutput: Self = this.set("summarizeFailureOutput", js.undefined)
  }
}
