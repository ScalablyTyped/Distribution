package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaExchangeAppAttestAttestationResponse extends StObject {
  
  /**
    * Encapsulates an App Check token.
    */
  var appCheckToken: js.UndefOr[SchemaGoogleFirebaseAppcheckV1betaAppCheckToken] = js.undefined
  
  /**
    * An artifact that can be used in future calls to ExchangeAppAttestAssertion.
    */
  var artifact: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Encapsulates an App Check token.
    */
  var attestationToken: js.UndefOr[SchemaGoogleFirebaseAppcheckV1betaAttestationTokenResponse] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaExchangeAppAttestAttestationResponse {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaExchangeAppAttestAttestationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaExchangeAppAttestAttestationResponse]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaExchangeAppAttestAttestationResponse](x: Self) {
    
    inline def setAppCheckToken(value: SchemaGoogleFirebaseAppcheckV1betaAppCheckToken): Self = StObject.set(x, "appCheckToken", value.asInstanceOf[js.Any])
    
    inline def setAppCheckTokenUndefined: Self = StObject.set(x, "appCheckToken", js.undefined)
    
    inline def setArtifact(value: String): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
    
    inline def setArtifactNull: Self = StObject.set(x, "artifact", null)
    
    inline def setArtifactUndefined: Self = StObject.set(x, "artifact", js.undefined)
    
    inline def setAttestationToken(value: SchemaGoogleFirebaseAppcheckV1betaAttestationTokenResponse): Self = StObject.set(x, "attestationToken", value.asInstanceOf[js.Any])
    
    inline def setAttestationTokenUndefined: Self = StObject.set(x, "attestationToken", js.undefined)
  }
}
