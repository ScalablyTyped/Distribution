package typings.jsreportPdfUtils.mod.jsreportCoreAugmentingMod

import typings.jsreportPdfUtils.mod.JsReportPdfUtils.PdfMeta
import typings.jsreportPdfUtils.mod.JsReportPdfUtils.PdfOperation
import typings.jsreportPdfUtils.mod.JsReportPdfUtils.PdfPassword
import typings.jsreportPdfUtils.mod.JsReportPdfUtils.PdfSign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Template extends js.Object {
  
  var pdfMeta: js.UndefOr[PdfMeta] = js.native
  
  var pdfOperations: js.UndefOr[js.Array[PdfOperation]] = js.native
  
  var pdfPassword: js.UndefOr[PdfPassword] = js.native
  
  var pdfSign: js.UndefOr[PdfSign] = js.native
}
object Template {
  
  @scala.inline
  def apply(): Template = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Template]
  }
  
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
    
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
    def setPdfMeta(value: PdfMeta): Self = this.set("pdfMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdfMeta: Self = this.set("pdfMeta", js.undefined)
    
    @scala.inline
    def setPdfOperationsVarargs(value: PdfOperation*): Self = this.set("pdfOperations", js.Array(value :_*))
    
    @scala.inline
    def setPdfOperations(value: js.Array[PdfOperation]): Self = this.set("pdfOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdfOperations: Self = this.set("pdfOperations", js.undefined)
    
    @scala.inline
    def setPdfPassword(value: PdfPassword): Self = this.set("pdfPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdfPassword: Self = this.set("pdfPassword", js.undefined)
    
    @scala.inline
    def setPdfSign(value: PdfSign): Self = this.set("pdfSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdfSign: Self = this.set("pdfSign", js.undefined)
  }
}
