package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse extends StObject {
  
  /**
    * DeviceCheckConfigs retrieved.
    */
  var configs: js.UndefOr[js.Array[SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig]] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1BatchGetDeviceCheckConfigsResponse](x: Self) {
    
    inline def setConfigs(value: js.Array[SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
    
    inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
    
    inline def setConfigsVarargs(value: SchemaGoogleFirebaseAppcheckV1DeviceCheckConfig*): Self = StObject.set(x, "configs", js.Array(value*))
  }
}
