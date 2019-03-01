package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arc path.
  *
  * Examples:
  * ```
  * var arc: IPathArc = { type: 'arc', origin: [0, 0], radius: 7, startAngle: 0, endAngle: 45 };   //typescript
  * var arc = { type: 'arc', origin: [0, 0], radius: 7, startAngle: 0, endAngle: 45 };   //javascript
  * ```
  */
trait IPathArc extends IPathCircle {
  /**
    * The angle (in degrees) to end drawing the arc, in polar (counter-clockwise) direction. May be less than start angle if it past 360.
    */
  var endAngle: scala.Double
  /**
    * The angle (in degrees) to begin drawing the arc, in polar (counter-clockwise) direction.
    */
  var startAngle: scala.Double
}

object IPathArc {
  @scala.inline
  def apply(
    endAngle: scala.Double,
    origin: IPoint,
    radius: scala.Double,
    startAngle: scala.Double,
    `type`: java.lang.String,
    layer: java.lang.String = null
  ): IPathArc = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("endAngle")(endAngle)
    __obj.updateDynamic("origin")(origin)
    __obj.updateDynamic("radius")(radius)
    __obj.updateDynamic("startAngle")(startAngle)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    __obj.asInstanceOf[IPathArc]
  }
}

