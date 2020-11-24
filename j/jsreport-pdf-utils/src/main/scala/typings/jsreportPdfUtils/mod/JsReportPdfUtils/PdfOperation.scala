package typings.jsreportPdfUtils.mod.JsReportPdfUtils

import typings.jsreportCore.mod.Template
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.append
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.merge
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.prepend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PdfOperation extends js.Object {
  
  var mergeWholeDocument: js.UndefOr[Boolean] = js.native
  
  var renderForEveryPage: js.UndefOr[Boolean] = js.native
  
  var template: js.UndefOr[Template] = js.native
  
  var templateShortid: js.UndefOr[String] = js.native
  
  var `type`: merge | append | prepend = js.native
}
object PdfOperation {
  
  @scala.inline
  def apply(`type`: merge | append | prepend): PdfOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PdfOperation]
  }
  
  @scala.inline
  implicit class PdfOperationOps[Self <: PdfOperation] (val x: Self) extends AnyVal {
    
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
    def setType(value: merge | append | prepend): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeWholeDocument(value: Boolean): Self = this.set("mergeWholeDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeWholeDocument: Self = this.set("mergeWholeDocument", js.undefined)
    
    @scala.inline
    def setRenderForEveryPage(value: Boolean): Self = this.set("renderForEveryPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderForEveryPage: Self = this.set("renderForEveryPage", js.undefined)
    
    @scala.inline
    def setTemplate(value: Template): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateShortid(value: String): Self = this.set("templateShortid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateShortid: Self = this.set("templateShortid", js.undefined)
  }
}
