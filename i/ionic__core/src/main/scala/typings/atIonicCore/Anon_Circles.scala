package typings.atIonicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Circles extends js.Object {
  var circles: Double
  var dur: Double
  def fn(dur: Double, index: Double, total: Double): Anon_R
}

object Anon_Circles {
  @scala.inline
  def apply(circles: Double, dur: Double, fn: (Double, Double, Double) => Anon_R): Anon_Circles = {
    val __obj = js.Dynamic.literal(circles = circles, dur = dur, fn = js.Any.fromFunction3(fn))
  
    __obj.asInstanceOf[Anon_Circles]
  }
}

