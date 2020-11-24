package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SMTPDelivery extends js.Object {
  
  /** This is the SMTP account/email that appears in the `From:` of the email. If empty, it is assumed to be sender. */
  var fromAddress: js.UndefOr[String] = js.native
  
  /** The SMTP sender's password. */
  var password: js.UndefOr[NotifierSecretRef] = js.native
  
  /** The SMTP port of the server. */
  var port: js.UndefOr[String] = js.native
  
  /** This is the list of addresses to which we send the email (i.e. in the `To:` of the email). */
  var recipientAddresses: js.UndefOr[js.Array[String]] = js.native
  
  /** This is the SMTP account/email that is used to send the message. */
  var senderAddress: js.UndefOr[String] = js.native
  
  /** The address of the SMTP server. */
  var server: js.UndefOr[String] = js.native
}
object SMTPDelivery {
  
  @scala.inline
  def apply(): SMTPDelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMTPDelivery]
  }
  
  @scala.inline
  implicit class SMTPDeliveryOps[Self <: SMTPDelivery] (val x: Self) extends AnyVal {
    
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
    def setFromAddress(value: String): Self = this.set("fromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromAddress: Self = this.set("fromAddress", js.undefined)
    
    @scala.inline
    def setPassword(value: NotifierSecretRef): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setRecipientAddressesVarargs(value: String*): Self = this.set("recipientAddresses", js.Array(value :_*))
    
    @scala.inline
    def setRecipientAddresses(value: js.Array[String]): Self = this.set("recipientAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientAddresses: Self = this.set("recipientAddresses", js.undefined)
    
    @scala.inline
    def setSenderAddress(value: String): Self = this.set("senderAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderAddress: Self = this.set("senderAddress", js.undefined)
    
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
}
