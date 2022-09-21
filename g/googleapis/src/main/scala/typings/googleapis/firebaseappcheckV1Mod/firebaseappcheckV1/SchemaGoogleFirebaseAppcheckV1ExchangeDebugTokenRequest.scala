package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1ExchangeDebugTokenRequest extends StObject {
  
  /**
    * Required. A debug token secret. This string must match a debug token secret previously created using CreateDebugToken.
    */
  var debugToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1ExchangeDebugTokenRequest {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1ExchangeDebugTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1ExchangeDebugTokenRequest]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1ExchangeDebugTokenRequest](x: Self) {
    
    inline def setDebugToken(value: String): Self = StObject.set(x, "debugToken", value.asInstanceOf[js.Any])
    
    inline def setDebugTokenNull: Self = StObject.set(x, "debugToken", null)
    
    inline def setDebugTokenUndefined: Self = StObject.set(x, "debugToken", js.undefined)
  }
}
