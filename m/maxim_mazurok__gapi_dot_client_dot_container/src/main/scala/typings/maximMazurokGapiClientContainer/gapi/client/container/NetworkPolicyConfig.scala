package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkPolicyConfig extends StObject {
  
  /** Whether NetworkPolicy is enabled for this cluster. */
  var disabled: js.UndefOr[Boolean] = js.undefined
}
object NetworkPolicyConfig {
  
  inline def apply(): NetworkPolicyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPolicyConfig]
  }
  
  extension [Self <: NetworkPolicyConfig](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
