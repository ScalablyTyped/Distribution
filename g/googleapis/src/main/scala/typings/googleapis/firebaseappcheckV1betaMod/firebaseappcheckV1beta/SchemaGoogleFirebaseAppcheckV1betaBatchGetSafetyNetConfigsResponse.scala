package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaBatchGetSafetyNetConfigsResponse extends StObject {
  
  /**
    * SafetyNetConfigs retrieved.
    */
  var configs: js.UndefOr[js.Array[SchemaGoogleFirebaseAppcheckV1betaSafetyNetConfig]] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaBatchGetSafetyNetConfigsResponse {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaBatchGetSafetyNetConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaBatchGetSafetyNetConfigsResponse]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaBatchGetSafetyNetConfigsResponse](x: Self) {
    
    inline def setConfigs(value: js.Array[SchemaGoogleFirebaseAppcheckV1betaSafetyNetConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
    
    inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
    
    inline def setConfigsVarargs(value: SchemaGoogleFirebaseAppcheckV1betaSafetyNetConfig*): Self = StObject.set(x, "configs", js.Array(value*))
  }
}
