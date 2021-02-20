package typings.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterID extends StObject {
  
  var registerID: String = js.native
}
object RegisterID {
  
  @scala.inline
  def apply(registerID: String): RegisterID = {
    val __obj = js.Dynamic.literal(registerID = registerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterID]
  }
  
  @scala.inline
  implicit class RegisterIDMutableBuilder[Self <: RegisterID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegisterID(value: String): Self = StObject.set(x, "registerID", value.asInstanceOf[js.Any])
  }
}
