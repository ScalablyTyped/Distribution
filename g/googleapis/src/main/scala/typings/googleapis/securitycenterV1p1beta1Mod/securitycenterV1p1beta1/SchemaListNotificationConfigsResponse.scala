package typings.googleapis.securitycenterV1p1beta1Mod.securitycenterV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListNotificationConfigsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Notification configs belonging to the requested parent.
    */
  var notificationConfigs: js.UndefOr[js.Array[SchemaNotificationConfig]] = js.undefined
}
object SchemaListNotificationConfigsResponse {
  
  inline def apply(): SchemaListNotificationConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNotificationConfigsResponse]
  }
  
  extension [Self <: SchemaListNotificationConfigsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNotificationConfigs(value: js.Array[SchemaNotificationConfig]): Self = StObject.set(x, "notificationConfigs", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigsUndefined: Self = StObject.set(x, "notificationConfigs", js.undefined)
    
    inline def setNotificationConfigsVarargs(value: SchemaNotificationConfig*): Self = StObject.set(x, "notificationConfigs", js.Array(value*))
  }
}
