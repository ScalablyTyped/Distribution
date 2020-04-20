package typings.humanDate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeTimeReturns extends js.Object {
  var days: Double
  var hours: Double
  var past: Boolean
  var seconds: Double
  var years: Double
}

object RelativeTimeReturns {
  @scala.inline
  def apply(days: Double, hours: Double, past: Boolean, seconds: Double, years: Double): RelativeTimeReturns = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeReturns]
  }
}

