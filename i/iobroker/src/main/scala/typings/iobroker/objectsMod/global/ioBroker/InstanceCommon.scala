package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerInts.`1`
import typings.iobroker.iobrokerInts.`2`
import typings.iobroker.iobrokerInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceCommon
  extends StObject
     with ObjectCommon {
  
  // Make it possible to narrow the object type using the custom property
  var custom: Unit
  
  var enabled: Boolean
  
  /** The name of the host where this instance is running */
  var host: String
  
  /** How and when this instance should be started */
  var mode: InstanceMode
  
  /**
    * The starting priority of this adapter:
    * - **1:** Logic adapters
    * - **2:** Data providers
    * - **3:** All other adapters
    */
  var tier: js.UndefOr[`1` | `2` | `3`] = js.undefined
}
object InstanceCommon {
  
  inline def apply(custom: Unit, enabled: Boolean, host: String, mode: InstanceMode, name: StringOrTranslated): InstanceCommon = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceCommon]
  }
  
  extension [Self <: InstanceCommon](x: Self) {
    
    inline def setCustom(value: Unit): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setMode(value: InstanceMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setTier(value: `1` | `2` | `3`): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
