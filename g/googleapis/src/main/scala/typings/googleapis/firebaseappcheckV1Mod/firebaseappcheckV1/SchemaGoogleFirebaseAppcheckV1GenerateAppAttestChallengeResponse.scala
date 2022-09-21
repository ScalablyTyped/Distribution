package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1GenerateAppAttestChallengeResponse extends StObject {
  
  /**
    * A one-time use challenge for the client to pass to the App Attest API.
    */
  var challenge: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The duration from the time this challenge is minted until its expiration. This field is intended to ease client-side token management, since the client may have clock skew, but is still able to accurately measure a duration.
    */
  var ttl: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1GenerateAppAttestChallengeResponse {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1GenerateAppAttestChallengeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1GenerateAppAttestChallengeResponse]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1GenerateAppAttestChallengeResponse](x: Self) {
    
    inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setChallengeNull: Self = StObject.set(x, "challenge", null)
    
    inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlNull: Self = StObject.set(x, "ttl", null)
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
