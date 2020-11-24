package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reservation extends js.Object {
  
  /** Output only. Creation time of the reservation. */
  var creationTime: js.UndefOr[String] = js.native
  
  /**
    * If false, any query using this reservation will use idle slots from other reservations within the same admin project. If true, a query using this reservation will execute with the
    * slot capacity specified above at most.
    */
  var ignoreIdleSlots: js.UndefOr[Boolean] = js.native
  
  /** The resource name of the reservation, e.g., `projects/∗/locations/∗/reservations/team1-prod`. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the unit of parallelism. Queries using this reservation might use
    * more slots during runtime if ignore_idle_slots is set to false. If the new reservation's slot capacity exceed the parent's slot capacity or if total slot capacity of the new
    * reservation and its siblings exceeds the parent's slot capacity, the request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`.
    */
  var slotCapacity: js.UndefOr[String] = js.native
  
  /** Output only. Last update time of the reservation. */
  var updateTime: js.UndefOr[String] = js.native
}
object Reservation {
  
  @scala.inline
  def apply(): Reservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reservation]
  }
  
  @scala.inline
  implicit class ReservationOps[Self <: Reservation] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setIgnoreIdleSlots(value: Boolean): Self = this.set("ignoreIdleSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreIdleSlots: Self = this.set("ignoreIdleSlots", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSlotCapacity(value: String): Self = this.set("slotCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlotCapacity: Self = this.set("slotCapacity", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
