package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Vacation auto-reply settings for an account. These settings correspond to
  * the &quot;Vacation responder&quot; feature in the web interface.
  */
trait SchemaVacationSettings extends StObject {
  
  /**
    * Flag that controls whether Gmail automatically replies to messages.
    */
  var enableAutoReply: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional end time for sending auto-replies (epoch ms). When this is
    * specified, Gmail will automatically reply only to messages that it
    * receives before the end time. If both startTime and endTime are
    * specified, startTime must precede endTime.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Response body in HTML format. Gmail will sanitize the HTML before storing
    * it.
    */
  var responseBodyHtml: js.UndefOr[String] = js.undefined
  
  /**
    * Response body in plain text format.
    */
  var responseBodyPlainText: js.UndefOr[String] = js.undefined
  
  /**
    * Optional text to prepend to the subject line in vacation responses. In
    * order to enable auto-replies, either the response subject or the response
    * body must be nonempty.
    */
  var responseSubject: js.UndefOr[String] = js.undefined
  
  /**
    * Flag that determines whether responses are sent to recipients who are not
    * in the user&#39;s list of contacts.
    */
  var restrictToContacts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Flag that determines whether responses are sent to recipients who are
    * outside of the user&#39;s domain. This feature is only available for G
    * Suite users.
    */
  var restrictToDomain: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional start time for sending auto-replies (epoch ms). When this is
    * specified, Gmail will automatically reply only to messages that it
    * receives after the start time. If both startTime and endTime are
    * specified, startTime must precede endTime.
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object SchemaVacationSettings {
  
  @scala.inline
  def apply(): SchemaVacationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVacationSettings]
  }
  
  @scala.inline
  implicit class SchemaVacationSettingsMutableBuilder[Self <: SchemaVacationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableAutoReply(value: Boolean): Self = StObject.set(x, "enableAutoReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoReplyUndefined: Self = StObject.set(x, "enableAutoReply", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setResponseBodyHtml(value: String): Self = StObject.set(x, "responseBodyHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseBodyHtmlUndefined: Self = StObject.set(x, "responseBodyHtml", js.undefined)
    
    @scala.inline
    def setResponseBodyPlainText(value: String): Self = StObject.set(x, "responseBodyPlainText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseBodyPlainTextUndefined: Self = StObject.set(x, "responseBodyPlainText", js.undefined)
    
    @scala.inline
    def setResponseSubject(value: String): Self = StObject.set(x, "responseSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseSubjectUndefined: Self = StObject.set(x, "responseSubject", js.undefined)
    
    @scala.inline
    def setRestrictToContacts(value: Boolean): Self = StObject.set(x, "restrictToContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictToContactsUndefined: Self = StObject.set(x, "restrictToContacts", js.undefined)
    
    @scala.inline
    def setRestrictToDomain(value: Boolean): Self = StObject.set(x, "restrictToDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictToDomainUndefined: Self = StObject.set(x, "restrictToDomain", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
