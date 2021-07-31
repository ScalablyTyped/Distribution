package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Template for a notification resource.
  */
trait SchemaNotification extends StObject {
  
  /**
    * Body of the notification (Read-only)
    */
  var body: js.UndefOr[String] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Address from which the notification is received (Read-only)
    */
  var fromAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Boolean indicating whether the notification is unread or not.
    */
  var isUnread: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of the resource.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var notificationId: js.UndefOr[String] = js.undefined
  
  /**
    * Time at which notification was sent (Read-only)
    */
  var sendTime: js.UndefOr[String] = js.undefined
  
  /**
    * Subject of the notification (Read-only)
    */
  var subject: js.UndefOr[String] = js.undefined
}
object SchemaNotification {
  
  @scala.inline
  def apply(): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotification]
  }
  
  @scala.inline
  implicit class SchemaNotificationMutableBuilder[Self <: SchemaNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setFromAddress(value: String): Self = StObject.set(x, "fromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromAddressUndefined: Self = StObject.set(x, "fromAddress", js.undefined)
    
    @scala.inline
    def setIsUnread(value: Boolean): Self = StObject.set(x, "isUnread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUnreadUndefined: Self = StObject.set(x, "isUnread", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNotificationId(value: String): Self = StObject.set(x, "notificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationIdUndefined: Self = StObject.set(x, "notificationId", js.undefined)
    
    @scala.inline
    def setSendTime(value: String): Self = StObject.set(x, "sendTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendTimeUndefined: Self = StObject.set(x, "sendTime", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
