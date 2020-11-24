package typings.materialRipple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BGFOCUSED extends js.Object {
  
  var BG_FOCUSED: String = js.native
  
  var FG_ACTIVATION: String = js.native
  
  var FG_DEACTIVATION: String = js.native
  
  var ROOT: String = js.native
  
  var UNBOUNDED: String = js.native
}
object BGFOCUSED {
  
  @scala.inline
  def apply(
    BG_FOCUSED: String,
    FG_ACTIVATION: String,
    FG_DEACTIVATION: String,
    ROOT: String,
    UNBOUNDED: String
  ): BGFOCUSED = {
    val __obj = js.Dynamic.literal(BG_FOCUSED = BG_FOCUSED.asInstanceOf[js.Any], FG_ACTIVATION = FG_ACTIVATION.asInstanceOf[js.Any], FG_DEACTIVATION = FG_DEACTIVATION.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any], UNBOUNDED = UNBOUNDED.asInstanceOf[js.Any])
    __obj.asInstanceOf[BGFOCUSED]
  }
  
  @scala.inline
  implicit class BGFOCUSEDOps[Self <: BGFOCUSED] (val x: Self) extends AnyVal {
    
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
    def setBG_FOCUSED(value: String): Self = this.set("BG_FOCUSED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFG_ACTIVATION(value: String): Self = this.set("FG_ACTIVATION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFG_DEACTIVATION(value: String): Self = this.set("FG_DEACTIVATION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setROOT(value: String): Self = this.set("ROOT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNBOUNDED(value: String): Self = this.set("UNBOUNDED", value.asInstanceOf[js.Any])
  }
}
