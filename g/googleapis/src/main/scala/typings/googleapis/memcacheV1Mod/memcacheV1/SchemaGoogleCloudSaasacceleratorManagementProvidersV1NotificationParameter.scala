package typings.googleapis.memcacheV1Mod.memcacheV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter extends StObject {
  
  /**
    * Optional. Array of string values. e.g. instance's replica information.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter {
  
  inline def apply(): SchemaGoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter]
  }
  
  extension [Self <: SchemaGoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter](x: Self) {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
