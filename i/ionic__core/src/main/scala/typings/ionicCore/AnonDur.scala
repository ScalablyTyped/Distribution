package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDur extends js.Object {
  var circles: Double
  var dur: Double
  var elmDuration: Boolean
  def fn(): AnonCx
}

object AnonDur {
  @scala.inline
  def apply(circles: Double, dur: Double, elmDuration: Boolean, fn: () => AnonCx): AnonDur = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], elmDuration = elmDuration.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn))
  
    __obj.asInstanceOf[AnonDur]
  }
}

