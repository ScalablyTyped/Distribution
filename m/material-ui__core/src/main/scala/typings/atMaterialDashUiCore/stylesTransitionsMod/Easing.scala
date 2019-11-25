package typings.atMaterialDashUiCore.stylesTransitionsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Easing extends js.Object {
  var easeIn: String
  var easeInOut: String
  var easeOut: String
  var sharp: String
}

object Easing {
  @scala.inline
  def apply(easeIn: String, easeInOut: String, easeOut: String, sharp: String): Easing = {
    val __obj = js.Dynamic.literal(easeIn = easeIn.asInstanceOf[js.Any], easeInOut = easeInOut.asInstanceOf[js.Any], easeOut = easeOut.asInstanceOf[js.Any], sharp = sharp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Easing]
  }
}

@JSImport("@material-ui/core/styles/transitions", "easing")
@js.native
object easing extends TopLevel[Easing]

