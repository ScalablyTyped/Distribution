package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaAttestationTokenResponse extends StObject {
  
  /**
    * An App Check token. App Check tokens are signed [JWTs](https://tools.ietf.org/html/rfc7519) containing claims that identify the attested app and Firebase project. This token is used to access Firebase services protected by App Check.
    */
  var attestationToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The duration from the time this token is minted until its expiration. This field is intended to ease client-side token management, since the client may have clock skew, but is still able to accurately measure a duration.
    */
  var ttl: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaAttestationTokenResponse {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaAttestationTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaAttestationTokenResponse]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaAttestationTokenResponse](x: Self) {
    
    inline def setAttestationToken(value: String): Self = StObject.set(x, "attestationToken", value.asInstanceOf[js.Any])
    
    inline def setAttestationTokenNull: Self = StObject.set(x, "attestationToken", null)
    
    inline def setAttestationTokenUndefined: Self = StObject.set(x, "attestationToken", js.undefined)
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlNull: Self = StObject.set(x, "ttl", null)
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
