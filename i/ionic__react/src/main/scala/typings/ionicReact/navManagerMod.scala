package typings.ionicReact

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicReact.anon.TypeofPageManager
import typings.ionicReact.ionRouterContextMod.IonRouterContextState
import typings.ionicReact.locationHistoryMod.LocationHistory
import typings.ionicReact.navContextMod.NavContextState
import typings.ionicReact.routeActionMod.RouteAction
import typings.ionicReact.routeInfoMod.RouteInfo
import typings.ionicReact.routerDirectionMod.RouterDirection
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navManagerMod {
  
  @JSImport("@ionic/react/dist/types/routing/NavManager", "NavManager")
  @js.native
  class NavManager protected ()
    extends PureComponent[NavManagerProps, NavContextState, js.Any] {
    def this(props: NavManagerProps) = this()
    
    def getIonRedirect(): js.Any = js.native
    
    def getIonRoute(): js.Any = js.native
    
    def getPageManager(): TypeofPageManager = js.native
    
    def getStackManager(): js.Any = js.native
    
    def goBack(): Unit = js.native
    def goBack(route: String): Unit = js.native
    def goBack(route: String, animationBuilder: AnimationBuilder): Unit = js.native
    def goBack(route: Unit, animationBuilder: AnimationBuilder): Unit = js.native
    def goBack(route: RouteInfo[js.Any]): Unit = js.native
    def goBack(route: RouteInfo[js.Any], animationBuilder: AnimationBuilder): Unit = js.native
    
    var ionRouterContextValue: IonRouterContextState = js.native
    
    def navigate(path: String): Unit = js.native
    def navigate(path: String, direction: Unit, action: Unit, animationBuilder: Unit, options: js.Any): Unit = js.native
    def navigate(path: String, direction: Unit, action: Unit, animationBuilder: Unit, options: js.Any, tab: String): Unit = js.native
    def navigate(path: String, direction: Unit, action: Unit, animationBuilder: Unit, options: Unit, tab: String): Unit = js.native
    def navigate(path: String, direction: Unit, action: Unit, animationBuilder: AnimationBuilder): Unit = js.native
    def navigate(path: String, direction: Unit, action: Unit, animationBuilder: AnimationBuilder, options: js.Any): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      action: Unit,
      animationBuilder: AnimationBuilder,
      options: js.Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      action: Unit,
      animationBuilder: AnimationBuilder,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: Unit, action: RouteAction): Unit = js.native
    def navigate(path: String, direction: Unit, action: RouteAction, animationBuilder: Unit, options: js.Any): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      action: RouteAction,
      animationBuilder: Unit,
      options: js.Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      action: RouteAction,
      animationBuilder: Unit,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: Unit, action: RouteAction, animationBuilder: AnimationBuilder): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      action: RouteAction,
      animationBuilder: AnimationBuilder,
      options: js.Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      action: RouteAction,
      animationBuilder: AnimationBuilder,
      options: js.Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: Unit,
      action: RouteAction,
      animationBuilder: AnimationBuilder,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: RouterDirection): Unit = js.native
    def navigate(path: String, direction: RouterDirection, action: Unit, animationBuilder: Unit, options: js.Any): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: Unit,
      animationBuilder: Unit,
      options: js.Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: Unit,
      animationBuilder: Unit,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: RouterDirection, action: Unit, animationBuilder: AnimationBuilder): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: Unit,
      animationBuilder: AnimationBuilder,
      options: js.Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: Unit,
      animationBuilder: AnimationBuilder,
      options: js.Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: Unit,
      animationBuilder: AnimationBuilder,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: RouterDirection, action: RouteAction): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: RouteAction,
      animationBuilder: Unit,
      options: js.Any
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: RouteAction,
      animationBuilder: Unit,
      options: js.Any,
      tab: String
    ): Unit = js.native
    def navigate(
      path: String,
      direction: RouterDirection,
      action: RouteAction,
      animationBuilder: Unit,
      options: Unit,
      tab: String
    ): Unit = js.native
    def navigate(path: String, direction: RouterDirection, action: RouteAction, animationBuilder: AnimationBuilder): Unit = js.native
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
    def navigate(
      path: String,
      direction: RouterDirection,
      action: RouteAction,
      animationBuilder: AnimationBuilder,
      options: Unit,
      tab: String
    ): Unit = js.native
  }
  
  @js.native
  trait NavManagerProps extends StObject {
    
    var ionRedirect: js.Any = js.native
    
    var ionRoute: js.Any = js.native
    
    var locationHistory: LocationHistory = js.native
    
    def onChangeTab(tab: String, path: String): Unit = js.native
    def onChangeTab(tab: String, path: String, routeOptions: js.Any): Unit = js.native
    
    def onNavigate(path: String, action: RouteAction): Unit = js.native
    def onNavigate(path: String, action: RouteAction, direction: Unit, animationBuilder: Unit, options: js.Any): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: Unit,
      animationBuilder: Unit,
      options: js.Any,
      tab: String
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: Unit,
      animationBuilder: Unit,
      options: Unit,
      tab: String
    ): Unit = js.native
    def onNavigate(path: String, action: RouteAction, direction: Unit, animationBuilder: AnimationBuilder): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: Unit,
      animationBuilder: AnimationBuilder,
      options: js.Any
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: Unit,
      animationBuilder: AnimationBuilder,
      options: js.Any,
      tab: String
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: Unit,
      animationBuilder: AnimationBuilder,
      options: Unit,
      tab: String
    ): Unit = js.native
    def onNavigate(path: String, action: RouteAction, direction: RouterDirection): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: RouterDirection,
      animationBuilder: Unit,
      options: js.Any
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: RouterDirection,
      animationBuilder: Unit,
      options: js.Any,
      tab: String
    ): Unit = js.native
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: RouterDirection,
      animationBuilder: Unit,
      options: Unit,
      tab: String
    ): Unit = js.native
    def onNavigate(path: String, action: RouteAction, direction: RouterDirection, animationBuilder: AnimationBuilder): Unit = js.native
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
    def onNavigate(
      path: String,
      action: RouteAction,
      direction: RouterDirection,
      animationBuilder: AnimationBuilder,
      options: Unit,
      tab: String
    ): Unit = js.native
    
    def onNavigateBack(): Unit = js.native
    def onNavigateBack(route: String): Unit = js.native
    def onNavigateBack(route: String, animationBuilder: AnimationBuilder): Unit = js.native
    def onNavigateBack(route: Unit, animationBuilder: AnimationBuilder): Unit = js.native
    def onNavigateBack(route: RouteInfo[js.Any]): Unit = js.native
    def onNavigateBack(route: RouteInfo[js.Any], animationBuilder: AnimationBuilder): Unit = js.native
    
    def onResetTab(tab: String, path: String): Unit = js.native
    def onResetTab(tab: String, path: String, routeOptions: js.Any): Unit = js.native
    
    def onSetCurrentTab(tab: String, routeInfo: RouteInfo[js.Any]): Unit = js.native
    
    var routeInfo: RouteInfo[js.Any] = js.native
    
    var stackManager: js.Any = js.native
  }
}
