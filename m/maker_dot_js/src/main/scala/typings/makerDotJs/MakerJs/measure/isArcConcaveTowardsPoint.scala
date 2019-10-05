package typings.makerDotJs.MakerJs.measure

import typings.makerDotJs.MakerJs.IPathArc
import typings.makerDotJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.measure.isArcConcaveTowardsPoint")
@js.native
object isArcConcaveTowardsPoint extends js.Object {
  /**
    * Check for arc being concave or convex towards a given point.
    *
    * @param arc The arc to test.
    * @param towardsPoint The point to test.
    * @returns Boolean true if arc is concave towards point.
    */
  def apply(arc: IPathArc, towardsPoint: IPoint): Boolean = js.native
}

