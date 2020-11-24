package typings.jsreportPdfUtils.mod.JsReportPdfUtils

import typings.jsreportPdfUtils.jsreportPdfUtilsBooleans.`true`
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.HighResolution
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.LowResolution
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.NotAllowed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PdfPassword extends js.Object {
  
  var contentAccessibility: Boolean = js.native
  
  var copying: Boolean = js.native
  
  var documentAssembly: `true` = js.native
  
  var fillingForms: Boolean = js.native
  
  var modifying: Boolean = js.native
  
  var ownerPassword: String = js.native
  
  var password: String = js.native
  
  var printing: HighResolution | NotAllowed | LowResolution = js.native
}
object PdfPassword {
  
  @scala.inline
  def apply(
    contentAccessibility: Boolean,
    copying: Boolean,
    documentAssembly: `true`,
    fillingForms: Boolean,
    modifying: Boolean,
    ownerPassword: String,
    password: String,
    printing: HighResolution | NotAllowed | LowResolution
  ): PdfPassword = {
    val __obj = js.Dynamic.literal(contentAccessibility = contentAccessibility.asInstanceOf[js.Any], copying = copying.asInstanceOf[js.Any], documentAssembly = documentAssembly.asInstanceOf[js.Any], fillingForms = fillingForms.asInstanceOf[js.Any], modifying = modifying.asInstanceOf[js.Any], ownerPassword = ownerPassword.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], printing = printing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PdfPassword]
  }
  
  @scala.inline
  implicit class PdfPasswordOps[Self <: PdfPassword] (val x: Self) extends AnyVal {
    
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
    def setContentAccessibility(value: Boolean): Self = this.set("contentAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopying(value: Boolean): Self = this.set("copying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentAssembly(value: `true`): Self = this.set("documentAssembly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillingForms(value: Boolean): Self = this.set("fillingForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifying(value: Boolean): Self = this.set("modifying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerPassword(value: String): Self = this.set("ownerPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrinting(value: HighResolution | NotAllowed | LowResolution): Self = this.set("printing", value.asInstanceOf[js.Any])
  }
}
