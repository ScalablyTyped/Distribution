package typings.leaflet.global.L

import typings.geojson.mod.GeoJsonObject
import typings.geojson.mod.GeometryObject
import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.leaflet.anon.Alt
import typings.leaflet.anon.X
import typings.leaflet.global.L.^
import typings.leaflet.mod.BoundsLiteral
import typings.leaflet.mod.CircleMarkerOptions
import typings.leaflet.mod.DivIconOptions
import typings.leaflet.mod.GeoJSONOptions
import typings.leaflet.mod.GridLayerOptions
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.ImageOverlayOptions
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.LatLngLiteral
import typings.leaflet.mod.LatLngTuple
import typings.leaflet.mod.LayerOptions
import typings.leaflet.mod.MapOptions
import typings.leaflet.mod.MarkerOptions
import typings.leaflet.mod.MixinType
import typings.leaflet.mod.PointExpression
import typings.leaflet.mod.PointTuple
import typings.leaflet.mod.PolylineOptions
import typings.leaflet.mod.PopupOptions
import typings.leaflet.mod.RendererOptions
import typings.leaflet.mod.TooltipOptions
import typings.leaflet.mod.VideoOverlayOptions
import typings.std.HTMLElement
import typings.std.HTMLVideoElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Mixin: MixinType = ^.asInstanceOf[js.Dynamic].selectDynamic("Mixin").asInstanceOf[MixinType]

inline def bind: js.Function2[
/* fn */ js.Function1[/* repeated */ Any, Unit], 
/* repeated */ Any, 
js.Function0[Unit]] = ^.asInstanceOf[js.Dynamic].selectDynamic("bind").asInstanceOf[js.Function2[
/* fn */ js.Function1[/* repeated */ Any, Unit], 
/* repeated */ Any, 
js.Function0[Unit]]]

inline def bounds(points: js.Array[typings.leaflet.mod.Point_]): typings.leaflet.mod.Bounds_ = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(points.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Bounds_]
inline def bounds(points: BoundsLiteral): typings.leaflet.mod.Bounds_ = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(points.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Bounds_]
inline def bounds(topLeft: PointExpression, bottomRight: PointExpression): typings.leaflet.mod.Bounds_ = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(topLeft.asInstanceOf[js.Any], bottomRight.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Bounds_]

inline def canvas(): typings.leaflet.mod.Canvas_ = ^.asInstanceOf[js.Dynamic].applyDynamic("canvas")().asInstanceOf[typings.leaflet.mod.Canvas_]
inline def canvas(options: RendererOptions): typings.leaflet.mod.Canvas_ = ^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Canvas_]

inline def circle(latlng: LatLngExpression): typings.leaflet.mod.Circle_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Circle_[Any]]
inline def circle(latlng: LatLngExpression, options: CircleMarkerOptions): typings.leaflet.mod.Circle_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Circle_[Any]]
inline def circle(latlng: LatLngExpression, radius: Double): typings.leaflet.mod.Circle_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Circle_[Any]]
inline def circle(latlng: LatLngExpression, radius: Double, options: CircleMarkerOptions): typings.leaflet.mod.Circle_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Circle_[Any]]

inline def circleMarker(latlng: LatLngExpression): typings.leaflet.mod.CircleMarker_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("circleMarker")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.CircleMarker_[Any]]
inline def circleMarker(latlng: LatLngExpression, options: CircleMarkerOptions): typings.leaflet.mod.CircleMarker_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("circleMarker")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.CircleMarker_[Any]]

inline def divIcon(): typings.leaflet.mod.DivIcon_ = ^.asInstanceOf[js.Dynamic].applyDynamic("divIcon")().asInstanceOf[typings.leaflet.mod.DivIcon_]
inline def divIcon(options: DivIconOptions): typings.leaflet.mod.DivIcon_ = ^.asInstanceOf[js.Dynamic].applyDynamic("divIcon")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.DivIcon_]

inline def extend(dest: Any, src: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(scala.List(dest.asInstanceOf[js.Any]).`++`(src.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
inline def extend[D /* <: js.Object */, S1 /* <: js.Object */](dest: D): D & S1 = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any]).asInstanceOf[D & S1]
inline def extend[D /* <: js.Object */, S1 /* <: js.Object */](dest: D, src: S1): D & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[D & S1]
inline def extend[D /* <: js.Object */, S1 /* <: js.Object */, S2 /* <: js.Object */](dest: D, src1: S1, src2: S2): D & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any])).asInstanceOf[D & S1 & S2]
inline def extend[D /* <: js.Object */, S1 /* <: js.Object */, S2 /* <: js.Object */, S3 /* <: js.Object */](dest: D, src1: S1, src2: S2, src3: S3): D & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[D & S1 & S2 & S3]

inline def featureGroup(): typings.leaflet.mod.FeatureGroup_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")().asInstanceOf[typings.leaflet.mod.FeatureGroup_[Any]]
inline def featureGroup(layers: js.Array[typings.leaflet.mod.Layer]): typings.leaflet.mod.FeatureGroup_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")(layers.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.FeatureGroup_[Any]]
inline def featureGroup(layers: js.Array[typings.leaflet.mod.Layer], options: LayerOptions): typings.leaflet.mod.FeatureGroup_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.FeatureGroup_[Any]]
inline def featureGroup(layers: Unit, options: LayerOptions): typings.leaflet.mod.FeatureGroup_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.FeatureGroup_[Any]]

inline def geoJSON_[P, G /* <: GeometryObject */](): typings.leaflet.mod.GeoJSON__[P, G] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")().asInstanceOf[typings.leaflet.mod.GeoJSON__[P, G]]
inline def geoJSON_[P, G /* <: GeometryObject */](geojson: js.Array[GeoJsonObject]): typings.leaflet.mod.GeoJSON__[P, G] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.GeoJSON__[P, G]]
inline def geoJSON_[P, G /* <: GeometryObject */](geojson: js.Array[GeoJsonObject], options: GeoJSONOptions[P, G]): typings.leaflet.mod.GeoJSON__[P, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.GeoJSON__[P, G]]
inline def geoJSON_[P, G /* <: GeometryObject */](geojson: Unit, options: GeoJSONOptions[P, G]): typings.leaflet.mod.GeoJSON__[P, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.GeoJSON__[P, G]]
inline def geoJSON_[P, G /* <: GeometryObject */](geojson: GeoJsonObject): typings.leaflet.mod.GeoJSON__[P, G] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.GeoJSON__[P, G]]
inline def geoJSON_[P, G /* <: GeometryObject */](geojson: GeoJsonObject, options: GeoJSONOptions[P, G]): typings.leaflet.mod.GeoJSON__[P, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.GeoJSON__[P, G]]

inline def geoJson[P, G /* <: GeometryObject */](): typings.leaflet.mod.GeoJSON__[P, G] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")().asInstanceOf[typings.leaflet.mod.GeoJSON__[P, G]]
inline def geoJson[P, G /* <: GeometryObject */](geojson: js.Array[GeoJsonObject]): typings.leaflet.mod.GeoJSON__[P, G] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.GeoJSON__[P, G]]
inline def geoJson[P, G /* <: GeometryObject */](geojson: js.Array[GeoJsonObject], options: GeoJSONOptions[P, G]): typings.leaflet.mod.GeoJSON__[P, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.GeoJSON__[P, G]]
inline def geoJson[P, G /* <: GeometryObject */](geojson: Unit, options: GeoJSONOptions[P, G]): typings.leaflet.mod.GeoJSON__[P, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.GeoJSON__[P, G]]
inline def geoJson[P, G /* <: GeometryObject */](geojson: GeoJsonObject): typings.leaflet.mod.GeoJSON__[P, G] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.GeoJSON__[P, G]]
inline def geoJson[P, G /* <: GeometryObject */](geojson: GeoJsonObject, options: GeoJSONOptions[P, G]): typings.leaflet.mod.GeoJSON__[P, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.GeoJSON__[P, G]]

inline def gridLayer(): typings.leaflet.mod.GridLayer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("gridLayer")().asInstanceOf[typings.leaflet.mod.GridLayer_]
inline def gridLayer(options: GridLayerOptions): typings.leaflet.mod.GridLayer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("gridLayer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.GridLayer_]

inline def icon(options: IconOptions): typings.leaflet.mod.Icon_[IconOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("icon")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Icon_[IconOptions]]

inline def imageOverlay(imageUrl: String, bounds: LatLngBoundsExpression): typings.leaflet.mod.ImageOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("imageOverlay")(imageUrl.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.ImageOverlay_]
inline def imageOverlay(imageUrl: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): typings.leaflet.mod.ImageOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("imageOverlay")(imageUrl.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.ImageOverlay_]

inline def latLng(coords: js.Tuple3[Double, Double, Double]): typings.leaflet.mod.LatLng_ = ^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LatLng_]
inline def latLng(coords: Alt): typings.leaflet.mod.LatLng_ = ^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LatLng_]
inline def latLng(coords: LatLngLiteral): typings.leaflet.mod.LatLng_ = ^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LatLng_]
inline def latLng(coords: LatLngTuple): typings.leaflet.mod.LatLng_ = ^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LatLng_]
inline def latLng(latitude: Double, longitude: Double): typings.leaflet.mod.LatLng_ = (^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.LatLng_]
inline def latLng(latitude: Double, longitude: Double, altitude: Double): typings.leaflet.mod.LatLng_ = (^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], altitude.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.LatLng_]

inline def latLngBounds(latlngs: js.Array[LatLngExpression]): typings.leaflet.mod.LatLngBounds_ = ^.asInstanceOf[js.Dynamic].applyDynamic("latLngBounds")(latlngs.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LatLngBounds_]
inline def latLngBounds(southWest: LatLngExpression, northEast: LatLngExpression): typings.leaflet.mod.LatLngBounds_ = (^.asInstanceOf[js.Dynamic].applyDynamic("latLngBounds")(southWest.asInstanceOf[js.Any], northEast.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.LatLngBounds_]

inline def layerGroup(): typings.leaflet.mod.LayerGroup_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")().asInstanceOf[typings.leaflet.mod.LayerGroup_[Any]]
inline def layerGroup(layers: js.Array[typings.leaflet.mod.Layer]): typings.leaflet.mod.LayerGroup_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LayerGroup_[Any]]
inline def layerGroup(layers: js.Array[typings.leaflet.mod.Layer], options: LayerOptions): typings.leaflet.mod.LayerGroup_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.LayerGroup_[Any]]
inline def layerGroup(layers: Unit, options: LayerOptions): typings.leaflet.mod.LayerGroup_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.LayerGroup_[Any]]

inline def map(element: String): typings.leaflet.mod.Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Map_]
inline def map(element: String, options: MapOptions): typings.leaflet.mod.Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Map_]
inline def map(element: HTMLElement): typings.leaflet.mod.Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Map_]
inline def map(element: HTMLElement, options: MapOptions): typings.leaflet.mod.Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Map_]

inline def marker(latlng: LatLngExpression): typings.leaflet.mod.Marker_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("marker")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Marker_[Any]]
inline def marker(latlng: LatLngExpression, options: MarkerOptions): typings.leaflet.mod.Marker_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("marker")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Marker_[Any]]

inline def noConflict(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Any]

inline def point(coords: X): typings.leaflet.mod.Point_ = ^.asInstanceOf[js.Dynamic].applyDynamic("point")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Point_]
inline def point(coords: PointTuple): typings.leaflet.mod.Point_ = ^.asInstanceOf[js.Dynamic].applyDynamic("point")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Point_]
inline def point(x: Double, y: Double): typings.leaflet.mod.Point_ = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Point_]
inline def point(x: Double, y: Double, round: Boolean): typings.leaflet.mod.Point_ = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Point_]

inline def polygon(latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]): typings.leaflet.mod.Polygon_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(latlngs.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Polygon_[Any]]
inline def polygon(
  latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression],
  options: PolylineOptions
): typings.leaflet.mod.Polygon_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(latlngs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Polygon_[Any]]

inline def polyline(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]): typings.leaflet.mod.Polyline_[LineString | MultiLineString, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("polyline")(latlngs.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Polyline_[LineString | MultiLineString, Any]]
inline def polyline(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions): typings.leaflet.mod.Polyline_[LineString | MultiLineString, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("polyline")(latlngs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Polyline_[LineString | MultiLineString, Any]]

inline def popup(): typings.leaflet.mod.Popup_ = ^.asInstanceOf[js.Dynamic].applyDynamic("popup")().asInstanceOf[typings.leaflet.mod.Popup_]
inline def popup(options: Unit, source: typings.leaflet.mod.Layer): typings.leaflet.mod.Popup_ = (^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Popup_]
inline def popup(options: PopupOptions): typings.leaflet.mod.Popup_ = ^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Popup_]
inline def popup(options: PopupOptions, source: typings.leaflet.mod.Layer): typings.leaflet.mod.Popup_ = (^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Popup_]

inline def rectangle(latLngBounds: LatLngBoundsExpression): typings.leaflet.mod.Rectangle_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(latLngBounds.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Rectangle_[Any]]
inline def rectangle(latLngBounds: LatLngBoundsExpression, options: PolylineOptions): typings.leaflet.mod.Rectangle_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(latLngBounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Rectangle_[Any]]

inline def setOptions: js.Function2[/* obj */ Any, /* options */ Any, Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("setOptions").asInstanceOf[js.Function2[/* obj */ Any, /* options */ Any, Any]]

inline def stamp: js.Function1[/* obj */ Any, Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("stamp").asInstanceOf[js.Function1[/* obj */ Any, Double]]

inline def svg(): typings.leaflet.mod.SVG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("svg")().asInstanceOf[typings.leaflet.mod.SVG_]
inline def svg(options: RendererOptions): typings.leaflet.mod.SVG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("svg")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.SVG_]

inline def svgOverlay(svgImage: String, bounds: LatLngBoundsExpression): typings.leaflet.mod.SVGOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.SVGOverlay_]
inline def svgOverlay(svgImage: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): typings.leaflet.mod.SVGOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.SVGOverlay_]
inline def svgOverlay(svgImage: SVGElement, bounds: LatLngBoundsExpression): typings.leaflet.mod.SVGOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.SVGOverlay_]
inline def svgOverlay(svgImage: SVGElement, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): typings.leaflet.mod.SVGOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.SVGOverlay_]

inline def tooltip(): typings.leaflet.mod.Tooltip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")().asInstanceOf[typings.leaflet.mod.Tooltip_]
inline def tooltip(options: Unit, source: typings.leaflet.mod.Layer): typings.leaflet.mod.Tooltip_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Tooltip_]
inline def tooltip(options: TooltipOptions): typings.leaflet.mod.Tooltip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Tooltip_]
inline def tooltip(options: TooltipOptions, source: typings.leaflet.mod.Layer): typings.leaflet.mod.Tooltip_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Tooltip_]

inline def transformation(a: Double, b: Double, c: Double, d: Double): typings.leaflet.mod.Transformation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("transformation")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Transformation_]
inline def transformation(coefficients: js.Tuple4[Double, Double, Double, Double]): typings.leaflet.mod.Transformation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("transformation")(coefficients.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Transformation_]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

inline def videoOverlay(video: String, bounds: LatLngBoundsExpression): typings.leaflet.mod.VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]
inline def videoOverlay(video: String, bounds: LatLngBoundsExpression, options: VideoOverlayOptions): typings.leaflet.mod.VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]
inline def videoOverlay(video: js.Array[String], bounds: LatLngBoundsExpression): typings.leaflet.mod.VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]
inline def videoOverlay(video: js.Array[String], bounds: LatLngBoundsExpression, options: VideoOverlayOptions): typings.leaflet.mod.VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]
inline def videoOverlay(video: HTMLVideoElement, bounds: LatLngBoundsExpression): typings.leaflet.mod.VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]
inline def videoOverlay(video: HTMLVideoElement, bounds: LatLngBoundsExpression, options: VideoOverlayOptions): typings.leaflet.mod.VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]
