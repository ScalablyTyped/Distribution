package typings.mathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolarCoordinates extends js.Object {
  var phi: Double
  var r: Double
}

object PolarCoordinates {
  @scala.inline
  def apply(phi: Double, r: Double): PolarCoordinates = {
    val __obj = js.Dynamic.literal(phi = phi.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarCoordinates]
  }
}

