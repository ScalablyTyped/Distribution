package typings.materialSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICONEVENT extends js.Object {
  
  var ICON_EVENT: String = js.native
  
  var ICON_ROLE: String = js.native
}
object ICONEVENT {
  
  @scala.inline
  def apply(ICON_EVENT: String, ICON_ROLE: String): ICONEVENT = {
    val __obj = js.Dynamic.literal(ICON_EVENT = ICON_EVENT.asInstanceOf[js.Any], ICON_ROLE = ICON_ROLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICONEVENT]
  }
  
  @scala.inline
  implicit class ICONEVENTOps[Self <: ICONEVENT] (val x: Self) extends AnyVal {
    
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
    def setICON_EVENT(value: String): Self = this.set("ICON_EVENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICON_ROLE(value: String): Self = this.set("ICON_ROLE", value.asInstanceOf[js.Any])
  }
}
