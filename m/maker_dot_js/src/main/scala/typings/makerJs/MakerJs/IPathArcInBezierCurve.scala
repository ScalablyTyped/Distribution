package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arc path segment in a bezier curve.
  */
trait IPathArcInBezierCurve extends IPathArc {
  var bezierData: IBezierRange
}

object IPathArcInBezierCurve {
  @scala.inline
  def apply(
    bezierData: IBezierRange,
    endAngle: Double,
    origin: IPoint,
    radius: Double,
    startAngle: Double,
    `type`: String,
    layer: String = null
  ): IPathArcInBezierCurve = {
    val __obj = js.Dynamic.literal(bezierData = bezierData.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathArcInBezierCurve]
  }
}

