package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSecuritycenterV1p1beta1NotificationMessage extends StObject {
  
  /**
    * If it's a Finding based notification config, this field will be populated.
    */
  var finding: js.UndefOr[SchemaGoogleCloudSecuritycenterV1p1beta1Finding] = js.undefined
  
  /**
    * Name of the notification config that generated current notification.
    */
  var notificationConfigName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Cloud resource tied to the notification.
    */
  var resource: js.UndefOr[SchemaGoogleCloudSecuritycenterV1p1beta1Resource] = js.undefined
}
object SchemaGoogleCloudSecuritycenterV1p1beta1NotificationMessage {
  
  inline def apply(): SchemaGoogleCloudSecuritycenterV1p1beta1NotificationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSecuritycenterV1p1beta1NotificationMessage]
  }
  
  extension [Self <: SchemaGoogleCloudSecuritycenterV1p1beta1NotificationMessage](x: Self) {
    
    inline def setFinding(value: SchemaGoogleCloudSecuritycenterV1p1beta1Finding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    inline def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    inline def setNotificationConfigName(value: String): Self = StObject.set(x, "notificationConfigName", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigNameNull: Self = StObject.set(x, "notificationConfigName", null)
    
    inline def setNotificationConfigNameUndefined: Self = StObject.set(x, "notificationConfigName", js.undefined)
    
    inline def setResource(value: SchemaGoogleCloudSecuritycenterV1p1beta1Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
