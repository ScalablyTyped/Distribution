package typings.atMaterialDashUiCore.stylesTransitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var complex: Double
  var enteringScreen: Double
  var leavingScreen: Double
  var short: Double
  var shorter: Double
  var shortest: Double
  var standard: Double
}

object Duration {
  @scala.inline
  def apply(
    complex: Double,
    enteringScreen: Double,
    leavingScreen: Double,
    short: Double,
    shorter: Double,
    shortest: Double,
    standard: Double
  ): Duration = {
    val __obj = js.Dynamic.literal(complex = complex, enteringScreen = enteringScreen, leavingScreen = leavingScreen, short = short, shorter = shorter, shortest = shortest, standard = standard)
  
    __obj.asInstanceOf[Duration]
  }
}

