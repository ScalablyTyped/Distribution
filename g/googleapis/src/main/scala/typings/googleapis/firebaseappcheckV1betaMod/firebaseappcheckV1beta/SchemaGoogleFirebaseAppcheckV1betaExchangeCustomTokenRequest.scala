package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaExchangeCustomTokenRequest extends StObject {
  
  /**
    * Required. A custom token signed using your project's Admin SDK service account credentials.
    */
  var customToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaExchangeCustomTokenRequest {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaExchangeCustomTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaExchangeCustomTokenRequest]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaExchangeCustomTokenRequest](x: Self) {
    
    inline def setCustomToken(value: String): Self = StObject.set(x, "customToken", value.asInstanceOf[js.Any])
    
    inline def setCustomTokenNull: Self = StObject.set(x, "customToken", null)
    
    inline def setCustomTokenUndefined: Self = StObject.set(x, "customToken", js.undefined)
  }
}
