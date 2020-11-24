package typings.jsreportDocx.mod.JsReportDocx

import typings.jsreportDocx.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocxTemplate extends js.Object {
  
  var templateAsetShortid: js.UndefOr[String] = js.native
  
  var templateAsset: js.UndefOr[Content] = js.native
}
object DocxTemplate {
  
  @scala.inline
  def apply(): DocxTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocxTemplate]
  }
  
  @scala.inline
  implicit class DocxTemplateOps[Self <: DocxTemplate] (val x: Self) extends AnyVal {
    
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
    def setTemplateAsetShortid(value: String): Self = this.set("templateAsetShortid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateAsetShortid: Self = this.set("templateAsetShortid", js.undefined)
    
    @scala.inline
    def setTemplateAsset(value: Content): Self = this.set("templateAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateAsset: Self = this.set("templateAsset", js.undefined)
  }
}
