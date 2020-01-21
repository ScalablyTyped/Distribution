package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/transitions.Easing> */
@js.native
trait PartialEasing extends js.Object {
  var easeIn: js.UndefOr[String] = js.native
  var easeInOut: js.UndefOr[String] = js.native
  var easeOut: js.UndefOr[String] = js.native
  var sharp: js.UndefOr[String] = js.native
}

object PartialEasing {
  @scala.inline
  def apply(easeIn: String = null, easeInOut: String = null, easeOut: String = null, sharp: String = null): PartialEasing = {
    val __obj = js.Dynamic.literal()
    if (easeIn != null) __obj.updateDynamic("easeIn")(easeIn.asInstanceOf[js.Any])
    if (easeInOut != null) __obj.updateDynamic("easeInOut")(easeInOut.asInstanceOf[js.Any])
    if (easeOut != null) __obj.updateDynamic("easeOut")(easeOut.asInstanceOf[js.Any])
    if (sharp != null) __obj.updateDynamic("sharp")(sharp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialEasing]
  }
}

