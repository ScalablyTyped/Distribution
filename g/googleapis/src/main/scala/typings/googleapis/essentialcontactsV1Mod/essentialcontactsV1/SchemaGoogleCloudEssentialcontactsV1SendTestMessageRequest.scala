package typings.googleapis.essentialcontactsV1Mod.essentialcontactsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudEssentialcontactsV1SendTestMessageRequest extends StObject {
  
  /**
    * Required. The list of names of the contacts to send a test message to. Format: organizations/{organization_id\}/contacts/{contact_id\}, folders/{folder_id\}/contacts/{contact_id\} or projects/{project_id\}/contacts/{contact_id\}
    */
  var contacts: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The notification category to send the test message for. All contacts must be subscribed to this category.
    */
  var notificationCategory: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudEssentialcontactsV1SendTestMessageRequest {
  
  inline def apply(): SchemaGoogleCloudEssentialcontactsV1SendTestMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudEssentialcontactsV1SendTestMessageRequest]
  }
  
  extension [Self <: SchemaGoogleCloudEssentialcontactsV1SendTestMessageRequest](x: Self) {
    
    inline def setContacts(value: js.Array[String]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsNull: Self = StObject.set(x, "contacts", null)
    
    inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    inline def setContactsVarargs(value: String*): Self = StObject.set(x, "contacts", js.Array(value*))
    
    inline def setNotificationCategory(value: String): Self = StObject.set(x, "notificationCategory", value.asInstanceOf[js.Any])
    
    inline def setNotificationCategoryNull: Self = StObject.set(x, "notificationCategory", null)
    
    inline def setNotificationCategoryUndefined: Self = StObject.set(x, "notificationCategory", js.undefined)
  }
}
