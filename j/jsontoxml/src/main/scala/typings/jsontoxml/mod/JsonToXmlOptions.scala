package typings.jsontoxml.mod

import typings.jsontoxml.anon.Standalone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonToXmlOptions extends js.Object {
  
  var docType: js.UndefOr[String] = js.native
  
  var escape: js.UndefOr[Boolean] = js.native
  
  var html: js.UndefOr[Boolean] = js.native
  
  var indent: js.UndefOr[String] = js.native
  
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  var removeIllegalNameCharacters: js.UndefOr[Boolean] = js.native
  
  var xmlHeader: js.UndefOr[Boolean | Standalone] = js.native
}
object JsonToXmlOptions {
  
  @scala.inline
  def apply(): JsonToXmlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonToXmlOptions]
  }
  
  @scala.inline
  implicit class JsonToXmlOptionsOps[Self <: JsonToXmlOptions] (val x: Self) extends AnyVal {
    
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
    def setDocType(value: String): Self = this.set("docType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocType: Self = this.set("docType", js.undefined)
    
    @scala.inline
    def setEscape(value: Boolean): Self = this.set("escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setRemoveIllegalNameCharacters(value: Boolean): Self = this.set("removeIllegalNameCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveIllegalNameCharacters: Self = this.set("removeIllegalNameCharacters", js.undefined)
    
    @scala.inline
    def setXmlHeader(value: Boolean | Standalone): Self = this.set("xmlHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlHeader: Self = this.set("xmlHeader", js.undefined)
  }
}
