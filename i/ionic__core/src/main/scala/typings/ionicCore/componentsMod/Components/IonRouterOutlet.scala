package typings.ionicCore.componentsMod.Components

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouteID
import typings.ionicCore.interfaceMod.RouteWrite
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.mod.FrameworkDelegate
import typings.ionicCore.navInterfaceMod.RouterOutletOptions
import typings.ionicCore.navInterfaceMod.SwipeGestureHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def commit(enteringEl: HTMLElement): js.Promise[Boolean] = js.native
  def commit(enteringEl: HTMLElement, leavingEl: js.UndefOr[scala.Nothing], opts: RouterOutletOptions): js.Promise[Boolean] = js.native
  def commit(enteringEl: HTMLElement, leavingEl: HTMLElement): js.Promise[Boolean] = js.native
  def commit(enteringEl: HTMLElement, leavingEl: HTMLElement, opts: RouterOutletOptions): js.Promise[Boolean] = js.native
  
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  
  def getRouteId(): js.Promise[js.UndefOr[RouteID]] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: ios | md = js.native
  
  def setRouteId(id: String, params: js.UndefOr[scala.Nothing], direction: RouterDirection): js.Promise[RouteWrite] = js.native
  def setRouteId(
    id: String,
    params: js.UndefOr[scala.Nothing],
    direction: RouterDirection,
    animation: AnimationBuilder
  ): js.Promise[RouteWrite] = js.native
  def setRouteId(id: String, params: ComponentProps[Null], direction: RouterDirection): js.Promise[RouteWrite] = js.native
  def setRouteId(id: String, params: ComponentProps[Null], direction: RouterDirection, animation: AnimationBuilder): js.Promise[RouteWrite] = js.native
  
  var swipeHandler: js.UndefOr[SwipeGestureHandler] = js.native
}
