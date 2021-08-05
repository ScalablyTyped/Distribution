package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShieldedNodes extends StObject {
  
  /** Whether Shielded Nodes features are enabled on all nodes in this cluster. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object ShieldedNodes {
  
  inline def apply(): ShieldedNodes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShieldedNodes]
  }
  
  extension [Self <: ShieldedNodes](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
