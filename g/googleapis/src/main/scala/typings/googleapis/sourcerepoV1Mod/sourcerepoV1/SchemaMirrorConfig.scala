package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration to automatically mirror a repository from another hosting
  * service, for example GitHub or Bitbucket.
  */
@js.native
trait SchemaMirrorConfig extends js.Object {
  
  /**
    * ID of the SSH deploy key at the other hosting service. Removing this key
    * from the other service would deauthorize Google Cloud Source Repositories
    * from mirroring.
    */
  var deployKeyId: js.UndefOr[String] = js.native
  
  /**
    * URL of the main repository at the other hosting service.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * ID of the webhook listening to updates to trigger mirroring. Removing
    * this webhook from the other hosting service will stop Google Cloud Source
    * Repositories from receiving notifications, and thereby disabling
    * mirroring.
    */
  var webhookId: js.UndefOr[String] = js.native
}
object SchemaMirrorConfig {
  
  @scala.inline
  def apply(): SchemaMirrorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMirrorConfig]
  }
  
  @scala.inline
  implicit class SchemaMirrorConfigOps[Self <: SchemaMirrorConfig] (val x: Self) extends AnyVal {
    
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
    def setDeployKeyId(value: String): Self = this.set("deployKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployKeyId: Self = this.set("deployKeyId", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWebhookId(value: String): Self = this.set("webhookId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhookId: Self = this.set("webhookId", js.undefined)
  }
}
