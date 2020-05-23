package typings.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Circles extends js.Object {
  var circles: Double
  var dur: Double
  def fn(dur: Double, index: Double, total: Double): R
}

object Circles {
  @scala.inline
  def apply(circles: Double, dur: Double, fn: (Double, Double, Double) => R): Circles = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction3(fn))
    __obj.asInstanceOf[Circles]
  }
}

