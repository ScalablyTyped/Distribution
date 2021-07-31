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
  
  @scala.inline
  def apply(): ListAnnouncementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnnouncementsResponse]
  }
  
  @scala.inline
  implicit class ListAnnouncementsResponseMutableBuilder[Self <: ListAnnouncementsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnouncements(value: js.Array[Announcement]): Self = StObject.set(x, "announcements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnouncementsUndefined: Self = StObject.set(x, "announcements", js.undefined)
    
    @scala.inline
    def setAnnouncementsVarargs(value: Announcement*): Self = StObject.set(x, "announcements", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
