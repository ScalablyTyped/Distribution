package typings.heremaps.H.Map_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * It defines the number of lower and higher zoom levels, where cached content of the base map is rendered while content of the current zoom level is still loading.
  * Example: if range was set to {lower: 3, higher: 2} and current level is 10 then rendering engine will try to display cached tiles from lower zoom levels 7, 8, 9 and higher levels 11 and 12.
  * @property lower {number} - The number of lower zoom levels to take into account, default is 0
  * @property higher {number} - The number of higher zoom levels to take into account, default is 0
  */
@js.native
trait BackgroundRange extends js.Object {
  var higher: Double = js.native
  var lower: Double = js.native
}

object BackgroundRange {
  @scala.inline
  def apply(higher: Double, lower: Double): BackgroundRange = {
    val __obj = js.Dynamic.literal(higher = higher.asInstanceOf[js.Any], lower = lower.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundRange]
  }
  @scala.inline
  implicit class BackgroundRangeOps[Self <: BackgroundRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHigher(value: Double): Self = this.set("higher", value.asInstanceOf[js.Any])
    @scala.inline
    def setLower(value: Double): Self = this.set("lower", value.asInstanceOf[js.Any])
  }
  
}

