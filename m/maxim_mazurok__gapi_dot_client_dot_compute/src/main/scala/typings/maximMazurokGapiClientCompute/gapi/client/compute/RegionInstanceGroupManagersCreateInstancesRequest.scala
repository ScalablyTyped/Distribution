package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionInstanceGroupManagersCreateInstancesRequest extends StObject {
  
  /** [Required] List of specifications of per-instance configs. */
  var instances: js.UndefOr[js.Array[PerInstanceConfig]] = js.native
}
object RegionInstanceGroupManagersCreateInstancesRequest {
  
  @scala.inline
  def apply(): RegionInstanceGroupManagersCreateInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionInstanceGroupManagersCreateInstancesRequest]
  }
  
  @scala.inline
  implicit class RegionInstanceGroupManagersCreateInstancesRequestMutableBuilder[Self <: RegionInstanceGroupManagersCreateInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[PerInstanceConfig]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: PerInstanceConfig*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
