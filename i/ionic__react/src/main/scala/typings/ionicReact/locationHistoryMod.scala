package typings.ionicReact

import typings.ionicReact.routeInfoMod.RouteInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/routing/LocationHistory", JSImport.Namespace)
@js.native
object locationHistoryMod extends js.Object {
  @js.native
  class LocationHistory () extends js.Object {
    var _add: js.Any = js.native
    var _clear: js.Any = js.native
    var _getRouteInfosByKey: js.Any = js.native
    var _pop: js.Any = js.native
    var _replace: js.Any = js.native
    var locationHistory: js.Any = js.native
    var tabHistory: js.Any = js.native
    def add(routeInfo: RouteInfo[_]): Unit = js.native
    def canGoBack(): Boolean = js.native
    def clearTabStack(tab: String): Unit = js.native
    def current(): RouteInfo[_] = js.native
    def findLastLocation(routeInfo: RouteInfo[_]): js.UndefOr[RouteInfo[_]] = js.native
    def getCurrentRouteInfoForTab(): js.UndefOr[RouteInfo[_]] = js.native
    def getCurrentRouteInfoForTab(tab: String): js.UndefOr[RouteInfo[_]] = js.native
    def getFirstRouteInfoForTab(tab: String): js.UndefOr[RouteInfo[_]] = js.native
    def previous(): RouteInfo[_] = js.native
    def update(routeInfo: RouteInfo[_]): Unit = js.native
  }
  
}

