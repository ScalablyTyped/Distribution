package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlatColorPickerMessages extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[java.lang.String] = js.undefined
  var cancel: js.UndefOr[java.lang.String] = js.undefined
}

object FlatColorPickerMessages {
  @scala.inline
  def apply(apply: java.lang.String = null, cancel: java.lang.String = null): FlatColorPickerMessages = {
    val __obj = js.Dynamic.literal()
    if (apply != null) __obj.updateDynamic("apply")(apply)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    __obj.asInstanceOf[FlatColorPickerMessages]
  }
}

