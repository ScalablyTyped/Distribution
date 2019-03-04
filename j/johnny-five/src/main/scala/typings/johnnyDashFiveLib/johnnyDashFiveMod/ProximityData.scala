package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProximityData extends js.Object {
  var cm: scala.Double
  var in: scala.Double
}

object ProximityData {
  @scala.inline
  def apply(cm: scala.Double, in: scala.Double): ProximityData = {
    val __obj = js.Dynamic.literal(cm = cm, in = in)
  
    __obj.asInstanceOf[ProximityData]
  }
}

