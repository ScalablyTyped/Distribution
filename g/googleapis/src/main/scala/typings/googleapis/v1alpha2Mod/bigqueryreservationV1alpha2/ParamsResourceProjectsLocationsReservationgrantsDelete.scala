package typings.googleapis.v1alpha2Mod.bigqueryreservationV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsReservationgrantsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the resource, e.g.: projects/myproject/locations/eu/reservationGrants/123
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsReservationgrantsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsReservationgrantsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsReservationgrantsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsReservationgrantsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
