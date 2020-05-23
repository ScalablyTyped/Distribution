package typings.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lines extends js.Object {
  var dur: Double
  var lines: Double
  def fn(dur: Double, index: Double, total: Double): Y1
}

object Lines {
  @scala.inline
  def apply(dur: Double, fn: (Double, Double, Double) => Y1, lines: Double): Lines = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction3(fn), lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lines]
  }
}

