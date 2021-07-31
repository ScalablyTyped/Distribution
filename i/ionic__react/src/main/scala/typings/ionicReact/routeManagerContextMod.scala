package typings.ionicReact

import typings.ionicReact.routeInfoMod.RouteInfo
import typings.ionicReact.viewItemMod.ViewItem
import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeManagerContextMod {
  
  @JSImport("@ionic/react/dist/types/routing/RouteManagerContext", "RouteManagerContext")
  @js.native
  val RouteManagerContext: Context[RouteManagerContextState] = js.native
  
  @js.native
  trait RouteManagerContextState extends StObject {
    
    def addViewItem(viewItem: ViewItem[js.Any]): Unit = js.native
    
    def canGoBack(): Boolean = js.native
    
    def clearOutlet(outletId: String): Unit = js.native
    
    def createViewItem(outletId: String, reactElement: ReactElement, routeInfo: RouteInfo[js.Any]): ViewItem[js.Any] = js.native
    def createViewItem(outletId: String, reactElement: ReactElement, routeInfo: RouteInfo[js.Any], page: HTMLElement): ViewItem[js.Any] = js.native
    
    def findLeavingViewItemByRouteInfo(routeInfo: RouteInfo[js.Any]): js.UndefOr[ViewItem[js.Any]] = js.native
    def findLeavingViewItemByRouteInfo(routeInfo: RouteInfo[js.Any], outletId: String): js.UndefOr[ViewItem[js.Any]] = js.native
    
    def findViewItemByPathname(pathname: String): js.UndefOr[ViewItem[js.Any]] = js.native
    def findViewItemByPathname(pathname: String, outletId: String): js.UndefOr[ViewItem[js.Any]] = js.native
    
    def findViewItemByRouteInfo(routeInfo: RouteInfo[js.Any]): js.UndefOr[ViewItem[js.Any]] = js.native
    def findViewItemByRouteInfo(routeInfo: RouteInfo[js.Any], outletId: String): js.UndefOr[ViewItem[js.Any]] = js.native
    
    def getChildrenToRender(
      outletId: String,
      ionRouterOutlet: ReactElement,
      routeInfo: RouteInfo[js.Any],
      reRender: js.Function0[Unit]
    ): js.Array[ReactNode] = js.native
    
    def goBack(): Unit = js.native
    
    def unMountViewItem(viewItem: ViewItem[js.Any]): Unit = js.native
  }
}
