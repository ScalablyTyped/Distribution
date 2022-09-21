package typings.googleapis.cloudshellV1Mod.cloudshellV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemovePublicKeyRequest extends StObject {
  
  /**
    * Key that should be removed from the environment.
    */
  var key: js.UndefOr[String | Null] = js.undefined
}
object SchemaRemovePublicKeyRequest {
  
  inline def apply(): SchemaRemovePublicKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemovePublicKeyRequest]
  }
  
  extension [Self <: SchemaRemovePublicKeyRequest](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
