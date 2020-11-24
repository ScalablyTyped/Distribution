package typings.materialCircularProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARIAVALUENOW extends js.Object {
  
  var ARIA_VALUENOW: String = js.native
  
  var DETERMINATE_CIRCLE_SELECTOR: String = js.native
  
  var RADIUS: String = js.native
  
  var STROKE_DASHOFFSET: String = js.native
}
object ARIAVALUENOW {
  
  @scala.inline
  def apply(
    ARIA_VALUENOW: String,
    DETERMINATE_CIRCLE_SELECTOR: String,
    RADIUS: String,
    STROKE_DASHOFFSET: String
  ): ARIAVALUENOW = {
    val __obj = js.Dynamic.literal(ARIA_VALUENOW = ARIA_VALUENOW.asInstanceOf[js.Any], DETERMINATE_CIRCLE_SELECTOR = DETERMINATE_CIRCLE_SELECTOR.asInstanceOf[js.Any], RADIUS = RADIUS.asInstanceOf[js.Any], STROKE_DASHOFFSET = STROKE_DASHOFFSET.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIAVALUENOW]
  }
  
  @scala.inline
  implicit class ARIAVALUENOWOps[Self <: ARIAVALUENOW] (val x: Self) extends AnyVal {
    
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
    def setARIA_VALUENOW(value: String): Self = this.set("ARIA_VALUENOW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDETERMINATE_CIRCLE_SELECTOR(value: String): Self = this.set("DETERMINATE_CIRCLE_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRADIUS(value: String): Self = this.set("RADIUS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTROKE_DASHOFFSET(value: String): Self = this.set("STROKE_DASHOFFSET", value.asInstanceOf[js.Any])
  }
}
