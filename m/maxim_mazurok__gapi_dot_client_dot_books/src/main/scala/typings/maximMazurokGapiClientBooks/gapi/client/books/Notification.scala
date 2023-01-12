package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notification extends StObject {
  
  var body: js.UndefOr[String] = js.undefined
  
  /** The list of crm experiment ids. */
  var crmExperimentIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var doc_id: js.UndefOr[String] = js.undefined
  
  var doc_type: js.UndefOr[String] = js.undefined
  
  var dont_show_notification: js.UndefOr[Boolean] = js.undefined
  
  var iconUrl: js.UndefOr[String] = js.undefined
  
  var is_document_mature: js.UndefOr[Boolean] = js.undefined
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  
  var notificationGroup: js.UndefOr[String] = js.undefined
  
  var notification_type: js.UndefOr[String] = js.undefined
  
  var pcampaign_id: js.UndefOr[String] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
  
  var show_notification_settings_action: js.UndefOr[Boolean] = js.undefined
  
  var targetUrl: js.UndefOr[String] = js.undefined
  
  var timeToExpireMs: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object Notification {
  
  inline def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCrmExperimentIds(value: js.Array[String]): Self = StObject.set(x, "crmExperimentIds", value.asInstanceOf[js.Any])
    
    inline def setCrmExperimentIdsUndefined: Self = StObject.set(x, "crmExperimentIds", js.undefined)
    
    inline def setCrmExperimentIdsVarargs(value: String*): Self = StObject.set(x, "crmExperimentIds", js.Array(value*))
    
    inline def setDoc_id(value: String): Self = StObject.set(x, "doc_id", value.asInstanceOf[js.Any])
    
    inline def setDoc_idUndefined: Self = StObject.set(x, "doc_id", js.undefined)
    
    inline def setDoc_type(value: String): Self = StObject.set(x, "doc_type", value.asInstanceOf[js.Any])
    
    inline def setDoc_typeUndefined: Self = StObject.set(x, "doc_type", js.undefined)
    
    inline def setDont_show_notification(value: Boolean): Self = StObject.set(x, "dont_show_notification", value.asInstanceOf[js.Any])
    
    inline def setDont_show_notificationUndefined: Self = StObject.set(x, "dont_show_notification", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setIs_document_mature(value: Boolean): Self = StObject.set(x, "is_document_mature", value.asInstanceOf[js.Any])
    
    inline def setIs_document_matureUndefined: Self = StObject.set(x, "is_document_mature", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNotificationGroup(value: String): Self = StObject.set(x, "notificationGroup", value.asInstanceOf[js.Any])
    
    inline def setNotificationGroupUndefined: Self = StObject.set(x, "notificationGroup", js.undefined)
    
    inline def setNotification_type(value: String): Self = StObject.set(x, "notification_type", value.asInstanceOf[js.Any])
    
    inline def setNotification_typeUndefined: Self = StObject.set(x, "notification_type", js.undefined)
    
    inline def setPcampaign_id(value: String): Self = StObject.set(x, "pcampaign_id", value.asInstanceOf[js.Any])
    
    inline def setPcampaign_idUndefined: Self = StObject.set(x, "pcampaign_id", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setShow_notification_settings_action(value: Boolean): Self = StObject.set(x, "show_notification_settings_action", value.asInstanceOf[js.Any])
    
    inline def setShow_notification_settings_actionUndefined: Self = StObject.set(x, "show_notification_settings_action", js.undefined)
    
    inline def setTargetUrl(value: String): Self = StObject.set(x, "targetUrl", value.asInstanceOf[js.Any])
    
    inline def setTargetUrlUndefined: Self = StObject.set(x, "targetUrl", js.undefined)
    
    inline def setTimeToExpireMs(value: String): Self = StObject.set(x, "timeToExpireMs", value.asInstanceOf[js.Any])
    
    inline def setTimeToExpireMsUndefined: Self = StObject.set(x, "timeToExpireMs", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
