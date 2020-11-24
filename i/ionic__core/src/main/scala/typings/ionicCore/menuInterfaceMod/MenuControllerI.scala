package typings.ionicCore.menuInterfaceMod

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.componentsMod.global.HTMLIonMenuElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuControllerI extends js.Object {
  
  def _createAnimation(`type`: String, menuCmp: MenuI): js.Promise[Animation] = js.native
  
  def _register(menu: MenuI): Unit = js.native
  
  def _setActiveMenu(menu: MenuI): Unit = js.native
  
  def _setOpen(menu: MenuI, shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = js.native
  
  def _unregister(menu: MenuI): Unit = js.native
  
  def getMenus(): js.Promise[js.Array[HTMLIonMenuElement]] = js.native
  
  def getOpenSync(): js.UndefOr[HTMLIonMenuElement] = js.native
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
  
  @scala.inline
  implicit class MenuControllerIOps[Self <: MenuControllerI] (val x: Self) extends AnyVal {
    
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
    def set_createAnimation(value: (String, MenuI) => js.Promise[Animation]): Self = this.set("_createAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_register(value: MenuI => Unit): Self = this.set("_register", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_setActiveMenu(value: MenuI => Unit): Self = this.set("_setActiveMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_setOpen(value: (MenuI, Boolean, Boolean) => js.Promise[Boolean]): Self = this.set("_setOpen", js.Any.fromFunction3(value))
    
    @scala.inline
    def set_unregister(value: MenuI => Unit): Self = this.set("_unregister", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMenus(value: () => js.Promise[js.Array[HTMLIonMenuElement]]): Self = this.set("getMenus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOpenSync(value: () => js.UndefOr[HTMLIonMenuElement]): Self = this.set("getOpenSync", js.Any.fromFunction0(value))
  }
}
