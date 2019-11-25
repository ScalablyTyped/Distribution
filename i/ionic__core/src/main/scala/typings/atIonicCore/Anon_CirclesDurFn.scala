package typings.atIonicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CirclesDurFn extends js.Object {
  var circles: Double
  var dur: Double
  def fn(): Anon_RStyle
}

object Anon_CirclesDurFn {
  @scala.inline
  def apply(circles: Double, dur: Double, fn: () => Anon_RStyle): Anon_CirclesDurFn = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn))
  
    __obj.asInstanceOf[Anon_CirclesDurFn]
  }
}

