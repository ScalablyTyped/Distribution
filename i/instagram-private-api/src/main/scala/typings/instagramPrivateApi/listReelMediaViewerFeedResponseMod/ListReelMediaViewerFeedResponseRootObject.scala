package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReelMediaViewerFeedResponseRootObject extends StObject {
  
  var next_max_id: String | Null
  
  var status: String
  
  var total_viewer_count: Double
  
  var updated_media: ListReelMediaViewerFeedResponseUpdatedMedia
  
  var user_count: Double
  
  var users: js.Array[ListReelMediaViewerFeedResponseUsersItem]
}
object ListReelMediaViewerFeedResponseRootObject {
  
  inline def apply(
    status: String,
    total_viewer_count: Double,
    updated_media: ListReelMediaViewerFeedResponseUpdatedMedia,
    user_count: Double,
    users: js.Array[ListReelMediaViewerFeedResponseUsersItem]
  ): ListReelMediaViewerFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], total_viewer_count = total_viewer_count.asInstanceOf[js.Any], updated_media = updated_media.asInstanceOf[js.Any], user_count = user_count.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], next_max_id = null)
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseRootObject]
  }
  
  extension [Self <: ListReelMediaViewerFeedResponseRootObject](x: Self) {
    
    inline def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
    
    inline def setNext_max_idNull: Self = StObject.set(x, "next_max_id", null)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTotal_viewer_count(value: Double): Self = StObject.set(x, "total_viewer_count", value.asInstanceOf[js.Any])
    
    inline def setUpdated_media(value: ListReelMediaViewerFeedResponseUpdatedMedia): Self = StObject.set(x, "updated_media", value.asInstanceOf[js.Any])
    
    inline def setUser_count(value: Double): Self = StObject.set(x, "user_count", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: js.Array[ListReelMediaViewerFeedResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: ListReelMediaViewerFeedResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
