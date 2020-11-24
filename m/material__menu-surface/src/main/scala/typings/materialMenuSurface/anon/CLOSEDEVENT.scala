package typings.materialMenuSurface.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CLOSEDEVENT extends js.Object {
  
  var CLOSED_EVENT: String = js.native
  
  var FOCUSABLE_ELEMENTS: String = js.native
  
  var OPENED_EVENT: String = js.native
}
object CLOSEDEVENT {
  
  @scala.inline
  def apply(CLOSED_EVENT: String, FOCUSABLE_ELEMENTS: String, OPENED_EVENT: String): CLOSEDEVENT = {
    val __obj = js.Dynamic.literal(CLOSED_EVENT = CLOSED_EVENT.asInstanceOf[js.Any], FOCUSABLE_ELEMENTS = FOCUSABLE_ELEMENTS.asInstanceOf[js.Any], OPENED_EVENT = OPENED_EVENT.asInstanceOf[js.Any])
    __obj.asInstanceOf[CLOSEDEVENT]
  }
  
  @scala.inline
  implicit class CLOSEDEVENTOps[Self <: CLOSEDEVENT] (val x: Self) extends AnyVal {
    
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
    def setCLOSED_EVENT(value: String): Self = this.set("CLOSED_EVENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFOCUSABLE_ELEMENTS(value: String): Self = this.set("FOCUSABLE_ELEMENTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPENED_EVENT(value: String): Self = this.set("OPENED_EVENT", value.asInstanceOf[js.Any])
  }
}
