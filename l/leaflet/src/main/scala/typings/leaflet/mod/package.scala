package typings.leaflet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BoundsExpression = typings.leaflet.mod.Bounds_ | typings.leaflet.mod.BoundsLiteral
  
  type BoundsLiteral = js.Tuple2[typings.leaflet.mod.PointTuple, typings.leaflet.mod.PointTuple]
  
  type Content = java.lang.String | typings.std.HTMLElement
  
  type CrossOrigin = scala.Boolean | java.lang.String
  
  type DoneCallback = js.Function2[
    /* error */ js.UndefOr[typings.std.Error], 
    /* tile */ js.UndefOr[typings.std.HTMLElement], 
    scala.Unit
  ]
  
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
    typings.leaflet.mod.PathOptions
  ]
  
  type TileErrorEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.TileErrorEvent, scala.Unit]
  
  type TileEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.TileEvent, scala.Unit]
  
  type TooltipEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.TooltipEvent, scala.Unit]
  
  type Zoom = scala.Boolean | typings.leaflet.leafletStrings.center
  
  type ZoomAnimEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.ZoomAnimEvent, scala.Unit]
  
  @scala.inline
  def bounds(points: js.Array[typings.leaflet.mod.Point_]): typings.leaflet.mod.Bounds_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(points.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Bounds_]
  @scala.inline
  def bounds(points: typings.leaflet.mod.BoundsLiteral): typings.leaflet.mod.Bounds_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(points.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Bounds_]
  @scala.inline
  def bounds(topLeft: typings.leaflet.mod.PointExpression, bottomRight: typings.leaflet.mod.PointExpression): typings.leaflet.mod.Bounds_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(topLeft.asInstanceOf[js.Any], bottomRight.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Bounds_]
  
  @scala.inline
  def canvas(): typings.leaflet.mod.Canvas_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("canvas")().asInstanceOf[typings.leaflet.mod.Canvas_]
  @scala.inline
  def canvas(options: typings.leaflet.mod.RendererOptions): typings.leaflet.mod.Canvas_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("canvas")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Canvas_]
  
  @scala.inline
  def circle(latlng: typings.leaflet.mod.LatLngExpression): typings.leaflet.mod.Circle_[_] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Circle_[_]]
  @scala.inline
  def circle(latlng: typings.leaflet.mod.LatLngExpression, options: typings.leaflet.mod.CircleMarkerOptions): typings.leaflet.mod.Circle_[_] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Circle_[_]]
  @scala.inline
  def circle(latlng: typings.leaflet.mod.LatLngExpression, radius: scala.Double): typings.leaflet.mod.Circle_[_] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Circle_[_]]
  @scala.inline
  def circle(
    latlng: typings.leaflet.mod.LatLngExpression,
    radius: scala.Double,
    options: typings.leaflet.mod.CircleMarkerOptions
  ): typings.leaflet.mod.Circle_[_] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circle")(latlng.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Circle_[_]]
  
  @scala.inline
  def circleMarker(latlng: typings.leaflet.mod.LatLngExpression): typings.leaflet.mod.CircleMarker_[_] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circleMarker")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.CircleMarker_[_]]
  @scala.inline
  def circleMarker(latlng: typings.leaflet.mod.LatLngExpression, options: typings.leaflet.mod.CircleMarkerOptions): typings.leaflet.mod.CircleMarker_[_] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circleMarker")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.CircleMarker_[_]]
  
  @scala.inline
  def divIcon(): typings.leaflet.mod.DivIcon_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("divIcon")().asInstanceOf[typings.leaflet.mod.DivIcon_]
  @scala.inline
  def divIcon(options: typings.leaflet.mod.DivIconOptions): typings.leaflet.mod.DivIcon_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("divIcon")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.DivIcon_]
  
  @scala.inline
  def featureGroup(): typings.leaflet.mod.FeatureGroup_[_] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")().asInstanceOf[typings.leaflet.mod.FeatureGroup_[_]]
  @scala.inline
  def featureGroup(layers: js.Array[typings.leaflet.mod.Layer]): typings.leaflet.mod.FeatureGroup_[_] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("featureGroup")(layers.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.FeatureGroup_[_]]
  
  @scala.inline
  def geoJSON[P](): typings.leaflet.mod.GeoJSON_[P] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")().asInstanceOf[typings.leaflet.mod.GeoJSON_[P]]
  @scala.inline
  def geoJSON[P](geojson: js.UndefOr[scala.Nothing], options: typings.leaflet.mod.GeoJSONOptions[P]): typings.leaflet.mod.GeoJSON_[P] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.GeoJSON_[P]]
  @scala.inline
  def geoJSON[P](geojson: typings.geojson.mod.GeoJsonObject): typings.leaflet.mod.GeoJSON_[P] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.GeoJSON_[P]]
  @scala.inline
  def geoJSON[P](geojson: typings.geojson.mod.GeoJsonObject, options: typings.leaflet.mod.GeoJSONOptions[P]): typings.leaflet.mod.GeoJSON_[P] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("geoJSON")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.GeoJSON_[P]]
  
  @scala.inline
  def gridLayer(): typings.leaflet.mod.GridLayer_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gridLayer")().asInstanceOf[typings.leaflet.mod.GridLayer_]
  @scala.inline
  def gridLayer(options: typings.leaflet.mod.GridLayerOptions): typings.leaflet.mod.GridLayer_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gridLayer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.GridLayer_]
  
  @scala.inline
  def icon(options: typings.leaflet.mod.IconOptions): typings.leaflet.mod.Icon_[typings.leaflet.mod.IconOptions] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("icon")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Icon_[typings.leaflet.mod.IconOptions]]
  
  @scala.inline
  def imageOverlay(imageUrl: java.lang.String, bounds: typings.leaflet.mod.LatLngBoundsExpression): typings.leaflet.mod.ImageOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("imageOverlay")(imageUrl.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.ImageOverlay_]
  @scala.inline
  def imageOverlay(
    imageUrl: java.lang.String,
    bounds: typings.leaflet.mod.LatLngBoundsExpression,
    options: typings.leaflet.mod.ImageOverlayOptions
  ): typings.leaflet.mod.ImageOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("imageOverlay")(imageUrl.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.ImageOverlay_]
  
  @scala.inline
  def latLng(coords: js.Tuple3[scala.Double, scala.Double, scala.Double]): typings.leaflet.mod.LatLng_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LatLng_]
  @scala.inline
  def latLng(coords: typings.leaflet.anon.Alt): typings.leaflet.mod.LatLng_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LatLng_]
  @scala.inline
  def latLng(coords: typings.leaflet.mod.LatLngLiteral): typings.leaflet.mod.LatLng_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LatLng_]
  @scala.inline
  def latLng(coords: typings.leaflet.mod.LatLngTuple): typings.leaflet.mod.LatLng_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LatLng_]
  @scala.inline
  def latLng(latitude: scala.Double, longitude: scala.Double): typings.leaflet.mod.LatLng_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.LatLng_]
  @scala.inline
  def latLng(latitude: scala.Double, longitude: scala.Double, altitude: scala.Double): typings.leaflet.mod.LatLng_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLng")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], altitude.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.LatLng_]
  
  @scala.inline
  def latLngBounds(latlngs: js.Array[typings.leaflet.mod.LatLngExpression]): typings.leaflet.mod.LatLngBounds_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLngBounds")(latlngs.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LatLngBounds_]
  @scala.inline
  def latLngBounds(southWest: typings.leaflet.mod.LatLngExpression, northEast: typings.leaflet.mod.LatLngExpression): typings.leaflet.mod.LatLngBounds_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("latLngBounds")(southWest.asInstanceOf[js.Any], northEast.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.LatLngBounds_]
  
  @scala.inline
  def layerGroup(): typings.leaflet.mod.LayerGroup_[_] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")().asInstanceOf[typings.leaflet.mod.LayerGroup_[_]]
  @scala.inline
  def layerGroup(layers: js.UndefOr[scala.Nothing], options: typings.leaflet.mod.LayerOptions): typings.leaflet.mod.LayerGroup_[_] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.LayerGroup_[_]]
  @scala.inline
  def layerGroup(layers: js.Array[typings.leaflet.mod.Layer]): typings.leaflet.mod.LayerGroup_[_] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.LayerGroup_[_]]
  @scala.inline
  def layerGroup(layers: js.Array[typings.leaflet.mod.Layer], options: typings.leaflet.mod.LayerOptions): typings.leaflet.mod.LayerGroup_[_] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(layers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.LayerGroup_[_]]
  
  @scala.inline
  def map(element: java.lang.String): typings.leaflet.mod.Map_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Map_]
  @scala.inline
  def map(element: java.lang.String, options: typings.leaflet.mod.MapOptions): typings.leaflet.mod.Map_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Map_]
  @scala.inline
  def map(element: typings.std.HTMLElement): typings.leaflet.mod.Map_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Map_]
  @scala.inline
  def map(element: typings.std.HTMLElement, options: typings.leaflet.mod.MapOptions): typings.leaflet.mod.Map_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Map_]
  
  @scala.inline
  def marker(latlng: typings.leaflet.mod.LatLngExpression): typings.leaflet.mod.Marker_[_] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("marker")(latlng.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Marker_[_]]
  @scala.inline
  def marker(latlng: typings.leaflet.mod.LatLngExpression, options: typings.leaflet.mod.MarkerOptions): typings.leaflet.mod.Marker_[_] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("marker")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Marker_[_]]
  
  @scala.inline
  def point(coords: typings.leaflet.anon.X): typings.leaflet.mod.Point_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("point")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Point_]
  @scala.inline
  def point(coords: typings.leaflet.mod.PointTuple): typings.leaflet.mod.Point_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("point")(coords.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Point_]
  @scala.inline
  def point(x: scala.Double, y: scala.Double): typings.leaflet.mod.Point_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Point_]
  @scala.inline
  def point(x: scala.Double, y: scala.Double, round: scala.Boolean): typings.leaflet.mod.Point_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Point_]
  
  @scala.inline
  def polygon(
    latlngs: js.Array[
      (js.Array[
        js.Array[typings.leaflet.mod.LatLngExpression] | typings.leaflet.mod.LatLngExpression
      ]) | typings.leaflet.mod.LatLngExpression
    ]
  ): typings.leaflet.mod.Polygon_[_] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(latlngs.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Polygon_[_]]
  @scala.inline
  def polygon(
    latlngs: js.Array[
      (js.Array[
        js.Array[typings.leaflet.mod.LatLngExpression] | typings.leaflet.mod.LatLngExpression
      ]) | typings.leaflet.mod.LatLngExpression
    ],
    options: typings.leaflet.mod.PolylineOptions
  ): typings.leaflet.mod.Polygon_[_] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(latlngs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Polygon_[_]]
  
  @scala.inline
  def polyline(
    latlngs: js.Array[
      js.Array[typings.leaflet.mod.LatLngExpression] | typings.leaflet.mod.LatLngExpression
    ]
  ): typings.leaflet.mod.Polyline_[typings.geojson.mod.LineString | typings.geojson.mod.MultiLineString, _] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("polyline")(latlngs.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Polyline_[typings.geojson.mod.LineString | typings.geojson.mod.MultiLineString, _]]
  @scala.inline
  def polyline(
    latlngs: js.Array[
      js.Array[typings.leaflet.mod.LatLngExpression] | typings.leaflet.mod.LatLngExpression
    ],
    options: typings.leaflet.mod.PolylineOptions
  ): typings.leaflet.mod.Polyline_[typings.geojson.mod.LineString | typings.geojson.mod.MultiLineString, _] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("polyline")(latlngs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Polyline_[typings.geojson.mod.LineString | typings.geojson.mod.MultiLineString, _]]
  
  @scala.inline
  def popup(): typings.leaflet.mod.Popup_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("popup")().asInstanceOf[typings.leaflet.mod.Popup_]
  @scala.inline
  def popup(options: js.UndefOr[scala.Nothing], source: typings.leaflet.mod.Layer): typings.leaflet.mod.Popup_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Popup_]
  @scala.inline
  def popup(options: typings.leaflet.mod.PopupOptions): typings.leaflet.mod.Popup_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Popup_]
  @scala.inline
  def popup(options: typings.leaflet.mod.PopupOptions, source: typings.leaflet.mod.Layer): typings.leaflet.mod.Popup_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("popup")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Popup_]
  
  @scala.inline
  def rectangle(latLngBounds: typings.leaflet.mod.LatLngBoundsExpression): typings.leaflet.mod.Rectangle_[_] = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(latLngBounds.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Rectangle_[_]]
  @scala.inline
  def rectangle(
    latLngBounds: typings.leaflet.mod.LatLngBoundsExpression,
    options: typings.leaflet.mod.PolylineOptions
  ): typings.leaflet.mod.Rectangle_[_] = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(latLngBounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Rectangle_[_]]
  
  @scala.inline
  def svg(): typings.leaflet.mod.SVG_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svg")().asInstanceOf[typings.leaflet.mod.SVG_]
  @scala.inline
  def svg(options: typings.leaflet.mod.RendererOptions): typings.leaflet.mod.SVG_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svg")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.SVG_]
  
  @scala.inline
  def svgOverlay(svgImage: java.lang.String, bounds: typings.leaflet.mod.LatLngBoundsExpression): typings.leaflet.mod.SVGOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.SVGOverlay_]
  @scala.inline
  def svgOverlay(
    svgImage: java.lang.String,
    bounds: typings.leaflet.mod.LatLngBoundsExpression,
    options: typings.leaflet.mod.ImageOverlayOptions
  ): typings.leaflet.mod.SVGOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.SVGOverlay_]
  @scala.inline
  def svgOverlay(svgImage: typings.std.SVGElement, bounds: typings.leaflet.mod.LatLngBoundsExpression): typings.leaflet.mod.SVGOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.SVGOverlay_]
  @scala.inline
  def svgOverlay(
    svgImage: typings.std.SVGElement,
    bounds: typings.leaflet.mod.LatLngBoundsExpression,
    options: typings.leaflet.mod.ImageOverlayOptions
  ): typings.leaflet.mod.SVGOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("svgOverlay")(svgImage.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.SVGOverlay_]
  
  @scala.inline
  def tooltip(): typings.leaflet.mod.Tooltip_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")().asInstanceOf[typings.leaflet.mod.Tooltip_]
  @scala.inline
  def tooltip(options: js.UndefOr[scala.Nothing], source: typings.leaflet.mod.Layer): typings.leaflet.mod.Tooltip_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Tooltip_]
  @scala.inline
  def tooltip(options: typings.leaflet.mod.TooltipOptions): typings.leaflet.mod.Tooltip_ = typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any]).asInstanceOf[typings.leaflet.mod.Tooltip_]
  @scala.inline
  def tooltip(options: typings.leaflet.mod.TooltipOptions, source: typings.leaflet.mod.Layer): typings.leaflet.mod.Tooltip_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(options.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.Tooltip_]
  
  @scala.inline
  def videoOverlay(video: java.lang.String, bounds: typings.leaflet.mod.LatLngBoundsExpression): typings.leaflet.mod.VideoOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]
  @scala.inline
  def videoOverlay(
    video: java.lang.String,
    bounds: typings.leaflet.mod.LatLngBoundsExpression,
    options: typings.leaflet.mod.VideoOverlayOptions
  ): typings.leaflet.mod.VideoOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]
  @scala.inline
  def videoOverlay(video: js.Array[java.lang.String], bounds: typings.leaflet.mod.LatLngBoundsExpression): typings.leaflet.mod.VideoOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]
  @scala.inline
  def videoOverlay(
    video: js.Array[java.lang.String],
    bounds: typings.leaflet.mod.LatLngBoundsExpression,
    options: typings.leaflet.mod.VideoOverlayOptions
  ): typings.leaflet.mod.VideoOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]
  @scala.inline
  def videoOverlay(video: typings.std.HTMLVideoElement, bounds: typings.leaflet.mod.LatLngBoundsExpression): typings.leaflet.mod.VideoOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]
  @scala.inline
  def videoOverlay(
    video: typings.std.HTMLVideoElement,
    bounds: typings.leaflet.mod.LatLngBoundsExpression,
    options: typings.leaflet.mod.VideoOverlayOptions
  ): typings.leaflet.mod.VideoOverlay_ = (typings.leaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("videoOverlay")(video.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.leaflet.mod.VideoOverlay_]
}
