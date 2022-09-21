package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaBatchGetAppAttestConfigsResponse extends StObject {
  
  /**
    * AppAttestConfigs retrieved.
    */
  var configs: js.UndefOr[js.Array[SchemaGoogleFirebaseAppcheckV1betaAppAttestConfig]] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaBatchGetAppAttestConfigsResponse {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaBatchGetAppAttestConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaBatchGetAppAttestConfigsResponse]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaBatchGetAppAttestConfigsResponse](x: Self) {
    
    inline def setConfigs(value: js.Array[SchemaGoogleFirebaseAppcheckV1betaAppAttestConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
    
    inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
    
    inline def setConfigsVarargs(value: SchemaGoogleFirebaseAppcheckV1betaAppAttestConfig*): Self = StObject.set(x, "configs", js.Array(value*))
  }
}
