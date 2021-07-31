package typings.jpm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentType extends StObject {
  
  var documentType: String
  
  var documentURL: String
  
  var isEditable: Boolean
  
  var linkURL: js.UndefOr[String] = js.undefined
  
  var selectionText: js.UndefOr[String] = js.undefined
  
  var srcURL: js.UndefOr[String] = js.undefined
  
  var targetID: js.UndefOr[String] = js.undefined
  
  var targetName: String
  
  var value: js.UndefOr[String] = js.undefined
}
object DocumentType {
  
  @scala.inline
  def apply(documentType: String, documentURL: String, isEditable: Boolean, targetName: String): DocumentType = {
    val __obj = js.Dynamic.literal(documentType = documentType.asInstanceOf[js.Any], documentURL = documentURL.asInstanceOf[js.Any], isEditable = isEditable.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentType]
  }
  
  @scala.inline
  implicit class DocumentTypeMutableBuilder[Self <: DocumentType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentType(value: String): Self = StObject.set(x, "documentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentURL(value: String): Self = StObject.set(x, "documentURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEditable(value: Boolean): Self = StObject.set(x, "isEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkURL(value: String): Self = StObject.set(x, "linkURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkURLUndefined: Self = StObject.set(x, "linkURL", js.undefined)
    
    @scala.inline
    def setSelectionText(value: String): Self = StObject.set(x, "selectionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionTextUndefined: Self = StObject.set(x, "selectionText", js.undefined)
    
    @scala.inline
    def setSrcURL(value: String): Self = StObject.set(x, "srcURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcURLUndefined: Self = StObject.set(x, "srcURL", js.undefined)
    
    @scala.inline
    def setTargetID(value: String): Self = StObject.set(x, "targetID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIDUndefined: Self = StObject.set(x, "targetID", js.undefined)
    
    @scala.inline
    def setTargetName(value: String): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
