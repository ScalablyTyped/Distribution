package typings.atMaterialDashUiCore.stylesTransitionsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Easing extends js.Object {
  var easeIn: String = js.native
  var easeInOut: String = js.native
  var easeOut: String = js.native
  var sharp: String = js.native
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

