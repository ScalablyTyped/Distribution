package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserPassword extends StObject {
  
  /**
    * Secret version reference containing the password.
    */
  var password: js.UndefOr[SchemaSecret] = js.undefined
  
  /**
    * Username.
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserPassword {
  
  inline def apply(): SchemaUserPassword = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserPassword]
  }
  
  extension [Self <: SchemaUserPassword](x: Self) {
    
    inline def setPassword(value: SchemaSecret): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
