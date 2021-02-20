package typings.htmlValidator.mod

import typings.htmlValidator.htmlValidatorStrings.info
import typings.htmlValidator.htmlValidatorStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationMessageBasicInfoObject extends StObject {
  
  var subType: js.UndefOr[warning] = js.native
  
  var `type`: info = js.native
}
object ValidationMessageBasicInfoObject {
  
  @scala.inline
  def apply(`type`: info): ValidationMessageBasicInfoObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMessageBasicInfoObject]
  }
  
  @scala.inline
  implicit class ValidationMessageBasicInfoObjectMutableBuilder[Self <: ValidationMessageBasicInfoObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubType(value: warning): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    @scala.inline
    def setType(value: info): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
