package typings.htmlValidator.mod

import typings.htmlValidator.htmlValidatorStrings.`non-document-error`
import typings.htmlValidator.htmlValidatorStrings.internal
import typings.htmlValidator.htmlValidatorStrings.io
import typings.htmlValidator.htmlValidatorStrings.schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationMessageBasicNonDocumentErrorObject extends StObject {
  
  var subType: js.UndefOr[internal | io | schema] = js.undefined
  
  var `type`: `non-document-error`
}
object ValidationMessageBasicNonDocumentErrorObject {
  
  inline def apply(): ValidationMessageBasicNonDocumentErrorObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("non-document-error")
    __obj.asInstanceOf[ValidationMessageBasicNonDocumentErrorObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidationMessageBasicNonDocumentErrorObject] (val x: Self) extends AnyVal {
    
    inline def setSubType(value: internal | io | schema): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    inline def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    inline def setType(value: `non-document-error`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
