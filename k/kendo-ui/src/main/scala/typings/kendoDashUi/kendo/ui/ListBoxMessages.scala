package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxMessages extends js.Object {
  var tools: js.UndefOr[ListBoxMessagesTools] = js.undefined
}

object ListBoxMessages {
  @scala.inline
  def apply(tools: ListBoxMessagesTools = null): ListBoxMessages = {
    val __obj = js.Dynamic.literal()
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBoxMessages]
  }
}

