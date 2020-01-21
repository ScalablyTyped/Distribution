package typings.makerJs.MakerJs

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
  var endT: Double
  /**
    * The bezier t-value at the starting point.
    */
  var startT: Double
}

object IBezierRange {
  @scala.inline
  def apply(endT: Double, startT: Double): IBezierRange = {
    val __obj = js.Dynamic.literal(endT = endT.asInstanceOf[js.Any], startT = startT.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBezierRange]
  }
}

