package typings
package makerDotJsLib.MakerJsNs

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
    endAngle: scala.Double,
    origin: IPoint,
    radius: scala.Double,
    startAngle: scala.Double,
    `type`: java.lang.String,
    layer: java.lang.String = null
  ): IPathArcInBezierCurve = {
    val __obj = js.Dynamic.literal(bezierData = bezierData, endAngle = endAngle, origin = origin, radius = radius, startAngle = startAngle)
    __obj.updateDynamic("type")(`type`)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    __obj.asInstanceOf[IPathArcInBezierCurve]
  }
}

