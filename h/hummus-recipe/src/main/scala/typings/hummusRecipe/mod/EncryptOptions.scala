package typings.hummusRecipe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptOptions extends StObject {
  
  var ownerPassword: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var userProtectionFlag: js.UndefOr[Double] = js.native
}
object EncryptOptions {
  
  @scala.inline
  def apply(): EncryptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptOptions]
  }
  
  @scala.inline
  implicit class EncryptOptionsMutableBuilder[Self <: EncryptOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwnerPassword(value: String): Self = StObject.set(x, "ownerPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerPasswordUndefined: Self = StObject.set(x, "ownerPassword", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUserProtectionFlag(value: Double): Self = StObject.set(x, "userProtectionFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProtectionFlagUndefined: Self = StObject.set(x, "userProtectionFlag", js.undefined)
  }
}
