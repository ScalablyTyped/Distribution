package typings.makerDotJs.MakerJs

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
  var endAngle: Double
  /**
    * The angle (in degrees) to begin drawing the arc, in polar (counter-clockwise) direction.
    */
  var startAngle: Double
}

object IPathArc {
  @scala.inline
  def apply(
    endAngle: Double,
    origin: IPoint,
    radius: Double,
    startAngle: Double,
    `type`: String,
    layer: String = null
  ): IPathArc = {
    val __obj = js.Dynamic.literal(endAngle = endAngle, origin = origin, radius = radius, startAngle = startAngle)
    __obj.updateDynamic("type")(`type`)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    __obj.asInstanceOf[IPathArc]
  }
}

