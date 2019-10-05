package typings.atIonicCore.distTypesComponentsMod.Components

import typings.atIonicCore.atIonicCoreStrings.ios
import typings.atIonicCore.atIonicCoreStrings.md
import typings.atIonicCore.distTypesComponentsNavNavDashInterfaceMod.RouterOutletOptions
import typings.atIonicCore.distTypesComponentsNavNavDashInterfaceMod.SwipeGestureHandler
import typings.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteID
import typings.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteWrite
import typings.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typings.atIonicCore.distTypesInterfaceMod.ComponentProps
import typings.atIonicCore.distTypesInterfaceMod.FrameworkDelegate
import typings.atIonicCore.distTypesUtilsAnimationOldDashAnimationAnimationDashInterfaceMod.AnimationBuilder
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonRouterOutlet extends js.Object {
  /**
    * If `true`, the router-outlet should animate the transition of components.
    */
  var animated: Boolean = js.native
  /**
    * By default `ion-nav` animates transition between pages based in the mode (ios or material design). However, this property allows to create custom transition using `AnimateBuilder` functions.
    */
  var animation: js.UndefOr[AnimationBuilder] = js.native
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: ios | md = js.native
  var swipeHandler: js.UndefOr[SwipeGestureHandler] = js.native
  def commit(enteringEl: HTMLElement): js.Promise[Boolean] = js.native
  def commit(enteringEl: HTMLElement, leavingEl: js.UndefOr[scala.Nothing], opts: RouterOutletOptions): js.Promise[Boolean] = js.native
  def commit(enteringEl: HTMLElement, leavingEl: HTMLElement): js.Promise[Boolean] = js.native
  def commit(enteringEl: HTMLElement, leavingEl: HTMLElement, opts: RouterOutletOptions): js.Promise[Boolean] = js.native
  def getRouteId(): js.Promise[js.UndefOr[RouteID]] = js.native
  def setRouteId(id: String, params: js.UndefOr[scala.Nothing], direction: RouterDirection): js.Promise[RouteWrite] = js.native
  def setRouteId(id: String, params: ComponentProps[Null], direction: RouterDirection): js.Promise[RouteWrite] = js.native
}

