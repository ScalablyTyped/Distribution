package typings.materialTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SELECTEDEVENT extends js.Object {
  
  var SELECTED_EVENT: String = js.native
}
object SELECTEDEVENT {
  
  @scala.inline
  def apply(SELECTED_EVENT: String): SELECTEDEVENT = {
    val __obj = js.Dynamic.literal(SELECTED_EVENT = SELECTED_EVENT.asInstanceOf[js.Any])
    __obj.asInstanceOf[SELECTEDEVENT]
  }
  
  @scala.inline
  implicit class SELECTEDEVENTOps[Self <: SELECTEDEVENT] (val x: Self) extends AnyVal {
    
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
    def setSELECTED_EVENT(value: String): Self = this.set("SELECTED_EVENT", value.asInstanceOf[js.Any])
  }
}
