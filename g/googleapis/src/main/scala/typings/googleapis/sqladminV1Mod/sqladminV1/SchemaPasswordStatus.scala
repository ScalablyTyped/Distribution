package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPasswordStatus extends StObject {
  
  /**
    * If true, user does not have login privileges.
    */
  var locked: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The expiration time of the current password.
    */
  var passwordExpirationTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaPasswordStatus {
  
  inline def apply(): SchemaPasswordStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPasswordStatus]
  }
  
  extension [Self <: SchemaPasswordStatus](x: Self) {
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedNull: Self = StObject.set(x, "locked", null)
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setPasswordExpirationTime(value: String): Self = StObject.set(x, "passwordExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setPasswordExpirationTimeNull: Self = StObject.set(x, "passwordExpirationTime", null)
    
    inline def setPasswordExpirationTimeUndefined: Self = StObject.set(x, "passwordExpirationTime", js.undefined)
  }
}
