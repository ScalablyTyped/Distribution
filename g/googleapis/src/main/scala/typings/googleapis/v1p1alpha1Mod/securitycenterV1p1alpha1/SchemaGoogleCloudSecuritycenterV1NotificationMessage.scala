package typings.googleapis.v1p1alpha1Mod.securitycenterV1p1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSecuritycenterV1NotificationMessage extends StObject {
  
  /**
    * If it&#39;s a Finding based notification config, this field will be populated.
    */
  var finding: js.UndefOr[SchemaFinding] = js.undefined
  
  /**
    * Name of the notification config that generated current notification.
    */
  var notificationConfigName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Cloud resource tied to this notification&#39;s Finding.
    */
  var resource: js.UndefOr[SchemaGoogleCloudSecuritycenterV1Resource] = js.undefined
}
object SchemaGoogleCloudSecuritycenterV1NotificationMessage {
  
  inline def apply(): SchemaGoogleCloudSecuritycenterV1NotificationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSecuritycenterV1NotificationMessage]
  }
  
  extension [Self <: SchemaGoogleCloudSecuritycenterV1NotificationMessage](x: Self) {
    
    inline def setFinding(value: SchemaFinding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    inline def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    inline def setNotificationConfigName(value: String): Self = StObject.set(x, "notificationConfigName", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigNameNull: Self = StObject.set(x, "notificationConfigName", null)
    
    inline def setNotificationConfigNameUndefined: Self = StObject.set(x, "notificationConfigName", js.undefined)
    
    inline def setResource(value: SchemaGoogleCloudSecuritycenterV1Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
