package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownListAnimationOpen extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var effects: js.UndefOr[String] = js.undefined
}

object DropDownListAnimationOpen {
  @scala.inline
  def apply(duration: Int | Double = null, effects: String = null): DropDownListAnimationOpen = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (effects != null) __obj.updateDynamic("effects")(effects)
    __obj.asInstanceOf[DropDownListAnimationOpen]
  }
}

