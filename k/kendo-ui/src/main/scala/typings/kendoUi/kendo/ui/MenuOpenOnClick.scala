package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuOpenOnClick extends js.Object {
  
  var rootMenuItems: js.UndefOr[Boolean] = js.native
  
  var subMenuItems: js.UndefOr[Boolean] = js.native
}
object MenuOpenOnClick {
  
  @scala.inline
  def apply(): MenuOpenOnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuOpenOnClick]
  }
  
  @scala.inline
  implicit class MenuOpenOnClickOps[Self <: MenuOpenOnClick] (val x: Self) extends AnyVal {
    
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
    def setRootMenuItems(value: Boolean): Self = this.set("rootMenuItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootMenuItems: Self = this.set("rootMenuItems", js.undefined)
    
    @scala.inline
    def setSubMenuItems(value: Boolean): Self = this.set("subMenuItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubMenuItems: Self = this.set("subMenuItems", js.undefined)
  }
}
