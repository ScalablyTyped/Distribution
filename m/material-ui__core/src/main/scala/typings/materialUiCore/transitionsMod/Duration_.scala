package typings.materialUiCore.transitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration_ extends js.Object {
  var complex: Double = js.native
  var enteringScreen: Double = js.native
  var leavingScreen: Double = js.native
  var short: Double = js.native
  var shorter: Double = js.native
  var shortest: Double = js.native
  var standard: Double = js.native
}

object Duration_ {
  @scala.inline
  def apply(
    complex: Double,
    enteringScreen: Double,
    leavingScreen: Double,
    short: Double,
    shorter: Double,
    shortest: Double,
    standard: Double
  ): Duration_ = {
    val __obj = js.Dynamic.literal(complex = complex.asInstanceOf[js.Any], enteringScreen = enteringScreen.asInstanceOf[js.Any], leavingScreen = leavingScreen.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], shorter = shorter.asInstanceOf[js.Any], shortest = shortest.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Duration_]
  }
}

