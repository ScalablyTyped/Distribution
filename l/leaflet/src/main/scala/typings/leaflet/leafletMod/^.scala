package typings.leaflet.leafletMod

import typings.geojson.geojsonMod.GeoJsonObject
import typings.geojson.geojsonMod.LineString
import typings.geojson.geojsonMod.MultiLineString
import typings.leaflet.Anon_Alt
import typings.leaflet.Anon_X
import typings.std.HTMLElement
import typings.std.HTMLVideoElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def bounds(points: js.Array[Point]): Bounds = js.native
  def bounds(points: BoundsLiteral): Bounds = js.native
  def bounds(topLeft: PointExpression, bottomRight: PointExpression): Bounds = js.native
  def canvas(): Canvas = js.native
  def canvas(options: RendererOptions): Canvas = js.native
  def circle(latlng: LatLngExpression): Circle[_] = js.native
  def circle(latlng: LatLngExpression, options: CircleMarkerOptions): Circle[_] = js.native
  def circle(latlng: LatLngExpression, radius: Double): Circle[_] = js.native
  def circle(latlng: LatLngExpression, radius: Double, options: CircleMarkerOptions): Circle[_] = js.native
  def circleMarker(latlng: LatLngExpression): CircleMarker[_] = js.native
  def circleMarker(latlng: LatLngExpression, options: CircleMarkerOptions): CircleMarker[_] = js.native
  def divIcon(): DivIcon = js.native
  def divIcon(options: DivIconOptions): DivIcon = js.native
  def featureGroup(): FeatureGroup[_] = js.native
  def featureGroup(layers: js.Array[Layer]): FeatureGroup[_] = js.native
  def geoJSON[P](): GeoJSON[P] = js.native
  def geoJSON[P](geojson: GeoJsonObject): GeoJSON[P] = js.native
  def geoJSON[P](geojson: GeoJsonObject, options: GeoJSONOptions[P]): GeoJSON[P] = js.native
  def gridLayer(): GridLayer = js.native
  def gridLayer(options: GridLayerOptions): GridLayer = js.native
  def icon(options: IconOptions): Icon[IconOptions] = js.native
  def imageOverlay(imageUrl: String, bounds: LatLngBoundsExpression): ImageOverlay = js.native
  def imageOverlay(imageUrl: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): ImageOverlay = js.native
  def latLng(coords: js.Tuple3[Double, Double, Double]): LatLng = js.native
  def latLng(coords: Anon_Alt): LatLng = js.native
  def latLng(coords: LatLngLiteral): LatLng = js.native
  def latLng(coords: LatLngTuple): LatLng = js.native
  def latLng(latitude: Double, longitude: Double): LatLng = js.native
  def latLng(latitude: Double, longitude: Double, altitude: Double): LatLng = js.native
  def latLngBounds(latlngs: js.Array[LatLngExpression]): LatLngBounds = js.native
  def latLngBounds(southWest: LatLngExpression, northEast: LatLngExpression): LatLngBounds = js.native
  def layerGroup(): LayerGroup[_] = js.native
  def layerGroup(layers: js.Array[Layer]): LayerGroup[_] = js.native
  def layerGroup(layers: js.Array[Layer], options: LayerOptions): LayerGroup[_] = js.native
  def map(element: String): Map = js.native
  def map(element: String, options: MapOptions): Map = js.native
  def map(element: HTMLElement): Map = js.native
  def map(element: HTMLElement, options: MapOptions): Map = js.native
  def marker(latlng: LatLngExpression): Marker[_] = js.native
  def marker(latlng: LatLngExpression, options: MarkerOptions): Marker[_] = js.native
  def point(coords: Anon_X): Point = js.native
  def point(coords: PointTuple): Point = js.native
  def point(x: Double, y: Double): Point = js.native
  def point(x: Double, y: Double, round: Boolean): Point = js.native
  def polygon(latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]): Polygon[_] = js.native
  def polygon(
    latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression],
    options: PolylineOptions
  ): Polygon[_] = js.native
  def polyline(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]): Polyline[LineString | MultiLineString, _] = js.native
  def polyline(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions): Polyline[LineString | MultiLineString, _] = js.native
  def popup(): Popup = js.native
  def popup(options: PopupOptions): Popup = js.native
  def popup(options: PopupOptions, source: Layer): Popup = js.native
  def rectangle(latLngBounds: LatLngBoundsExpression): Rectangle[_] = js.native
  def rectangle(latLngBounds: LatLngBoundsExpression, options: PolylineOptions): Rectangle[_] = js.native
  def svg(): SVG = js.native
  def svg(options: RendererOptions): SVG = js.native
  def svgOverlay(svgImage: String, bounds: LatLngBoundsExpression): SVGOverlay = js.native
  def svgOverlay(svgImage: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): SVGOverlay = js.native
  def svgOverlay(svgImage: SVGElement, bounds: LatLngBoundsExpression): SVGOverlay = js.native
  def svgOverlay(svgImage: SVGElement, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): SVGOverlay = js.native
  def tileLayer(urlTemplate: String): TileLayer = js.native
  def tileLayer(urlTemplate: String, options: TileLayerOptions): TileLayer = js.native
  def tooltip(): Tooltip = js.native
  def tooltip(options: TooltipOptions): Tooltip = js.native
  def tooltip(options: TooltipOptions, source: Layer): Tooltip = js.native
  def videoOverlay(video: String, bounds: LatLngBoundsExpression): VideoOverlay = js.native
  def videoOverlay(video: String, bounds: LatLngBoundsExpression, options: VideoOverlayOptions): VideoOverlay = js.native
  def videoOverlay(video: js.Array[String], bounds: LatLngBoundsExpression): VideoOverlay = js.native
  def videoOverlay(video: js.Array[String], bounds: LatLngBoundsExpression, options: VideoOverlayOptions): VideoOverlay = js.native
  def videoOverlay(video: HTMLVideoElement, bounds: LatLngBoundsExpression): VideoOverlay = js.native
  def videoOverlay(video: HTMLVideoElement, bounds: LatLngBoundsExpression, options: VideoOverlayOptions): VideoOverlay = js.native
}

