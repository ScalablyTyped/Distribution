package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ListNotificationChannels response.
  */
trait SchemaListNotificationChannelsResponse extends StObject {
  
  /**
    * If not empty, indicates that there may be more results that match the
    * request. Use the value in the page_token field in a subsequent request to
    * fetch the next set of results. If empty, all results have been returned.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The notification channels defined for the specified project.
    */
  var notificationChannels: js.UndefOr[js.Array[SchemaNotificationChannel]] = js.undefined
}
object SchemaListNotificationChannelsResponse {
  
  inline def apply(): SchemaListNotificationChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNotificationChannelsResponse]
  }
  
  extension [Self <: SchemaListNotificationChannelsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNotificationChannels(value: js.Array[SchemaNotificationChannel]): Self = StObject.set(x, "notificationChannels", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannelsUndefined: Self = StObject.set(x, "notificationChannels", js.undefined)
    
    inline def setNotificationChannelsVarargs(value: SchemaNotificationChannel*): Self = StObject.set(x, "notificationChannels", js.Array(value :_*))
  }
}
