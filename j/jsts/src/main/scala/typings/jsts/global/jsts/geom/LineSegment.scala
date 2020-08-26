package typings.jsts.global.jsts.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsts.geom.LineSegment")
@js.native
class LineSegment protected ()
  extends typings.jsts.jsts.geom.LineSegment {
  def this(p0: typings.jsts.jsts.geom.Coordinate, p1: typings.jsts.jsts.geom.Coordinate) = this()
}

/* static members */
@JSGlobal("jsts.geom.LineSegment")
@js.native
object LineSegment extends js.Object {
  /**
    * Computes the midpoint of a segment
    *
    * @param {jsts.geom.Coordinate} p0
    * @param {jsts.geom.Coordinate} p1
    * @return {jsts.geom.Coordinate} the midpoint of the segment
    */
  def midPoint(p0: typings.jsts.jsts.geom.Coordinate, p1: typings.jsts.jsts.geom.Coordinate): typings.jsts.jsts.geom.Coordinate = js.native
}

