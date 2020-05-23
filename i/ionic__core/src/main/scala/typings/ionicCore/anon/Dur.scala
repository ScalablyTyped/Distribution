package typings.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dur extends js.Object {
  var circles: Double
  var dur: Double
  var elmDuration: Boolean
  def fn(): Cx
}

object Dur {
  @scala.inline
  def apply(circles: Double, dur: Double, elmDuration: Boolean, fn: () => Cx): Dur = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], elmDuration = elmDuration.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn))
    __obj.asInstanceOf[Dur]
  }
}

