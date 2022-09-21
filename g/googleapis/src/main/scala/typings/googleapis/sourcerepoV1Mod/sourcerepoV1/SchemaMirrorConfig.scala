package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMirrorConfig extends StObject {
  
  /**
    * ID of the SSH deploy key at the other hosting service. Removing this key from the other service would deauthorize Google Cloud Source Repositories from mirroring.
    */
  var deployKeyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of the main repository at the other hosting service.
    */
  var url: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the webhook listening to updates to trigger mirroring. Removing this webhook from the other hosting service will stop Google Cloud Source Repositories from receiving notifications, and thereby disabling mirroring.
    */
  var webhookId: js.UndefOr[String | Null] = js.undefined
}
object SchemaMirrorConfig {
  
  inline def apply(): SchemaMirrorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMirrorConfig]
  }
  
  extension [Self <: SchemaMirrorConfig](x: Self) {
    
    inline def setDeployKeyId(value: String): Self = StObject.set(x, "deployKeyId", value.asInstanceOf[js.Any])
    
    inline def setDeployKeyIdNull: Self = StObject.set(x, "deployKeyId", null)
    
    inline def setDeployKeyIdUndefined: Self = StObject.set(x, "deployKeyId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWebhookId(value: String): Self = StObject.set(x, "webhookId", value.asInstanceOf[js.Any])
    
    inline def setWebhookIdNull: Self = StObject.set(x, "webhookId", null)
    
    inline def setWebhookIdUndefined: Self = StObject.set(x, "webhookId", js.undefined)
  }
}
