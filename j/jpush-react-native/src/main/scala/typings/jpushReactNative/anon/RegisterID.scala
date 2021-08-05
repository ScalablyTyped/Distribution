package typings.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterID extends StObject {
  
  var registerID: String
}
object RegisterID {
  
  inline def apply(registerID: String): RegisterID = {
    val __obj = js.Dynamic.literal(registerID = registerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterID]
  }
  
  extension [Self <: RegisterID](x: Self) {
    
    inline def setRegisterID(value: String): Self = StObject.set(x, "registerID", value.asInstanceOf[js.Any])
  }
}
