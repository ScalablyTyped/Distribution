package typings.makerJs.MakerJs.measure

import typings.makerJs.MakerJs.IPathArc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.measure.isBetweenArcAngles")
@js.native
object isBetweenArcAngles extends js.Object {
  /**
    * Check if a given angle is between an arc's start and end angles.
    *
    * @param angleInQuestion The angle to test.
    * @param arc Arc to test against.
    * @param exclusive Flag to exclude equaling the start or end angles.
    * @returns Boolean true if angle is between (or equal to) the arc's start and end angles.
    */
  def apply(angleInQuestion: Double, arc: IPathArc, exclusive: Boolean): Boolean = js.native
}

