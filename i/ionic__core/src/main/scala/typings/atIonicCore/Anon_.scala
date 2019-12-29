package typings.atIonicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  var circles: Double
  var dur: Double
  def fn(_underscore: Double, index: Double): Anon_RStyleAnonAnimationdelayLeft
}

object Anon_ {
  @scala.inline
  def apply(circles: Double, dur: Double, fn: (Double, Double) => Anon_RStyleAnonAnimationdelayLeft): Anon_ = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction2(fn))
  
    __obj.asInstanceOf[Anon_]
  }
}

