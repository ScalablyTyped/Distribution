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
trait BackgroundRange extends js.Object {
  var higher: Double
  var lower: Double
}

object BackgroundRange {
  @scala.inline
  def apply(higher: Double, lower: Double): BackgroundRange = {
    val __obj = js.Dynamic.literal(higher = higher.asInstanceOf[js.Any], lower = lower.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundRange]
  }
}

