package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2UnwrappedCryptoKey extends StObject {
  
  /**
    * Required. A 128/192/256 bit key.
    */
  var key: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2UnwrappedCryptoKey {
  
  inline def apply(): SchemaGooglePrivacyDlpV2UnwrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UnwrappedCryptoKey]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2UnwrappedCryptoKey](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
