package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.dataviz.map.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapOptions extends js.Object {
  
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
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
    
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
    def setBeforeReset(value: /* e */ MapBeforeResetEvent => Unit): Self = this.set("beforeReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeReset: Self = this.set("beforeReset", js.undefined)
    
    @scala.inline
    def setCenter(value: js.Any | Location): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setClick(value: /* e */ MapClickEvent => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setControls(value: MapControls): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setLayerDefaults(value: MapLayerDefaults): Self = this.set("layerDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerDefaults: Self = this.set("layerDefaults", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: MapLayer*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[MapLayer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setMarkerActivate(value: /* e */ MapMarkerActivateEvent => Unit): Self = this.set("markerActivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMarkerActivate: Self = this.set("markerActivate", js.undefined)
    
    @scala.inline
    def setMarkerClick(value: /* e */ MapMarkerClickEvent => Unit): Self = this.set("markerClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMarkerClick: Self = this.set("markerClick", js.undefined)
    
    @scala.inline
    def setMarkerCreated(value: /* e */ MapMarkerCreatedEvent => Unit): Self = this.set("markerCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMarkerCreated: Self = this.set("markerCreated", js.undefined)
    
    @scala.inline
    def setMarkerDefaults(value: MapMarkerDefaults): Self = this.set("markerDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerDefaults: Self = this.set("markerDefaults", js.undefined)
    
    @scala.inline
    def setMarkersVarargs(value: MapMarker*): Self = this.set("markers", js.Array(value :_*))
    
    @scala.inline
    def setMarkers(value: js.Array[MapMarker]): Self = this.set("markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkers: Self = this.set("markers", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPan(value: /* e */ MapPanEvent => Unit): Self = this.set("pan", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePan: Self = this.set("pan", js.undefined)
    
    @scala.inline
    def setPanEnd(value: /* e */ MapPanEndEvent => Unit): Self = this.set("panEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePanEnd: Self = this.set("panEnd", js.undefined)
    
    @scala.inline
    def setPannable(value: Boolean): Self = this.set("pannable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePannable: Self = this.set("pannable", js.undefined)
    
    @scala.inline
    def setReset(value: /* e */ MapResetEvent => Unit): Self = this.set("reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    
    @scala.inline
    def setShapeClick(value: /* e */ MapShapeClickEvent => Unit): Self = this.set("shapeClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShapeClick: Self = this.set("shapeClick", js.undefined)
    
    @scala.inline
    def setShapeCreated(value: /* e */ MapShapeCreatedEvent => Unit): Self = this.set("shapeCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShapeCreated: Self = this.set("shapeCreated", js.undefined)
    
    @scala.inline
    def setShapeFeatureCreated(value: /* e */ MapShapeFeatureCreatedEvent => Unit): Self = this.set("shapeFeatureCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShapeFeatureCreated: Self = this.set("shapeFeatureCreated", js.undefined)
    
    @scala.inline
    def setShapeMouseEnter(value: /* e */ MapShapeMouseEnterEvent => Unit): Self = this.set("shapeMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShapeMouseEnter: Self = this.set("shapeMouseEnter", js.undefined)
    
    @scala.inline
    def setShapeMouseLeave(value: /* e */ MapShapeMouseLeaveEvent => Unit): Self = this.set("shapeMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShapeMouseLeave: Self = this.set("shapeMouseLeave", js.undefined)
    
    @scala.inline
    def setWraparound(value: Boolean): Self = this.set("wraparound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWraparound: Self = this.set("wraparound", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    
    @scala.inline
    def setZoomEnd(value: /* e */ MapZoomEndEvent => Unit): Self = this.set("zoomEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteZoomEnd: Self = this.set("zoomEnd", js.undefined)
    
    @scala.inline
    def setZoomStart(value: /* e */ MapZoomStartEvent => Unit): Self = this.set("zoomStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteZoomStart: Self = this.set("zoomStart", js.undefined)
    
    @scala.inline
    def setZoomable(value: Boolean): Self = this.set("zoomable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomable: Self = this.set("zoomable", js.undefined)
  }
}
