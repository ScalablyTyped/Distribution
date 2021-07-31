package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration to automatically mirror a repository from another hosting
  * service, for example GitHub or Bitbucket.
  */
trait SchemaMirrorConfig extends StObject {
  
  /**
    * ID of the SSH deploy key at the other hosting service. Removing this key
    * from the other service would deauthorize Google Cloud Source Repositories
    * from mirroring.
    */
  var deployKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * URL of the main repository at the other hosting service.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the webhook listening to updates to trigger mirroring. Removing
    * this webhook from the other hosting service will stop Google Cloud Source
    * Repositories from receiving notifications, and thereby disabling
    * mirroring.
    */
  var webhookId: js.UndefOr[String] = js.undefined
}
object SchemaMirrorConfig {
  
  @scala.inline
  def apply(): SchemaMirrorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMirrorConfig]
  }
  
  @scala.inline
  implicit class SchemaMirrorConfigMutableBuilder[Self <: SchemaMirrorConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployKeyId(value: String): Self = StObject.set(x, "deployKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployKeyIdUndefined: Self = StObject.set(x, "deployKeyId", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWebhookId(value: String): Self = StObject.set(x, "webhookId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookIdUndefined: Self = StObject.set(x, "webhookId", js.undefined)
  }
}
