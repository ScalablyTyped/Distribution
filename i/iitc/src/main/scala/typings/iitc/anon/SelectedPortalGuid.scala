package typings.iitc.anon

import typings.iitc.iitctypesMod.PortalGUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectedPortalGuid extends js.Object {
  
  var selectedPortalGuid: PortalGUID = js.native
}
object SelectedPortalGuid {
  
  @scala.inline
  def apply(selectedPortalGuid: PortalGUID): SelectedPortalGuid = {
    val __obj = js.Dynamic.literal(selectedPortalGuid = selectedPortalGuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedPortalGuid]
  }
  
  @scala.inline
  implicit class SelectedPortalGuidOps[Self <: SelectedPortalGuid] (val x: Self) extends AnyVal {
    
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
    def setSelectedPortalGuid(value: PortalGUID): Self = this.set("selectedPortalGuid", value.asInstanceOf[js.Any])
  }
}
