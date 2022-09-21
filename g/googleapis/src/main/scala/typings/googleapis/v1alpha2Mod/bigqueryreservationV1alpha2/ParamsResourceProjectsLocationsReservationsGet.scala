package typings.googleapis.v1alpha2Mod.bigqueryreservationV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsReservationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Resource name of the reservation to retrieve. E.g., projects/myproject/locations/us-central1/reservations/path/to/reserv
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsReservationsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsReservationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsReservationsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsReservationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
