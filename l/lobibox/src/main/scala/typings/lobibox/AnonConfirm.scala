package typings.lobibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfirm extends js.Object {
  var confirm: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var info: js.UndefOr[String] = js.undefined
  var progress: js.UndefOr[String] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var success: js.UndefOr[String] = js.undefined
  var warning: js.UndefOr[String] = js.undefined
  var window: js.UndefOr[String] = js.undefined
}

object AnonConfirm {
  @scala.inline
  def apply(
    confirm: String = null,
    default: String = null,
    error: String = null,
    info: String = null,
    progress: String = null,
    prompt: String = null,
    success: String = null,
    warning: String = null,
    window: String = null
  ): AnonConfirm = {
    val __obj = js.Dynamic.literal()
    if (confirm != null) __obj.updateDynamic("confirm")(confirm.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfirm]
  }
}

