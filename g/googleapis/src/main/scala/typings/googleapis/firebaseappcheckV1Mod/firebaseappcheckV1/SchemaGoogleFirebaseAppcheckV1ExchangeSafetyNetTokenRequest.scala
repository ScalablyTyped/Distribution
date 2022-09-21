package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1ExchangeSafetyNetTokenRequest extends StObject {
  
  /**
    * Required. The [SafetyNet attestation response](https://developer.android.com/training/safetynet/attestation#request-attestation-step) issued to your app.
    */
  var safetyNetToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1ExchangeSafetyNetTokenRequest {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1ExchangeSafetyNetTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1ExchangeSafetyNetTokenRequest]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1ExchangeSafetyNetTokenRequest](x: Self) {
    
    inline def setSafetyNetToken(value: String): Self = StObject.set(x, "safetyNetToken", value.asInstanceOf[js.Any])
    
    inline def setSafetyNetTokenNull: Self = StObject.set(x, "safetyNetToken", null)
    
    inline def setSafetyNetTokenUndefined: Self = StObject.set(x, "safetyNetToken", js.undefined)
  }
}
