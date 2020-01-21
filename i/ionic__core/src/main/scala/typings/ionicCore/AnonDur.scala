package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDur extends js.Object {
  var dur: Double
  var lines: Double
  def fn(dur: Double, index: Double, total: Double): AnonStyleY1
}

object AnonDur {
  @scala.inline
  def apply(dur: Double, fn: (Double, Double, Double) => AnonStyleY1, lines: Double): AnonDur = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction3(fn), lines = lines.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDur]
  }
}

