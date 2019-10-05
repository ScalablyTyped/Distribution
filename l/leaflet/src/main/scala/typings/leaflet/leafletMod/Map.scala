package typings.leaflet.leafletMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Map")
@js.native
class Map protected () extends Evented {
  def this(element: String) = this()
  def this(element: HTMLElement) = this()
  def this(element: String, options: MapOptions) = this()
  def this(element: HTMLElement, options: MapOptions) = this()
  // Properties
  var boxZoom: Handler = js.native
  var doubleClickZoom: Handler = js.native
  var dragging: Handler = js.native
  var keyboard: Handler = js.native
  var options: MapOptions = js.native
  var scrollWheelZoom: Handler = js.native
  var tap: js.UndefOr[Handler] = js.native
  var touchZoom: Handler = js.native
  var zoomControl: typings.leaflet.leafletMod.Control.Zoom = js.native
  // Methods for layers and controls
  def addControl(control: Control): this.type = js.native
  // Other methods
  def addHandler(name: String, HandlerClass: Instantiable1[/* map */ Map, Handler]): this.type = js.native
  def addLayer(layer: Layer): this.type = js.native
  def closePopup(): this.type = js.native
  def closePopup(popup: Popup): this.type = js.native
  def closeTooltip(): this.type = js.native
  def closeTooltip(tooltip: Tooltip): this.type = js.native
  def containerPointToLatLng(point: PointExpression): LatLng = js.native
  def containerPointToLayerPoint(point: PointExpression): Point = js.native
  def createPane(name: String): HTMLElement = js.native
  def createPane(name: String, container: HTMLElement): HTMLElement = js.native
  def distance(latlng1: LatLngExpression, latlng2: LatLngExpression): Double = js.native
  def eachLayer(fn: js.Function1[/* layer */ Layer, Unit]): this.type = js.native
  def eachLayer(fn: js.Function1[/* layer */ Layer, Unit], context: js.Any): this.type = js.native
  def fitBounds(bounds: LatLngBoundsExpression): this.type = js.native
  def fitBounds(bounds: LatLngBoundsExpression, options: FitBoundsOptions): this.type = js.native
  def fitWorld(): this.type = js.native
  def fitWorld(options: FitBoundsOptions): this.type = js.native
  def flyTo(latlng: LatLngExpression): this.type = js.native
  def flyTo(latlng: LatLngExpression, zoom: Double): this.type = js.native
  def flyTo(latlng: LatLngExpression, zoom: Double, options: ZoomPanOptions): this.type = js.native
  def flyToBounds(bounds: LatLngBoundsExpression): this.type = js.native
  def flyToBounds(bounds: LatLngBoundsExpression, options: FitBoundsOptions): this.type = js.native
  def getBounds(): LatLngBounds = js.native
  def getBoundsZoom(bounds: LatLngBoundsExpression): Double = js.native
  def getBoundsZoom(bounds: LatLngBoundsExpression, inside: Boolean): Double = js.native
  // Methods for getting map state
  def getCenter(): LatLng = js.native
  def getContainer(): HTMLElement = js.native
  def getMaxZoom(): Double = js.native
  def getMinZoom(): Double = js.native
  /**
    * Name of the pane or the pane as HTML-Element
    */
  def getPane(pane: String): js.UndefOr[HTMLElement] = js.native
  def getPane(pane: HTMLElement): js.UndefOr[HTMLElement] = js.native
  def getPanes(): StringDictionary[HTMLElement] with DefaultMapPanes = js.native
  def getPixelBounds(): Bounds = js.native
  def getPixelOrigin(): Point = js.native
  def getPixelWorldBounds(): Bounds = js.native
  def getPixelWorldBounds(zoom: Double): Bounds = js.native
  def getRenderer(layer: Path): Renderer = js.native
  def getScaleZoom(scale: Double, fromZoom: Double): Double = js.native
  def getSize(): Point = js.native
  def getZoom(): Double = js.native
  // Conversion methods
  def getZoomScale(toZoom: Double, fromZoom: Double): Double = js.native
  def hasLayer(layer: Layer): Boolean = js.native
  /**
    * Boolean for animate or advanced ZoomPanOptions
    */
  def invalidateSize(): this.type = js.native
  def invalidateSize(options: Boolean): this.type = js.native
  def invalidateSize(options: ZoomPanOptions): this.type = js.native
  def latLngToContainerPoint(latlng: LatLngExpression): Point = js.native
  def latLngToLayerPoint(latlng: LatLngExpression): Point = js.native
  def layerPointToContainerPoint(point: PointExpression): Point = js.native
  def layerPointToLatLng(point: PointExpression): LatLng = js.native
  // Geolocation methods
  def locate(): this.type = js.native
  def locate(options: LocateOptions): this.type = js.native
  def mouseEventToContainerPoint(ev: MouseEvent): Point = js.native
  def mouseEventToLatLng(ev: MouseEvent): LatLng = js.native
  def mouseEventToLayerPoint(ev: MouseEvent): Point = js.native
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
  def project(latlng: LatLngExpression, zoom: Double): Point = js.native
   // Alternatively, HandlerClass: new(map: Map) => Handler
  def remove(): this.type = js.native
  def removeControl(control: Control): this.type = js.native
  def removeLayer(layer: Layer): this.type = js.native
  def setMaxBounds(bounds: LatLngBoundsExpression): this.type = js.native
  def setMaxZoom(zoom: Double): this.type = js.native
  def setMinZoom(zoom: Double): this.type = js.native
  // Methods for modifying map state
  def setView(center: LatLngExpression, zoom: Double): this.type = js.native
  def setView(center: LatLngExpression, zoom: Double, options: ZoomPanOptions): this.type = js.native
  def setZoom(zoom: Double): this.type = js.native
  def setZoom(zoom: Double, options: ZoomPanOptions): this.type = js.native
  def setZoomAround(position: LatLngExpression, zoom: Double): this.type = js.native
  def setZoomAround(position: LatLngExpression, zoom: Double, options: ZoomOptions): this.type = js.native
  def setZoomAround(position: Point, zoom: Double): this.type = js.native
  def setZoomAround(position: Point, zoom: Double, options: ZoomOptions): this.type = js.native
  def stop(): this.type = js.native
  def stopLocate(): this.type = js.native
  def unproject(point: PointExpression, zoom: Double): LatLng = js.native
  def whenReady(fn: js.Function0[Unit]): this.type = js.native
  def whenReady(fn: js.Function0[Unit], context: js.Any): this.type = js.native
  def wrapLatLng(latlng: LatLngExpression): LatLng = js.native
  def wrapLatLngBounds(bounds: LatLngBounds): LatLngBounds = js.native
  def zoomIn(): this.type = js.native
  def zoomIn(delta: Double): this.type = js.native
  def zoomIn(delta: Double, options: ZoomOptions): this.type = js.native
  def zoomOut(): this.type = js.native
  def zoomOut(delta: Double): this.type = js.native
  def zoomOut(delta: Double, options: ZoomOptions): this.type = js.native
}

@JSImport("leaflet", "map")
@js.native
object map extends js.Object {
  def apply(element: String): Map = js.native
  def apply(element: String, options: MapOptions): Map = js.native
  def apply(element: HTMLElement): Map = js.native
  def apply(element: HTMLElement, options: MapOptions): Map = js.native
}

