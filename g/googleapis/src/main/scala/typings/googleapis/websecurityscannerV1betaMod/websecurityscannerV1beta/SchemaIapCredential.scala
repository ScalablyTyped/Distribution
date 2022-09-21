package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIapCredential extends StObject {
  
  /**
    * Authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies.
    */
  var iapTestServiceAccountInfo: js.UndefOr[SchemaIapTestServiceAccountInfo] = js.undefined
}
object SchemaIapCredential {
  
  inline def apply(): SchemaIapCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIapCredential]
  }
  
  extension [Self <: SchemaIapCredential](x: Self) {
    
    inline def setIapTestServiceAccountInfo(value: SchemaIapTestServiceAccountInfo): Self = StObject.set(x, "iapTestServiceAccountInfo", value.asInstanceOf[js.Any])
    
    inline def setIapTestServiceAccountInfoUndefined: Self = StObject.set(x, "iapTestServiceAccountInfo", js.undefined)
  }
}
