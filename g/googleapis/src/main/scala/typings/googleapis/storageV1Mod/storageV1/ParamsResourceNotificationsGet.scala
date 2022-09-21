package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNotificationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The parent bucket of the notification.
    */
  var bucket: js.UndefOr[String] = js.undefined
  
  /**
    * Notification ID
    */
  var notification: js.UndefOr[String] = js.undefined
  
  /**
    * The project to be billed for this request. Required for Requester Pays buckets.
    */
  var userProject: js.UndefOr[String] = js.undefined
}
object ParamsResourceNotificationsGet {
  
  inline def apply(): ParamsResourceNotificationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNotificationsGet]
  }
  
  extension [Self <: ParamsResourceNotificationsGet](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setNotification(value: String): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
