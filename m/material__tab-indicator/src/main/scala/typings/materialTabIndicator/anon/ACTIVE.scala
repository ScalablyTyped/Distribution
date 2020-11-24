package typings.materialTabIndicator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ACTIVE extends js.Object {
  
  var ACTIVE: String = js.native
  
  var FADE: String = js.native
  
  var NO_TRANSITION: String = js.native
}
object ACTIVE {
  
  @scala.inline
  def apply(ACTIVE: String, FADE: String, NO_TRANSITION: String): ACTIVE = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any], FADE = FADE.asInstanceOf[js.Any], NO_TRANSITION = NO_TRANSITION.asInstanceOf[js.Any])
    __obj.asInstanceOf[ACTIVE]
  }
  
  @scala.inline
  implicit class ACTIVEOps[Self <: ACTIVE] (val x: Self) extends AnyVal {
    
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
    def setACTIVE(value: String): Self = this.set("ACTIVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFADE(value: String): Self = this.set("FADE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNO_TRANSITION(value: String): Self = this.set("NO_TRANSITION", value.asInstanceOf[js.Any])
  }
}
