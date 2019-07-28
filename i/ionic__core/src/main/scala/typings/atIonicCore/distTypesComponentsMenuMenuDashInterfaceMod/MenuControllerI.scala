package typings.atIonicCore.distTypesComponentsMenuMenuDashInterfaceMod

import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonMenuElement
import typings.atIonicCore.distTypesUtilsAnimationAnimationDashInterfaceMod.Animation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuControllerI extends js.Object {
  def _createAnimation(`type`: String, menuCmp: MenuI): js.Promise[Animation]
  def _register(menu: MenuI): Unit
  def _setActiveMenu(menu: MenuI): Unit
  def _setOpen(menu: MenuI, shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean]
  def _unregister(menu: MenuI): Unit
  def getMenus(): js.Promise[js.Array[HTMLIonMenuElement]]
  def getOpenSync(): js.UndefOr[HTMLIonMenuElement]
}

object MenuControllerI {
  @scala.inline
  def apply(
    _createAnimation: (String, MenuI) => js.Promise[Animation],
    _register: MenuI => Unit,
    _setActiveMenu: MenuI => Unit,
    _setOpen: (MenuI, Boolean, Boolean) => js.Promise[Boolean],
    _unregister: MenuI => Unit,
    getMenus: () => js.Promise[js.Array[HTMLIonMenuElement]],
    getOpenSync: () => js.UndefOr[HTMLIonMenuElement]
  ): MenuControllerI = {
    val __obj = js.Dynamic.literal(_createAnimation = js.Any.fromFunction2(_createAnimation), _register = js.Any.fromFunction1(_register), _setActiveMenu = js.Any.fromFunction1(_setActiveMenu), _setOpen = js.Any.fromFunction3(_setOpen), _unregister = js.Any.fromFunction1(_unregister), getMenus = js.Any.fromFunction0(getMenus), getOpenSync = js.Any.fromFunction0(getOpenSync))
  
    __obj.asInstanceOf[MenuControllerI]
  }
}

