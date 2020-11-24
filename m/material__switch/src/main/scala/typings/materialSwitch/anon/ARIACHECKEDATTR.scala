package typings.materialSwitch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARIACHECKEDATTR extends js.Object {
  
  var ARIA_CHECKED_ATTR: String = js.native
  
  var NATIVE_CONTROL_SELECTOR: String = js.native
  
  var RIPPLE_SURFACE_SELECTOR: String = js.native
}
object ARIACHECKEDATTR {
  
  @scala.inline
  def apply(ARIA_CHECKED_ATTR: String, NATIVE_CONTROL_SELECTOR: String, RIPPLE_SURFACE_SELECTOR: String): ARIACHECKEDATTR = {
    val __obj = js.Dynamic.literal(ARIA_CHECKED_ATTR = ARIA_CHECKED_ATTR.asInstanceOf[js.Any], NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR.asInstanceOf[js.Any], RIPPLE_SURFACE_SELECTOR = RIPPLE_SURFACE_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIACHECKEDATTR]
  }
  
  @scala.inline
  implicit class ARIACHECKEDATTROps[Self <: ARIACHECKEDATTR] (val x: Self) extends AnyVal {
    
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
    def setARIA_CHECKED_ATTR(value: String): Self = this.set("ARIA_CHECKED_ATTR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNATIVE_CONTROL_SELECTOR(value: String): Self = this.set("NATIVE_CONTROL_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRIPPLE_SURFACE_SELECTOR(value: String): Self = this.set("RIPPLE_SURFACE_SELECTOR", value.asInstanceOf[js.Any])
  }
}
