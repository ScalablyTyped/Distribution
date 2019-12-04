package typings.atIonicCore

import typings.atIonicCore.distTypesComponentsMenuMenuDashInterfaceMod.MenuI
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonMenuElement
import typings.atIonicCore.distTypesUtilsAnimationAnimationDashInterfaceMod.Animation
import typings.atIonicCore.distTypesUtilsAnimationOldDashAnimationAnimationDashInterfaceMod.AnimationBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/menu-controller/menu-controller", JSImport.Namespace)
@js.native
object distTypesComponentsMenuDashControllerMenuDashControllerMod extends js.Object {
  @js.native
  class MenuController () extends js.Object {
    /**
      * Close the menu. If a menu is specified, it will close that menu.
      * If no menu is specified, then it will close any menu that is open.
      * If it does not find any open menus, it will return `false`.
      *
      * @param menu The menuId or side of the menu to close.
      */
    def close(): js.Promise[Boolean] = js.native
    def close(menu: String): js.Promise[Boolean] = js.native
    /**
      * Enable or disable a menu. Disabling a menu will not allow gestures
      * for that menu or any calls to open it. This is useful when there are
      * multiple menus on the same side and only one of them should be allowed
      * to open. Enabling a menu will automatically disable all other menus
      * on that side.
      *
      * @param enable If `true`, the menu should be enabled.
      * @param menu The menuId or side of the menu to enable or disable.
      */
    def enable(enable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def enable(enable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    /**
      * Get a menu instance. If a menu is not provided then it will return the first
      * menu found. If the specified menu is `start` or `end`, then it will return the
      * enabled menu on that side. Otherwise, it will try to find the menu using the menu's
      * `id` property. If a menu is not found then it will return `null`.
      *
      * @param menu The menuId or side of the menu.
      */
    def get(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def get(menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    /**
      * Get all menu instances.
      */
    def getMenus(): js.Promise[js.Array[HTMLIonMenuElement]] = js.native
    /**
      * Get the instance of the opened menu. Returns `null` if a menu is not found.
      */
    def getOpen(): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    /**
      * Get whether or not a menu is animating. Returns `true` if any
      * menu is currently animating.
      */
    def isAnimating(): js.Promise[Boolean] = js.native
    /**
      * Get whether or not the menu is enabled. Returns `true` if the
      * specified menu is enabled. Returns `false` if a menu is disabled
      * or not found.
      *
      * @param menu The menuId or side of the menu that is being checked.
      */
    def isEnabled(): js.Promise[Boolean] = js.native
    def isEnabled(menu: String): js.Promise[Boolean] = js.native
    /**
      * Get whether or not the menu is open. Returns `true` if the specified
      * menu is open. If a menu is not specified, it will return `true` if
      * any menu is currently open.
      *
      * @param menu The menuId or side of the menu that is being checked.
      */
    def isOpen(): js.Promise[Boolean] = js.native
    def isOpen(menu: String): js.Promise[Boolean] = js.native
    /**
      * Open the menu. If a menu is not provided then it will open the first
      * menu found. If the specified menu is `start` or `end`, then it will open
      * the enabled menu on that side. Otherwise, it will try to find the menu
      * using the menu's `id` property. If a menu is not found then it will
      * return `false`.
      *
      * @param menu The menuId or side of the menu to open.
      */
    def open(): js.Promise[Boolean] = js.native
    def open(menu: String): js.Promise[Boolean] = js.native
    def registerAnimation(name: String, animation: js.Function1[/* menu */ MenuI, Animation]): js.Promise[Unit] = js.native
    /**
      * Registers a new animation that can be used with any `ion-menu` by
      * passing the name of the animation in its `type` property.
      *
      * @param name The name of the animation to register.
      * @param animation The animation function to register.
      */
    def registerAnimation(name: String, animation: AnimationBuilder): js.Promise[Unit] = js.native
    /**
      * Enable or disable the ability to swipe open the menu.
      *
      * @param enable If `true`, the menu swipe gesture should be enabled.
      * @param menu The menuId or side of the menu to enable or disable the swipe gesture on.
      */
    def swipeGesture(enable: Boolean): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    def swipeGesture(enable: Boolean, menu: String): js.Promise[js.UndefOr[HTMLIonMenuElement]] = js.native
    /**
      * Toggle the menu open or closed. If the menu is already open, it will try to
      * close the menu, otherwise it will try to open it. Returns `false` if
      * a menu is not found.
      *
      * @param menu The menuId or side of the menu to toggle.
      */
    def toggle(): js.Promise[Boolean] = js.native
    def toggle(menu: String): js.Promise[Boolean] = js.native
  }
  
}

