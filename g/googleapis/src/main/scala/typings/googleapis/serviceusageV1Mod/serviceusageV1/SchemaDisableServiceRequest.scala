package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for the `DisableService` method.
  */
trait SchemaDisableServiceRequest extends StObject {
  
  /**
    * Indicates if services that are enabled and which depend on this service
    * should also be disabled. If not set, an error will be generated if any
    * enabled services depend on the service to be disabled. When set, the
    * service, and any enabled services that depend on it, will be disabled
    * together.
    */
  var disableDependentServices: js.UndefOr[Boolean] = js.undefined
}
object SchemaDisableServiceRequest {
  
  inline def apply(): SchemaDisableServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisableServiceRequest]
  }
  
  extension [Self <: SchemaDisableServiceRequest](x: Self) {
    
    inline def setDisableDependentServices(value: Boolean): Self = StObject.set(x, "disableDependentServices", value.asInstanceOf[js.Any])
    
    inline def setDisableDependentServicesUndefined: Self = StObject.set(x, "disableDependentServices", js.undefined)
  }
}
