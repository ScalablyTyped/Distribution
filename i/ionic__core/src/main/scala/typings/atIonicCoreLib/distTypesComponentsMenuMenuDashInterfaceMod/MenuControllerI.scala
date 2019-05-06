package typings
package atIonicCoreLib.distTypesComponentsMenuMenuDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuControllerI extends js.Object {
  def _createAnimation(`type`: java.lang.String, menuCmp: MenuI): js.Promise[stdLib.Animation]
  def _register(menu: MenuI): scala.Unit
  def _setActiveMenu(menu: MenuI): scala.Unit
  def _setOpen(menu: MenuI, shouldOpen: scala.Boolean, animated: scala.Boolean): js.Promise[scala.Boolean]
  def _unregister(menu: MenuI): scala.Unit
  def getMenus(): js.Promise[js.Array[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]]
  def getOpenSync(): js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]
}

object MenuControllerI {
  @scala.inline
  def apply(
    _createAnimation: (java.lang.String, MenuI) => js.Promise[stdLib.Animation],
    _register: MenuI => scala.Unit,
    _setActiveMenu: MenuI => scala.Unit,
    _setOpen: (MenuI, scala.Boolean, scala.Boolean) => js.Promise[scala.Boolean],
    _unregister: MenuI => scala.Unit,
    getMenus: () => js.Promise[js.Array[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]],
    getOpenSync: () => js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]
  ): MenuControllerI = {
    val __obj = js.Dynamic.literal(_createAnimation = js.Any.fromFunction2(_createAnimation), _register = js.Any.fromFunction1(_register), _setActiveMenu = js.Any.fromFunction1(_setActiveMenu), _setOpen = js.Any.fromFunction3(_setOpen), _unregister = js.Any.fromFunction1(_unregister), getMenus = js.Any.fromFunction0(getMenus), getOpenSync = js.Any.fromFunction0(getOpenSync))
  
    __obj.asInstanceOf[MenuControllerI]
  }
}

