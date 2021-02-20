package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.dataviz.map.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapOptions extends StObject {
  
  var beforeReset: js.UndefOr[js.Function1[/* e */ MapBeforeResetEvent, Unit]] = js.native
  
  var center: js.UndefOr[js.Any | Location] = js.native
  
  var click: js.UndefOr[js.Function1[/* e */ MapClickEvent, Unit]] = js.native
  
  var controls: js.UndefOr[MapControls] = js.native
  
  var layerDefaults: js.UndefOr[MapLayerDefaults] = js.native
  
  var layers: js.UndefOr[js.Array[MapLayer]] = js.native
  
  var markerActivate: js.UndefOr[js.Function1[/* e */ MapMarkerActivateEvent, Unit]] = js.native
  
  var markerClick: js.UndefOr[js.Function1[/* e */ MapMarkerClickEvent, Unit]] = js.native
  
  var markerCreated: js.UndefOr[js.Function1[/* e */ MapMarkerCreatedEvent, Unit]] = js.native
  
  var markerDefaults: js.UndefOr[MapMarkerDefaults] = js.native
  
  var markers: js.UndefOr[js.Array[MapMarker]] = js.native
  
  var maxZoom: js.UndefOr[Double] = js.native
  
  var minSize: js.UndefOr[Double] = js.native
  
  var minZoom: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pan: js.UndefOr[js.Function1[/* e */ MapPanEvent, Unit]] = js.native
  
  var panEnd: js.UndefOr[js.Function1[/* e */ MapPanEndEvent, Unit]] = js.native
  
  var pannable: js.UndefOr[Boolean] = js.native
  
  var reset: js.UndefOr[js.Function1[/* e */ MapResetEvent, Unit]] = js.native
  
  var shapeClick: js.UndefOr[js.Function1[/* e */ MapShapeClickEvent, Unit]] = js.native
  
  var shapeCreated: js.UndefOr[js.Function1[/* e */ MapShapeCreatedEvent, Unit]] = js.native
  
  var shapeFeatureCreated: js.UndefOr[js.Function1[/* e */ MapShapeFeatureCreatedEvent, Unit]] = js.native
  
  var shapeMouseEnter: js.UndefOr[js.Function1[/* e */ MapShapeMouseEnterEvent, Unit]] = js.native
  
  var shapeMouseLeave: js.UndefOr[js.Function1[/* e */ MapShapeMouseLeaveEvent, Unit]] = js.native
  
  var wraparound: js.UndefOr[Boolean] = js.native
  
  var zoom: js.UndefOr[Double] = js.native
  
  var zoomEnd: js.UndefOr[js.Function1[/* e */ MapZoomEndEvent, Unit]] = js.native
  
  var zoomStart: js.UndefOr[js.Function1[/* e */ MapZoomStartEvent, Unit]] = js.native
  
  var zoomable: js.UndefOr[Boolean] = js.native
}
object MapOptions {
  
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit class MapOptionsMutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeReset(value: /* e */ MapBeforeResetEvent => Unit): Self = StObject.set(x, "beforeReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeResetUndefined: Self = StObject.set(x, "beforeReset", js.undefined)
    
    @scala.inline
    def setCenter(value: js.Any | Location): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setClick(value: /* e */ MapClickEvent => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setControls(value: MapControls): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setLayerDefaults(value: MapLayerDefaults): Self = StObject.set(x, "layerDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerDefaultsUndefined: Self = StObject.set(x, "layerDefaults", js.undefined)
    
    @scala.inline
    def setLayers(value: js.Array[MapLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: MapLayer*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    @scala.inline
    def setMarkerActivate(value: /* e */ MapMarkerActivateEvent => Unit): Self = StObject.set(x, "markerActivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMarkerActivateUndefined: Self = StObject.set(x, "markerActivate", js.undefined)
    
    @scala.inline
    def setMarkerClick(value: /* e */ MapMarkerClickEvent => Unit): Self = StObject.set(x, "markerClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMarkerClickUndefined: Self = StObject.set(x, "markerClick", js.undefined)
    
    @scala.inline
    def setMarkerCreated(value: /* e */ MapMarkerCreatedEvent => Unit): Self = StObject.set(x, "markerCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMarkerCreatedUndefined: Self = StObject.set(x, "markerCreated", js.undefined)
    
    @scala.inline
    def setMarkerDefaults(value: MapMarkerDefaults): Self = StObject.set(x, "markerDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDefaultsUndefined: Self = StObject.set(x, "markerDefaults", js.undefined)
    
    @scala.inline
    def setMarkers(value: js.Array[MapMarker]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    @scala.inline
    def setMarkersVarargs(value: MapMarker*): Self = StObject.set(x, "markers", js.Array(value :_*))
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPan(value: /* e */ MapPanEvent => Unit): Self = StObject.set(x, "pan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPanEnd(value: /* e */ MapPanEndEvent => Unit): Self = StObject.set(x, "panEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPanEndUndefined: Self = StObject.set(x, "panEnd", js.undefined)
    
    @scala.inline
    def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    @scala.inline
    def setPannable(value: Boolean): Self = StObject.set(x, "pannable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPannableUndefined: Self = StObject.set(x, "pannable", js.undefined)
    
    @scala.inline
    def setReset(value: /* e */ MapResetEvent => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    @scala.inline
    def setShapeClick(value: /* e */ MapShapeClickEvent => Unit): Self = StObject.set(x, "shapeClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShapeClickUndefined: Self = StObject.set(x, "shapeClick", js.undefined)
    
    @scala.inline
    def setShapeCreated(value: /* e */ MapShapeCreatedEvent => Unit): Self = StObject.set(x, "shapeCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShapeCreatedUndefined: Self = StObject.set(x, "shapeCreated", js.undefined)
    
    @scala.inline
    def setShapeFeatureCreated(value: /* e */ MapShapeFeatureCreatedEvent => Unit): Self = StObject.set(x, "shapeFeatureCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShapeFeatureCreatedUndefined: Self = StObject.set(x, "shapeFeatureCreated", js.undefined)
    
    @scala.inline
    def setShapeMouseEnter(value: /* e */ MapShapeMouseEnterEvent => Unit): Self = StObject.set(x, "shapeMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShapeMouseEnterUndefined: Self = StObject.set(x, "shapeMouseEnter", js.undefined)
    
    @scala.inline
    def setShapeMouseLeave(value: /* e */ MapShapeMouseLeaveEvent => Unit): Self = StObject.set(x, "shapeMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShapeMouseLeaveUndefined: Self = StObject.set(x, "shapeMouseLeave", js.undefined)
    
    @scala.inline
    def setWraparound(value: Boolean): Self = StObject.set(x, "wraparound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWraparoundUndefined: Self = StObject.set(x, "wraparound", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomEnd(value: /* e */ MapZoomEndEvent => Unit): Self = StObject.set(x, "zoomEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomEndUndefined: Self = StObject.set(x, "zoomEnd", js.undefined)
    
    @scala.inline
    def setZoomStart(value: /* e */ MapZoomStartEvent => Unit): Self = StObject.set(x, "zoomStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomStartUndefined: Self = StObject.set(x, "zoomStart", js.undefined)
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    
    @scala.inline
    def setZoomable(value: Boolean): Self = StObject.set(x, "zoomable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomableUndefined: Self = StObject.set(x, "zoomable", js.undefined)
  }
}
