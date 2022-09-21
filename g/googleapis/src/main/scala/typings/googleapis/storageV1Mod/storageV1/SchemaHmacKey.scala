package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHmacKey extends StObject {
  
  /**
    * The kind of item this is. For HMAC keys, this is always storage#hmacKey.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Key metadata.
    */
  var metadata: js.UndefOr[SchemaHmacKeyMetadata] = js.undefined
  
  /**
    * HMAC secret key material.
    */
  var secret: js.UndefOr[String | Null] = js.undefined
}
object SchemaHmacKey {
  
  inline def apply(): SchemaHmacKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHmacKey]
  }
  
  extension [Self <: SchemaHmacKey](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: SchemaHmacKeyMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretNull: Self = StObject.set(x, "secret", null)
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
