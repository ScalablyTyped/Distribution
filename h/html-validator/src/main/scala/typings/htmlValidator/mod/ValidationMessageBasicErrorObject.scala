package typings.htmlValidator.mod

import typings.htmlValidator.htmlValidatorStrings.error
import typings.htmlValidator.htmlValidatorStrings.fatal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationMessageBasicErrorObject extends StObject {
  
  var subType: js.UndefOr[fatal] = js.undefined
  
  var `type`: error
}
object ValidationMessageBasicErrorObject {
  
  @scala.inline
  def apply(): ValidationMessageBasicErrorObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[ValidationMessageBasicErrorObject]
  }
  
  @scala.inline
  implicit class ValidationMessageBasicErrorObjectMutableBuilder[Self <: ValidationMessageBasicErrorObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubType(value: fatal): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    @scala.inline
    def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
