package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReauthSettings extends StObject {
  
  /**
    * Reauth session lifetime, how long before a user has to reauthenticate again.
    */
  var maxAge: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Reauth method requested.
    */
  var method: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How IAP determines the effective policy in cases of hierarchial policies. Policies are merged from higher in the hierarchy to lower in the hierarchy.
    */
  var policyType: js.UndefOr[String | Null] = js.undefined
}
object SchemaReauthSettings {
  
  inline def apply(): SchemaReauthSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReauthSettings]
  }
  
  extension [Self <: SchemaReauthSettings](x: Self) {
    
    inline def setMaxAge(value: String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeNull: Self = StObject.set(x, "maxAge", null)
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPolicyType(value: String): Self = StObject.set(x, "policyType", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypeNull: Self = StObject.set(x, "policyType", null)
    
    inline def setPolicyTypeUndefined: Self = StObject.set(x, "policyType", js.undefined)
  }
}
