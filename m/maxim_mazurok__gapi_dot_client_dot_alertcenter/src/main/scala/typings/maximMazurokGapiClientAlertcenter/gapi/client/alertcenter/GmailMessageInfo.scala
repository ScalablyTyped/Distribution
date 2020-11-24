package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GmailMessageInfo extends js.Object {
  
  /** The `SHA256` hash of email's attachment and all MIME parts. */
  var attachmentsSha256Hash: js.UndefOr[js.Array[String]] = js.native
  
  /** The date the malicious email was sent. */
  var date: js.UndefOr[String] = js.native
  
  /** The hash of the message body text. */
  var md5HashMessageBody: js.UndefOr[String] = js.native
  
  /** The MD5 Hash of email's subject (only available for reported emails). */
  var md5HashSubject: js.UndefOr[String] = js.native
  
  /** The snippet of the message body text (only available for reported emails). */
  var messageBodySnippet: js.UndefOr[String] = js.native
  
  /** The message ID. */
  var messageId: js.UndefOr[String] = js.native
  
  /** The recipient of this email. */
  var recipient: js.UndefOr[String] = js.native
  
  /** The email subject text (only available for reported emails). */
  var subjectText: js.UndefOr[String] = js.native
}
object GmailMessageInfo {
  
  @scala.inline
  def apply(): GmailMessageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GmailMessageInfo]
  }
  
  @scala.inline
  implicit class GmailMessageInfoOps[Self <: GmailMessageInfo] (val x: Self) extends AnyVal {
    
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
    def setAttachmentsSha256HashVarargs(value: String*): Self = this.set("attachmentsSha256Hash", js.Array(value :_*))
    
    @scala.inline
    def setAttachmentsSha256Hash(value: js.Array[String]): Self = this.set("attachmentsSha256Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentsSha256Hash: Self = this.set("attachmentsSha256Hash", js.undefined)
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setMd5HashMessageBody(value: String): Self = this.set("md5HashMessageBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd5HashMessageBody: Self = this.set("md5HashMessageBody", js.undefined)
    
    @scala.inline
    def setMd5HashSubject(value: String): Self = this.set("md5HashSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd5HashSubject: Self = this.set("md5HashSubject", js.undefined)
    
    @scala.inline
    def setMessageBodySnippet(value: String): Self = this.set("messageBodySnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageBodySnippet: Self = this.set("messageBodySnippet", js.undefined)
    
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    
    @scala.inline
    def setRecipient(value: String): Self = this.set("recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipient: Self = this.set("recipient", js.undefined)
    
    @scala.inline
    def setSubjectText(value: String): Self = this.set("subjectText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectText: Self = this.set("subjectText", js.undefined)
  }
}
