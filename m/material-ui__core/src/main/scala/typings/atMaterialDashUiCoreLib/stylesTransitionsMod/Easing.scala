package typings
package atMaterialDashUiCoreLib.stylesTransitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Easing extends js.Object {
  var easeIn: java.lang.String
  var easeInOut: java.lang.String
  var easeOut: java.lang.String
  var sharp: java.lang.String
}

object Easing {
  @scala.inline
  def apply(
    easeIn: java.lang.String,
    easeInOut: java.lang.String,
    easeOut: java.lang.String,
    sharp: java.lang.String
  ): Easing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("easeIn")(easeIn)
    __obj.updateDynamic("easeInOut")(easeInOut)
    __obj.updateDynamic("easeOut")(easeOut)
    __obj.updateDynamic("sharp")(sharp)
    __obj.asInstanceOf[Easing]
  }
}

