package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.Marker_
import typings.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlanOptions extends js.Object {
  
  var addButtonClassName: js.UndefOr[String] = js.native
  
   // IGeocoder
  var addWaypoints: js.UndefOr[Boolean] = js.native
  
  var createGeocoder: js.UndefOr[
    js.Function3[/* waypointIndex */ Double, /* numberWaypoints */ Double, /* plan */ Plan_, js.Object]
  ] = js.native
  
  var createGeocoderElement: js.UndefOr[
    js.Function4[
      /* waypoint */ Waypoint_, 
      /* waypointIndex */ Double, 
      /* numberWaypoints */ Double, 
      /* options */ this.type, 
      GeocoderElement_
    ]
  ] = js.native
  
  var createMarker: js.UndefOr[
    js.Function3[
      /* waypointIndex */ Double, 
      /* waypoint */ Waypoint_, 
      /* numberWaypoints */ Double, 
      Marker_[_]
    ]
  ] = js.native
  
  var dragStyles: js.UndefOr[js.Array[PathOptions]] = js.native
  
  var draggableWaypoints: js.UndefOr[Boolean] = js.native
  
  var geocoder: js.UndefOr[js.Any] = js.native
  
  var geocoderClass: js.UndefOr[js.Function2[/* waypointIndex */ Double, /* numberWaypoints */ Double, Unit]] = js.native
  
  var geocoderPlaceholder: js.UndefOr[js.Function2[/* waypointIndex */ Double, /* numberWaypoints */ Double, String]] = js.native
  
  var geocodersClassName: js.UndefOr[String] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var maxGeocoderTolerance: js.UndefOr[Double] = js.native
  
  var reverseWaypoints: js.UndefOr[Boolean] = js.native
  
  var routeWhileDragging: js.UndefOr[Boolean] = js.native
  
  var waypointNameFallback: js.UndefOr[js.Function1[/* latLng */ LatLng_, String]] = js.native
}
object PlanOptions {
  
  @scala.inline
  def apply(): PlanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanOptions]
  }
  
  @scala.inline
  implicit class PlanOptionsOps[Self <: PlanOptions] (val x: Self) extends AnyVal {
    
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
    def setAddButtonClassName(value: String): Self = this.set("addButtonClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddButtonClassName: Self = this.set("addButtonClassName", js.undefined)
    
    @scala.inline
    def setAddWaypoints(value: Boolean): Self = this.set("addWaypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddWaypoints: Self = this.set("addWaypoints", js.undefined)
    
    @scala.inline
    def setCreateGeocoder(value: (/* waypointIndex */ Double, /* numberWaypoints */ Double, /* plan */ Plan_) => js.Object): Self = this.set("createGeocoder", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCreateGeocoder: Self = this.set("createGeocoder", js.undefined)
    
    @scala.inline
    def setCreateGeocoderElement(
      value: (/* waypoint */ Waypoint_, /* waypointIndex */ Double, /* numberWaypoints */ Double, PlanOptions) => GeocoderElement_
    ): Self = this.set("createGeocoderElement", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteCreateGeocoderElement: Self = this.set("createGeocoderElement", js.undefined)
    
    @scala.inline
    def setCreateMarker(
      value: (/* waypointIndex */ Double, /* waypoint */ Waypoint_, /* numberWaypoints */ Double) => Marker_[_]
    ): Self = this.set("createMarker", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCreateMarker: Self = this.set("createMarker", js.undefined)
    
    @scala.inline
    def setDragStylesVarargs(value: PathOptions*): Self = this.set("dragStyles", js.Array(value :_*))
    
    @scala.inline
    def setDragStyles(value: js.Array[PathOptions]): Self = this.set("dragStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragStyles: Self = this.set("dragStyles", js.undefined)
    
    @scala.inline
    def setDraggableWaypoints(value: Boolean): Self = this.set("draggableWaypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableWaypoints: Self = this.set("draggableWaypoints", js.undefined)
    
    @scala.inline
    def setGeocoder(value: js.Any): Self = this.set("geocoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeocoder: Self = this.set("geocoder", js.undefined)
    
    @scala.inline
    def setGeocoderClass(value: (/* waypointIndex */ Double, /* numberWaypoints */ Double) => Unit): Self = this.set("geocoderClass", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGeocoderClass: Self = this.set("geocoderClass", js.undefined)
    
    @scala.inline
    def setGeocoderPlaceholder(value: (/* waypointIndex */ Double, /* numberWaypoints */ Double) => String): Self = this.set("geocoderPlaceholder", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGeocoderPlaceholder: Self = this.set("geocoderPlaceholder", js.undefined)
    
    @scala.inline
    def setGeocodersClassName(value: String): Self = this.set("geocodersClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeocodersClassName: Self = this.set("geocodersClassName", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setMaxGeocoderTolerance(value: Double): Self = this.set("maxGeocoderTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxGeocoderTolerance: Self = this.set("maxGeocoderTolerance", js.undefined)
    
    @scala.inline
    def setReverseWaypoints(value: Boolean): Self = this.set("reverseWaypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverseWaypoints: Self = this.set("reverseWaypoints", js.undefined)
    
    @scala.inline
    def setRouteWhileDragging(value: Boolean): Self = this.set("routeWhileDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteWhileDragging: Self = this.set("routeWhileDragging", js.undefined)
    
    @scala.inline
    def setWaypointNameFallback(value: /* latLng */ LatLng_ => String): Self = this.set("waypointNameFallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWaypointNameFallback: Self = this.set("waypointNameFallback", js.undefined)
  }
}
