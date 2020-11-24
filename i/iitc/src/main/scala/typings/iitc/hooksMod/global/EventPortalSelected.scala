package typings.iitc.hooksMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventPortalSelected extends js.Object {
  
  var selectedPortalGuid: String = js.native
  
  var unselectedPortalGuid: String = js.native
}
object EventPortalSelected {
  
  @scala.inline
  def apply(selectedPortalGuid: String, unselectedPortalGuid: String): EventPortalSelected = {
    val __obj = js.Dynamic.literal(selectedPortalGuid = selectedPortalGuid.asInstanceOf[js.Any], unselectedPortalGuid = unselectedPortalGuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPortalSelected]
  }
  
  @scala.inline
  implicit class EventPortalSelectedOps[Self <: EventPortalSelected] (val x: Self) extends AnyVal {
    
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
    def setSelectedPortalGuid(value: String): Self = this.set("selectedPortalGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectedPortalGuid(value: String): Self = this.set("unselectedPortalGuid", value.asInstanceOf[js.Any])
  }
}
