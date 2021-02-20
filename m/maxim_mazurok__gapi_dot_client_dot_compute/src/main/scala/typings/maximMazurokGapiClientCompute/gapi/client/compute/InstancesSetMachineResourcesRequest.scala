package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesSetMachineResourcesRequest extends StObject {
  
  /** A list of the type and count of accelerator cards attached to the instance. */
  var guestAccelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.native
}
object InstancesSetMachineResourcesRequest {
  
  @scala.inline
  def apply(): InstancesSetMachineResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesSetMachineResourcesRequest]
  }
  
  @scala.inline
  implicit class InstancesSetMachineResourcesRequestMutableBuilder[Self <: InstancesSetMachineResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGuestAccelerators(value: js.Array[AcceleratorConfig]): Self = StObject.set(x, "guestAccelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuestAcceleratorsUndefined: Self = StObject.set(x, "guestAccelerators", js.undefined)
    
    @scala.inline
    def setGuestAcceleratorsVarargs(value: AcceleratorConfig*): Self = StObject.set(x, "guestAccelerators", js.Array(value :_*))
  }
}
