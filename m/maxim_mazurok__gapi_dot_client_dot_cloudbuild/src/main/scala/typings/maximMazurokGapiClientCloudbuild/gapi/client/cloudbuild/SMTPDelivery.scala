package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SMTPDelivery extends StObject {
  
  /** This is the SMTP account/email that appears in the `From:` of the email. If empty, it is assumed to be sender. */
  var fromAddress: js.UndefOr[String] = js.undefined
  
  /** The SMTP sender's password. */
  var password: js.UndefOr[NotifierSecretRef] = js.undefined
  
  /** The SMTP port of the server. */
  var port: js.UndefOr[String] = js.undefined
  
  /** This is the list of addresses to which we send the email (i.e. in the `To:` of the email). */
  var recipientAddresses: js.UndefOr[js.Array[String]] = js.undefined
  
  /** This is the SMTP account/email that is used to send the message. */
  var senderAddress: js.UndefOr[String] = js.undefined
  
  /** The address of the SMTP server. */
  var server: js.UndefOr[String] = js.undefined
}
object SMTPDelivery {
  
  inline def apply(): SMTPDelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMTPDelivery]
  }
  
  extension [Self <: SMTPDelivery](x: Self) {
    
    inline def setFromAddress(value: String): Self = StObject.set(x, "fromAddress", value.asInstanceOf[js.Any])
    
    inline def setFromAddressUndefined: Self = StObject.set(x, "fromAddress", js.undefined)
    
    inline def setPassword(value: NotifierSecretRef): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setRecipientAddresses(value: js.Array[String]): Self = StObject.set(x, "recipientAddresses", value.asInstanceOf[js.Any])
    
    inline def setRecipientAddressesUndefined: Self = StObject.set(x, "recipientAddresses", js.undefined)
    
    inline def setRecipientAddressesVarargs(value: String*): Self = StObject.set(x, "recipientAddresses", js.Array(value :_*))
    
    inline def setSenderAddress(value: String): Self = StObject.set(x, "senderAddress", value.asInstanceOf[js.Any])
    
    inline def setSenderAddressUndefined: Self = StObject.set(x, "senderAddress", js.undefined)
    
    inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
