package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebhookConfig extends StObject {
  
  /** Required. Resource name for the secret required as a URL parameter. */
  var secret: js.UndefOr[String] = js.undefined
  
  /** Potential issues with the underlying Pub/Sub subscription configuration. Only populated on get requests. */
  var state: js.UndefOr[String] = js.undefined
}
object WebhookConfig {
  
  inline def apply(): WebhookConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookConfig]
  }
  
  extension [Self <: WebhookConfig](x: Self) {
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
