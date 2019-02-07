package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def bounds(points: js.Array[leafletLib.leafletMod.Point]): leafletLib.leafletMod.Bounds = js.native
  def bounds(points: leafletLib.leafletMod.BoundsLiteral): leafletLib.leafletMod.Bounds = js.native
  def bounds(topLeft: leafletLib.leafletMod.PointExpression, bottomRight: leafletLib.leafletMod.PointExpression): leafletLib.leafletMod.Bounds = js.native
  def canvas(): leafletLib.leafletMod.Canvas = js.native
  def canvas(options: leafletLib.leafletMod.RendererOptions): leafletLib.leafletMod.Canvas = js.native
  def circle(latlng: leafletLib.leafletMod.LatLngExpression): leafletLib.leafletMod.Circle[_] = js.native
  def circle(latlng: leafletLib.leafletMod.LatLngExpression, options: leafletLib.leafletMod.CircleMarkerOptions): leafletLib.leafletMod.Circle[_] = js.native
  def circle(latlng: leafletLib.leafletMod.LatLngExpression, radius: scala.Double): leafletLib.leafletMod.Circle[_] = js.native
  def circle(
    latlng: leafletLib.leafletMod.LatLngExpression,
    radius: scala.Double,
    options: leafletLib.leafletMod.CircleMarkerOptions
  ): leafletLib.leafletMod.Circle[_] = js.native
  def circleMarker(latlng: leafletLib.leafletMod.LatLngExpression): leafletLib.leafletMod.CircleMarker[_] = js.native
  def circleMarker(latlng: leafletLib.leafletMod.LatLngExpression, options: leafletLib.leafletMod.CircleMarkerOptions): leafletLib.leafletMod.CircleMarker[_] = js.native
  def divIcon(): leafletLib.leafletMod.DivIcon = js.native
  def divIcon(options: leafletLib.leafletMod.DivIconOptions): leafletLib.leafletMod.DivIcon = js.native
  def featureGroup(): leafletLib.leafletMod.FeatureGroup[_] = js.native
  def featureGroup(layers: js.Array[leafletLib.leafletMod.Layer]): leafletLib.leafletMod.FeatureGroup[_] = js.native
  def geoJSON[P](): leafletLib.leafletMod.GeoJSON[P] = js.native
  def geoJSON[P](geojson: geojsonLib.geojsonMod.GeoJsonObject): leafletLib.leafletMod.GeoJSON[P] = js.native
  def geoJSON[P](geojson: geojsonLib.geojsonMod.GeoJsonObject, options: leafletLib.leafletMod.GeoJSONOptions[P]): leafletLib.leafletMod.GeoJSON[P] = js.native
  def gridLayer(): leafletLib.leafletMod.GridLayer = js.native
  def gridLayer(options: leafletLib.leafletMod.GridLayerOptions): leafletLib.leafletMod.GridLayer = js.native
  def icon(options: leafletLib.leafletMod.IconOptions): leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] = js.native
  def imageOverlay(imageUrl: java.lang.String, bounds: leafletLib.leafletMod.LatLngBoundsExpression): leafletLib.leafletMod.ImageOverlay = js.native
  def imageOverlay(
    imageUrl: java.lang.String,
    bounds: leafletLib.leafletMod.LatLngBoundsExpression,
    options: leafletLib.leafletMod.ImageOverlayOptions
  ): leafletLib.leafletMod.ImageOverlay = js.native
  def latLng(coords: js.Tuple3[scala.Double, scala.Double, scala.Double]): leafletLib.leafletMod.LatLng = js.native
  def latLng(coords: leafletLib.Anon_Alt): leafletLib.leafletMod.LatLng = js.native
  def latLng(coords: leafletLib.leafletMod.LatLngLiteral): leafletLib.leafletMod.LatLng = js.native
  def latLng(coords: leafletLib.leafletMod.LatLngTuple): leafletLib.leafletMod.LatLng = js.native
  def latLng(latitude: scala.Double, longitude: scala.Double): leafletLib.leafletMod.LatLng = js.native
  def latLng(latitude: scala.Double, longitude: scala.Double, altitude: scala.Double): leafletLib.leafletMod.LatLng = js.native
  def latLngBounds(latlngs: js.Array[leafletLib.leafletMod.LatLngExpression]): leafletLib.leafletMod.LatLngBounds = js.native
  def latLngBounds(
    southWest: leafletLib.leafletMod.LatLngExpression,
    northEast: leafletLib.leafletMod.LatLngExpression
  ): leafletLib.leafletMod.LatLngBounds = js.native
  def layerGroup(): leafletLib.leafletMod.LayerGroup[_] = js.native
  def layerGroup(layers: js.Array[leafletLib.leafletMod.Layer]): leafletLib.leafletMod.LayerGroup[_] = js.native
  def layerGroup(layers: js.Array[leafletLib.leafletMod.Layer], options: leafletLib.leafletMod.LayerOptions): leafletLib.leafletMod.LayerGroup[_] = js.native
  def map(element: java.lang.String): leafletLib.leafletMod.Map = js.native
  def map(element: java.lang.String, options: leafletLib.leafletMod.MapOptions): leafletLib.leafletMod.Map = js.native
  def map(element: stdLib.HTMLElement): leafletLib.leafletMod.Map = js.native
  def map(element: stdLib.HTMLElement, options: leafletLib.leafletMod.MapOptions): leafletLib.leafletMod.Map = js.native
  def marker(latlng: leafletLib.leafletMod.LatLngExpression): leafletLib.leafletMod.Marker[_] = js.native
  def marker(latlng: leafletLib.leafletMod.LatLngExpression, options: leafletLib.leafletMod.MarkerOptions): leafletLib.leafletMod.Marker[_] = js.native
  def point(coords: leafletLib.Anon_X): leafletLib.leafletMod.Point = js.native
  def point(coords: leafletLib.leafletMod.PointTuple): leafletLib.leafletMod.Point = js.native
  def point(x: scala.Double, y: scala.Double): leafletLib.leafletMod.Point = js.native
  def point(x: scala.Double, y: scala.Double, round: scala.Boolean): leafletLib.leafletMod.Point = js.native
  def polygon(
    latlngs: js.Array[
      (js.Array[
        js.Array[leafletLib.leafletMod.LatLngExpression] | leafletLib.leafletMod.LatLngExpression
      ]) | leafletLib.leafletMod.LatLngExpression
    ]
  ): leafletLib.leafletMod.Polygon[_] = js.native
  def polygon(
    latlngs: js.Array[
      (js.Array[
        js.Array[leafletLib.leafletMod.LatLngExpression] | leafletLib.leafletMod.LatLngExpression
      ]) | leafletLib.leafletMod.LatLngExpression
    ],
    options: leafletLib.leafletMod.PolylineOptions
  ): leafletLib.leafletMod.Polygon[_] = js.native
  def polyline(
    latlngs: js.Array[
      js.Array[leafletLib.leafletMod.LatLngExpression] | leafletLib.leafletMod.LatLngExpression
    ]
  ): leafletLib.leafletMod.Polyline[geojsonLib.geojsonMod.LineString | geojsonLib.geojsonMod.MultiLineString, _] = js.native
  def polyline(
    latlngs: js.Array[
      js.Array[leafletLib.leafletMod.LatLngExpression] | leafletLib.leafletMod.LatLngExpression
    ],
    options: leafletLib.leafletMod.PolylineOptions
  ): leafletLib.leafletMod.Polyline[geojsonLib.geojsonMod.LineString | geojsonLib.geojsonMod.MultiLineString, _] = js.native
  def popup(): leafletLib.leafletMod.Popup = js.native
  def popup(options: leafletLib.leafletMod.PopupOptions): leafletLib.leafletMod.Popup = js.native
  def popup(options: leafletLib.leafletMod.PopupOptions, source: leafletLib.leafletMod.Layer): leafletLib.leafletMod.Popup = js.native
  def rectangle(latLngBounds: leafletLib.leafletMod.LatLngBoundsExpression): leafletLib.leafletMod.Rectangle[_] = js.native
  def rectangle(
    latLngBounds: leafletLib.leafletMod.LatLngBoundsExpression,
    options: leafletLib.leafletMod.PolylineOptions
  ): leafletLib.leafletMod.Rectangle[_] = js.native
  def svg(): leafletLib.leafletMod.SVG = js.native
  def svg(options: leafletLib.leafletMod.RendererOptions): leafletLib.leafletMod.SVG = js.native
  def tileLayer(urlTemplate: java.lang.String): leafletLib.leafletMod.TileLayer = js.native
  def tileLayer(urlTemplate: java.lang.String, options: leafletLib.leafletMod.TileLayerOptions): leafletLib.leafletMod.TileLayer = js.native
  def tooltip(): leafletLib.leafletMod.Tooltip = js.native
  def tooltip(options: leafletLib.leafletMod.TooltipOptions): leafletLib.leafletMod.Tooltip = js.native
  def tooltip(options: leafletLib.leafletMod.TooltipOptions, source: leafletLib.leafletMod.Layer): leafletLib.leafletMod.Tooltip = js.native
  def videoOverlay(video: java.lang.String, bounds: leafletLib.leafletMod.LatLngBoundsExpression): leafletLib.leafletMod.VideoOverlay = js.native
  def videoOverlay(
    video: java.lang.String,
    bounds: leafletLib.leafletMod.LatLngBoundsExpression,
    options: leafletLib.leafletMod.VideoOverlayOptions
  ): leafletLib.leafletMod.VideoOverlay = js.native
  def videoOverlay(video: js.Array[java.lang.String], bounds: leafletLib.leafletMod.LatLngBoundsExpression): leafletLib.leafletMod.VideoOverlay = js.native
  def videoOverlay(
    video: js.Array[java.lang.String],
    bounds: leafletLib.leafletMod.LatLngBoundsExpression,
    options: leafletLib.leafletMod.VideoOverlayOptions
  ): leafletLib.leafletMod.VideoOverlay = js.native
  def videoOverlay(video: stdLib.HTMLVideoElement, bounds: leafletLib.leafletMod.LatLngBoundsExpression): leafletLib.leafletMod.VideoOverlay = js.native
  def videoOverlay(
    video: stdLib.HTMLVideoElement,
    bounds: leafletLib.leafletMod.LatLngBoundsExpression,
    options: leafletLib.leafletMod.VideoOverlayOptions
  ): leafletLib.leafletMod.VideoOverlay = js.native
}

