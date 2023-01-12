package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupManagersCreateInstancesRequest extends StObject {
  
  /** [Required] List of specifications of per-instance configs. */
  var instances: js.UndefOr[js.Array[PerInstanceConfig]] = js.undefined
}
object InstanceGroupManagersCreateInstancesRequest {
  
  inline def apply(): InstanceGroupManagersCreateInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagersCreateInstancesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceGroupManagersCreateInstancesRequest] (val x: Self) extends AnyVal {
    
    inline def setInstances(value: js.Array[PerInstanceConfig]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: PerInstanceConfig*): Self = StObject.set(x, "instances", js.Array(value*))
  }
}
