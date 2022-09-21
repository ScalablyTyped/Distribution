package typings.googleapis.v1alpha2Mod.bigqueryreservationV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsReservationsCreatereservation
  extends StObject
     with StandardParameters {
  
  /**
    * Project, location, and (optionally) reservation name. E.g., projects/myproject/locations/us-central1/reservations/parent
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReservation] = js.undefined
  
  /**
    * The reservation ID relative to the parent, e.g., "dev". This field must only contain alphanumeric characters.
    */
  var reservationId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsReservationsCreatereservation {
  
  inline def apply(): ParamsResourceProjectsLocationsReservationsCreatereservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsReservationsCreatereservation]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsReservationsCreatereservation](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaReservation): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setReservationId(value: String): Self = StObject.set(x, "reservationId", value.asInstanceOf[js.Any])
    
    inline def setReservationIdUndefined: Self = StObject.set(x, "reservationId", js.undefined)
  }
}
