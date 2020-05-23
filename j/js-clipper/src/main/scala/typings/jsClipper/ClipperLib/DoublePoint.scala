package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoublePoint extends js.Object {
  var X: Double
  var Y: Double
}

object DoublePoint {
  @scala.inline
  def apply(X: Double, Y: Double): DoublePoint = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoublePoint]
  }
}

