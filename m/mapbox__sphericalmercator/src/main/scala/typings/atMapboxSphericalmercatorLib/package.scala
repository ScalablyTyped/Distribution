package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atMapboxSphericalmercatorLib {
  type BoundingBox = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  type LatLngPoint = js.Tuple2[scala.Double, scala.Double]
  type Projection = atMapboxSphericalmercatorLib.atMapboxSphericalmercatorLibStrings.WGS84 | atMapboxSphericalmercatorLib.atMapboxSphericalmercatorLibStrings.`900913`
  type XYPoint = js.Tuple2[scala.Double, scala.Double]
}
