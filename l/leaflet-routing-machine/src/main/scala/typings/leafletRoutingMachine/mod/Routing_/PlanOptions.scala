package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.Marker_
import typings.leaflet.mod.PathOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanOptions extends StObject {
  
  var addButtonClassName: js.UndefOr[String] = js.undefined
  
  // IGeocoder
  var addWaypoints: js.UndefOr[Boolean] = js.undefined
  
  var createGeocoder: js.UndefOr[
    js.Function3[
      /* waypointIndex */ Double, 
      /* numberOfWaypoints */ Double, 
      /* plan */ Plan_, 
      js.Object
    ]
  ] = js.undefined
  
  var createGeocoderElement: js.UndefOr[
    js.Function4[
      /* waypoint */ Waypoint_, 
      /* waypointIndex */ Double, 
      /* numberOfWaypoints */ Double, 
      /* options */ this.type, 
      GeocoderElement_
    ]
  ] = js.undefined
  
  var createMarker: js.UndefOr[
    js.Function3[
      /* waypointIndex */ Double, 
      /* waypoint */ Waypoint_, 
      /* numberOfWaypoints */ Double, 
      Marker_[Any] | Boolean
    ]
  ] = js.undefined
  
  var dragStyles: js.UndefOr[js.Array[PathOptions]] = js.undefined
  
  var draggableWaypoints: js.UndefOr[Boolean] = js.undefined
  
  var geocoder: js.UndefOr[Any] = js.undefined
  
  var geocoderClass: js.UndefOr[js.Function2[/* waypointIndex */ Double, /* numberOfWaypoints */ Double, Unit]] = js.undefined
  
  var geocoderPlaceholder: js.UndefOr[js.Function2[/* waypointIndex */ Double, /* numberOfWaypoints */ Double, String]] = js.undefined
  
  var geocodersClassName: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var maxGeocoderTolerance: js.UndefOr[Double] = js.undefined
  
  var reverseWaypoints: js.UndefOr[Boolean] = js.undefined
  
  var routeWhileDragging: js.UndefOr[Boolean] = js.undefined
  
  var waypointNameFallback: js.UndefOr[js.Function1[/* latLng */ LatLng_, String]] = js.undefined
}
object PlanOptions {
  
  inline def apply(): PlanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlanOptions]
  }
  
  extension [Self <: PlanOptions](x: Self) {
    
    inline def setAddButtonClassName(value: String): Self = StObject.set(x, "addButtonClassName", value.asInstanceOf[js.Any])
    
    inline def setAddButtonClassNameUndefined: Self = StObject.set(x, "addButtonClassName", js.undefined)
    
    inline def setAddWaypoints(value: Boolean): Self = StObject.set(x, "addWaypoints", value.asInstanceOf[js.Any])
    
    inline def setAddWaypointsUndefined: Self = StObject.set(x, "addWaypoints", js.undefined)
    
    inline def setCreateGeocoder(value: (/* waypointIndex */ Double, /* numberOfWaypoints */ Double, /* plan */ Plan_) => js.Object): Self = StObject.set(x, "createGeocoder", js.Any.fromFunction3(value))
    
    inline def setCreateGeocoderElement(
      value: (/* waypoint */ Waypoint_, /* waypointIndex */ Double, /* numberOfWaypoints */ Double, PlanOptions) => GeocoderElement_
    ): Self = StObject.set(x, "createGeocoderElement", js.Any.fromFunction4(value))
    
    inline def setCreateGeocoderElementUndefined: Self = StObject.set(x, "createGeocoderElement", js.undefined)
    
    inline def setCreateGeocoderUndefined: Self = StObject.set(x, "createGeocoder", js.undefined)
    
    inline def setCreateMarker(
      value: (/* waypointIndex */ Double, /* waypoint */ Waypoint_, /* numberOfWaypoints */ Double) => Marker_[Any] | Boolean
    ): Self = StObject.set(x, "createMarker", js.Any.fromFunction3(value))
    
    inline def setCreateMarkerUndefined: Self = StObject.set(x, "createMarker", js.undefined)
    
    inline def setDragStyles(value: js.Array[PathOptions]): Self = StObject.set(x, "dragStyles", value.asInstanceOf[js.Any])
    
    inline def setDragStylesUndefined: Self = StObject.set(x, "dragStyles", js.undefined)
    
    inline def setDragStylesVarargs(value: PathOptions*): Self = StObject.set(x, "dragStyles", js.Array(value*))
    
    inline def setDraggableWaypoints(value: Boolean): Self = StObject.set(x, "draggableWaypoints", value.asInstanceOf[js.Any])
    
    inline def setDraggableWaypointsUndefined: Self = StObject.set(x, "draggableWaypoints", js.undefined)
    
    inline def setGeocoder(value: Any): Self = StObject.set(x, "geocoder", value.asInstanceOf[js.Any])
    
    inline def setGeocoderClass(value: (/* waypointIndex */ Double, /* numberOfWaypoints */ Double) => Unit): Self = StObject.set(x, "geocoderClass", js.Any.fromFunction2(value))
    
    inline def setGeocoderClassUndefined: Self = StObject.set(x, "geocoderClass", js.undefined)
    
    inline def setGeocoderPlaceholder(value: (/* waypointIndex */ Double, /* numberOfWaypoints */ Double) => String): Self = StObject.set(x, "geocoderPlaceholder", js.Any.fromFunction2(value))
    
    inline def setGeocoderPlaceholderUndefined: Self = StObject.set(x, "geocoderPlaceholder", js.undefined)
    
    inline def setGeocoderUndefined: Self = StObject.set(x, "geocoder", js.undefined)
    
    inline def setGeocodersClassName(value: String): Self = StObject.set(x, "geocodersClassName", value.asInstanceOf[js.Any])
    
    inline def setGeocodersClassNameUndefined: Self = StObject.set(x, "geocodersClassName", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMaxGeocoderTolerance(value: Double): Self = StObject.set(x, "maxGeocoderTolerance", value.asInstanceOf[js.Any])
    
    inline def setMaxGeocoderToleranceUndefined: Self = StObject.set(x, "maxGeocoderTolerance", js.undefined)
    
    inline def setReverseWaypoints(value: Boolean): Self = StObject.set(x, "reverseWaypoints", value.asInstanceOf[js.Any])
    
    inline def setReverseWaypointsUndefined: Self = StObject.set(x, "reverseWaypoints", js.undefined)
    
    inline def setRouteWhileDragging(value: Boolean): Self = StObject.set(x, "routeWhileDragging", value.asInstanceOf[js.Any])
    
    inline def setRouteWhileDraggingUndefined: Self = StObject.set(x, "routeWhileDragging", js.undefined)
    
    inline def setWaypointNameFallback(value: /* latLng */ LatLng_ => String): Self = StObject.set(x, "waypointNameFallback", js.Any.fromFunction1(value))
    
    inline def setWaypointNameFallbackUndefined: Self = StObject.set(x, "waypointNameFallback", js.undefined)
  }
}
