package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.componentsMod.global.HTMLIonMenuElement
import typings.ionicCore.menuInterfaceMod.MenuI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuControllerMod {
  
  object menuController {
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.close")
    @js.native
    def close(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.close")
    @js.native
    def close(menu: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController._createAnimation")
    @js.native
    def createAnimation(`type`: String, menuCmp: MenuI): js.Any = js.native
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.enable")
    @js.native
    def enable(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.enable")
    @js.native
    def enable(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.get")
    @js.native
    def get(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.get")
    @js.native
    def get(menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.getMenus")
    @js.native
    def getMenus(): js.Promise[js.Array[HTMLIonMenuElement]] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.getOpen")
    @js.native
    def getOpen(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController._getOpenSync")
    @js.native
    def getOpenSync(): js.UndefOr[HTMLIonMenuElement] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.isAnimating")
    @js.native
    def isAnimating(): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.isEnabled")
    @js.native
    def isEnabled(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.isEnabled")
    @js.native
    def isEnabled(menu: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.isOpen")
    @js.native
    def isOpen(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.isOpen")
    @js.native
    def isOpen(menu: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.open")
    @js.native
    def open(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.open")
    @js.native
    def open(menu: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController._register")
    @js.native
    def register(menu: MenuI): Unit = js.native
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.registerAnimation")
    @js.native
    def registerAnimation(name: String, animation: AnimationBuilder): Unit = js.native
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController._setActiveMenu")
    @js.native
    def setActiveMenu(menu: MenuI): Unit = js.native
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController._setOpen")
    @js.native
    def setOpen(menu: MenuI, shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.swipeGesture")
    @js.native
    def swipeGesture(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.swipeGesture")
    @js.native
    def swipeGesture(shouldEnable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.toggle")
    @js.native
    def toggle(): js.Promise[Boolean] = js.native
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController.toggle")
    @js.native
    def toggle(menu: String): js.Promise[Boolean] = js.native
    
    @JSImport("@ionic/core/dist/types/utils/menu-controller", "menuController._unregister")
    @js.native
    def unregister(menu: MenuI): Unit = js.native
  }
}
