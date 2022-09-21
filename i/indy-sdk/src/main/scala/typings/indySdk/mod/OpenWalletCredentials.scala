package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenWalletCredentials
  extends StObject
     with WalletCredentials {
  
  var rekey: js.UndefOr[String] = js.undefined
  
  var rekey_derivation_method: js.UndefOr[KeyDerivationMethod] = js.undefined
}
object OpenWalletCredentials {
  
  inline def apply(key: String): OpenWalletCredentials = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenWalletCredentials]
  }
  
  extension [Self <: OpenWalletCredentials](x: Self) {
    
    inline def setRekey(value: String): Self = StObject.set(x, "rekey", value.asInstanceOf[js.Any])
    
    inline def setRekeyUndefined: Self = StObject.set(x, "rekey", js.undefined)
    
    inline def setRekey_derivation_method(value: KeyDerivationMethod): Self = StObject.set(x, "rekey_derivation_method", value.asInstanceOf[js.Any])
    
    inline def setRekey_derivation_methodUndefined: Self = StObject.set(x, "rekey_derivation_method", js.undefined)
  }
}
