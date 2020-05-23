package typings.makerJs.MakerJs.paths

import typings.makerJs.MakerJs.IPathLine
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for a parallel line path.
  *
  * @param toLine A line to be parallel to.
  * @param distance Distance between parallel and original line.
  * @param nearPoint Any point to determine which side of the line to place the parallel.
  */
trait Parallel extends IPathLine

object Parallel {
  @scala.inline
  def apply(end: IPoint, origin: IPoint, `type`: String, layer: String = null): Parallel = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parallel]
  }
}

