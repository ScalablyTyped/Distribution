package typings.materialToolbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CHANGEEVENT extends js.Object {
  
  var CHANGE_EVENT: String = js.native
  
  var FIRST_ROW_SELECTOR: String = js.native
  
  var ICON_SELECTOR: String = js.native
  
  var TITLE_SELECTOR: String = js.native
}
object CHANGEEVENT {
  
  @scala.inline
  def apply(CHANGE_EVENT: String, FIRST_ROW_SELECTOR: String, ICON_SELECTOR: String, TITLE_SELECTOR: String): CHANGEEVENT = {
    val __obj = js.Dynamic.literal(CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], FIRST_ROW_SELECTOR = FIRST_ROW_SELECTOR.asInstanceOf[js.Any], ICON_SELECTOR = ICON_SELECTOR.asInstanceOf[js.Any], TITLE_SELECTOR = TITLE_SELECTOR.asInstanceOf[js.Any])
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
    def setFIRST_ROW_SELECTOR(value: String): Self = this.set("FIRST_ROW_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICON_SELECTOR(value: String): Self = this.set("ICON_SELECTOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTITLE_SELECTOR(value: String): Self = this.set("TITLE_SELECTOR", value.asInstanceOf[js.Any])
  }
}
