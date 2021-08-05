package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.interfaceMod.RouterEventDetail
import typings.ionicCore.mod.BackButtonEvent
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  @JSImport("@ionic/core/dist/types/components/router/router", "Router")
  @js.native
  class Router ()
    extends StObject
       with ComponentInterface {
    
    /**
      * Go back to previous page in the window.history.
      */
    def back(): js.Promise[Unit] = js.native
    
    /* private */ var busy: js.Any = js.native
    
    /** @internal */
    def canTransition(): js.Promise[String | Boolean] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MRouter(): Unit = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MRouter(): js.Promise[Unit] = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var getPath: js.Any = js.native
    
    /* private */ var historyDirection: js.Any = js.native
    
    /**
      * Emitted when the route had changed
      */
    var ionRouteDidChange: EventEmitter[RouterEventDetail] = js.native
    
    /**
      * Event emitted when the route is about to change
      */
    var ionRouteWillChange: EventEmitter[RouterEventDetail] = js.native
    
    /* private */ var lastState: js.Any = js.native
    
    /* private */ var lock: js.Any = js.native
    
    /** @internal */
    def navChanged(direction: RouterDirection): js.Promise[Boolean] = js.native
    
    /* protected */ def onBackButton(ev: BackButtonEvent): Unit = js.native
    
    /* protected */ def onPopState(): js.Promise[Boolean] = js.native
    
    /* private */ var onRedirectChanged: js.Any = js.native
    
    /* private */ var onRoutesChanged: js.Any = js.native
    
    /* private */ var previousPath: js.Any = js.native
    
    /** @internal */
    def printDebug(): js.Promise[Unit] = js.native
    
    /**
      * Navigate to the specified URL.
      *
      * @param url The url to navigate to.
      * @param direction The direction of the animation. Defaults to `"forward"`.
      */
    def push(url: String): js.Promise[Boolean] = js.native
    def push(url: String, direction: Unit, animation: AnimationBuilder): js.Promise[Boolean] = js.native
    def push(url: String, direction: RouterDirection): js.Promise[Boolean] = js.native
    def push(url: String, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = js.native
    
    /**
      * By default `ion-router` will match the routes at the root path ("/").
      * That can be changed when
      *
      */
    var root: String = js.native
    
    /* private */ var routeChangeEvent: js.Any = js.native
    
    /* private */ var runGuards: js.Any = js.native
    
    /* private */ var safeWriteNavState: js.Any = js.native
    
    /* private */ var setPath: js.Any = js.native
    
    /* private */ var state: js.Any = js.native
    
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
    
    /* private */ var waitPromise: js.Any = js.native
    
    /* private */ var writeNavState: js.Any = js.native
    
    /* private */ var writeNavStateRoot: js.Any = js.native
  }
}
