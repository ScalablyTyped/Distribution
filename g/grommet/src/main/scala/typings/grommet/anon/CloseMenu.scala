package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseMenu extends js.Object {
  var closeMenu: js.UndefOr[String] = js.native
  var openMenu: js.UndefOr[String] = js.native
}

object CloseMenu {
  @scala.inline
  def apply(): CloseMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseMenu]
  }
  @scala.inline
  implicit class CloseMenuOps[Self <: CloseMenu] (val x: Self) extends AnyVal {
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
    def setCloseMenu(value: String): Self = this.set("closeMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseMenu: Self = this.set("closeMenu", js.undefined)
    @scala.inline
    def setOpenMenu(value: String): Self = this.set("openMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenMenu: Self = this.set("openMenu", js.undefined)
  }
  
}

