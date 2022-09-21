package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdminProjectsLocationsReservationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the reservation whose configuration to return. Structured like: projects/{project_number\}/locations/{location\}/reservations/{reservation_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdminProjectsLocationsReservationsGet {
  
  inline def apply(): ParamsResourceAdminProjectsLocationsReservationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdminProjectsLocationsReservationsGet]
  }
  
  extension [Self <: ParamsResourceAdminProjectsLocationsReservationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
