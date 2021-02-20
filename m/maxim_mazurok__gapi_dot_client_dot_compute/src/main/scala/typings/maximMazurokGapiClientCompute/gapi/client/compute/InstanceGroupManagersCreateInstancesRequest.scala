package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupManagersCreateInstancesRequest extends StObject {
  
  /** [Required] List of specifications of per-instance configs. */
  var instances: js.UndefOr[js.Array[PerInstanceConfig]] = js.native
}
object InstanceGroupManagersCreateInstancesRequest {
  
  @scala.inline
  def apply(): InstanceGroupManagersCreateInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagersCreateInstancesRequest]
  }
  
  @scala.inline
  implicit class InstanceGroupManagersCreateInstancesRequestMutableBuilder[Self <: InstanceGroupManagersCreateInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[PerInstanceConfig]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: PerInstanceConfig*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
