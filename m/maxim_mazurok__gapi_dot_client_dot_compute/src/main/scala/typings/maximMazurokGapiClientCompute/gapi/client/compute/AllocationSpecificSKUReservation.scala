package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllocationSpecificSKUReservation extends js.Object {
  
  /** Specifies the number of resources that are allocated. */
  var count: js.UndefOr[String] = js.native
  
  /** [Output Only] Indicates how many instances are in use. */
  var inUseCount: js.UndefOr[String] = js.native
  
  /** The instance properties for the reservation. */
  var instanceProperties: js.UndefOr[AllocationSpecificSKUAllocationReservedInstanceProperties] = js.native
}
object AllocationSpecificSKUReservation {
  
  @scala.inline
  def apply(): AllocationSpecificSKUReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocationSpecificSKUReservation]
  }
  
  @scala.inline
  implicit class AllocationSpecificSKUReservationOps[Self <: AllocationSpecificSKUReservation] (val x: Self) extends AnyVal {
    
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setInUseCount(value: String): Self = this.set("inUseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInUseCount: Self = this.set("inUseCount", js.undefined)
    
    @scala.inline
    def setInstanceProperties(value: AllocationSpecificSKUAllocationReservedInstanceProperties): Self = this.set("instanceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceProperties: Self = this.set("instanceProperties", js.undefined)
  }
}
