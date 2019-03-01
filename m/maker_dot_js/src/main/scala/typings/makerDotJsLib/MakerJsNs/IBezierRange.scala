package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bezier t values for an arc path segment in a bezier curve.
  */
trait IBezierRange extends js.Object {
  /**
    * The bezier t-value at the end point.
    */
  var endT: scala.Double
  /**
    * The bezier t-value at the starting point.
    */
  var startT: scala.Double
}

object IBezierRange {
  @scala.inline
  def apply(endT: scala.Double, startT: scala.Double): IBezierRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endT")(endT)
    __obj.updateDynamic("startT")(startT)
    __obj.asInstanceOf[IBezierRange]
  }
}

