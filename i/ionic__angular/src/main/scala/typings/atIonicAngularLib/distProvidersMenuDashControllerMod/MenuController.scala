package typings
package atIonicAngularLib.distProvidersMenuDashControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/providers/menu-controller", "MenuController")
@js.native
class MenuController protected () extends js.Object {
  def this(doc: js.Any) = this()
  var doc: js.Any = js.native
  /**
    * Programmatically close the Menu. If no `menuId` is given as the first
    * argument then it'll close any menu which is open. If a `menuId`
    * is given then it'll close that exact menu.
    * @param [menuId]  Optionally get the menu by its id, or side.
    * @return returns a promise when the menu is fully closed
    */
  def close(): js.Promise[scala.Boolean] = js.native
  def close(menuId: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Used to enable or disable a menu. For example, there could be multiple
    * left menus, but only one of them should be able to be opened at the same
    * time. If there are multiple menus on the same side, then enabling one menu
    * will also automatically disable all the others that are on the same side.
    * @param [menuId]  Optionally get the menu by its id, or side.
    * @return Returns the instance of the menu, which is useful for chaining.
    */
  def enable(shouldEnable: scala.Boolean): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement] = js.native
  def enable(shouldEnable: scala.Boolean, menuId: java.lang.String): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement] = js.native
  /**
    * Used to get a menu instance. If a `menuId` is not provided then it'll
    * return the first menu found. If a `menuId` is `left` or `right`, then
    * it'll return the enabled menu on that side. Otherwise, if a `menuId` is
    * provided, then it'll try to find the menu using the menu's `id`
    * property. If a menu is not found then it'll return `null`.
    * @param [menuId]  Optionally get the menu by its id, or side.
    * @return Returns the instance of the menu if found, otherwise `null`.
    */
  def get(): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement] = js.native
  def get(menuId: java.lang.String): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement] = js.native
  /**
    * @return Returns an array of all menu instances.
    */
  def getMenus(): js.Promise[js.Array[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]] = js.native
  /**
    * @return Returns the instance of the menu already opened, otherwise `null`.
    */
  def getOpen(): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement] = js.native
  /**
    * @param [menuId]  Optionally get the menu by its id, or side.
    * @return Returns true if the menu is currently enabled, otherwise false.
    */
  def isEnabled(): js.Promise[scala.Boolean] = js.native
  def isEnabled(menuId: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * @param [menuId] Optionally get the menu by its id, or side.
    * @return Returns true if the specified menu is currently open, otherwise false.
    * If the menuId is not specified, it returns true if ANY menu is currenly open.
    */
  def isOpen(): js.Promise[scala.Boolean] = js.native
  def isOpen(menuId: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Programmatically open the Menu.
    * @param [menuId]  Optionally get the menu by its id, or side.
    * @return returns a promise when the menu is fully opened
    */
  def open(): js.Promise[scala.Boolean] = js.native
  def open(menuId: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Used to enable or disable the ability to swipe open the menu.
    * @param shouldEnable  True if it should be swipe-able, false if not.
    * @param [menuId]  Optionally get the menu by its id, or side.
    * @return Returns the instance of the menu, which is useful for chaining.
    * @deprecated Use swipeGesture() instead
    */
  def swipeEnable(shouldEnable: scala.Boolean): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement] = js.native
  def swipeEnable(shouldEnable: scala.Boolean, menuId: java.lang.String): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement] = js.native
  /**
    * Used to enable or disable the ability to swipe open the menu.
    * @param shouldEnable  True if it should be swipe-able, false if not.
    * @param [menuId]  Optionally get the menu by its id, or side.
    * @return Returns the instance of the menu, which is useful for chaining.
    */
  def swipeGesture(shouldEnable: scala.Boolean): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement] = js.native
  def swipeGesture(shouldEnable: scala.Boolean, menuId: java.lang.String): js.Promise[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement] = js.native
  /**
    * Toggle the menu. If it's closed, it will open, and if opened, it
    * will close.
    * @param [menuId]  Optionally get the menu by its id, or side.
    * @return returns a promise when the menu has been toggled
    */
  def toggle(): js.Promise[scala.Boolean] = js.native
  def toggle(menuId: java.lang.String): js.Promise[scala.Boolean] = js.native
}

