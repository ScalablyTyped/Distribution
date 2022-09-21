package typings.googleapis.v1alpha2Mod.bigqueryreservationV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsReservationsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * If true, deletes all the child reservations of the given reservation. Otherwise, attempting to delete a reservation that has child reservations will fail with error code `google.rpc.Code.FAILED_PRECONDITION`.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Resource name of the reservation to retrieve. E.g., projects/myproject/locations/us-central1/reservations/my_reservation
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsReservationsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsReservationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsReservationsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsReservationsDelete](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
