package typings
package atIonicCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  var circles: scala.Double
  var dur: scala.Double
  def fn(`_`: scala.Double, index: scala.Double): Anon_RStyleAnonAnimationdelayLeftString
}

object Anon_ {
  @scala.inline
  def apply(
    circles: scala.Double,
    dur: scala.Double,
    fn: (scala.Double, scala.Double) => Anon_RStyleAnonAnimationdelayLeftString
  ): Anon_ = {
    val __obj = js.Dynamic.literal(circles = circles, dur = dur, fn = js.Any.fromFunction2(fn))
  
    __obj.asInstanceOf[Anon_]
  }
}

