package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Menu //////////////////////////////////////////////////
@js.native
trait MenuOptions extends MenuEvents {
  var disabled: js.UndefOr[Boolean] = js.native
  var icons: js.UndefOr[js.Any] = js.native
  var menus: js.UndefOr[String] = js.native
  var position: js.UndefOr[js.Any] = js.native
   // TODO
  var role: js.UndefOr[String] = js.native
}

object MenuOptions {
  @scala.inline
  def apply(): MenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuOptions]
  }
  @scala.inline
  implicit class MenuOptionsOps[Self <: MenuOptions] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIcons(value: js.Any): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setMenus(value: String): Self = this.set("menus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenus: Self = this.set("menus", js.undefined)
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

