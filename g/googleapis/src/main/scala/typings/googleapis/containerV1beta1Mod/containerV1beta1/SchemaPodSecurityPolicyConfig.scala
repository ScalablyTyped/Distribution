package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for the PodSecurityPolicy feature.
  */
trait SchemaPodSecurityPolicyConfig extends StObject {
  
  /**
    * Enable the PodSecurityPolicy controller for this cluster. If enabled,
    * pods must be valid under a PodSecurityPolicy to be created.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaPodSecurityPolicyConfig {
  
  inline def apply(): SchemaPodSecurityPolicyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPodSecurityPolicyConfig]
  }
  
  extension [Self <: SchemaPodSecurityPolicyConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
