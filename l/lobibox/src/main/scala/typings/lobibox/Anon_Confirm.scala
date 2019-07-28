package typings.lobibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Confirm extends js.Object {
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

object Anon_Confirm {
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
  ): Anon_Confirm = {
    val __obj = js.Dynamic.literal()
    if (confirm != null) __obj.updateDynamic("confirm")(confirm)
    if (default != null) __obj.updateDynamic("default")(default)
    if (error != null) __obj.updateDynamic("error")(error)
    if (info != null) __obj.updateDynamic("info")(info)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (success != null) __obj.updateDynamic("success")(success)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[Anon_Confirm]
  }
}

