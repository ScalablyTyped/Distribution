package typings
package atIonicCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Circles extends js.Object {
  var circles: scala.Double
  var dur: scala.Double
  def fn(dur: scala.Double, index: scala.Double, total: scala.Double): Anon_R
}

object Anon_Circles {
  @scala.inline
  def apply(circles: scala.Double, dur: scala.Double, fn: (scala.Double, scala.Double, scala.Double) => Anon_R): Anon_Circles = {
    val __obj = js.Dynamic.literal(circles = circles, dur = dur, fn = js.Any.fromFunction3(fn))
  
    __obj.asInstanceOf[Anon_Circles]
  }
}

