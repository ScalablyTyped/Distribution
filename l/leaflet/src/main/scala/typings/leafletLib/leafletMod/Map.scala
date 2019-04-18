package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Map")
@js.native
class Map protected () extends Evented {
  def this(element: java.lang.String) = this()
  def this(element: stdLib.HTMLElement) = this()
  def this(element: java.lang.String, options: MapOptions) = this()
  def this(element: stdLib.HTMLElement, options: MapOptions) = this()
  // Properties
  var boxZoom: Handler = js.native
  var doubleClickZoom: Handler = js.native
  var dragging: Handler = js.native
  var keyboard: Handler = js.native
  var options: MapOptions = js.native
  var scrollWheelZoom: Handler = js.native
  var tap: js.UndefOr[Handler] = js.native
  var touchZoom: Handler = js.native
  var zoomControl: leafletLib.leafletMod.ControlNs.Zoom = js.native
  // Methods for layers and controls
  def addControl(control: Control): this.type = js.native
  // Other methods
  def addHandler(
    name: java.lang.String,
    HandlerClass: org.scalablytyped.runtime.Instantiable1[/* map */ Map, Handler]
  ): this.type = js.native
  def addLayer(layer: Layer): this.type = js.native
  def closePopup(): this.type = js.native
  def closePopup(popup: Popup): this.type = js.native
  def closeTooltip(): this.type = js.native
  def closeTooltip(tooltip: Tooltip): this.type = js.native
  def containerPointToLatLng(point: PointExpression): LatLng = js.native
  def containerPointToLayerPoint(point: PointExpression): Point = js.native
  def createPane(name: java.lang.String): stdLib.HTMLElement = js.native
  def createPane(name: java.lang.String, container: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def distance(latlng1: LatLngExpression, latlng2: LatLngExpression): scala.Double = js.native
  def eachLayer(fn: js.Function1[/* layer */ Layer, scala.Unit]): this.type = js.native
  def eachLayer(fn: js.Function1[/* layer */ Layer, scala.Unit], context: js.Any): this.type = js.native
  def fitBounds(bounds: LatLngBoundsExpression): this.type = js.native
  def fitBounds(bounds: LatLngBoundsExpression, options: FitBoundsOptions): this.type = js.native
  def fitWorld(): this.type = js.native
  def fitWorld(options: FitBoundsOptions): this.type = js.native
  def flyTo(latlng: LatLngExpression): this.type = js.native
  def flyTo(latlng: LatLngExpression, zoom: scala.Double): this.type = js.native
  def flyTo(latlng: LatLngExpression, zoom: scala.Double, options: ZoomPanOptions): this.type = js.native
  def flyToBounds(bounds: LatLngBoundsExpression): this.type = js.native
  def flyToBounds(bounds: LatLngBoundsExpression, options: FitBoundsOptions): this.type = js.native
  def getBounds(): LatLngBounds = js.native
  def getBoundsZoom(bounds: LatLngBoundsExpression): scala.Double = js.native
  def getBoundsZoom(bounds: LatLngBoundsExpression, inside: scala.Boolean): scala.Double = js.native
  // Methods for getting map state
  def getCenter(): LatLng = js.native
  def getContainer(): stdLib.HTMLElement = js.native
  def getMaxZoom(): scala.Double = js.native
  def getMinZoom(): scala.Double = js.native
  /**
    * Name of the pane or the pane as HTML-Element
    */
  def getPane(pane: java.lang.String): js.UndefOr[stdLib.HTMLElement] = js.native
  def getPane(pane: stdLib.HTMLElement): js.UndefOr[stdLib.HTMLElement] = js.native
  def getPanes(): org.scalablytyped.runtime.StringDictionary[stdLib.HTMLElement] with DefaultMapPanes = js.native
  def getPixelBounds(): Bounds = js.native
  def getPixelOrigin(): Point = js.native
  def getPixelWorldBounds(): Bounds = js.native
  def getPixelWorldBounds(zoom: scala.Double): Bounds = js.native
  def getRenderer(layer: Path): Renderer = js.native
  def getScaleZoom(scale: scala.Double, fromZoom: scala.Double): scala.Double = js.native
  def getSize(): Point = js.native
  def getZoom(): scala.Double = js.native
  // Conversion methods
  def getZoomScale(toZoom: scala.Double, fromZoom: scala.Double): scala.Double = js.native
  def hasLayer(layer: Layer): scala.Boolean = js.native
  /**
    * Boolean for animate or advanced ZoomPanOptions
    */
  def invalidateSize(): this.type = js.native
  def invalidateSize(options: ZoomPanOptions): this.type = js.native
  def invalidateSize(options: scala.Boolean): this.type = js.native
  def latLngToContainerPoint(latlng: LatLngExpression): Point = js.native
  def latLngToLayerPoint(latlng: LatLngExpression): Point = js.native
  def layerPointToContainerPoint(point: PointExpression): Point = js.native
  def layerPointToLatLng(point: PointExpression): LatLng = js.native
  // Geolocation methods
  def locate(): this.type = js.native
  def locate(options: LocateOptions): this.type = js.native
  def mouseEventToContainerPoint(ev: stdLib.MouseEvent): Point = js.native
  def mouseEventToLatLng(ev: stdLib.MouseEvent): LatLng = js.native
  def mouseEventToLayerPoint(ev: stdLib.MouseEvent): Point = js.native
  def openPopup(content: Content, latlng: LatLngExpression): this.type = js.native
  def openPopup(content: Content, latlng: LatLngExpression, options: PopupOptions): this.type = js.native
  def openPopup(popup: Popup): this.type = js.native
  def openTooltip(content: Content, latlng: LatLngExpression): this.type = js.native
  def openTooltip(content: Content, latlng: LatLngExpression, options: TooltipOptions): this.type = js.native
  def openTooltip(tooltip: Tooltip): this.type = js.native
  def panBy(offset: PointExpression): this.type = js.native
  def panBy(offset: PointExpression, options: PanOptions): this.type = js.native
  def panInside(latLng: LatLngExpression): this.type = js.native
  def panInside(latLng: LatLngExpression, options: PanInsideOptions): this.type = js.native
  def panInsideBounds(bounds: LatLngBoundsExpression): this.type = js.native
  def panInsideBounds(bounds: LatLngBoundsExpression, options: PanOptions): this.type = js.native
  def panTo(latlng: LatLngExpression): this.type = js.native
  def panTo(latlng: LatLngExpression, options: PanOptions): this.type = js.native
  def project(latlng: LatLngExpression, zoom: scala.Double): Point = js.native
   // Alternatively, HandlerClass: new(map: Map) => Handler
  def remove(): this.type = js.native
  def removeControl(control: Control): this.type = js.native
  def removeLayer(layer: Layer): this.type = js.native
  def setMaxBounds(bounds: LatLngBoundsExpression): this.type = js.native
  def setMaxZoom(zoom: scala.Double): this.type = js.native
  def setMinZoom(zoom: scala.Double): this.type = js.native
  // Methods for modifying map state
  def setView(center: LatLngExpression, zoom: scala.Double): this.type = js.native
  def setView(center: LatLngExpression, zoom: scala.Double, options: ZoomPanOptions): this.type = js.native
  def setZoom(zoom: scala.Double): this.type = js.native
  def setZoom(zoom: scala.Double, options: ZoomPanOptions): this.type = js.native
  def setZoomAround(position: LatLngExpression, zoom: scala.Double): this.type = js.native
  def setZoomAround(position: LatLngExpression, zoom: scala.Double, options: ZoomOptions): this.type = js.native
  def setZoomAround(position: Point, zoom: scala.Double): this.type = js.native
  def setZoomAround(position: Point, zoom: scala.Double, options: ZoomOptions): this.type = js.native
  def stop(): this.type = js.native
  def stopLocate(): this.type = js.native
  def unproject(point: PointExpression, zoom: scala.Double): LatLng = js.native
  def whenReady(fn: js.Function0[scala.Unit]): this.type = js.native
  def whenReady(fn: js.Function0[scala.Unit], context: js.Any): this.type = js.native
  def wrapLatLng(latlng: LatLngExpression): LatLng = js.native
  def wrapLatLngBounds(bounds: LatLngBounds): LatLngBounds = js.native
  def zoomIn(): this.type = js.native
  def zoomIn(delta: scala.Double): this.type = js.native
  def zoomIn(delta: scala.Double, options: ZoomOptions): this.type = js.native
  def zoomOut(): this.type = js.native
  def zoomOut(delta: scala.Double): this.type = js.native
  def zoomOut(delta: scala.Double, options: ZoomOptions): this.type = js.native
}

