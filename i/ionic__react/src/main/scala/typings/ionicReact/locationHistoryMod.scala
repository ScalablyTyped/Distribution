package typings.ionicReact

import typings.ionicReact.routeInfoMod.RouteInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationHistoryMod {
  
  @JSImport("@ionic/react/dist/types/routing/LocationHistory", "LocationHistory")
  @js.native
  class LocationHistory () extends StObject {
    
    var _add: js.Any = js.native
    
    var _clear: js.Any = js.native
    
    var _getRouteInfosByKey: js.Any = js.native
    
    var _pop: js.Any = js.native
    
    var _replace: js.Any = js.native
    
    def add(routeInfo: RouteInfo[_]): Unit = js.native
    
    def canGoBack(): Boolean = js.native
    
    def clearTabStack(tab: String): Unit = js.native
    
    def current(): RouteInfo[_] = js.native
    
    def findLastLocation(routeInfo: RouteInfo[_]): js.UndefOr[RouteInfo[_]] = js.native
    
    def getCurrentRouteInfoForTab(): js.UndefOr[RouteInfo[_]] = js.native
    def getCurrentRouteInfoForTab(tab: String): js.UndefOr[RouteInfo[_]] = js.native
    
    def getFirstRouteInfoForTab(tab: String): js.UndefOr[RouteInfo[_]] = js.native
    
    var locationHistory: js.Any = js.native
    
    def previous(): RouteInfo[_] = js.native
    
    var tabHistory: js.Any = js.native
    
    def update(routeInfo: RouteInfo[_]): Unit = js.native
  }
}
