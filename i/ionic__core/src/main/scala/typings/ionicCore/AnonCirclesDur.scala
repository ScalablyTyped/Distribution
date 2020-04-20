package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCirclesDur extends js.Object {
  var circles: Double
  var dur: Double
  def fn(_underscore: Double, index: Double): AnonRStyle
}

object AnonCirclesDur {
  @scala.inline
  def apply(circles: Double, dur: Double, fn: (Double, Double) => AnonRStyle): AnonCirclesDur = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction2(fn))
    __obj.asInstanceOf[AnonCirclesDur]
  }
}

