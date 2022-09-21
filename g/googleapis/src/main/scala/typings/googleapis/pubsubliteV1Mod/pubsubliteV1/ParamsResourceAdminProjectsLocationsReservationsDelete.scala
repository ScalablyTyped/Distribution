package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdminProjectsLocationsReservationsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the reservation to delete. Structured like: projects/{project_number\}/locations/{location\}/reservations/{reservation_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdminProjectsLocationsReservationsDelete {
  
  inline def apply(): ParamsResourceAdminProjectsLocationsReservationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdminProjectsLocationsReservationsDelete]
  }
  
  extension [Self <: ParamsResourceAdminProjectsLocationsReservationsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
