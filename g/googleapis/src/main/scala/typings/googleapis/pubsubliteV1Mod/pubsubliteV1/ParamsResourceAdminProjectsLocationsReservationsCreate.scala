package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdminProjectsLocationsReservationsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent location in which to create the reservation. Structured like `projects/{project_number\}/locations/{location\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReservation] = js.undefined
  
  /**
    * Required. The ID to use for the reservation, which will become the final component of the reservation's name. This value is structured like: `my-reservation-name`.
    */
  var reservationId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdminProjectsLocationsReservationsCreate {
  
  inline def apply(): ParamsResourceAdminProjectsLocationsReservationsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdminProjectsLocationsReservationsCreate]
  }
  
  extension [Self <: ParamsResourceAdminProjectsLocationsReservationsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaReservation): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setReservationId(value: String): Self = StObject.set(x, "reservationId", value.asInstanceOf[js.Any])
    
    inline def setReservationIdUndefined: Self = StObject.set(x, "reservationId", js.undefined)
  }
}
