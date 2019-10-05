package typings.atIonicAngular

import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonMenuElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/providers/menu-controller", JSImport.Namespace)
@js.native
object distProvidersMenuDashControllerMod extends js.Object {
  @js.native
  class MenuController () extends js.Object {
    /**
      * Programmatically close the Menu. If no `menuId` is given as the first
      * argument then it'll close any menu which is open. If a `menuId`
      * is given then it'll close that exact menu.
      * @param [menuId]  Optionally get the menu by its id, or side.
      * @return returns a promise when the menu is fully closed
      */
    def close(): js.Promise[Boolean] = js.native
    def close(menuId: String): js.Promise[Boolean] = js.native
    /**
      * Used to enable or disable a menu. For example, there could be multiple
      * left menus, but only one of them should be able to be opened at the same
      * time. If there are multiple menus on the same side, then enabling one menu
      * will also automatically disable all the others that are on the same side.
      * @param [menuId]  Optionally get the menu by its id, or side.
      * @return Returns the instance of the menu, which is useful for chaining.
      */
    def enable(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def enable(shouldEnable: Boolean, menuId: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    /**
      * Used to get a menu instance. If a `menuId` is not provided then it'll
      * return the first menu found. If a `menuId` is `left` or `right`, then
      * it'll return the enabled menu on that side. Otherwise, if a `menuId` is
      * provided, then it'll try to find the menu using the menu's `id`
      * property. If a menu is not found then it'll return `null`.
      * @param [menuId]  Optionally get the menu by its id, or side.
      * @return Returns the instance of the menu if found, otherwise `null`.
      */
    def get(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def get(menuId: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    /**
      * @return Returns an array of all menu instances.
      */
    def getMenus(): js.Promise[js.Array[HTMLIonMenuElement]] = js.native
    /**
      * @return Returns the instance of the menu already opened, otherwise `null`.
      */
    def getOpen(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    /**
      * @param [menuId]  Optionally get the menu by its id, or side.
      * @return Returns true if the menu is currently enabled, otherwise false.
      */
    def isEnabled(): js.Promise[Boolean] = js.native
    def isEnabled(menuId: String): js.Promise[Boolean] = js.native
    /**
      * @param [menuId] Optionally get the menu by its id, or side.
      * @return Returns true if the specified menu is currently open, otherwise false.
      * If the menuId is not specified, it returns true if ANY menu is currenly open.
      */
    def isOpen(): js.Promise[Boolean] = js.native
    def isOpen(menuId: String): js.Promise[Boolean] = js.native
    /**
      * Programmatically open the Menu.
      * @param [menuId]  Optionally get the menu by its id, or side.
      * @return returns a promise when the menu is fully opened
      */
    def open(): js.Promise[Boolean] = js.native
    def open(menuId: String): js.Promise[Boolean] = js.native
    /**
      * Used to enable or disable the ability to swipe open the menu.
      * @param shouldEnable  True if it should be swipe-able, false if not.
      * @param [menuId]  Optionally get the menu by its id, or side.
      * @return Returns the instance of the menu, which is useful for chaining.
      * @deprecated Use swipeGesture() instead.
      */
    def swipeEnable(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def swipeEnable(shouldEnable: Boolean, menuId: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    /**
      * Used to enable or disable the ability to swipe open the menu.
      * @param shouldEnable  True if it should be swipe-able, false if not.
      * @param [menuId]  Optionally get the menu by its id, or side.
      * @return Returns the instance of the menu, which is useful for chaining.
      */
    def swipeGesture(shouldEnable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def swipeGesture(shouldEnable: Boolean, menuId: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    /**
      * Toggle the menu. If it's closed, it will open, and if opened, it
      * will close.
      * @param [menuId]  Optionally get the menu by its id, or side.
      * @return returns a promise when the menu has been toggled
      */
    def toggle(): js.Promise[Boolean] = js.native
    def toggle(menuId: String): js.Promise[Boolean] = js.native
  }
  
}

