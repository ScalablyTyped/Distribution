package typings
package atIonicAngularLib.distProvidersNavDashControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/providers/nav-controller", "NavController")
@js.native
class NavController protected () extends js.Object {
  def this(platform: atIonicAngularLib.distProvidersPlatformMod.Platform, location: atAngularCommonLib.atAngularCommonMod.Location, serializer: atAngularRouterLib.atAngularRouterMod.UrlSerializer) = this()
  def this(platform: atIonicAngularLib.distProvidersPlatformMod.Platform, location: atAngularCommonLib.atAngularCommonMod.Location, serializer: atAngularRouterLib.atAngularRouterMod.UrlSerializer, router: atAngularRouterLib.atAngularRouterMod.Router) = this()
  var animated: js.UndefOr[js.Any] = js.native
  var direction: js.Any = js.native
  var guessAnimation: js.UndefOr[js.Any] = js.native
  var guessDirection: js.Any = js.native
  var lastNavId: js.Any = js.native
  var location: js.Any = js.native
  var navigate: js.Any = js.native
  var router: js.UndefOr[js.Any] = js.native
  var serializer: js.Any = js.native
  var topOutlet: js.UndefOr[js.Any] = js.native
  /**
    * Same as [Location](https://angular.io/api/common/Location)'s back() method.
    * It will use the standard `window.history.back()` under the hood, but featuring a `back` animation.
    */
  def back(): scala.Unit = js.native
  def back(options: AnimationOptions): scala.Unit = js.native
  /**
    * @internal
    */
  def consumeTransition(): atIonicAngularLib.Anon_Animation = js.native
  def navigateBack(url: atAngularRouterLib.atAngularRouterMod.UrlTree): js.Promise[scala.Boolean] = js.native
  def navigateBack(url: atAngularRouterLib.atAngularRouterMod.UrlTree, options: NavigationOptions): js.Promise[scala.Boolean] = js.native
  /**
    * This method uses Angular's [Router](https://angular.io/api/router/Router) under the hood,
    * it's equivalent to call:
    *
    * ```ts
    * this.navController.setDirection('back');
    * this.router.navigateByUrl(path);
    * ```
    *
    * Going **back** means that all the pages in the stack until the navigated page is found will be pop,
    * and that it will show a "back" animation by default.
    *
    * Navigating back can also be trigger in a declarative manner by using the `[routerDirection]` directive:
    *
    * ```html
    * <a routerLink="/path/to/page" routerDirection="back">Link</a>
    * ```
    */
  def navigateBack(url: java.lang.String): js.Promise[scala.Boolean] = js.native
  def navigateBack(url: java.lang.String, options: NavigationOptions): js.Promise[scala.Boolean] = js.native
  def navigateBack(url: js.Array[_]): js.Promise[scala.Boolean] = js.native
  def navigateBack(url: js.Array[_], options: NavigationOptions): js.Promise[scala.Boolean] = js.native
  def navigateForward(url: atAngularRouterLib.atAngularRouterMod.UrlTree): js.Promise[scala.Boolean] = js.native
  def navigateForward(url: atAngularRouterLib.atAngularRouterMod.UrlTree, options: NavigationOptions): js.Promise[scala.Boolean] = js.native
  /**
    * This method uses Angular's [Router](https://angular.io/api/router/Router) under the hood,
    * it's equivalent to call `this.router.navigateByUrl()`, but it's explicit about the **direction** of the transition.
    *
    * Going **forward** means that a new page it's going to be pushed to the stack of the outlet (ion-router-outlet),
    * and that it will show a "forward" animation by default.
    *
    * Navigating forward can also be trigger in a declarative manner by using the `[routerDirection]` directive:
    *
    * ```html
    * <a routerLink="/path/to/page" routerDirection="forward">Link</a>
    * ```
    */
  def navigateForward(url: java.lang.String): js.Promise[scala.Boolean] = js.native
  def navigateForward(url: java.lang.String, options: NavigationOptions): js.Promise[scala.Boolean] = js.native
  def navigateForward(url: js.Array[_]): js.Promise[scala.Boolean] = js.native
  def navigateForward(url: js.Array[_], options: NavigationOptions): js.Promise[scala.Boolean] = js.native
  def navigateRoot(url: atAngularRouterLib.atAngularRouterMod.UrlTree): js.Promise[scala.Boolean] = js.native
  def navigateRoot(url: atAngularRouterLib.atAngularRouterMod.UrlTree, options: NavigationOptions): js.Promise[scala.Boolean] = js.native
  /**
    * This method uses Angular's [Router](https://angular.io/api/router/Router) under the hood,
    * it's equivalent to call:
    *
    * ```ts
    * this.navController.setDirection('root');
    * this.router.navigateByUrl(path);
    * ```
    *
    * Going **root** means that all existing pages in the stack will be removed,
    * and the navigated page will become the single page in the stack.
    *
    * Navigating root can also be trigger in a declarative manner by using the `[routerDirection]` directive:
    *
    * ```html
    * <a routerLink="/path/to/page" routerDirection="root">Link</a>
    * ```
    */
  def navigateRoot(url: java.lang.String): js.Promise[scala.Boolean] = js.native
  def navigateRoot(url: java.lang.String, options: NavigationOptions): js.Promise[scala.Boolean] = js.native
  def navigateRoot(url: js.Array[_]): js.Promise[scala.Boolean] = js.native
  def navigateRoot(url: js.Array[_], options: NavigationOptions): js.Promise[scala.Boolean] = js.native
  /**
    * This methods goes back in the context of ionic's stack navigation.
    *
    * It recursivelly finds the top active `ion-router-outlet` and calls `pop()`.
    * This is the recommended way to go back when you are using `ion-router-outlet`.
    */
  def pop(): js.Promise[scala.Unit] = js.native
  /**
    * This methods specifies the direction of the next navigation performed by the angular router.
    *
    * `setDirection()` does not trigger any transition, it just sets a set of flags to be consumed by `ion-router-outlet`.
    *
    * It's recommended to use `navigateForward()`, `navigateBack()` and `navigateBack()` instead of `setDirection()`.
    */
  def setDirection(direction: atIonicCoreLib.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection): scala.Unit = js.native
  def setDirection(
    direction: atIonicCoreLib.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection,
    animated: scala.Boolean
  ): scala.Unit = js.native
  @JSName("setDirection")
  def setDirection_back(
    direction: atIonicCoreLib.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection,
    animated: scala.Boolean,
    animationDirection: atIonicAngularLib.atIonicAngularLibStrings.back
  ): scala.Unit = js.native
  @JSName("setDirection")
  def setDirection_forward(
    direction: atIonicCoreLib.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection,
    animated: scala.Boolean,
    animationDirection: atIonicAngularLib.atIonicAngularLibStrings.forward
  ): scala.Unit = js.native
  /**
    * @internal
    */
  def setTopOutlet(outlet: atIonicAngularLib.distDirectivesNavigationIonDashRouterDashOutletMod.IonRouterOutlet): scala.Unit = js.native
}

