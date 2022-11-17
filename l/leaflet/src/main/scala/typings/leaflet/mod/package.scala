package typings.leaflet.mod

import org.scalablytyped.runtime.StringDictionary
import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonObject
import typings.geojson.mod.GeometryObject
import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.leaflet.anon.Active
import typings.leaflet.anon.Alt
import typings.leaflet.anon.X
import typings.leaflet.mod.^
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

inline def bounds(points: js.Array[Point_]): Bounds_ = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(points.asInstanceOf[js.Any]).asInstanceOf[Bounds_]
inline def bounds(points: BoundsLiteral): Bounds_ = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(points.asInstanceOf[js.Any]).asInstanceOf[Bounds_]
inline def bounds(topLeft: PointExpression, bottomRight: PointExpression): Bounds_ = (^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(topLeft.asInstanceOf[js.Any], bottomRight.asInstanceOf[js.Any])).asInstanceOf[Bounds_]

inline def canvas(): Canvas_ = ^.asInstanceOf[js.Dynamic].applyDynamic("canvas")().asInstanceOf[Canvas_]
inline def canvas(options: RendererOptions): Canvas_ = ^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(options.asInstanceOf[js.Any]).asInstanceOf[Canvas_]

inline def circle(latlng: LatLngExpression): Circle_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any]).asInstanceOf[Circle_[Any]]
inline def circle(latlng: LatLngExpression, options: CircleMarkerOptions): Circle_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Circle_[Any]]
inline def circle(latlng: LatLngExpression, radius: Double): Circle_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Circle_[Any]]
inline def circle(latlng: LatLngExpression, radius: Double, options: CircleMarkerOptions): Circle_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Circle_[Any]]

inline def circleMarker(latlng: LatLngExpression): CircleMarker_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("circleMarker")(latlng.asInstanceOf[js.Any]).asInstanceOf[CircleMarker_[Any]]
inline def circleMarker(latlng: LatLngExpression, options: CircleMarkerOptions): CircleMarker_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("circleMarker")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CircleMarker_[Any]]

inline def divIcon(): DivIcon_ = ^.asInstanceOf[js.Dynamic].applyDynamic("divIcon")().asInstanceOf[DivIcon_]
inline def divIcon(options: DivIconOptions): DivIcon_ = ^.asInstanceOf[js.Dynamic].applyDynamic("divIcon")(options.asInstanceOf[js.Any]).asInstanceOf[DivIcon_]

inline def extend(dest: Any, src: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(scala.List(dest.asInstanceOf[js.Any]).`++`(src.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
inline def extend[D /* <: js.Object */, S1 /* <: js.Object */](dest: D): D & S1 = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any]).asInstanceOf[D & S1]
inline def extend[D /* <: js.Object */, S1 /* <: js.Object */](dest: D, src: S1): D & S1 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[D & S1]
inline def extend[D /* <: js.Object */, S1 /* <: js.Object */, S2 /* <: js.Object */](dest: D, src1: S1, src2: S2): D & S1 & S2 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any])).asInstanceOf[D & S1 & S2]
inline def extend[D /* <: js.Object */, S1 /* <: js.Object */, S2 /* <: js.Object */, S3 /* <: js.Object */](dest: D, src1: S1, src2: S2, src3: S3): D & S1 & S2 & S3 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(dest.asInstanceOf[js.Any], src1.asInstanceOf[js.Any], src2.asInstanceOf[js.Any], src3.asInstanceOf[js.Any])).asInstanceOf[D & S1 & S2 & S3]

inline def featureGroup(): FeatureGroup_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")().asInstanceOf[FeatureGroup_[Any]]
inline def featureGroup(layers: js.Array[Layer]): FeatureGroup_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")(layers.asInstanceOf[js.Any]).asInstanceOf[FeatureGroup_[Any]]
inline def featureGroup(layers: js.Array[Layer], options: LayerOptions): FeatureGroup_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FeatureGroup_[Any]]
inline def featureGroup(layers: Unit, options: LayerOptions): FeatureGroup_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FeatureGroup_[Any]]

inline def geoJSON_[P](): GeoJSON__[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")().asInstanceOf[GeoJSON__[P]]
inline def geoJSON_[P](geojson: js.Array[GeoJsonObject]): GeoJSON__[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any]).asInstanceOf[GeoJSON__[P]]
inline def geoJSON_[P](geojson: js.Array[GeoJsonObject], options: GeoJSONOptions[P]): GeoJSON__[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GeoJSON__[P]]
inline def geoJSON_[P](geojson: Unit, options: GeoJSONOptions[P]): GeoJSON__[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GeoJSON__[P]]
inline def geoJSON_[P](geojson: GeoJsonObject): GeoJSON__[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any]).asInstanceOf[GeoJSON__[P]]
inline def geoJSON_[P](geojson: GeoJsonObject, options: GeoJSONOptions[P]): GeoJSON__[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GeoJSON__[P]]

inline def geoJson[P](): GeoJSON__[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")().asInstanceOf[GeoJSON__[P]]
inline def geoJson[P](geojson: js.Array[GeoJsonObject]): GeoJSON__[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any]).asInstanceOf[GeoJSON__[P]]
inline def geoJson[P](geojson: js.Array[GeoJsonObject], options: GeoJSONOptions[P]): GeoJSON__[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GeoJSON__[P]]
inline def geoJson[P](geojson: Unit, options: GeoJSONOptions[P]): GeoJSON__[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GeoJSON__[P]]
inline def geoJson[P](geojson: GeoJsonObject): GeoJSON__[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any]).asInstanceOf[GeoJSON__[P]]
inline def geoJson[P](geojson: GeoJsonObject, options: GeoJSONOptions[P]): GeoJSON__[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GeoJSON__[P]]

inline def gridLayer(): GridLayer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("gridLayer")().asInstanceOf[GridLayer_]
inline def gridLayer(options: GridLayerOptions): GridLayer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("gridLayer")(options.asInstanceOf[js.Any]).asInstanceOf[GridLayer_]

inline def icon(options: IconOptions): Icon_[IconOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("icon")(options.asInstanceOf[js.Any]).asInstanceOf[Icon_[IconOptions]]

inline def imageOverlay(imageUrl: String, bounds: LatLngBoundsExpression): ImageOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("imageOverlay")(imageUrl.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[ImageOverlay_]
inline def imageOverlay(imageUrl: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): ImageOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("imageOverlay")(imageUrl.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ImageOverlay_]

inline def latLng(coords: js.Tuple3[Double, Double, Double]): LatLng_ = ^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[LatLng_]
inline def latLng(coords: Alt): LatLng_ = ^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[LatLng_]
inline def latLng(coords: LatLngLiteral): LatLng_ = ^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[LatLng_]
inline def latLng(coords: LatLngTuple): LatLng_ = ^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[LatLng_]
inline def latLng(latitude: Double, longitude: Double): LatLng_ = (^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[LatLng_]
inline def latLng(latitude: Double, longitude: Double, altitude: Double): LatLng_ = (^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], altitude.asInstanceOf[js.Any])).asInstanceOf[LatLng_]

inline def latLngBounds(latlngs: js.Array[LatLngExpression]): LatLngBounds_ = ^.asInstanceOf[js.Dynamic].applyDynamic("latLngBounds")(latlngs.asInstanceOf[js.Any]).asInstanceOf[LatLngBounds_]
inline def latLngBounds(southWest: LatLngExpression, northEast: LatLngExpression): LatLngBounds_ = (^.asInstanceOf[js.Dynamic].applyDynamic("latLngBounds")(southWest.asInstanceOf[js.Any], northEast.asInstanceOf[js.Any])).asInstanceOf[LatLngBounds_]

inline def layerGroup(): LayerGroup_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")().asInstanceOf[LayerGroup_[Any]]
inline def layerGroup(layers: js.Array[Layer]): LayerGroup_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any]).asInstanceOf[LayerGroup_[Any]]
inline def layerGroup(layers: js.Array[Layer], options: LayerOptions): LayerGroup_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LayerGroup_[Any]]
inline def layerGroup(layers: Unit, options: LayerOptions): LayerGroup_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LayerGroup_[Any]]

inline def map(element: String): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any]).asInstanceOf[Map_]
inline def map(element: String, options: MapOptions): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Map_]
inline def map(element: HTMLElement): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any]).asInstanceOf[Map_]
inline def map(element: HTMLElement, options: MapOptions): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Map_]

inline def marker(latlng: LatLngExpression): Marker_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("marker")(latlng.asInstanceOf[js.Any]).asInstanceOf[Marker_[Any]]
inline def marker(latlng: LatLngExpression, options: MarkerOptions): Marker_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("marker")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Marker_[Any]]

inline def noConflict(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Any]

inline def point(coords: X): Point_ = ^.asInstanceOf[js.Dynamic].applyDynamic("point")(coords.asInstanceOf[js.Any]).asInstanceOf[Point_]
inline def point(coords: PointTuple): Point_ = ^.asInstanceOf[js.Dynamic].applyDynamic("point")(coords.asInstanceOf[js.Any]).asInstanceOf[Point_]
inline def point(x: Double, y: Double): Point_ = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Point_]
inline def point(x: Double, y: Double, round: Boolean): Point_ = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[Point_]

inline def polygon(latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]): Polygon_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(latlngs.asInstanceOf[js.Any]).asInstanceOf[Polygon_[Any]]
inline def polygon(
  latlngs: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression],
  options: PolylineOptions
): Polygon_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(latlngs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Polygon_[Any]]

inline def polyline(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]): Polyline_[LineString | MultiLineString, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("polyline")(latlngs.asInstanceOf[js.Any]).asInstanceOf[Polyline_[LineString | MultiLineString, Any]]
inline def polyline(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions): Polyline_[LineString | MultiLineString, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("polyline")(latlngs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Polyline_[LineString | MultiLineString, Any]]

inline def popup(): Popup_ = ^.asInstanceOf[js.Dynamic].applyDynamic("popup")().asInstanceOf[Popup_]
inline def popup(options: Unit, source: Layer): Popup_ = (^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Popup_]
inline def popup(options: PopupOptions): Popup_ = ^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any]).asInstanceOf[Popup_]
inline def popup(options: PopupOptions, source: Layer): Popup_ = (^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Popup_]

inline def rectangle(latLngBounds: LatLngBoundsExpression): Rectangle_[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(latLngBounds.asInstanceOf[js.Any]).asInstanceOf[Rectangle_[Any]]
inline def rectangle(latLngBounds: LatLngBoundsExpression, options: PolylineOptions): Rectangle_[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(latLngBounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Rectangle_[Any]]

inline def setOptions: js.Function2[/* obj */ Any, /* options */ Any, Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("setOptions").asInstanceOf[js.Function2[/* obj */ Any, /* options */ Any, Any]]

inline def stamp: js.Function1[/* obj */ Any, Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("stamp").asInstanceOf[js.Function1[/* obj */ Any, Double]]

inline def svg(): SVG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("svg")().asInstanceOf[SVG_]
inline def svg(options: RendererOptions): SVG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("svg")(options.asInstanceOf[js.Any]).asInstanceOf[SVG_]

inline def svgOverlay(svgImage: String, bounds: LatLngBoundsExpression): SVGOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[SVGOverlay_]
inline def svgOverlay(svgImage: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): SVGOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SVGOverlay_]
inline def svgOverlay(svgImage: SVGElement, bounds: LatLngBoundsExpression): SVGOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[SVGOverlay_]
inline def svgOverlay(svgImage: SVGElement, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): SVGOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SVGOverlay_]

inline def tooltip(): Tooltip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")().asInstanceOf[Tooltip_]
inline def tooltip(options: Unit, source: Layer): Tooltip_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Tooltip_]
inline def tooltip(options: TooltipOptions): Tooltip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any]).asInstanceOf[Tooltip_]
inline def tooltip(options: TooltipOptions, source: Layer): Tooltip_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Tooltip_]

inline def transformation(a: Double, b: Double, c: Double, d: Double): Transformation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("transformation")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Transformation_]
inline def transformation(coefficients: js.Tuple4[Double, Double, Double, Double]): Transformation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("transformation")(coefficients.asInstanceOf[js.Any]).asInstanceOf[Transformation_]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

inline def videoOverlay(video: String, bounds: LatLngBoundsExpression): VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[VideoOverlay_]
inline def videoOverlay(video: String, bounds: LatLngBoundsExpression, options: VideoOverlayOptions): VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VideoOverlay_]
inline def videoOverlay(video: js.Array[String], bounds: LatLngBoundsExpression): VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[VideoOverlay_]
inline def videoOverlay(video: js.Array[String], bounds: LatLngBoundsExpression, options: VideoOverlayOptions): VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VideoOverlay_]
inline def videoOverlay(video: HTMLVideoElement, bounds: LatLngBoundsExpression): VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[VideoOverlay_]
inline def videoOverlay(video: HTMLVideoElement, bounds: LatLngBoundsExpression, options: VideoOverlayOptions): VideoOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VideoOverlay_]

type BoundsExpression = Bounds_ | BoundsLiteral

type BoundsLiteral = js.Tuple2[PointTuple, PointTuple]

type Content = String | HTMLElement

type ControlPosition = "topleft" | "topright" | "bottomleft" | "bottomright"

type CrossOrigin = "anonymous" | "use-credentials" | ""

type Direction = "right" | "left" | "top" | "bottom" | "center" | "auto"

type DoneCallback = js.Function2[/* error */ js.UndefOr[js.Error], /* tile */ js.UndefOr[HTMLElement], Unit]

type DragEndEventHandlerFn = js.Function1[/* event */ DragEndEvent, Unit]

type ErrorEventHandlerFn = js.Function1[/* event */ ErrorEvent, Unit]

type FillRule = "nonzero" | "evenodd" | "inherit"

type InternalTiles = StringDictionary[Active]

type LatLngBoundsExpression = LatLngBounds_ | LatLngBoundsLiteral

type LatLngBoundsLiteral = js.Array[LatLngTuple]

type LatLngExpression = LatLng_ | LatLngLiteral | LatLngTuple

type LatLngTuple = js.Tuple2[Double, Double]

type LayerEventHandlerFn = js.Function1[/* event */ LayerEvent, Unit]

type LayersControlEventHandlerFn = js.Function1[/* event */ LayersControlEvent, Unit]

type LeafletEventHandlerFn = js.Function1[/* event */ LeafletEvent, Unit]

type LeafletKeyboardEventHandlerFn = js.Function1[/* event */ LeafletKeyboardEvent, Unit]

type LeafletMouseEventHandlerFn = js.Function1[/* event */ LeafletMouseEvent, Unit]

type LineCapShape = "butt" | "round" | "square" | "inherit"

type LineJoinShape = "miter" | "round" | "bevel" | "inherit"

type LocationEventHandlerFn = js.Function1[/* event */ LocationEvent, Unit]

type PointExpression = Point_ | PointTuple

type PointTuple = js.Tuple2[Double, Double]

type PopupEventHandlerFn = js.Function1[/* event */ PopupEvent, Unit]

type ReferrerPolicy = "no-referrer" | "no-referrer-when-downgrade" | "origin" | "origin-when-cross-origin" | "same-origin" | "strict-origin" | "strict-origin-when-cross-origin" | "unsafe-url"

type ResizeEventHandlerFn = js.Function1[/* event */ ResizeEvent, Unit]

type SVGOverlayStyleOptions = ImageOverlayStyleOptions

type StyleFunction[P] = js.Function1[/* feature */ js.UndefOr[Feature[GeometryObject, P]], PathOptions]

type TileErrorEventHandlerFn = js.Function1[/* event */ TileErrorEvent, Unit]

type TileEventHandlerFn = js.Function1[/* event */ TileEvent, Unit]

type TooltipEventHandlerFn = js.Function1[/* event */ TooltipEvent, Unit]

type Zoom = Boolean | "center"

type ZoomAnimEventHandlerFn = js.Function1[/* event */ ZoomAnimEvent, Unit]
