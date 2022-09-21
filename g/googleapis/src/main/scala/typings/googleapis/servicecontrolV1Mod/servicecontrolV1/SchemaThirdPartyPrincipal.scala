package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaThirdPartyPrincipal extends StObject {
  
  /**
    * Metadata about third party identity.
    */
  var thirdPartyClaims: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaThirdPartyPrincipal {
  
  inline def apply(): SchemaThirdPartyPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThirdPartyPrincipal]
  }
  
  extension [Self <: SchemaThirdPartyPrincipal](x: Self) {
    
    inline def setThirdPartyClaims(value: StringDictionary[Any]): Self = StObject.set(x, "thirdPartyClaims", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyClaimsNull: Self = StObject.set(x, "thirdPartyClaims", null)
    
    inline def setThirdPartyClaimsUndefined: Self = StObject.set(x, "thirdPartyClaims", js.undefined)
  }
}
