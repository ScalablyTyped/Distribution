package typings.makerDotJs.MakerJs.measure

import typings.makerDotJs.MakerJs.IPathBezierSeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.measure.isBezierSeedLinear")
@js.native
object isBezierSeedLinear extends js.Object {
  /**
    * Check if a given bezier seed is simply a line.
    *
    * @param seed The bezier seed to test.
    * @returns Boolean true if bezier seed has control points on the line slope and between the line endpoints.
    */
  def apply(seed: IPathBezierSeed): Boolean = js.native
}

