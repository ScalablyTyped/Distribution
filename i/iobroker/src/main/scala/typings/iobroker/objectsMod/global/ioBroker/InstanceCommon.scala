package typings.iobroker.objectsMod.global.ioBroker

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
}
object InstanceCommon {
  
  @scala.inline
  def apply(custom: Unit, enabled: Boolean, host: String, mode: InstanceMode, name: StringOrTranslated): InstanceCommon = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceCommon]
  }
  
  @scala.inline
  implicit class InstanceCommonMutableBuilder[Self <: InstanceCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom(value: Unit): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: InstanceMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
