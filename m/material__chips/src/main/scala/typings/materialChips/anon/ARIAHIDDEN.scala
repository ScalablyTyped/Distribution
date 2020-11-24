package typings.materialChips.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARIAHIDDEN extends js.Object {
  
  var ARIA_HIDDEN: String = js.native
  
  var INTERACTION_EVENT: String = js.native
  
  var NAVIGATION_EVENT: String = js.native
  
  var TAB_INDEX: String = js.native
}
object ARIAHIDDEN {
  
  @scala.inline
  def apply(ARIA_HIDDEN: String, INTERACTION_EVENT: String, NAVIGATION_EVENT: String, TAB_INDEX: String): ARIAHIDDEN = {
    val __obj = js.Dynamic.literal(ARIA_HIDDEN = ARIA_HIDDEN.asInstanceOf[js.Any], INTERACTION_EVENT = INTERACTION_EVENT.asInstanceOf[js.Any], NAVIGATION_EVENT = NAVIGATION_EVENT.asInstanceOf[js.Any], TAB_INDEX = TAB_INDEX.asInstanceOf[js.Any])
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
    def setINTERACTION_EVENT(value: String): Self = this.set("INTERACTION_EVENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNAVIGATION_EVENT(value: String): Self = this.set("NAVIGATION_EVENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTAB_INDEX(value: String): Self = this.set("TAB_INDEX", value.asInstanceOf[js.Any])
  }
}
