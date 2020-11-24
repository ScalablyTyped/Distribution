package typings.materialSwitch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CHECKED extends js.Object {
  
  var CHECKED: String = js.native
  
  var DISABLED: String = js.native
}
object CHECKED {
  
  @scala.inline
  def apply(CHECKED: String, DISABLED: String): CHECKED = {
    val __obj = js.Dynamic.literal(CHECKED = CHECKED.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any])
    __obj.asInstanceOf[CHECKED]
  }
  
  @scala.inline
  implicit class CHECKEDOps[Self <: CHECKED] (val x: Self) extends AnyVal {
    
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
    def setCHECKED(value: String): Self = this.set("CHECKED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDISABLED(value: String): Self = this.set("DISABLED", value.asInstanceOf[js.Any])
  }
}
