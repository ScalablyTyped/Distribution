package typings.istanbulLibReport.anon

import typings.istanbulLibReport.mod.Summarizers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<istanbul-lib-report.istanbul-lib-report.ReportBaseOptions> */
@js.native
trait PartialReportBaseOptions extends js.Object {
  
  var summarizer: js.UndefOr[Summarizers] = js.native
}
object PartialReportBaseOptions {
  
  @scala.inline
  def apply(): PartialReportBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReportBaseOptions]
  }
  
  @scala.inline
  implicit class PartialReportBaseOptionsOps[Self <: PartialReportBaseOptions] (val x: Self) extends AnyVal {
    
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
    def setSummarizer(value: Summarizers): Self = this.set("summarizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummarizer: Self = this.set("summarizer", js.undefined)
  }
}
