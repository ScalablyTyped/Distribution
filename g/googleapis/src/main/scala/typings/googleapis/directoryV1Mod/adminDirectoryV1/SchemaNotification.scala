package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Template for a notification resource.
  */
@js.native
trait SchemaNotification extends js.Object {
  
  /**
    * Body of the notification (Read-only)
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Address from which the notification is received (Read-only)
    */
  var fromAddress: js.UndefOr[String] = js.native
  
  /**
    * Boolean indicating whether the notification is unread or not.
    */
  var isUnread: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of the resource.
    */
  var kind: js.UndefOr[String] = js.native
  
  var notificationId: js.UndefOr[String] = js.native
  
  /**
    * Time at which notification was sent (Read-only)
    */
  var sendTime: js.UndefOr[String] = js.native
  
  /**
    * Subject of the notification (Read-only)
    */
  var subject: js.UndefOr[String] = js.native
}
object SchemaNotification {
  
  @scala.inline
  def apply(): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotification]
  }
  
  @scala.inline
  implicit class SchemaNotificationOps[Self <: SchemaNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setFromAddress(value: String): Self = this.set("fromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromAddress: Self = this.set("fromAddress", js.undefined)
    
    @scala.inline
    def setIsUnread(value: Boolean): Self = this.set("isUnread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUnread: Self = this.set("isUnread", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNotificationId(value: String): Self = this.set("notificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationId: Self = this.set("notificationId", js.undefined)
    
    @scala.inline
    def setSendTime(value: String): Self = this.set("sendTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendTime: Self = this.set("sendTime", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
