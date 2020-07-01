package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.interfaceMod.RouterEventDetail
import typings.ionicCore.mod.BackButtonEvent
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/router/router", JSImport.Namespace)
@js.native
object routerMod extends js.Object {
  @js.native
  class Router () extends ComponentInterface {
    var busy: js.Any = js.native
    var el: HTMLElement = js.native
    var getPath: js.Any = js.native
    var historyDirection: js.Any = js.native
    /**
      * Emitted when the route had changed
      */
    var ionRouteDidChange: EventEmitter[RouterEventDetail] = js.native
    /**
      * Event emitted when the route is about to change
      */
    var ionRouteWillChange: EventEmitter[RouterEventDetail] = js.native
    var lastState: js.Any = js.native
    var lock: js.Any = js.native
    var onRedirectChanged: js.Any = js.native
    var onRoutesChanged: js.Any = js.native
    var previousPath: js.Any = js.native
    /**
      * By default `ion-router` will match the routes at the root path ("/").
      * That can be changed when
      *
      */
    var root: String = js.native
    var routeChangeEvent: js.Any = js.native
    var safeWriteNavState: js.Any = js.native
    var setPath: js.Any = js.native
    var state: js.Any = js.native
    /**
      * The router can work in two "modes":
      * - With hash: `/index.html#/path/to/page`
      * - Without hash: `/path/to/page`
      *
      * Using one or another might depend in the requirements of your app and/or where it's deployed.
      *
      * Usually "hash-less" navigation works better for SEO and it's more user friendly too, but it might
      * requires additional server-side configuration in order to properly work.
      *
      * On the otherside hash-navigation is much easier to deploy, it even works over the file protocol.
      *
      * By default, this property is `true`, change to `false` to allow hash-less URLs.
      */
    var useHash: Boolean = js.native
    var waitPromise: js.UndefOr[js.Any] = js.native
    var writeNavState: js.Any = js.native
    var writeNavStateRoot: js.Any = js.native
    /**
      * Go back to previous page in the window.history.
      */
    def back(): js.Promise[Unit] = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MRouter(): Unit = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MRouter(): js.Promise[Unit] = js.native
    /** @internal */
    def navChanged(direction: RouterDirection): js.Promise[Boolean] = js.native
    /* protected */ def onBackButton(ev: BackButtonEvent): Unit = js.native
    /* protected */ def onPopState(): js.Promise[Boolean] = js.native
    /** @internal */
    def printDebug(): js.Promise[Unit] = js.native
    /**
      * Navigate to the specified URL.
      *
      * @param url The url to navigate to.
      * @param direction The direction of the animation. Defaults to `"forward"`.
      */
    def push(url: String): js.Promise[Boolean] = js.native
    def push(url: String, direction: RouterDirection): js.Promise[Boolean] = js.native
    def push(url: String, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = js.native
  }
  
}

