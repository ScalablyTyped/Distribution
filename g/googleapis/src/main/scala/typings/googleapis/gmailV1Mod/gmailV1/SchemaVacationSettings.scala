package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Vacation auto-reply settings for an account. These settings correspond to
  * the &quot;Vacation responder&quot; feature in the web interface.
  */
@js.native
trait SchemaVacationSettings extends js.Object {
  
  /**
    * Flag that controls whether Gmail automatically replies to messages.
    */
  var enableAutoReply: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional end time for sending auto-replies (epoch ms). When this is
    * specified, Gmail will automatically reply only to messages that it
    * receives before the end time. If both startTime and endTime are
    * specified, startTime must precede endTime.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Response body in HTML format. Gmail will sanitize the HTML before storing
    * it.
    */
  var responseBodyHtml: js.UndefOr[String] = js.native
  
  /**
    * Response body in plain text format.
    */
  var responseBodyPlainText: js.UndefOr[String] = js.native
  
  /**
    * Optional text to prepend to the subject line in vacation responses. In
    * order to enable auto-replies, either the response subject or the response
    * body must be nonempty.
    */
  var responseSubject: js.UndefOr[String] = js.native
  
  /**
    * Flag that determines whether responses are sent to recipients who are not
    * in the user&#39;s list of contacts.
    */
  var restrictToContacts: js.UndefOr[Boolean] = js.native
  
  /**
    * Flag that determines whether responses are sent to recipients who are
    * outside of the user&#39;s domain. This feature is only available for G
    * Suite users.
    */
  var restrictToDomain: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional start time for sending auto-replies (epoch ms). When this is
    * specified, Gmail will automatically reply only to messages that it
    * receives after the start time. If both startTime and endTime are
    * specified, startTime must precede endTime.
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaVacationSettings {
  
  @scala.inline
  def apply(): SchemaVacationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVacationSettings]
  }
  
  @scala.inline
  implicit class SchemaVacationSettingsOps[Self <: SchemaVacationSettings] (val x: Self) extends AnyVal {
    
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
    def setEnableAutoReply(value: Boolean): Self = this.set("enableAutoReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoReply: Self = this.set("enableAutoReply", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setResponseBodyHtml(value: String): Self = this.set("responseBodyHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseBodyHtml: Self = this.set("responseBodyHtml", js.undefined)
    
    @scala.inline
    def setResponseBodyPlainText(value: String): Self = this.set("responseBodyPlainText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseBodyPlainText: Self = this.set("responseBodyPlainText", js.undefined)
    
    @scala.inline
    def setResponseSubject(value: String): Self = this.set("responseSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseSubject: Self = this.set("responseSubject", js.undefined)
    
    @scala.inline
    def setRestrictToContacts(value: Boolean): Self = this.set("restrictToContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictToContacts: Self = this.set("restrictToContacts", js.undefined)
    
    @scala.inline
    def setRestrictToDomain(value: Boolean): Self = this.set("restrictToDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictToDomain: Self = this.set("restrictToDomain", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
