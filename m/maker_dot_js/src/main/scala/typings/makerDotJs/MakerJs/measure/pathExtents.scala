package typings.makerDotJs.MakerJs.measure

import typings.makerDotJs.MakerJs.IMeasure
import typings.makerDotJs.MakerJs.IPath
import typings.makerDotJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.measure.pathExtents")
@js.native
object pathExtents extends js.Object {
  /**
    * Calculates the smallest rectangle which contains a path.
    *
    * @param pathToMeasure The path to measure.
    * @returns object with low and high points.
    */
  def apply(pathToMeasure: IPath): IMeasure = js.native
  def apply(pathToMeasure: IPath, addOffset: IPoint): IMeasure = js.native
}

