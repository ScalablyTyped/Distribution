package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAttestationResponse extends StObject {
  
  /**
    * Encapsulates an App Check token.
    */
  var appCheckToken: js.UndefOr[SchemaGoogleFirebaseAppcheckV1AppCheckToken] = js.undefined
  
  /**
    * An artifact that can be used in future calls to ExchangeAppAttestAssertion.
    */
  var artifact: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAttestationResponse {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAttestationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAttestationResponse]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1ExchangeAppAttestAttestationResponse](x: Self) {
    
    inline def setAppCheckToken(value: SchemaGoogleFirebaseAppcheckV1AppCheckToken): Self = StObject.set(x, "appCheckToken", value.asInstanceOf[js.Any])
    
    inline def setAppCheckTokenUndefined: Self = StObject.set(x, "appCheckToken", js.undefined)
    
    inline def setArtifact(value: String): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
    
    inline def setArtifactNull: Self = StObject.set(x, "artifact", null)
    
    inline def setArtifactUndefined: Self = StObject.set(x, "artifact", js.undefined)
  }
}
