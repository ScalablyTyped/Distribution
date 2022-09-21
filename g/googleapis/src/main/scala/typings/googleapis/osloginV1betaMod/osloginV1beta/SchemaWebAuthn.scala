package typings.googleapis.osloginV1betaMod.osloginV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWebAuthn extends StObject {
  
  /**
    * Relying party ID for Web Authentication.
    */
  var rpId: js.UndefOr[String | Null] = js.undefined
}
object SchemaWebAuthn {
  
  inline def apply(): SchemaWebAuthn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebAuthn]
  }
  
  extension [Self <: SchemaWebAuthn](x: Self) {
    
    inline def setRpId(value: String): Self = StObject.set(x, "rpId", value.asInstanceOf[js.Any])
    
    inline def setRpIdNull: Self = StObject.set(x, "rpId", null)
    
    inline def setRpIdUndefined: Self = StObject.set(x, "rpId", js.undefined)
  }
}
