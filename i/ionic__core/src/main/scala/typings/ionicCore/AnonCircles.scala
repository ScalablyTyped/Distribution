package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCircles extends js.Object {
  var circles: Double
  var dur: Double
  def fn(dur: Double, index: Double, total: Double): AnonR
}

object AnonCircles {
  @scala.inline
  def apply(circles: Double, dur: Double, fn: (Double, Double, Double) => AnonR): AnonCircles = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction3(fn))
  
    __obj.asInstanceOf[AnonCircles]
  }
}

