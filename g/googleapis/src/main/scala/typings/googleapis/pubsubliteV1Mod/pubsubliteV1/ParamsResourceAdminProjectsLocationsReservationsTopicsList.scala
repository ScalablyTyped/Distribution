package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdminProjectsLocationsReservationsTopicsList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the reservation whose topics to list. Structured like: projects/{project_number\}/locations/{location\}/reservations/{reservation_id\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of topics to return. The service may return fewer than this value. If unset or zero, all topics for the given reservation will be returned.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token, received from a previous `ListReservationTopics` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListReservationTopics` must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdminProjectsLocationsReservationsTopicsList {
  
  inline def apply(): ParamsResourceAdminProjectsLocationsReservationsTopicsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdminProjectsLocationsReservationsTopicsList]
  }
  
  extension [Self <: ParamsResourceAdminProjectsLocationsReservationsTopicsList](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
