package typings.materialTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INDICATORBACK extends js.Object {
  
  var INDICATOR_BACK: String = js.native
  
  var INDICATOR_ENABLED: String = js.native
  
  var INDICATOR_FORWARD: String = js.native
  
  var TAB: String = js.native
}
object INDICATORBACK {
  
  @scala.inline
  def apply(INDICATOR_BACK: String, INDICATOR_ENABLED: String, INDICATOR_FORWARD: String, TAB: String): INDICATORBACK = {
    val __obj = js.Dynamic.literal(INDICATOR_BACK = INDICATOR_BACK.asInstanceOf[js.Any], INDICATOR_ENABLED = INDICATOR_ENABLED.asInstanceOf[js.Any], INDICATOR_FORWARD = INDICATOR_FORWARD.asInstanceOf[js.Any], TAB = TAB.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDICATORBACK]
  }
  
  @scala.inline
  implicit class INDICATORBACKOps[Self <: INDICATORBACK] (val x: Self) extends AnyVal {
    
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
    def setINDICATOR_BACK(value: String): Self = this.set("INDICATOR_BACK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINDICATOR_ENABLED(value: String): Self = this.set("INDICATOR_ENABLED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINDICATOR_FORWARD(value: String): Self = this.set("INDICATOR_FORWARD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTAB(value: String): Self = this.set("TAB", value.asInstanceOf[js.Any])
  }
}
