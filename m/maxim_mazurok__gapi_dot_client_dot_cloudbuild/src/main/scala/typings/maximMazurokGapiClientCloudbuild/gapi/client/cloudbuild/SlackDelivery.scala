package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlackDelivery extends StObject {
  
  /** The secret reference for the Slack webhook URI for sending messages to a channel. */
  var webhookUri: js.UndefOr[NotifierSecretRef] = js.undefined
}
object SlackDelivery {
  
  inline def apply(): SlackDelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlackDelivery]
  }
  
  extension [Self <: SlackDelivery](x: Self) {
    
    inline def setWebhookUri(value: NotifierSecretRef): Self = StObject.set(x, "webhookUri", value.asInstanceOf[js.Any])
    
    inline def setWebhookUriUndefined: Self = StObject.set(x, "webhookUri", js.undefined)
  }
}
