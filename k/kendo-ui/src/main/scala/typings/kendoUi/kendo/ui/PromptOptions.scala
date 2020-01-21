package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptOptions extends js.Object {
  var messages: js.UndefOr[PromptMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object PromptOptions {
  @scala.inline
  def apply(messages: PromptMessages = null, name: String = null): PromptOptions = {
    val __obj = js.Dynamic.literal()
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
}

