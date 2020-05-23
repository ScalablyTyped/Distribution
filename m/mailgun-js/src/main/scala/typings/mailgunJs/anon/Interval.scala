package typings.mailgunJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interval extends js.Object {
  var interval: Double
  var times: Double
}

object Interval {
  @scala.inline
  def apply(interval: Double, times: Double): Interval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
}

