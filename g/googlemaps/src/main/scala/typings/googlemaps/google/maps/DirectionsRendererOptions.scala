package typings.googlemaps.google.maps

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsRendererOptions extends StObject {
  
  var directions: js.UndefOr[DirectionsResult] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var hideRouteList: js.UndefOr[Boolean] = js.undefined
  
  var infoWindow: js.UndefOr[InfoWindow] = js.undefined
  
  var map: js.UndefOr[Map[Element]] = js.undefined
  
  var markerOptions: js.UndefOr[MarkerOptions] = js.undefined
  
  var panel: js.UndefOr[Element] = js.undefined
  
  var polylineOptions: js.UndefOr[PolylineOptions] = js.undefined
  
  var preserveViewport: js.UndefOr[Boolean] = js.undefined
  
  var routeIndex: js.UndefOr[Double] = js.undefined
  
  var suppressBicyclingLayer: js.UndefOr[Boolean] = js.undefined
  
  var suppressInfoWindows: js.UndefOr[Boolean] = js.undefined
  
  var suppressMarkers: js.UndefOr[Boolean] = js.undefined
  
  var suppressPolylines: js.UndefOr[Boolean] = js.undefined
}
object DirectionsRendererOptions {
  
  @scala.inline
  def apply(): DirectionsRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsRendererOptions]
  }
  
  @scala.inline
  implicit class DirectionsRendererOptionsMutableBuilder[Self <: DirectionsRendererOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirections(value: DirectionsResult): Self = StObject.set(x, "directions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionsUndefined: Self = StObject.set(x, "directions", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setHideRouteList(value: Boolean): Self = StObject.set(x, "hideRouteList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideRouteListUndefined: Self = StObject.set(x, "hideRouteList", js.undefined)
    
    @scala.inline
    def setInfoWindow(value: InfoWindow): Self = StObject.set(x, "infoWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoWindowUndefined: Self = StObject.set(x, "infoWindow", js.undefined)
    
    @scala.inline
    def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setMarkerOptions(value: MarkerOptions): Self = StObject.set(x, "markerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerOptionsUndefined: Self = StObject.set(x, "markerOptions", js.undefined)
    
    @scala.inline
    def setPanel(value: Element): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    
    @scala.inline
    def setPolylineOptions(value: PolylineOptions): Self = StObject.set(x, "polylineOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineOptionsUndefined: Self = StObject.set(x, "polylineOptions", js.undefined)
    
    @scala.inline
    def setPreserveViewport(value: Boolean): Self = StObject.set(x, "preserveViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveViewportUndefined: Self = StObject.set(x, "preserveViewport", js.undefined)
    
    @scala.inline
    def setRouteIndex(value: Double): Self = StObject.set(x, "routeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteIndexUndefined: Self = StObject.set(x, "routeIndex", js.undefined)
    
    @scala.inline
    def setSuppressBicyclingLayer(value: Boolean): Self = StObject.set(x, "suppressBicyclingLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressBicyclingLayerUndefined: Self = StObject.set(x, "suppressBicyclingLayer", js.undefined)
    
    @scala.inline
    def setSuppressInfoWindows(value: Boolean): Self = StObject.set(x, "suppressInfoWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressInfoWindowsUndefined: Self = StObject.set(x, "suppressInfoWindows", js.undefined)
    
    @scala.inline
    def setSuppressMarkers(value: Boolean): Self = StObject.set(x, "suppressMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressMarkersUndefined: Self = StObject.set(x, "suppressMarkers", js.undefined)
    
    @scala.inline
    def setSuppressPolylines(value: Boolean): Self = StObject.set(x, "suppressPolylines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressPolylinesUndefined: Self = StObject.set(x, "suppressPolylines", js.undefined)
  }
}
