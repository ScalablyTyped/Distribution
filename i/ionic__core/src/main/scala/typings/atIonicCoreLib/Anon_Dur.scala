package typings
package atIonicCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dur extends js.Object {
  var dur: scala.Double
  var lines: scala.Double
  def fn(dur: scala.Double, index: scala.Double, total: scala.Double): Anon_Style
}

object Anon_Dur {
  @scala.inline
  def apply(
    dur: scala.Double,
    fn: (scala.Double, scala.Double, scala.Double) => Anon_Style,
    lines: scala.Double
  ): Anon_Dur = {
    val __obj = js.Dynamic.literal(dur = dur, fn = js.Any.fromFunction3(fn), lines = lines)
  
    __obj.asInstanceOf[Anon_Dur]
  }
}

