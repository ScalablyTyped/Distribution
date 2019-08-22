package typings.atIonicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CirclesDur extends js.Object {
  var circles: Double
  var dur: Double
  var elmDuration: Boolean
  def fn(): Anon_Cx
}

object Anon_CirclesDur {
  @scala.inline
  def apply(circles: Double, dur: Double, elmDuration: Boolean, fn: () => Anon_Cx): Anon_CirclesDur = {
    val __obj = js.Dynamic.literal(circles = circles, dur = dur, elmDuration = elmDuration, fn = js.Any.fromFunction0(fn))
  
    __obj.asInstanceOf[Anon_CirclesDur]
  }
}

