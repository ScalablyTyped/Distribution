package typings.atIonicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  var circles: Double
  var dur: Double
  def fn(`_`: Double, index: Double): Anon_RStyleAnonAnimationdelayLeftString
}

object Anon_ {
  @scala.inline
  def apply(circles: Double, dur: Double, fn: (Double, Double) => Anon_RStyleAnonAnimationdelayLeftString): Anon_ = {
    val __obj = js.Dynamic.literal(circles = circles, dur = dur, fn = js.Any.fromFunction2(fn))
  
    __obj.asInstanceOf[Anon_]
  }
}

