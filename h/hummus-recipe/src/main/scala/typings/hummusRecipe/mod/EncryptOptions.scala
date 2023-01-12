package typings.hummusRecipe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptOptions extends StObject {
  
  var ownerPassword: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var userProtectionFlag: js.UndefOr[Double] = js.undefined
}
object EncryptOptions {
  
  inline def apply(): EncryptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptOptions] (val x: Self) extends AnyVal {
    
    inline def setOwnerPassword(value: String): Self = StObject.set(x, "ownerPassword", value.asInstanceOf[js.Any])
    
    inline def setOwnerPasswordUndefined: Self = StObject.set(x, "ownerPassword", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUserProtectionFlag(value: Double): Self = StObject.set(x, "userProtectionFlag", value.asInstanceOf[js.Any])
    
    inline def setUserProtectionFlagUndefined: Self = StObject.set(x, "userProtectionFlag", js.undefined)
  }
}
