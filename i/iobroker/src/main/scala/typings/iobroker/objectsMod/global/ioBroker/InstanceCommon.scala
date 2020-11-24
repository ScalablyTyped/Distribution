package typings.iobroker.objectsMod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceCommon extends ObjectCommon {
  
  // Make it possible to narrow the object type using the custom property
  var custom: js.UndefOr[scala.Nothing] = js.native
  
  var enabled: Boolean = js.native
  
  /** The name of the host where this instance is running */
  var host: String = js.native
  
  /** How and when this instance should be started */
  var mode: InstanceMode = js.native
}
object InstanceCommon {
  
  @scala.inline
  def apply(enabled: Boolean, host: String, mode: InstanceMode, name: StringOrTranslated): InstanceCommon = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceCommon]
  }
  
  @scala.inline
  implicit class InstanceCommonOps[Self <: InstanceCommon] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: InstanceMode): Self = this.set("mode", value.asInstanceOf[js.Any])
  }
}
