package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1BatchGetAppAttestConfigsResponse extends StObject {
  
  /**
    * AppAttestConfigs retrieved.
    */
  var configs: js.UndefOr[js.Array[SchemaGoogleFirebaseAppcheckV1AppAttestConfig]] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1BatchGetAppAttestConfigsResponse {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1BatchGetAppAttestConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1BatchGetAppAttestConfigsResponse]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1BatchGetAppAttestConfigsResponse](x: Self) {
    
    inline def setConfigs(value: js.Array[SchemaGoogleFirebaseAppcheckV1AppAttestConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
    
    inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
    
    inline def setConfigsVarargs(value: SchemaGoogleFirebaseAppcheckV1AppAttestConfig*): Self = StObject.set(x, "configs", js.Array(value*))
  }
}
