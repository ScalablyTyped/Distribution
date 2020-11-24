package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlackDelivery extends js.Object {
  
  /** The secret reference for the Slack webhook URI for sending messages to a channel. */
  var webhookUri: js.UndefOr[NotifierSecretRef] = js.native
}
object SlackDelivery {
  
  @scala.inline
  def apply(): SlackDelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlackDelivery]
  }
  
  @scala.inline
  implicit class SlackDeliveryOps[Self <: SlackDelivery] (val x: Self) extends AnyVal {
    
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
    def setWebhookUri(value: NotifierSecretRef): Self = this.set("webhookUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhookUri: Self = this.set("webhookUri", js.undefined)
  }
}
