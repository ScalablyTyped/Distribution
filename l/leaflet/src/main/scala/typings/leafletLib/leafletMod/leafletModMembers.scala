package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", JSImport.Namespace)
@js.native
object leafletModMembers extends js.Object {
  def bounds(points: js.Array[Point]): Bounds = js.native
  def bounds(points: BoundsLiteral): Bounds = js.native
  def bounds(topLeft: PointExpression, bottomRight: PointExpression): Bounds = js.native
  def canvas(): Canvas = js.native
  def canvas(options: RendererOptions): Canvas = js.native
  def circle(latlng: LatLngExpression): Circle[_] = js.native
  def circle(latlng: LatLngExpression, options: CircleMarkerOptions): Circle[_] = js.native
  def circle(latlng: LatLngExpression, radius: scala.Double): Circle[_] = js.native
  def circle(latlng: LatLngExpression, radius: scala.Double, options: CircleMarkerOptions): Circle[_] = js.native
  def circleMarker(latlng: LatLngExpression): CircleMarker[_] = js.native
  def circleMarker(latlng: LatLngExpression, options: CircleMarkerOptions): CircleMarker[_] = js.native
  def divIcon(): DivIcon = js.native
  def divIcon(options: DivIconOptions): DivIcon = js.native
  def featureGroup(): FeatureGroup[_] = js.native
  def featureGroup(layers: js.Array[Layer]): FeatureGroup[_] = js.native
  def geoJSON[P](): GeoJSON[P] = js.native
  def geoJSON[P](geojson: geojsonLib.geojsonMod.GeoJsonObject): GeoJSON[P] = js.native
  def geoJSON[P](geojson: geojsonLib.geojsonMod.GeoJsonObject, options: GeoJSONOptions[P]): GeoJSON[P] = js.native
  def gridLayer(): GridLayer = js.native
  def gridLayer(options: GridLayerOptions): GridLayer = js.native
  def icon(options: IconOptions): Icon[IconOptions] = js.native
  def imageOverlay(imageUrl: java.lang.String, bounds: LatLngBoundsExpression): ImageOverlay = js.native
  def imageOverlay(imageUrl: java.lang.String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): ImageOverlay = js.native
  def latLng(coords: js.Tuple3[scala.Double, scala.Double, scala.Double]): LatLng = js.native
  def latLng(coords: leafletLib.Anon_Lat): LatLng = js.native
  def latLng(coords: LatLngLiteral): LatLng = js.native
  def latLng(coords: LatLngTuple): LatLng = js.native
  def latLng(latitude: scala.Double, longitude: scala.Double): LatLng = js.native
  def latLng(latitude: scala.Double, longitude: scala.Double, altitude: scala.Double): LatLng = js.native
  def latLngBounds(latlngs: js.Array[LatLngExpression]): LatLngBounds = js.native
  def latLngBounds(southWest: LatLngExpression, northEast: LatLngExpression): LatLngBounds = js.native
  def layerGroup(): LayerGroup[_] = js.native
  def layerGroup(layers: js.Array[Layer]): LayerGroup[_] = js.native
  def layerGroup(layers: js.Array[Layer], options: LayerOptions): LayerGroup[_] = js.native
  def map(element: java.lang.String): Map = js.native
  def map(element: java.lang.String, options: MapOptions): Map = js.native
  def map(element: stdLib.HTMLElement): Map = js.native
  def map(element: stdLib.HTMLElement, options: MapOptions): Map = js.native
  def marker(latlng: LatLngExpression): Marker[_] = js.native
  def marker(latlng: LatLngExpression, options: MarkerOptions): Marker[_] = js.native
  def point(coords: leafletLib.Anon_Y): Point = js.native
  def point(coords: PointTuple): Point = js.native
  def point(x: scala.Double, y: scala.Double): Point = js.native
  def point(x: scala.Double, y: scala.Double, round: scala.Boolean): Point = js.native
  def polygon(latlngs: js.Array[LatLngExpression | (js.Array[LatLngExpression | js.Array[LatLngExpression]])]): Polygon[_] = js.native
  def polygon(
    latlngs: js.Array[LatLngExpression | (js.Array[LatLngExpression | js.Array[LatLngExpression]])],
    options: PolylineOptions
  ): Polygon[_] = js.native
  def polyline(latlngs: js.Array[LatLngExpression | js.Array[LatLngExpression]]): Polyline[geojsonLib.geojsonMod.LineString | geojsonLib.geojsonMod.MultiLineString, _] = js.native
  def polyline(latlngs: js.Array[LatLngExpression | js.Array[LatLngExpression]], options: PolylineOptions): Polyline[geojsonLib.geojsonMod.LineString | geojsonLib.geojsonMod.MultiLineString, _] = js.native
  def popup(): Popup = js.native
  def popup(options: PopupOptions): Popup = js.native
  def popup(options: PopupOptions, source: Layer): Popup = js.native
  def rectangle(latLngBounds: LatLngBoundsExpression): Rectangle[_] = js.native
  def rectangle(latLngBounds: LatLngBoundsExpression, options: PolylineOptions): Rectangle[_] = js.native
  def svg(): SVG = js.native
  def svg(options: RendererOptions): SVG = js.native
  def tileLayer(urlTemplate: java.lang.String): TileLayer = js.native
  def tileLayer(urlTemplate: java.lang.String, options: TileLayerOptions): TileLayer = js.native
  def tooltip(): Tooltip = js.native
  def tooltip(options: TooltipOptions): Tooltip = js.native
  def tooltip(options: TooltipOptions, source: Layer): Tooltip = js.native
}

