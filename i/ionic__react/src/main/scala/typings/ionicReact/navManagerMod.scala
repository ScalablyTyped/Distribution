package typings.ionicReact

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicReact.anon.TypeofPageManager
import typings.ionicReact.ionRouterContextMod.IonRouterContextState
import typings.ionicReact.locationHistoryMod.LocationHistory
import typings.ionicReact.navContextMod.NavContextState
import typings.ionicReact.routeActionMod.RouteAction
import typings.ionicReact.routeInfoMod.RouteInfo
import typings.ionicReact.routerDirectionMod.RouterDirection
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/react/dist/types/routing/NavManager", JSImport.Namespace)
@js.native
object navManagerMod extends js.Object {
  
  @js.native
  class NavManager protected ()
    extends Component[NavManagerProps, NavContextState, js.Any] {
    def this(props: NavManagerProps) = this()
    
    def getIonRedirect(): js.Any = js.native
    
    def getIonRoute(): js.Any = js.native
    
    def getPageManager(): TypeofPageManager = js.native
    
    def getStackManager(): js.Any = js.native
    
    def goBack(): Unit = js.native
    def goBack(route: js.UndefOr[scala.Nothing], animationBuilder: AnimationBuilder): Unit = js.native
    def goBack(route: String): Unit = js.native
    def goBack(route: String, animationBuilder: AnimationBuilder): Unit = js.native
    def goBack(route: RouteInfo[_]): Unit = js.native
    def goBack(route: RouteInfo[_], animationBuilder: AnimationBuilder): Unit = js.native
    
    var ionRouterContextValue: IonRouterContextState = js.native
    
    def navigate(path: String): Unit = js.native
    def navigate(
      path: String,
      direction: js.UndefOr[scala.Nothing],
      action: js.UndefOr[scala.Nothing],
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: js.UndefOr[scala.Nothing],
      action: js.UndefOr[scala.Nothing],
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: js.UndefOr[scala.Nothing],
      action: js.UndefOr[scala.Nothing],
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: js.UndefOr[scala.Nothing],
      action: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def navigate(
      path: String,
      direction: js.UndefOr[scala.Nothing],
      action: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder,
      options: js.UndefOr[scala.Nothing],
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: js.UndefOr[scala.Nothing],
      action: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder,
      options: js.Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: js.UndefOr[scala.Nothing],
      action: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder,
      options: js.Any,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: js.UndefOr[scala.Nothing], action: RouteAction): Unit = js.native
    def navigate(
      path: String,
      direction: js.UndefOr[scala.Nothing],
      action: RouteAction,
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: js.UndefOr[scala.Nothing],
      action: RouteAction,
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: js.UndefOr[scala.Nothing],
      action: RouteAction,
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: js.UndefOr[scala.Nothing],
      action: RouteAction,
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def navigate(
      path: String,
      direction: js.UndefOr[scala.Nothing],
      action: RouteAction,
      animationBuilder: AnimationBuilder,
      options: js.UndefOr[scala.Nothing],
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: js.UndefOr[scala.Nothing],
      action: RouteAction,
      animationBuilder: AnimationBuilder,
      options: js.Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: js.UndefOr[scala.Nothing],
      action: RouteAction,
      animationBuilder: AnimationBuilder,
      options: js.Any,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: RouterDirection): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: js.UndefOr[scala.Nothing],
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: js.UndefOr[scala.Nothing],
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: js.UndefOr[scala.Nothing],
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder,
      options: js.UndefOr[scala.Nothing],
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder,
      options: js.Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder,
      options: js.Any,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: RouterDirection, action: RouteAction): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: RouteAction,
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: RouteAction,
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: RouteAction,
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.Any,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: RouterDirection, action: RouteAction, animationBuilder: AnimationBuilder): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: RouteAction,
      animationBuilder: AnimationBuilder,
      options: js.UndefOr[scala.Nothing],
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: RouteAction,
      animationBuilder: AnimationBuilder,
      options: js.Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: RouteAction,
      animationBuilder: AnimationBuilder,
      options: js.Any,
      tab: String
    ): Unit = js.native
  }
  
  @js.native
  trait NavManagerProps extends js.Object {
    
    var ionRedirect: js.Any = js.native
    
    var ionRoute: js.Any = js.native
    
    var locationHistory: LocationHistory = js.native
    
    def onChangeTab(tab: String, path: String): Unit = js.native
    def onChangeTab(tab: String, path: String, routeOptions: js.Any): Unit = js.native
    
    def onNavigate(path: String, action: RouteAction): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: js.UndefOr[scala.Nothing],
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      tab: String
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: js.UndefOr[scala.Nothing],
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: js.UndefOr[scala.Nothing],
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.Any,
      tab: String
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder,
      options: js.UndefOr[scala.Nothing],
      tab: String
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder,
      options: js.Any
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: js.UndefOr[scala.Nothing],
      animationBuilder: AnimationBuilder,
      options: js.Any,
      tab: String
    ): Unit = js.native
    def onNavigate(path: String, action: RouteAction, direction: RouterDirection): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: RouterDirection,
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      tab: String
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: RouterDirection,
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.Any
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: RouterDirection,
      animationBuilder: js.UndefOr[scala.Nothing],
      options: js.Any,
      tab: String
    ): Unit = js.native
    def onNavigate(path: String, action: RouteAction, direction: RouterDirection, animationBuilder: AnimationBuilder): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: RouterDirection,
      animationBuilder: AnimationBuilder,
      options: js.UndefOr[scala.Nothing],
      tab: String
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: RouterDirection,
      animationBuilder: AnimationBuilder,
      options: js.Any
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: RouterDirection,
      animationBuilder: AnimationBuilder,
      options: js.Any,
      tab: String
    ): Unit = js.native
    
    def onNavigateBack(): Unit = js.native
    def onNavigateBack(route: js.UndefOr[scala.Nothing], animationBuilder: AnimationBuilder): Unit = js.native
    def onNavigateBack(route: String): Unit = js.native
    def onNavigateBack(route: String, animationBuilder: AnimationBuilder): Unit = js.native
    def onNavigateBack(route: RouteInfo[_]): Unit = js.native
    def onNavigateBack(route: RouteInfo[_], animationBuilder: AnimationBuilder): Unit = js.native
    
    def onResetTab(tab: String, path: String): Unit = js.native
    def onResetTab(tab: String, path: String, routeOptions: js.Any): Unit = js.native
    
    def onSetCurrentTab(tab: String, routeInfo: RouteInfo[_]): Unit = js.native
    
    var routeInfo: RouteInfo[_] = js.native
    
    var stackManager: js.Any = js.native
  }
}
