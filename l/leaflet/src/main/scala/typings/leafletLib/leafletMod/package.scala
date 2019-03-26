package typings
package leafletLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object leafletMod {
  type BoundsExpression = Bounds | BoundsLiteral
  type BoundsLiteral = js.Tuple2[PointTuple, PointTuple]
  type Content = java.lang.String | stdLib.HTMLElement
  type CrossOrigin = scala.Boolean | java.lang.String
  type DoneCallback = js.Function2[
    /* error */ js.UndefOr[stdLib.Error], 
    /* tile */ js.UndefOr[stdLib.HTMLElement], 
    scala.Unit
  ]
  type LatLngBoundsExpression = LatLngBounds | LatLngBoundsLiteral
  type LatLngBoundsLiteral = js.Array[LatLngTuple]
  /* Rewritten from type alias, can be one of: 
    - LatLng
    - LatLngLiteral
    - LatLngTuple
  */
  type LatLngExpression = _LatLngExpression | LatLngTuple
  type LatLngTuple = js.Tuple2[scala.Double, scala.Double]
  type LeafletEventHandlerFn = js.Function1[/* event */ LeafletEvent, scala.Unit]
  type PointExpression = Point | PointTuple
  type PointTuple = js.Tuple2[scala.Double, scala.Double]
  type StyleFunction[P] = js.Function1[
    /* feature */ js.UndefOr[geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, P]], 
    PathOptions
  ]
  type Zoom = scala.Boolean | leafletLib.leafletLibStrings.center
}
