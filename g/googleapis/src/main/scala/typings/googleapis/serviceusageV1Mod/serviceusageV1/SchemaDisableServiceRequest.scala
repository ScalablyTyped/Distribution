package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDisableServiceRequest extends StObject {
  
  /**
    * Defines the behavior for checking service usage when disabling a service.
    */
  var checkIfServiceHasUsage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates if services that are enabled and which depend on this service should also be disabled. If not set, an error will be generated if any enabled services depend on the service to be disabled. When set, the service, and any enabled services that depend on it, will be disabled together.
    */
  var disableDependentServices: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDisableServiceRequest {
  
  inline def apply(): SchemaDisableServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisableServiceRequest]
  }
  
  extension [Self <: SchemaDisableServiceRequest](x: Self) {
    
    inline def setCheckIfServiceHasUsage(value: String): Self = StObject.set(x, "checkIfServiceHasUsage", value.asInstanceOf[js.Any])
    
    inline def setCheckIfServiceHasUsageNull: Self = StObject.set(x, "checkIfServiceHasUsage", null)
    
    inline def setCheckIfServiceHasUsageUndefined: Self = StObject.set(x, "checkIfServiceHasUsage", js.undefined)
    
    inline def setDisableDependentServices(value: Boolean): Self = StObject.set(x, "disableDependentServices", value.asInstanceOf[js.Any])
    
    inline def setDisableDependentServicesNull: Self = StObject.set(x, "disableDependentServices", null)
    
    inline def setDisableDependentServicesUndefined: Self = StObject.set(x, "disableDependentServices", js.undefined)
  }
}
