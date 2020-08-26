package typings.ionicCore.componentsMod.LocalJSX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonMenuToggle extends js.Object {
  /**
    * Automatically hides the content when the corresponding menu is not active.  By default, it's `true`. Change it to `false` in order to keep `ion-menu-toggle` always visible regardless the state of the menu.
    */
  var autoHide: js.UndefOr[Boolean] = js.native
  /**
    * Optional property that maps to a Menu's `menuId` prop. Can also be `start` or `end` for the menu side. This is used to find the correct menu to toggle.  If this property is not used, `ion-menu-toggle` will toggle the first menu that is active.
    */
  var menu: js.UndefOr[String] = js.native
}

object IonMenuToggle {
  @scala.inline
  def apply(): IonMenuToggle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonMenuToggle]
  }
  @scala.inline
  implicit class IonMenuToggleOps[Self <: IonMenuToggle] (val x: Self) extends AnyVal {
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
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    @scala.inline
    def setMenu(value: String): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
  }
  
}

