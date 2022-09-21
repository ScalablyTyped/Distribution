package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaBatchGetDeviceCheckConfigsResponse extends StObject {
  
  /**
    * DeviceCheckConfigs retrieved.
    */
  var configs: js.UndefOr[js.Array[SchemaGoogleFirebaseAppcheckV1betaDeviceCheckConfig]] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaBatchGetDeviceCheckConfigsResponse {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaBatchGetDeviceCheckConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaBatchGetDeviceCheckConfigsResponse]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaBatchGetDeviceCheckConfigsResponse](x: Self) {
    
    inline def setConfigs(value: js.Array[SchemaGoogleFirebaseAppcheckV1betaDeviceCheckConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
    
    inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
    
    inline def setConfigsVarargs(value: SchemaGoogleFirebaseAppcheckV1betaDeviceCheckConfig*): Self = StObject.set(x, "configs", js.Array(value*))
  }
}
