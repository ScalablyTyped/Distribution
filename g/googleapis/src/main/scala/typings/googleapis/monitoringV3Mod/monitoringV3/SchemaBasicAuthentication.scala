package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBasicAuthentication extends StObject {
  
  /**
    * The password to use when authenticating with the HTTP server.
    */
  var password: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The username to use when authenticating with the HTTP server.
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaBasicAuthentication {
  
  inline def apply(): SchemaBasicAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicAuthentication]
  }
  
  extension [Self <: SchemaBasicAuthentication](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
