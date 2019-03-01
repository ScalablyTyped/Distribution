package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptOptions extends js.Object {
  var messages: js.UndefOr[PromptMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object PromptOptions {
  @scala.inline
  def apply(messages: PromptMessages = null, name: java.lang.String = null): PromptOptions = {
    val __obj = js.Dynamic.literal()
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[PromptOptions]
  }
}

