package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User&#39;s information.
  */
trait SchemaUserInfo extends StObject {
  
  /**
    * The displayed name of the user.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The email address of the user.
    */
  var email: js.UndefOr[String] = js.undefined
}
object SchemaUserInfo {
  
  inline def apply(): SchemaUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserInfo]
  }
  
  extension [Self <: SchemaUserInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
