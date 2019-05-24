package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/transitions.Easing> */
trait PartialEasing extends js.Object {
  var easeIn: js.UndefOr[java.lang.String] = js.undefined
  var easeInOut: js.UndefOr[java.lang.String] = js.undefined
  var easeOut: js.UndefOr[java.lang.String] = js.undefined
  var sharp: js.UndefOr[java.lang.String] = js.undefined
}

object PartialEasing {
  @scala.inline
  def apply(
    easeIn: java.lang.String = null,
    easeInOut: java.lang.String = null,
    easeOut: java.lang.String = null,
    sharp: java.lang.String = null
  ): PartialEasing = {
    val __obj = js.Dynamic.literal()
    if (easeIn != null) __obj.updateDynamic("easeIn")(easeIn)
    if (easeInOut != null) __obj.updateDynamic("easeInOut")(easeInOut)
    if (easeOut != null) __obj.updateDynamic("easeOut")(easeOut)
    if (sharp != null) __obj.updateDynamic("sharp")(sharp)
    __obj.asInstanceOf[PartialEasing]
  }
}

