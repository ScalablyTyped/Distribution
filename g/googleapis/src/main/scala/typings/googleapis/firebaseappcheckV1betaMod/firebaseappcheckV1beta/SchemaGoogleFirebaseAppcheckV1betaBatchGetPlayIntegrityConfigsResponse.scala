package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaBatchGetPlayIntegrityConfigsResponse extends StObject {
  
  /**
    * PlayIntegrityConfigs retrieved.
    */
  var configs: js.UndefOr[js.Array[SchemaGoogleFirebaseAppcheckV1betaPlayIntegrityConfig]] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaBatchGetPlayIntegrityConfigsResponse {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaBatchGetPlayIntegrityConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaBatchGetPlayIntegrityConfigsResponse]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaBatchGetPlayIntegrityConfigsResponse](x: Self) {
    
    inline def setConfigs(value: js.Array[SchemaGoogleFirebaseAppcheckV1betaPlayIntegrityConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
    
    inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
    
    inline def setConfigsVarargs(value: SchemaGoogleFirebaseAppcheckV1betaPlayIntegrityConfig*): Self = StObject.set(x, "configs", js.Array(value*))
  }
}
