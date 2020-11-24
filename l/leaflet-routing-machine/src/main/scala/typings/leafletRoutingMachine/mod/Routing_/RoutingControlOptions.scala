package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.LatLng_
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.connect
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.smart
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.snap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutingControlOptions extends ItineraryOptions {
  
  var addWaypoints: js.UndefOr[Boolean] = js.native
  
  var altLineOptions: js.UndefOr[LineOptions] = js.native
  
  var autoRoute: js.UndefOr[Boolean] = js.native
  
  var defaultErrorHandler: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.native
  
   // IGeocorder is from other library;
  var fitSelectedRoutes: js.UndefOr[smart | Boolean] = js.native
  
  var geocoder: js.UndefOr[js.Any] = js.native
  
  var lineOptions: js.UndefOr[LineOptions] = js.native
  
  var plan: js.UndefOr[Plan_] = js.native
  
  var routeDragInterval: js.UndefOr[Double] = js.native
  
  var routeLine: js.UndefOr[js.Function2[/* route */ IRoute, /* options */ LineOptions, Line_]] = js.native
  
  var routeWhileDragging: js.UndefOr[Boolean] = js.native
  
  var router: js.UndefOr[IRouter] = js.native
  
  var showAlternatives: js.UndefOr[Boolean] = js.native
  
  var useZoomParameter: js.UndefOr[Boolean] = js.native
  
  var waypointMode: js.UndefOr[connect | snap] = js.native
  
  var waypoints: js.UndefOr[js.Array[LatLng_ | Waypoint_]] = js.native
}
object RoutingControlOptions {
  
  @scala.inline
  def apply(): RoutingControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutingControlOptions]
  }
  
  @scala.inline
  implicit class RoutingControlOptionsOps[Self <: RoutingControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddWaypoints(value: Boolean): Self = this.set("addWaypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddWaypoints: Self = this.set("addWaypoints", js.undefined)
    
    @scala.inline
    def setAltLineOptions(value: LineOptions): Self = this.set("altLineOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltLineOptions: Self = this.set("altLineOptions", js.undefined)
    
    @scala.inline
    def setAutoRoute(value: Boolean): Self = this.set("autoRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRoute: Self = this.set("autoRoute", js.undefined)
    
    @scala.inline
    def setDefaultErrorHandler(value: /* error */ js.Any => Unit): Self = this.set("defaultErrorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDefaultErrorHandler: Self = this.set("defaultErrorHandler", js.undefined)
    
    @scala.inline
    def setFitSelectedRoutes(value: smart | Boolean): Self = this.set("fitSelectedRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitSelectedRoutes: Self = this.set("fitSelectedRoutes", js.undefined)
    
    @scala.inline
    def setGeocoder(value: js.Any): Self = this.set("geocoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeocoder: Self = this.set("geocoder", js.undefined)
    
    @scala.inline
    def setLineOptions(value: LineOptions): Self = this.set("lineOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineOptions: Self = this.set("lineOptions", js.undefined)
    
    @scala.inline
    def setPlan(value: Plan_): Self = this.set("plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlan: Self = this.set("plan", js.undefined)
    
    @scala.inline
    def setRouteDragInterval(value: Double): Self = this.set("routeDragInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteDragInterval: Self = this.set("routeDragInterval", js.undefined)
    
    @scala.inline
    def setRouteLine(value: (/* route */ IRoute, /* options */ LineOptions) => Line_): Self = this.set("routeLine", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRouteLine: Self = this.set("routeLine", js.undefined)
    
    @scala.inline
    def setRouteWhileDragging(value: Boolean): Self = this.set("routeWhileDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteWhileDragging: Self = this.set("routeWhileDragging", js.undefined)
    
    @scala.inline
    def setRouter(value: IRouter): Self = this.set("router", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouter: Self = this.set("router", js.undefined)
    
    @scala.inline
    def setShowAlternatives(value: Boolean): Self = this.set("showAlternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAlternatives: Self = this.set("showAlternatives", js.undefined)
    
    @scala.inline
    def setUseZoomParameter(value: Boolean): Self = this.set("useZoomParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseZoomParameter: Self = this.set("useZoomParameter", js.undefined)
    
    @scala.inline
    def setWaypointMode(value: connect | snap): Self = this.set("waypointMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaypointMode: Self = this.set("waypointMode", js.undefined)
    
    @scala.inline
    def setWaypointsVarargs(value: (LatLng_ | Waypoint_)*): Self = this.set("waypoints", js.Array(value :_*))
    
    @scala.inline
    def setWaypoints(value: js.Array[LatLng_ | Waypoint_]): Self = this.set("waypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaypoints: Self = this.set("waypoints", js.undefined)
  }
}
