package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientColorStopObject extends js.Object {
  var `0`: Double
  var `1`: ColorString
}

object GradientColorStopObject {
  @scala.inline
  def apply(`0`: Double, `1`: ColorString): GradientColorStopObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientColorStopObject]
  }
}

