package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsStepCredentials
  extends StObject
     with SavingsStepEnabled {
  
  var isFamilyNameEnabled: Boolean
  
  var isGivenNameEnabled: Boolean
  
  var isPhoneEnabled: Boolean
}
object SavingsStepCredentials {
  
  inline def apply(
    isEnabled: Boolean,
    isFamilyNameEnabled: Boolean,
    isGivenNameEnabled: Boolean,
    isPhoneEnabled: Boolean
  ): SavingsStepCredentials = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], isFamilyNameEnabled = isFamilyNameEnabled.asInstanceOf[js.Any], isGivenNameEnabled = isGivenNameEnabled.asInstanceOf[js.Any], isPhoneEnabled = isPhoneEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsStepCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsStepCredentials] (val x: Self) extends AnyVal {
    
    inline def setIsFamilyNameEnabled(value: Boolean): Self = StObject.set(x, "isFamilyNameEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsGivenNameEnabled(value: Boolean): Self = StObject.set(x, "isGivenNameEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsPhoneEnabled(value: Boolean): Self = StObject.set(x, "isPhoneEnabled", value.asInstanceOf[js.Any])
  }
}
