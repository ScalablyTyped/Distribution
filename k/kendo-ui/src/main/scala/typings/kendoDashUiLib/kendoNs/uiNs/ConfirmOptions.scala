package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmOptions extends js.Object {
  var messages: js.UndefOr[ConfirmMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ConfirmOptions {
  @scala.inline
  def apply(messages: ConfirmMessages = null, name: java.lang.String = null): ConfirmOptions = {
    val __obj = js.Dynamic.literal()
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ConfirmOptions]
  }
}

