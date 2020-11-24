package typings.maximMazurokGapiClientDfareporting.anon

import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.Recipient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailOwner extends js.Object {
  
  /** Whether the report should be emailed to the report owner. */
  var emailOwner: js.UndefOr[Boolean] = js.native
  
  /** The type of delivery for the owner to receive, if enabled. */
  var emailOwnerDeliveryType: js.UndefOr[String] = js.native
  
  /** The message to be sent with each email. */
  var message: js.UndefOr[String] = js.native
  
  /** The list of recipients to which to email the report. */
  var recipients: js.UndefOr[js.Array[Recipient]] = js.native
}
object EmailOwner {
  
  @scala.inline
  def apply(): EmailOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailOwner]
  }
  
  @scala.inline
  implicit class EmailOwnerOps[Self <: EmailOwner] (val x: Self) extends AnyVal {
    
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
    def setEmailOwner(value: Boolean): Self = this.set("emailOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailOwner: Self = this.set("emailOwner", js.undefined)
    
    @scala.inline
    def setEmailOwnerDeliveryType(value: String): Self = this.set("emailOwnerDeliveryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailOwnerDeliveryType: Self = this.set("emailOwnerDeliveryType", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: Recipient*): Self = this.set("recipients", js.Array(value :_*))
    
    @scala.inline
    def setRecipients(value: js.Array[Recipient]): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
  }
}
