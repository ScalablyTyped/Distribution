package typings.makerJs.MakerJs.paths

import typings.makerJs.MakerJs.IPathArc
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for arc path.
  */
trait Arc extends IPathArc

object Arc {
  @scala.inline
  def apply(
    endAngle: Double,
    origin: IPoint,
    radius: Double,
    startAngle: Double,
    `type`: String,
    layer: String = null
  ): Arc = {
    val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc]
  }
}

