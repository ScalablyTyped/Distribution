package typings.ionicReact

import typings.ionicReact.routeInfoMod.RouteInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationHistoryMod {
  
  @JSImport("@ionic/react/dist/types/routing/LocationHistory", "LocationHistory")
  @js.native
  class LocationHistory () extends StObject {
    
    /* private */ var _add: js.Any = js.native
    
    /* private */ var _clear: js.Any = js.native
    
    /* private */ var _getRouteInfosByKey: js.Any = js.native
    
    /* private */ var _pop: js.Any = js.native
    
    /* private */ var _replace: js.Any = js.native
    
    def add(routeInfo: RouteInfo[js.Any]): Unit = js.native
    
    def canGoBack(): Boolean = js.native
    
    def clearTabStack(tab: String): Unit = js.native
    
    def current(): RouteInfo[js.Any] = js.native
    
    def findLastLocation(routeInfo: RouteInfo[js.Any]): js.UndefOr[RouteInfo[js.Any]] = js.native
    
    def getCurrentRouteInfoForTab(): js.UndefOr[RouteInfo[js.Any]] = js.native
    def getCurrentRouteInfoForTab(tab: String): js.UndefOr[RouteInfo[js.Any]] = js.native
    
    def getFirstRouteInfoForTab(tab: String): js.UndefOr[RouteInfo[js.Any]] = js.native
    
    /* private */ var locationHistory: js.Any = js.native
    
    def previous(): RouteInfo[js.Any] = js.native
    
    /* private */ var tabHistory: js.Any = js.native
    
    def update(routeInfo: RouteInfo[js.Any]): Unit = js.native
  }
}
