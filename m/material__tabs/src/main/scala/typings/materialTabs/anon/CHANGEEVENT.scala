package typings.materialTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CHANGEEVENT extends js.Object {
  
  var CHANGE_EVENT: String = js.native
  
  var INDICATOR_SELECTOR: String = js.native
  
  var TAB_SELECTOR: String = js.native
}
object CHANGEEVENT {
  
  @scala.inline
  def apply(CHANGE_EVENT: String, INDICATOR_SELECTOR: String, TAB_SELECTOR: String): CHANGEEVENT = {
    val __obj = js.Dynamic.literal(CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], INDICATOR_SELECTOR = INDICATOR_SELECTOR.asInstanceOf[js.Any], TAB_SELECTOR = TAB_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[CHANGEEVENT]
  }
  
  @scala.inline
  implicit class CHANGEEVENTOps[Self <: CHANGEEVENT] (val x: Self) extends AnyVal {
    
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
    def setCHANGE_EVENT(value: String): Self = this.set("CHANGE_EVENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINDICATOR_SELECTOR(value: String): Self = this.set("INDICATOR_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTAB_SELECTOR(value: String): Self = this.set("TAB_SELECTOR", value.asInstanceOf[js.Any])
  }
}
