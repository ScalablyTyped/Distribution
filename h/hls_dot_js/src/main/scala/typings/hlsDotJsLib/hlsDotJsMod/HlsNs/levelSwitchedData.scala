package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait levelSwitchedData extends js.Object {
  var level: scala.Double
}

object levelSwitchedData {
  @scala.inline
  def apply(level: scala.Double): levelSwitchedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[levelSwitchedData]
  }
}

