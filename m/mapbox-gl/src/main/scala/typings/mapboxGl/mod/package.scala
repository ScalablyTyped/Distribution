package typings.mapboxGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.mapboxGl.mod.BackgroundLayout
    - typings.mapboxGl.mod.FillLayout
    - typings.mapboxGl.mod.FillExtrusionLayout
    - typings.mapboxGl.mod.LineLayout
    - typings.mapboxGl.mod.SymbolLayout
    - typings.mapboxGl.mod.RasterLayout
    - typings.mapboxGl.mod.CircleLayout
    - typings.mapboxGl.mod.HeatmapLayout
    - typings.mapboxGl.mod.HillshadeLayout
  */
  type AnyLayout = typings.mapboxGl.mod._AnyLayout | typings.mapboxGl.mod.BackgroundLayout | typings.mapboxGl.mod.FillLayout | typings.mapboxGl.mod.FillExtrusionLayout | typings.mapboxGl.mod.RasterLayout | typings.mapboxGl.mod.CircleLayout | typings.mapboxGl.mod.HeatmapLayout | typings.mapboxGl.mod.HillshadeLayout
  type BackgroundLayout = typings.mapboxGl.mod.Layout
  type CameraForBoundsResult = (typings.std.Required[
    typings.std.Pick[
      typings.mapboxGl.mod.CameraOptions, 
      typings.mapboxGl.mapboxGlStrings.zoom | typings.mapboxGl.mapboxGlStrings.bearing
    ]
  ]) with typings.mapboxGl.AnonCenter
  type CircleLayout = typings.mapboxGl.mod.Layout
  type EventData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Expression = js.Array[typings.mapboxGl.mod.ExpressionName | js.Any]
  type FillExtrusionLayout = typings.mapboxGl.mod.Layout
  type FillLayout = typings.mapboxGl.mod.Layout
  type HeatmapLayout = typings.mapboxGl.mod.Layout
  type HillshadeLayout = typings.mapboxGl.mod.Layout
  type LngLatBoundsLike = typings.mapboxGl.mod.LngLatBounds | (js.Tuple2[typings.mapboxGl.mod.LngLatLike, typings.mapboxGl.mod.LngLatLike]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  /* Rewritten from type alias, can be one of: 
    - typings.mapboxGl.mod.LngLat
    - typings.mapboxGl.AnonLat
    - typings.mapboxGl.AnonLatLon
    - js.Tuple2[scala.Double, scala.Double]
  */
  type LngLatLike = typings.mapboxGl.mod._LngLatLike | (js.Tuple2[scala.Double, scala.Double])
  type MapLayerMouseEvent = typings.mapboxGl.mod.MapMouseEvent with typings.mapboxGl.AnonFeatures
  type MapLayerTouchEvent = typings.mapboxGl.mod.MapTouchEvent with typings.mapboxGl.AnonFeatures
  type MapboxGeoJSONFeature = (typings.geojson.mod.Feature[typings.geojson.mod.Geometry, typings.geojson.mod.GeoJsonProperties]) with typings.mapboxGl.AnonKey
  type PointLike = typings.mapboxGl.mod.Point | (js.Tuple2[scala.Double, scala.Double])
  type RasterLayout = typings.mapboxGl.mod.Layout
  type Sources = org.scalablytyped.runtime.StringDictionary[typings.mapboxGl.mod.AnySourceData]
  type TransformRequestFunction = js.Function2[
    /* url */ java.lang.String, 
    /* resourceType */ typings.mapboxGl.mod.ResourceType, 
    typings.mapboxGl.mod.RequestParameters
  ]
}
