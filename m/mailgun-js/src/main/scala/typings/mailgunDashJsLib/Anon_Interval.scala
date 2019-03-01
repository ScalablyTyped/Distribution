package typings
package mailgunDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Interval extends js.Object {
  var interval: scala.Double
  var times: scala.Double
}

object Anon_Interval {
  @scala.inline
  def apply(interval: scala.Double, times: scala.Double): Anon_Interval = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("interval")(interval)
    __obj.updateDynamic("times")(times)
    __obj.asInstanceOf[Anon_Interval]
  }
}

