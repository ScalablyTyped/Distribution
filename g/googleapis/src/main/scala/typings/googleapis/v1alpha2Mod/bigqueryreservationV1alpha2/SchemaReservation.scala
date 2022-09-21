package typings.googleapis.v1alpha2Mod.bigqueryreservationV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReservation extends StObject {
  
  /**
    * The resource name of the reservation, e.g., "projects/x/locations/x/reservations/dev/team/product". Reservation names (e.g., "dev/team/product") exceeding a depth of six will fail with `google.rpc.Code.INVALID_ARGUMENT`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Maximum slots available to this reservation and its children. A slot is a unit of computational power in BigQuery, and serves as the unit of parallelism. In a scan of a multi-partitioned table, a single slot operates on a single partition of the table. If the new reservation's slot capacity exceed the parent's slot capacity or if total slot capacity of the new reservation and its siblings exceeds the parent's slot capacity, the request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`.
    */
  var slotCapacity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, any query using this reservation will also be submitted to the parent reservation. This allows the query to share the additional slot capacity of the parent with other queries in the parent reservation. If the parent also has this field set to true, then this process will continue until it encounters a reservation for which this is false. If false, a query using this reservation will execute with the maximum slot capacity as specified above. If not specified, default value is true. Ignored for top-level reservation.
    */
  var useParentReservation: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaReservation {
  
  inline def apply(): SchemaReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReservation]
  }
  
  extension [Self <: SchemaReservation](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSlotCapacity(value: String): Self = StObject.set(x, "slotCapacity", value.asInstanceOf[js.Any])
    
    inline def setSlotCapacityNull: Self = StObject.set(x, "slotCapacity", null)
    
    inline def setSlotCapacityUndefined: Self = StObject.set(x, "slotCapacity", js.undefined)
    
    inline def setUseParentReservation(value: Boolean): Self = StObject.set(x, "useParentReservation", value.asInstanceOf[js.Any])
    
    inline def setUseParentReservationNull: Self = StObject.set(x, "useParentReservation", null)
    
    inline def setUseParentReservationUndefined: Self = StObject.set(x, "useParentReservation", js.undefined)
  }
}
