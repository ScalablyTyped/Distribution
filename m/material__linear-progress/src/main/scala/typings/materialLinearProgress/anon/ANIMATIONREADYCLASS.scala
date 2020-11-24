package typings.materialLinearProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ANIMATIONREADYCLASS extends js.Object {
  
  var ANIMATION_READY_CLASS: String = js.native
  
  var CLOSED_ANIMATION_OFF_CLASS: String = js.native
  
  var CLOSED_CLASS: String = js.native
  
  var INDETERMINATE_CLASS: String = js.native
  
  var REVERSED_CLASS: String = js.native
}
object ANIMATIONREADYCLASS {
  
  @scala.inline
  def apply(
    ANIMATION_READY_CLASS: String,
    CLOSED_ANIMATION_OFF_CLASS: String,
    CLOSED_CLASS: String,
    INDETERMINATE_CLASS: String,
    REVERSED_CLASS: String
  ): ANIMATIONREADYCLASS = {
    val __obj = js.Dynamic.literal(ANIMATION_READY_CLASS = ANIMATION_READY_CLASS.asInstanceOf[js.Any], CLOSED_ANIMATION_OFF_CLASS = CLOSED_ANIMATION_OFF_CLASS.asInstanceOf[js.Any], CLOSED_CLASS = CLOSED_CLASS.asInstanceOf[js.Any], INDETERMINATE_CLASS = INDETERMINATE_CLASS.asInstanceOf[js.Any], REVERSED_CLASS = REVERSED_CLASS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ANIMATIONREADYCLASS]
  }
  
  @scala.inline
  implicit class ANIMATIONREADYCLASSOps[Self <: ANIMATIONREADYCLASS] (val x: Self) extends AnyVal {
    
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
    def setANIMATION_READY_CLASS(value: String): Self = this.set("ANIMATION_READY_CLASS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLOSED_ANIMATION_OFF_CLASS(value: String): Self = this.set("CLOSED_ANIMATION_OFF_CLASS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLOSED_CLASS(value: String): Self = this.set("CLOSED_CLASS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINDETERMINATE_CLASS(value: String): Self = this.set("INDETERMINATE_CLASS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREVERSED_CLASS(value: String): Self = this.set("REVERSED_CLASS", value.asInstanceOf[js.Any])
  }
}
