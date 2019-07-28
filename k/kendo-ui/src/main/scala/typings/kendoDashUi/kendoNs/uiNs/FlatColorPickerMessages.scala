package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlatColorPickerMessages extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[String] = js.undefined
  var cancel: js.UndefOr[String] = js.undefined
}

object FlatColorPickerMessages {
  @scala.inline
  def apply(apply: String = null, cancel: String = null): FlatColorPickerMessages = {
    val __obj = js.Dynamic.literal()
    if (apply != null) __obj.updateDynamic("apply")(apply)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    __obj.asInstanceOf[FlatColorPickerMessages]
  }
}

