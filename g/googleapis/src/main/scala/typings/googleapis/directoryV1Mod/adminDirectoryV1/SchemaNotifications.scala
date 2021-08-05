package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Template for notifications list response.
  */
trait SchemaNotifications extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * List of notifications in this page.
    */
  var items: js.UndefOr[js.Array[SchemaNotification]] = js.undefined
  
  /**
    * The type of the resource.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Token for fetching the next page of notifications.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Number of unread notification for the domain.
    */
  var unreadNotificationsCount: js.UndefOr[Double] = js.undefined
}
object SchemaNotifications {
  
  inline def apply(): SchemaNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotifications]
  }
  
  extension [Self <: SchemaNotifications](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[SchemaNotification]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaNotification*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreadNotificationsCount(value: Double): Self = StObject.set(x, "unreadNotificationsCount", value.asInstanceOf[js.Any])
    
    inline def setUnreadNotificationsCountUndefined: Self = StObject.set(x, "unreadNotificationsCount", js.undefined)
  }
}
