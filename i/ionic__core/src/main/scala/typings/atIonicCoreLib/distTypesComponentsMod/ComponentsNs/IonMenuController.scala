package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonMenuController extends js.Object {
  def _getInstance(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuControllerI */ _
  ] = js.native
  /**
    * Close the menu. If no menu is specified, then it will close any menu that is open. If a menu is specified, it will close that menu.
    */
  def close(): js.Promise[scala.Boolean] = js.native
  def close(menuId: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Used to enable or disable a menu. For example, there could be multiple left menus, but only one of them should be able to be opened at the same time. If there are multiple menus on the same side, then enabling one menu will also automatically disable all the others that are on the same side.
    */
  def enable(shouldEnable: scala.Boolean): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]] = js.native
  def enable(shouldEnable: scala.Boolean, menuId: java.lang.String): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]] = js.native
  /**
    * Used to get a menu instance. If a menu is not provided then it will return the first menu found. If the specified menu is `start` or `end`, then it will return the enabled menu on that side. Otherwise, it will try to find the menu using the menu's `id` property. If a menu is not found then it will return `null`.
    */
  def get(): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]] = js.native
  def get(menuId: java.lang.String): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]] = js.native
  /**
    * Returns an array of all menu instances.
    */
  def getMenus(): js.Promise[js.Array[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]] = js.native
  /**
    * Returns the instance of the menu already opened, otherwise `null`.
    */
  def getOpen(): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]] = js.native
  /**
    * Returns `true` if any menu is currently animating.
    */
  def isAnimating(): js.Promise[scala.Boolean] = js.native
  /**
    * Returns `true` if the specified menu is enabled.
    */
  def isEnabled(): js.Promise[scala.Boolean] = js.native
  def isEnabled(menuId: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Returns `true` if the specified menu is open. If the menu is not specified, it will return `true` if any menu is currently open.
    */
  def isOpen(): js.Promise[scala.Boolean] = js.native
  def isOpen(menuId: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Open the menu.
    */
  def open(): js.Promise[scala.Boolean] = js.native
  def open(menuId: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Registers a new animation that can be used in any `ion-menu`.  ```    * <ion-menu type="my-animation">    * ```
    */
  def registerAnimation(
    name: java.lang.String,
    animation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ): scala.Unit = js.native
  /**
    * Used to enable or disable the ability to swipe open the menu.
    */
  def swipeGesture(shouldEnable: scala.Boolean): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]] = js.native
  def swipeGesture(shouldEnable: scala.Boolean, menuId: java.lang.String): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]] = js.native
  /**
    * Toggle the menu. If it's closed, it will open, and if opened, it will close.
    */
  def toggle(): js.Promise[scala.Boolean] = js.native
  def toggle(menuId: java.lang.String): js.Promise[scala.Boolean] = js.native
}

