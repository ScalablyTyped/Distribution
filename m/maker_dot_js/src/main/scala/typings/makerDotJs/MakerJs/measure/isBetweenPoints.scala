package typings.makerDotJs.MakerJs.measure

import typings.makerDotJs.MakerJs.IPathLine
import typings.makerDotJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.measure.isBetweenPoints")
@js.native
object isBetweenPoints extends js.Object {
  /**
    * Check if a given point is between a line's end points.
    *
    * @param pointInQuestion The point to test.
    * @param line Line to test against.
    * @param exclusive Flag to exclude equaling the origin or end points.
    * @returns Boolean true if point is between (or equal to) the line's origin and end points.
    */
  def apply(pointInQuestion: IPoint, line: IPathLine, exclusive: Boolean): Boolean = js.native
}

