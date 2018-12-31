package typings
package jstsLib.jstsNs.geomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.geom.LineString")
@js.native
class LineString protected () extends Geometry {
  /**
    * @constructor
    */
  def this(points: js.Array[Coordinate]) = this()
  def this(points: js.Array[Coordinate], factory: js.Any) = this()
  /**
    * @return {jsts.geom.Coordinate} The n'th coordinate of this
    *         jsts.geom.LineString.
    * @param {int}
    *          n index.
    */
  def getCoordinateN(n: scala.Double): Coordinate = js.native
  /**
    * @return {jsts.geom.Point} The last point of this
    *         jsts.geom.LineString.
    */
  def getEndPoint(): Point = js.native
  /**
    * @return {jsts.geom.Point} The n'th point of this
    *         jsts.geom.LineString.
    * @param {int}
    *          n index.
    */
  def getPointN(n: scala.Double): Point = js.native
  /**
    * @return {jsts.geom.Point} The first point of this
    *         jsts.geom.LineString.
    */
  def getStartPoint(): Point = js.native
  /**
    * @return {Boolean} true if LineString is Closed.
    */
  def isClosed(): scala.Boolean = js.native
  /**
    * @return {Boolean} true if LineString is a Ring.
    */
  def isRing(): scala.Boolean = js.native
}

