package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1BatchGetSafetyNetConfigsResponse extends StObject {
  
  /**
    * SafetyNetConfigs retrieved.
    */
  var configs: js.UndefOr[js.Array[SchemaGoogleFirebaseAppcheckV1SafetyNetConfig]] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1BatchGetSafetyNetConfigsResponse {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1BatchGetSafetyNetConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1BatchGetSafetyNetConfigsResponse]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1BatchGetSafetyNetConfigsResponse](x: Self) {
    
    inline def setConfigs(value: js.Array[SchemaGoogleFirebaseAppcheckV1SafetyNetConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
    
    inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
    
    inline def setConfigsVarargs(value: SchemaGoogleFirebaseAppcheckV1SafetyNetConfig*): Self = StObject.set(x, "configs", js.Array(value*))
  }
}
