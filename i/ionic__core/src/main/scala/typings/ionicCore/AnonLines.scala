package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLines extends js.Object {
  var dur: Double
  var lines: Double
  def fn(dur: Double, index: Double, total: Double): AnonY1
}

object AnonLines {
  @scala.inline
  def apply(dur: Double, fn: (Double, Double, Double) => AnonY1, lines: Double): AnonLines = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction3(fn), lines = lines.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLines]
  }
}

