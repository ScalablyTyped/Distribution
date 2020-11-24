package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for the PodSecurityPolicy feature.
  */
@js.native
trait SchemaPodSecurityPolicyConfig extends js.Object {
  
  /**
    * Enable the PodSecurityPolicy controller for this cluster. If enabled,
    * pods must be valid under a PodSecurityPolicy to be created.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}
object SchemaPodSecurityPolicyConfig {
  
  @scala.inline
  def apply(): SchemaPodSecurityPolicyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPodSecurityPolicyConfig]
  }
  
  @scala.inline
  implicit class SchemaPodSecurityPolicyConfigOps[Self <: SchemaPodSecurityPolicyConfig] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
}
