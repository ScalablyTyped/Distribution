package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GmailMessageInfo extends StObject {
  
  /** The `SHA256` hash of email's attachment and all MIME parts. */
  var attachmentsSha256Hash: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The date the malicious email was sent. */
  var date: js.UndefOr[String] = js.undefined
  
  /** The hash of the message body text. */
  var md5HashMessageBody: js.UndefOr[String] = js.undefined
  
  /** The MD5 Hash of email's subject (only available for reported emails). */
  var md5HashSubject: js.UndefOr[String] = js.undefined
  
  /** The snippet of the message body text (only available for reported emails). */
  var messageBodySnippet: js.UndefOr[String] = js.undefined
  
  /** The message ID. */
  var messageId: js.UndefOr[String] = js.undefined
  
  /** The recipient of this email. */
  var recipient: js.UndefOr[String] = js.undefined
  
  /** The email subject text (only available for reported emails). */
  var subjectText: js.UndefOr[String] = js.undefined
}
object GmailMessageInfo {
  
  inline def apply(): GmailMessageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GmailMessageInfo]
  }
  
  extension [Self <: GmailMessageInfo](x: Self) {
    
    inline def setAttachmentsSha256Hash(value: js.Array[String]): Self = StObject.set(x, "attachmentsSha256Hash", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsSha256HashUndefined: Self = StObject.set(x, "attachmentsSha256Hash", js.undefined)
    
    inline def setAttachmentsSha256HashVarargs(value: String*): Self = StObject.set(x, "attachmentsSha256Hash", js.Array(value :_*))
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setMd5HashMessageBody(value: String): Self = StObject.set(x, "md5HashMessageBody", value.asInstanceOf[js.Any])
    
    inline def setMd5HashMessageBodyUndefined: Self = StObject.set(x, "md5HashMessageBody", js.undefined)
    
    inline def setMd5HashSubject(value: String): Self = StObject.set(x, "md5HashSubject", value.asInstanceOf[js.Any])
    
    inline def setMd5HashSubjectUndefined: Self = StObject.set(x, "md5HashSubject", js.undefined)
    
    inline def setMessageBodySnippet(value: String): Self = StObject.set(x, "messageBodySnippet", value.asInstanceOf[js.Any])
    
    inline def setMessageBodySnippetUndefined: Self = StObject.set(x, "messageBodySnippet", js.undefined)
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    inline def setSubjectText(value: String): Self = StObject.set(x, "subjectText", value.asInstanceOf[js.Any])
    
    inline def setSubjectTextUndefined: Self = StObject.set(x, "subjectText", js.undefined)
  }
}
