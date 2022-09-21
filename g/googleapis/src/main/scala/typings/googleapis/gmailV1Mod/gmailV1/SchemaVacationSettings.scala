package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVacationSettings extends StObject {
  
  /**
    * Flag that controls whether Gmail automatically replies to messages.
    */
  var enableAutoReply: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * An optional end time for sending auto-replies (epoch ms). When this is specified, Gmail will automatically reply only to messages that it receives before the end time. If both `startTime` and `endTime` are specified, `startTime` must precede `endTime`.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Response body in HTML format. Gmail will sanitize the HTML before storing it. If both `response_body_plain_text` and `response_body_html` are specified, `response_body_html` will be used.
    */
  var responseBodyHtml: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Response body in plain text format. If both `response_body_plain_text` and `response_body_html` are specified, `response_body_html` will be used.
    */
  var responseBodyPlainText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional text to prepend to the subject line in vacation responses. In order to enable auto-replies, either the response subject or the response body must be nonempty.
    */
  var responseSubject: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Flag that determines whether responses are sent to recipients who are not in the user's list of contacts.
    */
  var restrictToContacts: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Flag that determines whether responses are sent to recipients who are outside of the user's domain. This feature is only available for G Suite users.
    */
  var restrictToDomain: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * An optional start time for sending auto-replies (epoch ms). When this is specified, Gmail will automatically reply only to messages that it receives after the start time. If both `startTime` and `endTime` are specified, `startTime` must precede `endTime`.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaVacationSettings {
  
  inline def apply(): SchemaVacationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVacationSettings]
  }
  
  extension [Self <: SchemaVacationSettings](x: Self) {
    
    inline def setEnableAutoReply(value: Boolean): Self = StObject.set(x, "enableAutoReply", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoReplyNull: Self = StObject.set(x, "enableAutoReply", null)
    
    inline def setEnableAutoReplyUndefined: Self = StObject.set(x, "enableAutoReply", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setResponseBodyHtml(value: String): Self = StObject.set(x, "responseBodyHtml", value.asInstanceOf[js.Any])
    
    inline def setResponseBodyHtmlNull: Self = StObject.set(x, "responseBodyHtml", null)
    
    inline def setResponseBodyHtmlUndefined: Self = StObject.set(x, "responseBodyHtml", js.undefined)
    
    inline def setResponseBodyPlainText(value: String): Self = StObject.set(x, "responseBodyPlainText", value.asInstanceOf[js.Any])
    
    inline def setResponseBodyPlainTextNull: Self = StObject.set(x, "responseBodyPlainText", null)
    
    inline def setResponseBodyPlainTextUndefined: Self = StObject.set(x, "responseBodyPlainText", js.undefined)
    
    inline def setResponseSubject(value: String): Self = StObject.set(x, "responseSubject", value.asInstanceOf[js.Any])
    
    inline def setResponseSubjectNull: Self = StObject.set(x, "responseSubject", null)
    
    inline def setResponseSubjectUndefined: Self = StObject.set(x, "responseSubject", js.undefined)
    
    inline def setRestrictToContacts(value: Boolean): Self = StObject.set(x, "restrictToContacts", value.asInstanceOf[js.Any])
    
    inline def setRestrictToContactsNull: Self = StObject.set(x, "restrictToContacts", null)
    
    inline def setRestrictToContactsUndefined: Self = StObject.set(x, "restrictToContacts", js.undefined)
    
    inline def setRestrictToDomain(value: Boolean): Self = StObject.set(x, "restrictToDomain", value.asInstanceOf[js.Any])
    
    inline def setRestrictToDomainNull: Self = StObject.set(x, "restrictToDomain", null)
    
    inline def setRestrictToDomainUndefined: Self = StObject.set(x, "restrictToDomain", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
