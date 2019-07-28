package typings.atMaterialDashUiCore.stylesTransitionsMod

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
    val __obj = js.Dynamic.literal(easeIn = easeIn, easeInOut = easeInOut, easeOut = easeOut, sharp = sharp)
  
    __obj.asInstanceOf[Easing]
  }
}

