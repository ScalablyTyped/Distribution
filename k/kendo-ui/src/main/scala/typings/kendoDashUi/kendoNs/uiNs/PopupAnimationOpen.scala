package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupAnimationOpen extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var effects: js.UndefOr[String] = js.undefined
}

object PopupAnimationOpen {
  @scala.inline
  def apply(duration: Int | Double = null, effects: String = null): PopupAnimationOpen = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (effects != null) __obj.updateDynamic("effects")(effects)
    __obj.asInstanceOf[PopupAnimationOpen]
  }
}

