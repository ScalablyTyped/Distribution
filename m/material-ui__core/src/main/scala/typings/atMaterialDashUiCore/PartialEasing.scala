package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/transitions.Easing> */
trait PartialEasing extends js.Object {
  var easeIn: js.UndefOr[String] = js.undefined
  var easeInOut: js.UndefOr[String] = js.undefined
  var easeOut: js.UndefOr[String] = js.undefined
  var sharp: js.UndefOr[String] = js.undefined
}

object PartialEasing {
  @scala.inline
  def apply(easeIn: String = null, easeInOut: String = null, easeOut: String = null, sharp: String = null): PartialEasing = {
    val __obj = js.Dynamic.literal()
    if (easeIn != null) __obj.updateDynamic("easeIn")(easeIn)
    if (easeInOut != null) __obj.updateDynamic("easeInOut")(easeInOut)
    if (easeOut != null) __obj.updateDynamic("easeOut")(easeOut)
    if (sharp != null) __obj.updateDynamic("sharp")(sharp)
    __obj.asInstanceOf[PartialEasing]
  }
}

