package typings.makerDotJs.MakerJs.measure

import typings.makerDotJs.MakerJs.IPathLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.measure.isLineOverlapping")
@js.native
object isLineOverlapping extends js.Object {
  /**
    * Check for line overlapping another line.
    *
    * @param lineA The line to test.
    * @param lineB The line to check for overlap.
    * @param excludeTangents Boolean to exclude exact endpoints and only look for deep overlaps.
    * @returns Boolean true if lineA is overlapped with lineB.
    */
  def apply(lineA: IPathLine, lineB: IPathLine, excludeTangents: Boolean): Boolean = js.native
}

