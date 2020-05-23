package typings.makerJs.MakerJs.paths

import typings.makerJs.MakerJs.IPathCircle
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for circle path.
  */
trait Circle extends IPathCircle

object Circle {
  @scala.inline
  def apply(origin: IPoint, radius: Double, `type`: String, layer: String = null): Circle = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
}

