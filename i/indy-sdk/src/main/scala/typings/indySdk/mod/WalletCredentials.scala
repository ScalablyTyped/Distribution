package typings.indySdk.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WalletCredentials extends StObject {
  
  var key: String
  
  var key_derivation_method: js.UndefOr[KeyDerivationMethod] = js.undefined
  
  var storage_credentials: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object WalletCredentials {
  
  inline def apply(key: String): WalletCredentials = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WalletCredentials] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKey_derivation_method(value: KeyDerivationMethod): Self = StObject.set(x, "key_derivation_method", value.asInstanceOf[js.Any])
    
    inline def setKey_derivation_methodUndefined: Self = StObject.set(x, "key_derivation_method", js.undefined)
    
    inline def setStorage_credentials(value: StringDictionary[Any]): Self = StObject.set(x, "storage_credentials", value.asInstanceOf[js.Any])
    
    inline def setStorage_credentialsUndefined: Self = StObject.set(x, "storage_credentials", js.undefined)
  }
}
