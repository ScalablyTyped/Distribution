package typings
package atMaterialDashUiCoreLib.stylesTransitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var complex: scala.Double
  var enteringScreen: scala.Double
  var leavingScreen: scala.Double
  var short: scala.Double
  var shorter: scala.Double
  var shortest: scala.Double
  var standard: scala.Double
}

object Duration {
  @scala.inline
  def apply(
    complex: scala.Double,
    enteringScreen: scala.Double,
    leavingScreen: scala.Double,
    short: scala.Double,
    shorter: scala.Double,
    shortest: scala.Double,
    standard: scala.Double
  ): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complex")(complex)
    __obj.updateDynamic("enteringScreen")(enteringScreen)
    __obj.updateDynamic("leavingScreen")(leavingScreen)
    __obj.updateDynamic("short")(short)
    __obj.updateDynamic("shorter")(shorter)
    __obj.updateDynamic("shortest")(shortest)
    __obj.updateDynamic("standard")(standard)
    __obj.asInstanceOf[Duration]
  }
}

