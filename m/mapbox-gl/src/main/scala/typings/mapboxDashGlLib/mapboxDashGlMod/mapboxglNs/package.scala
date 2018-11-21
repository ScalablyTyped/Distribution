package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mapboxglNs {
  type Anchor = mapboxDashGlLib.mapboxDashGlLibStrings.center | mapboxDashGlLib.mapboxDashGlLibStrings.left | mapboxDashGlLib.mapboxDashGlLibStrings.right | mapboxDashGlLib.mapboxDashGlLibStrings.top | mapboxDashGlLib.mapboxDashGlLibStrings.bottom | mapboxDashGlLib.mapboxDashGlLibStrings.`top-left` | mapboxDashGlLib.mapboxDashGlLibStrings.`top-right` | mapboxDashGlLib.mapboxDashGlLibStrings.`bottom-left` | mapboxDashGlLib.mapboxDashGlLibStrings.`bottom-right`
  type AttributionControl = Control
  type Control = Evented
  type Expression = js.Array[js.Any]
  type FullscreenControl = Control
  type LngLatBoundsLike = LngLatBounds | (js.Tuple2[LngLatLike, LngLatLike]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  type LngLatLike = LngLat | mapboxDashGlLib.Anon_Lat | mapboxDashGlLib.Anon_LatLon | (js.Tuple2[scala.Double, scala.Double])
  type MapDataEvent = MapSourceDataEvent | MapStyleDataEvent
  type MapLayerMouseEvent = MapMouseEvent with mapboxDashGlLib.Anon_Features
  type MapLayerTouchEvent = MapTouchEvent with mapboxDashGlLib.Anon_Features
  type MapboxGeoJSONFeature = (geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]) with mapboxDashGlLib.Anon_SourceLayerLayer
  type NavigationControl = Control
  type PointLike = Point | (js.Tuple2[scala.Double, scala.Double])
  type ResourceType = mapboxDashGlLib.mapboxDashGlLibStrings.Unknown | mapboxDashGlLib.mapboxDashGlLibStrings.Style | mapboxDashGlLib.mapboxDashGlLibStrings.Source | mapboxDashGlLib.mapboxDashGlLibStrings.Tile | mapboxDashGlLib.mapboxDashGlLibStrings.Glyphs | mapboxDashGlLib.mapboxDashGlLibStrings.SpriteImage | mapboxDashGlLib.mapboxDashGlLibStrings.SpriteJSON | mapboxDashGlLib.mapboxDashGlLibStrings.Image
  type TransformRequestFunction = js.Function2[/* url */ java.lang.String, /* resourceType */ ResourceType, RequestParameters]
}
