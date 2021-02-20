package typings.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutValidationGroup extends StObject {
  
  var errors: js.UndefOr[KnockoutValidationErrors] = js.native
  
  var isAnyMessageShown: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.native
}
object KnockoutValidationGroup {
  
  @scala.inline
  def apply(): KnockoutValidationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutValidationGroup]
  }
  
  @scala.inline
  implicit class KnockoutValidationGroupMutableBuilder[Self <: KnockoutValidationGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: KnockoutValidationErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setIsAnyMessageShown(value: () => Boolean): Self = StObject.set(x, "isAnyMessageShown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAnyMessageShownUndefined: Self = StObject.set(x, "isAnyMessageShown", js.undefined)
    
    @scala.inline
    def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
  }
}
