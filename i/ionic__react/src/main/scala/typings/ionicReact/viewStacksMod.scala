package typings.ionicReact

import typings.ionicReact.routeInfoMod.RouteInfo
import typings.ionicReact.viewItemMod.ViewItem
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewStacksMod {
  
  @JSImport("@ionic/react/dist/types/routing/ViewStacks", "ViewStacks")
  @js.native
  abstract class ViewStacks () extends StObject {
    
    def add(viewItem: ViewItem[js.Any]): Unit = js.native
    
    def clear(outletId: String): Unit = js.native
    
    def createViewItem(outletId: String, reactElement: ReactElement, routeInfo: RouteInfo[js.Any]): ViewItem[js.Any] = js.native
    def createViewItem(outletId: String, reactElement: ReactElement, routeInfo: RouteInfo[js.Any], page: HTMLElement): ViewItem[js.Any] = js.native
    
    def findLeavingViewItemByRouteInfo(routeInfo: RouteInfo[js.Any]): js.UndefOr[ViewItem[js.Any]] = js.native
    def findLeavingViewItemByRouteInfo(routeInfo: RouteInfo[js.Any], outletId: String): js.UndefOr[ViewItem[js.Any]] = js.native
    
    def findViewItemByPathname(pathname: String): js.UndefOr[ViewItem[js.Any]] = js.native
    def findViewItemByPathname(pathname: String, outletId: String): js.UndefOr[ViewItem[js.Any]] = js.native
    
    def findViewItemByRouteInfo(routeInfo: RouteInfo[js.Any]): js.UndefOr[ViewItem[js.Any]] = js.native
    def findViewItemByRouteInfo(routeInfo: RouteInfo[js.Any], outletId: String): js.UndefOr[ViewItem[js.Any]] = js.native
    
    /* protected */ def getAllViewItems(): js.Array[ViewItem[js.Any]] = js.native
    
    def getChildrenToRender(
      outletId: String,
      ionRouterOutlet: ReactElement,
      routeInfo: RouteInfo[js.Any],
      reRender: js.Function0[Unit],
      setInTransition: js.Function0[Unit]
    ): js.Array[ReactNode] = js.native
    
    /* protected */ def getStackIds(): js.Array[String] = js.native
    
    def getViewItemsForOutlet(outletId: String): js.Array[ViewItem[js.Any]] = js.native
    
    def remove(viewItem: ViewItem[js.Any]): Unit = js.native
    
    var viewStacks: js.Any = js.native
  }
}
