package typings.leafletDashDraw.leafletMod.Localization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tooltip extends js.Object {
  var cont: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
}

object Tooltip {
  @scala.inline
  def apply(cont: String = null, end: String = null, start: String = null): Tooltip = {
    val __obj = js.Dynamic.literal()
    if (cont != null) __obj.updateDynamic("cont")(cont.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
}

