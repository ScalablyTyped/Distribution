package typings.makerJs.MakerJs.measure

import typings.makerJs.MakerJs.IPath
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.measure.isPathEqual")
@js.native
object isPathEqual extends js.Object {
  /**
    * Find out if two paths are equal.
    *
    * @param pathA First path.
    * @param pathB Second path.
    * @returns true if paths are the same, false if they are not
    */
  def apply(pathA: IPath, pathB: IPath): Boolean = js.native
  def apply(pathA: IPath, pathB: IPath, withinPointDistance: Double): Boolean = js.native
  def apply(pathA: IPath, pathB: IPath, withinPointDistance: Double, pathAOffset: IPoint): Boolean = js.native
  def apply(pathA: IPath, pathB: IPath, withinPointDistance: Double, pathAOffset: IPoint, pathBOffset: IPoint): Boolean = js.native
}

