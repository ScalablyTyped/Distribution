package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProximityData extends js.Object {
  var cm: Double
  var in: Double
}

object ProximityData {
  @scala.inline
  def apply(cm: Double, in: Double): ProximityData = {
    val __obj = js.Dynamic.literal(cm = cm.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProximityData]
  }
}

