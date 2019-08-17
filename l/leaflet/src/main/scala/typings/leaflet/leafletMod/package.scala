package typings.leaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object leafletMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.geojson.geojsonMod.Feature
  import typings.geojson.geojsonMod.GeometryObject
  import typings.leaflet.Anon_Active
  import typings.leaflet.leafletStrings.center
  import typings.std.Error
  import typings.std.HTMLElement

  type BoundsExpression = Bounds | BoundsLiteral
  type BoundsLiteral = js.Tuple2[PointTuple, PointTuple]
  type Content = String | HTMLElement
  type CrossOrigin = Boolean | String
  type DoneCallback = js.Function2[/* error */ js.UndefOr[Error], /* tile */ js.UndefOr[HTMLElement], Unit]
  type InternalTiles = StringDictionary[Anon_Active]
  type LatLngBoundsExpression = LatLngBounds | LatLngBoundsLiteral
  type LatLngBoundsLiteral = js.Array[LatLngTuple]
  /* Rewritten from type alias, can be one of: 
    - typings.leaflet.leafletMod.LatLng
    - typings.leaflet.leafletMod.LatLngLiteral
    - typings.leaflet.leafletMod.LatLngTuple
  */
  type LatLngExpression = _LatLngExpression | LatLngTuple
  type LatLngTuple = js.Tuple2[Double, Double]
  type LeafletEventHandlerFn = js.Function1[/* event */ LeafletEvent, Unit]
  type LeafletEventHandlerFnMap = StringDictionary[LeafletEventHandlerFn]
  type PointExpression = Point | PointTuple
  type PointTuple = js.Tuple2[Double, Double]
  type StyleFunction[P] = js.Function1[/* feature */ js.UndefOr[Feature[GeometryObject, P]], PathOptions]
  type Zoom = Boolean | center
}
