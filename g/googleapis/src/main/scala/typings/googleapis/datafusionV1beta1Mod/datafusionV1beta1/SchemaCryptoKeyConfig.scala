package typings.googleapis.datafusionV1beta1Mod.datafusionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCryptoKeyConfig extends StObject {
  
  /**
    * The name of the key which is used to encrypt/decrypt customer data. For key in Cloud KMS, the key should be in the format of `projects/x/locations/x/keyRings/x/cryptoKeys/x`.
    */
  var keyReference: js.UndefOr[String | Null] = js.undefined
}
object SchemaCryptoKeyConfig {
  
  inline def apply(): SchemaCryptoKeyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCryptoKeyConfig]
  }
  
  extension [Self <: SchemaCryptoKeyConfig](x: Self) {
    
    inline def setKeyReference(value: String): Self = StObject.set(x, "keyReference", value.asInstanceOf[js.Any])
    
    inline def setKeyReferenceNull: Self = StObject.set(x, "keyReference", null)
    
    inline def setKeyReferenceUndefined: Self = StObject.set(x, "keyReference", js.undefined)
  }
}
