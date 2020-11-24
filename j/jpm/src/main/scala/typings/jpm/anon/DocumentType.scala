package typings.jpm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentType extends js.Object {
  
  var documentType: String = js.native
  
  var documentURL: String = js.native
  
  var isEditable: Boolean = js.native
  
  var linkURL: js.UndefOr[String] = js.native
  
  var selectionText: js.UndefOr[String] = js.native
  
  var srcURL: js.UndefOr[String] = js.native
  
  var targetID: js.UndefOr[String] = js.native
  
  var targetName: String = js.native
  
  var value: js.UndefOr[String] = js.native
}
object DocumentType {
  
  @scala.inline
  def apply(documentType: String, documentURL: String, isEditable: Boolean, targetName: String): DocumentType = {
    val __obj = js.Dynamic.literal(documentType = documentType.asInstanceOf[js.Any], documentURL = documentURL.asInstanceOf[js.Any], isEditable = isEditable.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentType]
  }
  
  @scala.inline
  implicit class DocumentTypeOps[Self <: DocumentType] (val x: Self) extends AnyVal {
    
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
    def setDocumentType(value: String): Self = this.set("documentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentURL(value: String): Self = this.set("documentURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEditable(value: Boolean): Self = this.set("isEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetName(value: String): Self = this.set("targetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkURL(value: String): Self = this.set("linkURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkURL: Self = this.set("linkURL", js.undefined)
    
    @scala.inline
    def setSelectionText(value: String): Self = this.set("selectionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionText: Self = this.set("selectionText", js.undefined)
    
    @scala.inline
    def setSrcURL(value: String): Self = this.set("srcURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcURL: Self = this.set("srcURL", js.undefined)
    
    @scala.inline
    def setTargetID(value: String): Self = this.set("targetID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetID: Self = this.set("targetID", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
