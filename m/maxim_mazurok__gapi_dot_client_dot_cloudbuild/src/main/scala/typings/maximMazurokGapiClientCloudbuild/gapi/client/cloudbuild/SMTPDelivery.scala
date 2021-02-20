package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SMTPDelivery extends StObject {
  
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
  implicit class SMTPDeliveryMutableBuilder[Self <: SMTPDelivery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromAddress(value: String): Self = StObject.set(x, "fromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromAddressUndefined: Self = StObject.set(x, "fromAddress", js.undefined)
    
    @scala.inline
    def setPassword(value: NotifierSecretRef): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setRecipientAddresses(value: js.Array[String]): Self = StObject.set(x, "recipientAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientAddressesUndefined: Self = StObject.set(x, "recipientAddresses", js.undefined)
    
    @scala.inline
    def setRecipientAddressesVarargs(value: String*): Self = StObject.set(x, "recipientAddresses", js.Array(value :_*))
    
    @scala.inline
    def setSenderAddress(value: String): Self = StObject.set(x, "senderAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderAddressUndefined: Self = StObject.set(x, "senderAddress", js.undefined)
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
