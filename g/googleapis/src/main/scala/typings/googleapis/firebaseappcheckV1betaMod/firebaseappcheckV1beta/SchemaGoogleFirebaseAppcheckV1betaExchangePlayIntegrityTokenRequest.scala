package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaExchangePlayIntegrityTokenRequest extends StObject {
  
  /**
    * Required. The [integrity verdict response token from Play Integrity](https://developer.android.com/google/play/integrity/verdict#decrypt-verify) issued to your app.
    */
  var playIntegrityToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaExchangePlayIntegrityTokenRequest {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaExchangePlayIntegrityTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaExchangePlayIntegrityTokenRequest]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaExchangePlayIntegrityTokenRequest](x: Self) {
    
    inline def setPlayIntegrityToken(value: String): Self = StObject.set(x, "playIntegrityToken", value.asInstanceOf[js.Any])
    
    inline def setPlayIntegrityTokenNull: Self = StObject.set(x, "playIntegrityToken", null)
    
    inline def setPlayIntegrityTokenUndefined: Self = StObject.set(x, "playIntegrityToken", js.undefined)
  }
}
