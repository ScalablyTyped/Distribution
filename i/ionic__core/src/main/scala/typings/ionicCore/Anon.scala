package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon extends js.Object {
  var circles: Double
  var dur: Double
  def fn(_underscore: Double, index: Double): AnonRStyleAnonAnimationdelayLeft
}

object Anon {
  @scala.inline
  def apply(circles: Double, dur: Double, fn: (Double, Double) => AnonRStyleAnonAnimationdelayLeft): Anon = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction2(fn))
  
    __obj.asInstanceOf[Anon]
  }
}

