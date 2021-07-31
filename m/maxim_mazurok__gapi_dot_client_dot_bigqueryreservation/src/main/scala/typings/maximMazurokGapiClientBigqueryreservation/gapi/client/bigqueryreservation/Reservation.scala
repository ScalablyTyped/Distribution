package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reservation extends StObject {
  
  /** Output only. Creation time of the reservation. */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /**
    * If false, any query using this reservation will use idle slots from other reservations within the same admin project. If true, a query using this reservation will execute with the
    * slot capacity specified above at most.
    */
  var ignoreIdleSlots: js.UndefOr[Boolean] = js.undefined
  
  /** The resource name of the reservation, e.g., `projects/∗/locations/∗/reservations/team1-prod`. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the unit of parallelism. Queries using this reservation might use
    * more slots during runtime if ignore_idle_slots is set to false. If the new reservation's slot capacity exceed the parent's slot capacity or if total slot capacity of the new
    * reservation and its siblings exceeds the parent's slot capacity, the request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`.
    */
  var slotCapacity: js.UndefOr[String] = js.undefined
  
  /** Output only. Last update time of the reservation. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Reservation {
  
  @scala.inline
  def apply(): Reservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reservation]
  }
  
  @scala.inline
  implicit class ReservationMutableBuilder[Self <: Reservation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setIgnoreIdleSlots(value: Boolean): Self = StObject.set(x, "ignoreIdleSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreIdleSlotsUndefined: Self = StObject.set(x, "ignoreIdleSlots", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSlotCapacity(value: String): Self = StObject.set(x, "slotCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotCapacityUndefined: Self = StObject.set(x, "slotCapacity", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
