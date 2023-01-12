package typings.libp2p.mod

import typings.libp2p.distSrcCircuitMod.AutoRelayConfig
import typings.libp2p.distSrcCircuitMod.RelayAdvertiseConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelayConfig extends StObject {
  
  var advertise: RelayAdvertiseConfig
  
  var autoRelay: AutoRelayConfig
  
  var enabled: Boolean
  
  var hop: HopConfig
}
object RelayConfig {
  
  inline def apply(advertise: RelayAdvertiseConfig, autoRelay: AutoRelayConfig, enabled: Boolean, hop: HopConfig): RelayConfig = {
    val __obj = js.Dynamic.literal(advertise = advertise.asInstanceOf[js.Any], autoRelay = autoRelay.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hop = hop.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelayConfig] (val x: Self) extends AnyVal {
    
    inline def setAdvertise(value: RelayAdvertiseConfig): Self = StObject.set(x, "advertise", value.asInstanceOf[js.Any])
    
    inline def setAutoRelay(value: AutoRelayConfig): Self = StObject.set(x, "autoRelay", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setHop(value: HopConfig): Self = StObject.set(x, "hop", value.asInstanceOf[js.Any])
  }
}
