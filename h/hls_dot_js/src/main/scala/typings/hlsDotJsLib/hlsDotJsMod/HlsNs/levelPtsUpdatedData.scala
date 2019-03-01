package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait levelPtsUpdatedData extends js.Object {
  var details: LevelDetails
  var drift: scala.Double
  var level: scala.Double
}

object levelPtsUpdatedData {
  @scala.inline
  def apply(details: LevelDetails, drift: scala.Double, level: scala.Double): levelPtsUpdatedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("details")(details)
    __obj.updateDynamic("drift")(drift)
    __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[levelPtsUpdatedData]
  }
}

