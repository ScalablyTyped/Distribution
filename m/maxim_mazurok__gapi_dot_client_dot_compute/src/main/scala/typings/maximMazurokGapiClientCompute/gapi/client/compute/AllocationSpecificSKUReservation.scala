package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocationSpecificSKUReservation extends StObject {
  
  /** Specifies the number of resources that are allocated. */
  var count: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Indicates how many instances are in use. */
  var inUseCount: js.UndefOr[String] = js.undefined
  
  /** The instance properties for the reservation. */
  var instanceProperties: js.UndefOr[AllocationSpecificSKUAllocationReservedInstanceProperties] = js.undefined
}
object AllocationSpecificSKUReservation {
  
  @scala.inline
  def apply(): AllocationSpecificSKUReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocationSpecificSKUReservation]
  }
  
  @scala.inline
  implicit class AllocationSpecificSKUReservationMutableBuilder[Self <: AllocationSpecificSKUReservation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setInUseCount(value: String): Self = StObject.set(x, "inUseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInUseCountUndefined: Self = StObject.set(x, "inUseCount", js.undefined)
    
    @scala.inline
    def setInstanceProperties(value: AllocationSpecificSKUAllocationReservedInstanceProperties): Self = StObject.set(x, "instanceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancePropertiesUndefined: Self = StObject.set(x, "instanceProperties", js.undefined)
  }
}
