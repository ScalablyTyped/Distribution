package typings.ionicReact

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicReact.routeActionMod.RouteAction
import typings.ionicReact.routeInfoMod.RouteInfo
import typings.ionicReact.routerDirectionMod.RouterDirection
import typings.ionicReact.routerOptionsMod.RouterOptions
import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/IonRouterContext", JSImport.Namespace)
@js.native
object ionRouterContextMod extends js.Object {
  @js.native
  trait IonRouterContextState extends js.Object {
    var routeInfo: RouteInfo[_] = js.native
    def back(): Unit = js.native
    def back(animationBuilder: AnimationBuilder): Unit = js.native
    def canGoBack(): Boolean = js.native
    def push(pathname: String): Unit = js.native
    def push(
      pathname: String,
      routerDirection: js.UndefOr[scala.Nothing],
      routeAction: js.UndefOr[scala.Nothing],
      routerOptions: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: js.UndefOr[scala.Nothing],
      routeAction: js.UndefOr[scala.Nothing],
      routerOptions: RouterOptions
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: js.UndefOr[scala.Nothing],
      routeAction: js.UndefOr[scala.Nothing],
      routerOptions: RouterOptions,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def push(pathname: String, routerDirection: js.UndefOr[scala.Nothing], routeAction: RouteAction): Unit = js.native
    def push(
      pathname: String,
      routerDirection: js.UndefOr[scala.Nothing],
      routeAction: RouteAction,
      routerOptions: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: js.UndefOr[scala.Nothing],
      routeAction: RouteAction,
      routerOptions: RouterOptions
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: js.UndefOr[scala.Nothing],
      routeAction: RouteAction,
      routerOptions: RouterOptions,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def push(pathname: String, routerDirection: RouterDirection): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: js.UndefOr[scala.Nothing],
      routerOptions: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: js.UndefOr[scala.Nothing],
      routerOptions: RouterOptions
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: js.UndefOr[scala.Nothing],
      routerOptions: RouterOptions,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def push(pathname: String, routerDirection: RouterDirection, routeAction: RouteAction): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: RouteAction,
      routerOptions: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: RouteAction,
      routerOptions: RouterOptions
    ): Unit = js.native
    def push(
      pathname: String,
      routerDirection: RouterDirection,
      routeAction: RouteAction,
      routerOptions: RouterOptions,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
  }
  
  val IonRouterContext: Context[IonRouterContextState] = js.native
  def useIonRouter(): IonRouterContextState = js.native
}

