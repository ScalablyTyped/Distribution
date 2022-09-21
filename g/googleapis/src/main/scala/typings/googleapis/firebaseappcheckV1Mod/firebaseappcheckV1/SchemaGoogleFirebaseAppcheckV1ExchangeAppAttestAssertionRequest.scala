package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAssertionRequest extends StObject {
  
  /**
    * Required. The artifact returned by a previous call to ExchangeAppAttestAttestation.
    */
  var artifact: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The CBOR-encoded assertion returned by the client-side App Attest API.
    */
  var assertion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A one-time challenge returned by an immediately prior call to GenerateAppAttestChallenge.
    */
  var challenge: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAssertionRequest {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAssertionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAssertionRequest]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAssertionRequest](x: Self) {
    
    inline def setArtifact(value: String): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
    
    inline def setArtifactNull: Self = StObject.set(x, "artifact", null)
    
    inline def setArtifactUndefined: Self = StObject.set(x, "artifact", js.undefined)
    
    inline def setAssertion(value: String): Self = StObject.set(x, "assertion", value.asInstanceOf[js.Any])
    
    inline def setAssertionNull: Self = StObject.set(x, "assertion", null)
    
    inline def setAssertionUndefined: Self = StObject.set(x, "assertion", js.undefined)
    
    inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setChallengeNull: Self = StObject.set(x, "challenge", null)
    
    inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
  }
}
