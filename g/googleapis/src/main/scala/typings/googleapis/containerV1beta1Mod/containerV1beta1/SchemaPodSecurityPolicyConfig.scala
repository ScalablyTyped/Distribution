package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for the PodSecurityPolicy feature.
  */
@js.native
trait SchemaPodSecurityPolicyConfig extends StObject {
  
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
  implicit class SchemaPodSecurityPolicyConfigMutableBuilder[Self <: SchemaPodSecurityPolicyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
