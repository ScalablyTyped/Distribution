package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Template for notifications list response.
  */
@js.native
trait SchemaNotifications extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * List of notifications in this page.
    */
  var items: js.UndefOr[js.Array[SchemaNotification]] = js.native
  
  /**
    * The type of the resource.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Token for fetching the next page of notifications.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Number of unread notification for the domain.
    */
  var unreadNotificationsCount: js.UndefOr[Double] = js.native
}
object SchemaNotifications {
  
  @scala.inline
  def apply(): SchemaNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotifications]
  }
  
  @scala.inline
  implicit class SchemaNotificationsMutableBuilder[Self <: SchemaNotifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaNotification]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaNotification*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUnreadNotificationsCount(value: Double): Self = StObject.set(x, "unreadNotificationsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreadNotificationsCountUndefined: Self = StObject.set(x, "unreadNotificationsCount", js.undefined)
  }
}
