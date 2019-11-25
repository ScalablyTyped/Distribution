package typings.atMaterialDashUiCore.stylesTransitionsMod

import org.scalablytyped.runtime.TopLevel
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
    val __obj = js.Dynamic.literal(complex = complex.asInstanceOf[js.Any], enteringScreen = enteringScreen.asInstanceOf[js.Any], leavingScreen = leavingScreen.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], shorter = shorter.asInstanceOf[js.Any], shortest = shortest.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Duration]
  }
}

@JSImport("@material-ui/core/styles/transitions", "duration")
@js.native
object duration extends TopLevel[Duration]

