package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnnouncementsResponse extends StObject {
  
  /** Announcement items that match the request. */
  var announcements: js.UndefOr[js.Array[Announcement]] = js.undefined
  
  /** Token identifying the next page of results to return. If empty, no further results are available. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListAnnouncementsResponse {
  
  inline def apply(): ListAnnouncementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnnouncementsResponse]
  }
  
  extension [Self <: ListAnnouncementsResponse](x: Self) {
    
    inline def setAnnouncements(value: js.Array[Announcement]): Self = StObject.set(x, "announcements", value.asInstanceOf[js.Any])
    
    inline def setAnnouncementsUndefined: Self = StObject.set(x, "announcements", js.undefined)
    
    inline def setAnnouncementsVarargs(value: Announcement*): Self = StObject.set(x, "announcements", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
