package typings.materialTextfield.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARIAHIDDEN extends js.Object {
  
  var ARIA_HIDDEN: String = js.native
  
  var ROLE: String = js.native
  
  var ROOT_SELECTOR: String = js.native
}
object ARIAHIDDEN {
  
  @scala.inline
  def apply(ARIA_HIDDEN: String, ROLE: String, ROOT_SELECTOR: String): ARIAHIDDEN = {
    val __obj = js.Dynamic.literal(ARIA_HIDDEN = ARIA_HIDDEN.asInstanceOf[js.Any], ROLE = ROLE.asInstanceOf[js.Any], ROOT_SELECTOR = ROOT_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIAHIDDEN]
  }
  
  @scala.inline
  implicit class ARIAHIDDENOps[Self <: ARIAHIDDEN] (val x: Self) extends AnyVal {
    
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
    def setARIA_HIDDEN(value: String): Self = this.set("ARIA_HIDDEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setROLE(value: String): Self = this.set("ROLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setROOT_SELECTOR(value: String): Self = this.set("ROOT_SELECTOR", value.asInstanceOf[js.Any])
  }
}
