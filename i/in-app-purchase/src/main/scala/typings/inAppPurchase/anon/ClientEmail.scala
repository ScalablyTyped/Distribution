package typings.inAppPurchase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientEmail extends js.Object {
  
  // client email from Google API service account JSON key file
  var clientEmail: String = js.native
  
  // private key string from Google API service account JSON key file
  var privateKey: String = js.native
}
object ClientEmail {
  
  @scala.inline
  def apply(clientEmail: String, privateKey: String): ClientEmail = {
    val __obj = js.Dynamic.literal(clientEmail = clientEmail.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientEmail]
  }
  
  @scala.inline
  implicit class ClientEmailOps[Self <: ClientEmail] (val x: Self) extends AnyVal {
    
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
    def setClientEmail(value: String): Self = this.set("clientEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
  }
}
