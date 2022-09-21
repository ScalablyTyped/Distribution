package typings.googleapis.v1alpha2Mod.bigqueryreservationV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsReservationsSlotpoolsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Resource name of the slot pool to retrieve. E.g., projects/myproject/locations/us-central1/reservations/my_reservation/slotPools/123
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsReservationsSlotpoolsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsReservationsSlotpoolsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsReservationsSlotpoolsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsReservationsSlotpoolsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
