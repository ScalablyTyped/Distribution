package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesSetMachineResourcesRequest extends js.Object {
  
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
  implicit class InstancesSetMachineResourcesRequestOps[Self <: InstancesSetMachineResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGuestAcceleratorsVarargs(value: AcceleratorConfig*): Self = this.set("guestAccelerators", js.Array(value :_*))
    
    @scala.inline
    def setGuestAccelerators(value: js.Array[AcceleratorConfig]): Self = this.set("guestAccelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuestAccelerators: Self = this.set("guestAccelerators", js.undefined)
  }
}
