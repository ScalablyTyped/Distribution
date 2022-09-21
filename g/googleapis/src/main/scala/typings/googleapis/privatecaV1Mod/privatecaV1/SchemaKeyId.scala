package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKeyId extends StObject {
  
  /**
    * Optional. The value of this KeyId encoded in lowercase hexadecimal. This is most likely the 160 bit SHA-1 hash of the public key.
    */
  var keyId: js.UndefOr[String | Null] = js.undefined
}
object SchemaKeyId {
  
  inline def apply(): SchemaKeyId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyId]
  }
  
  extension [Self <: SchemaKeyId](x: Self) {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdNull: Self = StObject.set(x, "keyId", null)
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
  }
}
