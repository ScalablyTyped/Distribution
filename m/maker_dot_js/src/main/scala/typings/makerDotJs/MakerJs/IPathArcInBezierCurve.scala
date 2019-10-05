package typings.makerDotJs.MakerJs

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
    val __obj = js.Dynamic.literal(bezierData = bezierData, endAngle = endAngle, origin = origin, radius = radius, startAngle = startAngle)
    __obj.updateDynamic("type")(`type`)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    __obj.asInstanceOf[IPathArcInBezierCurve]
  }
}

