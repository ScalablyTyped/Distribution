package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def bounds(points: js.Array[typings.leaflet.mod.Point_]): typings.leaflet.mod.Bounds_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(points.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Bounds_]
inline def bounds(points: typings.leaflet.mod.BoundsLiteral): typings.leaflet.mod.Bounds_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(points.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Bounds_]
inline def bounds(topLeft: typings.leaflet.mod.PointExpression, bottomRight: typings.leaflet.mod.PointExpression): typings.leaflet.mod.Bounds_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(topLeft.asInstanceOf[js.Any], bottomRight.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Bounds_]

inline def canvas(): typings.leaflet.mod.Canvas_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("canvas")().asInstanceOf[typings.leaflet.mod.Canvas_]
inline def canvas(options: typings.leaflet.mod.RendererOptions): typings.leaflet.mod.Canvas_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Canvas_]

inline def circle(latlng: typings.leaflet.mod.LatLngExpression): typings.leaflet.mod.Circle_[js.Any] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Circle_[js.Any]]
inline def circle(latlng: typings.leaflet.mod.LatLngExpression, options: typings.leaflet.mod.CircleMarkerOptions): typings.leaflet.mod.Circle_[js.Any] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Circle_[js.Any]]
inline def circle(latlng: typings.leaflet.mod.LatLngExpression, radius: scala.Double): typings.leaflet.mod.Circle_[js.Any] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Circle_[js.Any]]
inline def circle(
  latlng: typings.leaflet.mod.LatLngExpression,
  radius: scala.Double,
  options: typings.leaflet.mod.CircleMarkerOptions
): typings.leaflet.mod.Circle_[js.Any] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Circle_[js.Any]]

inline def circleMarker(latlng: typings.leaflet.mod.LatLngExpression): typings.leaflet.mod.CircleMarker_[js.Any] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circleMarker")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.CircleMarker_[js.Any]]
inline def circleMarker(latlng: typings.leaflet.mod.LatLngExpression, options: typings.leaflet.mod.CircleMarkerOptions): typings.leaflet.mod.CircleMarker_[js.Any] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circleMarker")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.CircleMarker_[js.Any]]

inline def divIcon(): typings.leaflet.mod.DivIcon_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("divIcon")().asInstanceOf[typings.leaflet.mod.DivIcon_]
inline def divIcon(options: typings.leaflet.mod.DivIconOptions): typings.leaflet.mod.DivIcon_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("divIcon")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.DivIcon_]

inline def featureGroup(): typings.leaflet.mod.FeatureGroup_[js.Any] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")().asInstanceOf[typings.leaflet.mod.FeatureGroup_[js.Any]]
inline def featureGroup(layers: js.Array[typings.leaflet.mod.Layer]): typings.leaflet.mod.FeatureGroup_[js.Any] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")(layers.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.FeatureGroup_[js.Any]]

inline def geoJSON[P](): typings.leaflet.mod.GeoJSON_[P] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")().asInstanceOf[typings.leaflet.mod.GeoJSON_[P]]
inline def geoJSON[P](geojson: scala.Unit, options: typings.leaflet.mod.GeoJSONOptions[P]): typings.leaflet.mod.GeoJSON_[P] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.GeoJSON_[P]]
inline def geoJSON[P](geojson: typings.geojson.mod.GeoJsonObject): typings.leaflet.mod.GeoJSON_[P] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.GeoJSON_[P]]
inline def geoJSON[P](geojson: typings.geojson.mod.GeoJsonObject, options: typings.leaflet.mod.GeoJSONOptions[P]): typings.leaflet.mod.GeoJSON_[P] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.GeoJSON_[P]]

inline def gridLayer(): typings.leaflet.mod.GridLayer_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gridLayer")().asInstanceOf[typings.leaflet.mod.GridLayer_]
inline def gridLayer(options: typings.leaflet.mod.GridLayerOptions): typings.leaflet.mod.GridLayer_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gridLayer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.GridLayer_]

inline def icon(options: typings.leaflet.mod.IconOptions): typings.leaflet.mod.Icon_[typings.leaflet.mod.IconOptions] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("icon")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Icon_[typings.leaflet.mod.IconOptions]]

inline def imageOverlay(imageUrl: java.lang.String, bounds: typings.leaflet.mod.LatLngBoundsExpression): typings.leaflet.mod.ImageOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("imageOverlay")(imageUrl.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.ImageOverlay_]
inline def imageOverlay(
  imageUrl: java.lang.String,
  bounds: typings.leaflet.mod.LatLngBoundsExpression,
  options: typings.leaflet.mod.ImageOverlayOptions
): typings.leaflet.mod.ImageOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("imageOverlay")(imageUrl.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.ImageOverlay_]

inline def latLng(coords: js.Tuple3[scala.Double, scala.Double, scala.Double]): typings.leaflet.mod.LatLng_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LatLng_]
inline def latLng(coords: typings.leaflet.anon.Alt): typings.leaflet.mod.LatLng_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LatLng_]
inline def latLng(coords: typings.leaflet.mod.LatLngLiteral): typings.leaflet.mod.LatLng_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LatLng_]
inline def latLng(coords: typings.leaflet.mod.LatLngTuple): typings.leaflet.mod.LatLng_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LatLng_]
inline def latLng(latitude: scala.Double, longitude: scala.Double): typings.leaflet.mod.LatLng_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.LatLng_]
inline def latLng(latitude: scala.Double, longitude: scala.Double, altitude: scala.Double): typings.leaflet.mod.LatLng_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], altitude.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.LatLng_]

inline def latLngBounds(latlngs: js.Array[typings.leaflet.mod.LatLngExpression]): typings.leaflet.mod.LatLngBounds_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLngBounds")(latlngs.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LatLngBounds_]
inline def latLngBounds(southWest: typings.leaflet.mod.LatLngExpression, northEast: typings.leaflet.mod.LatLngExpression): typings.leaflet.mod.LatLngBounds_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLngBounds")(southWest.asInstanceOf[js.Any], northEast.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.LatLngBounds_]

inline def layerGroup(): typings.leaflet.mod.LayerGroup_[js.Any] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")().asInstanceOf[typings.leaflet.mod.LayerGroup_[js.Any]]
inline def layerGroup(layers: js.Array[typings.leaflet.mod.Layer]): typings.leaflet.mod.LayerGroup_[js.Any] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LayerGroup_[js.Any]]
inline def layerGroup(layers: js.Array[typings.leaflet.mod.Layer], options: typings.leaflet.mod.LayerOptions): typings.leaflet.mod.LayerGroup_[js.Any] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.LayerGroup_[js.Any]]
inline def layerGroup(layers: scala.Unit, options: typings.leaflet.mod.LayerOptions): typings.leaflet.mod.LayerGroup_[js.Any] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.LayerGroup_[js.Any]]

inline def map(element: java.lang.String): typings.leaflet.mod.Map_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Map_]
inline def map(element: java.lang.String, options: typings.leaflet.mod.MapOptions): typings.leaflet.mod.Map_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Map_]
inline def map(element: typings.std.HTMLElement): typings.leaflet.mod.Map_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Map_]
inline def map(element: typings.std.HTMLElement, options: typings.leaflet.mod.MapOptions): typings.leaflet.mod.Map_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Map_]

inline def marker(latlng: typings.leaflet.mod.LatLngExpression): typings.leaflet.mod.Marker_[js.Any] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("marker")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Marker_[js.Any]]
inline def marker(latlng: typings.leaflet.mod.LatLngExpression, options: typings.leaflet.mod.MarkerOptions): typings.leaflet.mod.Marker_[js.Any] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("marker")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Marker_[js.Any]]

inline def point(coords: typings.leaflet.anon.X): typings.leaflet.mod.Point_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("point")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Point_]
inline def point(coords: typings.leaflet.mod.PointTuple): typings.leaflet.mod.Point_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("point")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Point_]
inline def point(x: scala.Double, y: scala.Double): typings.leaflet.mod.Point_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Point_]
inline def point(x: scala.Double, y: scala.Double, round: scala.Boolean): typings.leaflet.mod.Point_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Point_]

inline def polygon(
  latlngs: js.Array[
  (js.Array[
    js.Array[typings.leaflet.mod.LatLngExpression] | typings.leaflet.mod.LatLngExpression
  ]) | typings.leaflet.mod.LatLngExpression
]
): typings.leaflet.mod.Polygon_[js.Any] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(latlngs.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Polygon_[js.Any]]
inline def polygon(
  latlngs: js.Array[
  (js.Array[
    js.Array[typings.leaflet.mod.LatLngExpression] | typings.leaflet.mod.LatLngExpression
  ]) | typings.leaflet.mod.LatLngExpression
],
  options: typings.leaflet.mod.PolylineOptions
): typings.leaflet.mod.Polygon_[js.Any] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(latlngs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Polygon_[js.Any]]

inline def polyline(
  latlngs: js.Array[
  js.Array[typings.leaflet.mod.LatLngExpression] | typings.leaflet.mod.LatLngExpression
]
): typings.leaflet.mod.Polyline_[typings.geojson.mod.LineString | typings.geojson.mod.MultiLineString, js.Any] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("polyline")(latlngs.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Polyline_[typings.geojson.mod.LineString | typings.geojson.mod.MultiLineString, js.Any]]
inline def polyline(
  latlngs: js.Array[
  js.Array[typings.leaflet.mod.LatLngExpression] | typings.leaflet.mod.LatLngExpression
],
  options: typings.leaflet.mod.PolylineOptions
): typings.leaflet.mod.Polyline_[typings.geojson.mod.LineString | typings.geojson.mod.MultiLineString, js.Any] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("polyline")(latlngs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Polyline_[typings.geojson.mod.LineString | typings.geojson.mod.MultiLineString, js.Any]]

inline def popup(): typings.leaflet.mod.Popup_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("popup")().asInstanceOf[typings.leaflet.mod.Popup_]
inline def popup(options: scala.Unit, source: typings.leaflet.mod.Layer): typings.leaflet.mod.Popup_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Popup_]
inline def popup(options: typings.leaflet.mod.PopupOptions): typings.leaflet.mod.Popup_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Popup_]
inline def popup(options: typings.leaflet.mod.PopupOptions, source: typings.leaflet.mod.Layer): typings.leaflet.mod.Popup_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Popup_]

inline def rectangle(latLngBounds: typings.leaflet.mod.LatLngBoundsExpression): typings.leaflet.mod.Rectangle_[js.Any] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(latLngBounds.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Rectangle_[js.Any]]
inline def rectangle(
  latLngBounds: typings.leaflet.mod.LatLngBoundsExpression,
  options: typings.leaflet.mod.PolylineOptions
): typings.leaflet.mod.Rectangle_[js.Any] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(latLngBounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Rectangle_[js.Any]]

inline def svg(): typings.leaflet.mod.SVG_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svg")().asInstanceOf[typings.leaflet.mod.SVG_]
inline def svg(options: typings.leaflet.mod.RendererOptions): typings.leaflet.mod.SVG_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svg")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.SVG_]

inline def svgOverlay(svgImage: java.lang.String, bounds: typings.leaflet.mod.LatLngBoundsExpression): typings.leaflet.mod.SVGOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.SVGOverlay_]
inline def svgOverlay(
  svgImage: java.lang.String,
  bounds: typings.leaflet.mod.LatLngBoundsExpression,
  options: typings.leaflet.mod.ImageOverlayOptions
): typings.leaflet.mod.SVGOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.SVGOverlay_]
inline def svgOverlay(svgImage: typings.std.SVGElement, bounds: typings.leaflet.mod.LatLngBoundsExpression): typings.leaflet.mod.SVGOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.SVGOverlay_]
inline def svgOverlay(
  svgImage: typings.std.SVGElement,
  bounds: typings.leaflet.mod.LatLngBoundsExpression,
  options: typings.leaflet.mod.ImageOverlayOptions
): typings.leaflet.mod.SVGOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.SVGOverlay_]

inline def tooltip(): typings.leaflet.mod.Tooltip_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")().asInstanceOf[typings.leaflet.mod.Tooltip_]
inline def tooltip(options: scala.Unit, source: typings.leaflet.mod.Layer): typings.leaflet.mod.Tooltip_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Tooltip_]
inline def tooltip(options: typings.leaflet.mod.TooltipOptions): typings.leaflet.mod.Tooltip_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Tooltip_]
inline def tooltip(options: typings.leaflet.mod.TooltipOptions, source: typings.leaflet.mod.Layer): typings.leaflet.mod.Tooltip_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Tooltip_]

inline def videoOverlay(video: java.lang.String, bounds: typings.leaflet.mod.LatLngBoundsExpression): typings.leaflet.mod.VideoOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]
inline def videoOverlay(
  video: java.lang.String,
  bounds: typings.leaflet.mod.LatLngBoundsExpression,
  options: typings.leaflet.mod.VideoOverlayOptions
): typings.leaflet.mod.VideoOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]
inline def videoOverlay(video: js.Array[java.lang.String], bounds: typings.leaflet.mod.LatLngBoundsExpression): typings.leaflet.mod.VideoOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]
inline def videoOverlay(
  video: js.Array[java.lang.String],
  bounds: typings.leaflet.mod.LatLngBoundsExpression,
  options: typings.leaflet.mod.VideoOverlayOptions
): typings.leaflet.mod.VideoOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]
inline def videoOverlay(video: typings.std.HTMLVideoElement, bounds: typings.leaflet.mod.LatLngBoundsExpression): typings.leaflet.mod.VideoOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]
inline def videoOverlay(
  video: typings.std.HTMLVideoElement,
  bounds: typings.leaflet.mod.LatLngBoundsExpression,
  options: typings.leaflet.mod.VideoOverlayOptions
): typings.leaflet.mod.VideoOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]

type BoundsExpression = typings.leaflet.mod.Bounds_ | typings.leaflet.mod.BoundsLiteral

type BoundsLiteral = js.Tuple2[typings.leaflet.mod.PointTuple, typings.leaflet.mod.PointTuple]

type Content = java.lang.String | typings.std.HTMLElement

type CrossOrigin = scala.Boolean | java.lang.String

type DoneCallback = js.Function2[
/* error */ js.UndefOr[typings.std.Error], 
/* tile */ js.UndefOr[typings.std.HTMLElement], 
scala.Unit]

type DragEndEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.DragEndEvent, scala.Unit]

type ErrorEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.ErrorEvent, scala.Unit]

type InternalTiles = org.scalablytyped.runtime.StringDictionary[typings.leaflet.anon.Active]

type LatLngBoundsExpression = typings.leaflet.mod.LatLngBounds_ | typings.leaflet.mod.LatLngBoundsLiteral

type LatLngBoundsLiteral = js.Array[typings.leaflet.mod.LatLngTuple]

/* Rewritten from type alias, can be one of: 
  - typings.leaflet.mod.LatLng_
  - typings.leaflet.mod.LatLngLiteral
  - typings.leaflet.mod.LatLngTuple
*/
type LatLngExpression = typings.leaflet.mod._LatLngExpression | typings.leaflet.mod.LatLngTuple

type LatLngTuple = js.Tuple2[scala.Double, scala.Double]

type LayerEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.LayerEvent, scala.Unit]

type LayersControlEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.LayersControlEvent, scala.Unit]

type LeafletEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.LeafletEvent, scala.Unit]

type LeafletKeyboardEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.LeafletKeyboardEvent, scala.Unit]

type LeafletMouseEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.LeafletMouseEvent, scala.Unit]

type LocationEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.LocationEvent, scala.Unit]

type PointExpression = typings.leaflet.mod.Point_ | typings.leaflet.mod.PointTuple

type PointTuple = js.Tuple2[scala.Double, scala.Double]

type PopupEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.PopupEvent, scala.Unit]

type ResizeEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.ResizeEvent, scala.Unit]

type StyleFunction[P] = js.Function1[
/* feature */ js.UndefOr[typings.geojson.mod.Feature[typings.geojson.mod.GeometryObject, P]], 
typings.leaflet.mod.PathOptions]

type TileErrorEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.TileErrorEvent, scala.Unit]

type TileEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.TileEvent, scala.Unit]

type TooltipEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.TooltipEvent, scala.Unit]

type Zoom = scala.Boolean | typings.leaflet.leafletStrings.center

type ZoomAnimEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.ZoomAnimEvent, scala.Unit]
