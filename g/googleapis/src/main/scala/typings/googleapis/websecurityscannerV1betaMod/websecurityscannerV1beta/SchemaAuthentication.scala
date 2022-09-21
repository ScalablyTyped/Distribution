package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthentication extends StObject {
  
  /**
    * Authentication using a custom account.
    */
  var customAccount: js.UndefOr[SchemaCustomAccount] = js.undefined
  
  /**
    * Authentication using a Google account.
    */
  var googleAccount: js.UndefOr[SchemaGoogleAccount] = js.undefined
  
  /**
    * Authentication using Identity-Aware-Proxy (IAP).
    */
  var iapCredential: js.UndefOr[SchemaIapCredential] = js.undefined
}
object SchemaAuthentication {
  
  inline def apply(): SchemaAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthentication]
  }
  
  extension [Self <: SchemaAuthentication](x: Self) {
    
    inline def setCustomAccount(value: SchemaCustomAccount): Self = StObject.set(x, "customAccount", value.asInstanceOf[js.Any])
    
    inline def setCustomAccountUndefined: Self = StObject.set(x, "customAccount", js.undefined)
    
    inline def setGoogleAccount(value: SchemaGoogleAccount): Self = StObject.set(x, "googleAccount", value.asInstanceOf[js.Any])
    
    inline def setGoogleAccountUndefined: Self = StObject.set(x, "googleAccount", js.undefined)
    
    inline def setIapCredential(value: SchemaIapCredential): Self = StObject.set(x, "iapCredential", value.asInstanceOf[js.Any])
    
    inline def setIapCredentialUndefined: Self = StObject.set(x, "iapCredential", js.undefined)
  }
}
