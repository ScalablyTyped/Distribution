package typings.atIonicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dur extends js.Object {
  var dur: Double
  var lines: Double
  def fn(dur: Double, index: Double, total: Double): Anon_Style
}

object Anon_Dur {
  @scala.inline
  def apply(dur: Double, fn: (Double, Double, Double) => Anon_Style, lines: Double): Anon_Dur = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction3(fn), lines = lines.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Dur]
  }
}

