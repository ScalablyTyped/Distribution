package typings.makerJs.MakerJs.measure

import typings.makerJs.MakerJs.IPathArc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.measure.isArcOverlapping")
@js.native
object isArcOverlapping extends js.Object {
  /**
    * Check for arc overlapping another arc.
    *
    * @param arcA The arc to test.
    * @param arcB The arc to check for overlap.
    * @param excludeTangents Boolean to exclude exact endpoints and only look for deep overlaps.
    * @returns Boolean true if arcA is overlapped with arcB.
    */
  def apply(arcA: IPathArc, arcB: IPathArc, excludeTangents: Boolean): Boolean = js.native
}

