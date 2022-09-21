package typings.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoKeyConfig extends StObject {
  
  /** The name of the key which is used to encrypt/decrypt customer data. For key in Cloud KMS, the key should be in the format of `projects/ *‍/locations/ *‍/keyRings/ *‍/cryptoKeys/ *`. */
  var keyReference: js.UndefOr[String] = js.undefined
}
object CryptoKeyConfig {
  
  inline def apply(): CryptoKeyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoKeyConfig]
  }
  
  extension [Self <: CryptoKeyConfig](x: Self) {
    
    inline def setKeyReference(value: String): Self = StObject.set(x, "keyReference", value.asInstanceOf[js.Any])
    
    inline def setKeyReferenceUndefined: Self = StObject.set(x, "keyReference", js.undefined)
  }
}
