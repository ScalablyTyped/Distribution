package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.NavOutlet
import typings.ionicCore.mod.FrameworkDelegate
import typings.ionicCore.mod.Mode
import typings.ionicCore.navInterfaceMod.RouterOutletOptions
import typings.ionicCore.navInterfaceMod.SwipeGestureHandler
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/router-outlet/route-outlet", JSImport.Namespace)
@js.native
object routeOutletMod extends js.Object {
  @js.native
  class RouterOutlet ()
    extends ComponentInterface
       with NavOutlet {
    var activeComponent: js.Any = js.native
    var activeEl: js.Any = js.native
    var ani: js.UndefOr[js.Any] = js.native
    /**
      * If `true`, the router-outlet should animate the transition of components.
      */
    var animated: Boolean = js.native
    /**
      * By default `ion-nav` animates transition between pages based in the mode (ios or material design).
      * However, this property allows to create custom transition using `AnimateBuilder` functions.
      */
    var animation: js.UndefOr[AnimationBuilder] = js.native
    var animationEnabled: js.Any = js.native
    /** @internal */
    var delegate: js.UndefOr[FrameworkDelegate] = js.native
    var el: HTMLElement = js.native
    var gesture: js.UndefOr[js.Any] = js.native
    /** @internal */
    var ionNavDidChange: EventEmitter[Unit] = js.native
    /** @internal */
    var ionNavWillChange: EventEmitter[Unit] = js.native
    /** @internal */
    var ionNavWillLoad: EventEmitter[Unit] = js.native
    var lock: js.Any = js.native
    /**
      * The mode determines which platform styles to use.
      */
    var mode: Mode = js.native
    var setRoot: js.Any = js.native
    /** @internal */
    var swipeHandler: js.UndefOr[SwipeGestureHandler] = js.native
    var transition: js.Any = js.native
    var waitPromise: js.UndefOr[js.Any] = js.native
    def commit(enteringEl: HTMLElement): js.Promise[Boolean] = js.native
    def commit(enteringEl: HTMLElement, leavingEl: js.UndefOr[scala.Nothing], opts: RouterOutletOptions): js.Promise[Boolean] = js.native
    /** @internal */
    def commit(enteringEl: HTMLElement, leavingEl: HTMLElement): js.Promise[Boolean] = js.native
    def commit(enteringEl: HTMLElement, leavingEl: HTMLElement, opts: RouterOutletOptions): js.Promise[Boolean] = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MRouterOutlet(): Unit = js.native
    @JSName("connectedCallback")
    def connectedCallback_MRouterOutlet(): js.Promise[Unit] = js.native
    @JSName("disconnectedCallback")
    def disconnectedCallback_MRouterOutlet(): Unit = js.native
    @JSName("render")
    def render_MRouterOutlet(): js.Any = js.native
    def swipeHandlerChanged(): Unit = js.native
  }
  
}

