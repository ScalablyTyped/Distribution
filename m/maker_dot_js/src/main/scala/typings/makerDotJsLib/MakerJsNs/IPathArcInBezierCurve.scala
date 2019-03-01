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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bezierData")(bezierData)
    __obj.updateDynamic("endAngle")(endAngle)
    __obj.updateDynamic("origin")(origin)
    __obj.updateDynamic("radius")(radius)
    __obj.updateDynamic("startAngle")(startAngle)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    __obj.asInstanceOf[IPathArcInBezierCurve]
  }
}

