package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reservation extends StObject {
  
  /**
    * Maximum number of queries that are allowed to run concurrently in this reservation. This is a soft limit due to asynchronous nature of the system and various optimizations for small
    * queries. Default value is 0 which means that concurrency will be automatically set based on the reservation size.
    */
  var concurrency: js.UndefOr[String] = js.undefined
  
  /** Output only. Creation time of the reservation. */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /**
    * If false, any query or pipeline job using this reservation will use idle slots from other reservations within the same admin project. If true, a query or pipeline job using this
    * reservation will execute with the slot capacity specified in the slot_capacity field at most.
    */
  var ignoreIdleSlots: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Applicable only for reservations located within one of the BigQuery multi-regions (US or EU). If set to true, this reservation is placed in the organization's secondary region which
    * is designated for disaster recovery purposes. If false, this reservation is placed in the organization's default region.
    */
  var multiRegionAuxiliary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The resource name of the reservation, e.g., `projects/ *‍/locations/ *‍/reservations/team1-prod`. The reservation_id must only contain lower case alphanumeric characters or dashes. It
    * must start with a letter and must not end with a dash. Its maximum length is 64 characters.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the unit of parallelism. Queries using this reservation might use
    * more slots during runtime if ignore_idle_slots is set to false. If total slot_capacity of the reservation and its siblings exceeds the total slot_count of all capacity commitments,
    * the request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`. NOTE: for reservations in US or EU multi-regions, slot capacity constraints are checked separately for default and
    * auxiliary regions. See multi_region_auxiliary flag for more details.
    */
  var slotCapacity: js.UndefOr[String] = js.undefined
  
  /** Output only. Last update time of the reservation. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Reservation {
  
  inline def apply(): Reservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reservation]
  }
  
  extension [Self <: Reservation](x: Self) {
    
    inline def setConcurrency(value: String): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setIgnoreIdleSlots(value: Boolean): Self = StObject.set(x, "ignoreIdleSlots", value.asInstanceOf[js.Any])
    
    inline def setIgnoreIdleSlotsUndefined: Self = StObject.set(x, "ignoreIdleSlots", js.undefined)
    
    inline def setMultiRegionAuxiliary(value: Boolean): Self = StObject.set(x, "multiRegionAuxiliary", value.asInstanceOf[js.Any])
    
    inline def setMultiRegionAuxiliaryUndefined: Self = StObject.set(x, "multiRegionAuxiliary", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSlotCapacity(value: String): Self = StObject.set(x, "slotCapacity", value.asInstanceOf[js.Any])
    
    inline def setSlotCapacityUndefined: Self = StObject.set(x, "slotCapacity", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
