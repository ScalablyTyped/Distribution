package typings
package leafletLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object leafletMod {
  type BoundsExpression = Bounds | BoundsLiteral
  type BoundsLiteral = js.Tuple2[PointTuple, PointTuple]
  type Content = java.lang.String | stdLib.HTMLElement
  type ControlPosition = leafletLib.leafletLibStrings.topleft | leafletLib.leafletLibStrings.topright | leafletLib.leafletLibStrings.bottomleft | leafletLib.leafletLibStrings.bottomright
  type Direction = leafletLib.leafletLibStrings.right | leafletLib.leafletLibStrings.left | leafletLib.leafletLibStrings.top | leafletLib.leafletLibStrings.bottom | leafletLib.leafletLibStrings.center | leafletLib.leafletLibStrings.auto
  type DoneCallback = js.Function2[
    /* error */ js.UndefOr[stdLib.Error], 
    /* tile */ js.UndefOr[stdLib.HTMLElement], 
    scala.Unit
  ]
  type FillRule = leafletLib.leafletLibStrings.nonzero | leafletLib.leafletLibStrings.evenodd | leafletLib.leafletLibStrings.inherit
  type LatLngBoundsExpression = LatLngBounds | LatLngBoundsLiteral
  type LatLngBoundsLiteral = js.Array[LatLngTuple]
  type LatLngExpression = LatLng | LatLngLiteral | LatLngTuple
  type LatLngTuple = js.Tuple2[scala.Double, scala.Double]
  type LeafletEventHandlerFn = js.Function1[/* event */ LeafletEvent, scala.Unit]
  type LineCapShape = leafletLib.leafletLibStrings.butt | leafletLib.leafletLibStrings.round | leafletLib.leafletLibStrings.square | leafletLib.leafletLibStrings.inherit
  type LineJoinShape = leafletLib.leafletLibStrings.miter | leafletLib.leafletLibStrings.round | leafletLib.leafletLibStrings.bevel | leafletLib.leafletLibStrings.inherit
  type PointExpression = Point | PointTuple
  type PointTuple = js.Tuple2[scala.Double, scala.Double]
  type StyleFunction[P] = js.Function1[
    /* feature */ js.UndefOr[geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.GeometryObject, P]], 
    PathOptions
  ]
  type Zoom = scala.Boolean | leafletLib.leafletLibStrings.center
}
