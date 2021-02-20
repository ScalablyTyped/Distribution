package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of a message in phishing spike alert.
  */
@js.native
trait SchemaGmailMessageInfo extends StObject {
  
  /**
    * The `SHA256` hash of email&#39;s attachment and all MIME parts.
    */
  var attachmentsSha256Hash: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The date the malicious email was sent.
    */
  var date: js.UndefOr[String] = js.native
  
  /**
    * The hash of the message body text.
    */
  var md5HashMessageBody: js.UndefOr[String] = js.native
  
  /**
    * The MD5 Hash of email&#39;s subject (only available for reported emails).
    */
  var md5HashSubject: js.UndefOr[String] = js.native
  
  /**
    * The snippet of the message body text (only available for reported
    * emails).
    */
  var messageBodySnippet: js.UndefOr[String] = js.native
  
  /**
    * The message ID.
    */
  var messageId: js.UndefOr[String] = js.native
  
  /**
    * The recipient of this email.
    */
  var recipient: js.UndefOr[String] = js.native
  
  /**
    * The email subject text (only available for reported emails).
    */
  var subjectText: js.UndefOr[String] = js.native
}
object SchemaGmailMessageInfo {
  
  @scala.inline
  def apply(): SchemaGmailMessageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGmailMessageInfo]
  }
  
  @scala.inline
  implicit class SchemaGmailMessageInfoMutableBuilder[Self <: SchemaGmailMessageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentsSha256Hash(value: js.Array[String]): Self = StObject.set(x, "attachmentsSha256Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsSha256HashUndefined: Self = StObject.set(x, "attachmentsSha256Hash", js.undefined)
    
    @scala.inline
    def setAttachmentsSha256HashVarargs(value: String*): Self = StObject.set(x, "attachmentsSha256Hash", js.Array(value :_*))
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setMd5HashMessageBody(value: String): Self = StObject.set(x, "md5HashMessageBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5HashMessageBodyUndefined: Self = StObject.set(x, "md5HashMessageBody", js.undefined)
    
    @scala.inline
    def setMd5HashSubject(value: String): Self = StObject.set(x, "md5HashSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5HashSubjectUndefined: Self = StObject.set(x, "md5HashSubject", js.undefined)
    
    @scala.inline
    def setMessageBodySnippet(value: String): Self = StObject.set(x, "messageBodySnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageBodySnippetUndefined: Self = StObject.set(x, "messageBodySnippet", js.undefined)
    
    @scala.inline
    def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    @scala.inline
    def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    @scala.inline
    def setSubjectText(value: String): Self = StObject.set(x, "subjectText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectTextUndefined: Self = StObject.set(x, "subjectText", js.undefined)
  }
}
