package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatMessages extends js.Object {
  var placeholder: js.UndefOr[String] = js.undefined
  var sendButton: js.UndefOr[String] = js.undefined
  var toggleButton: js.UndefOr[String] = js.undefined
}

object ChatMessages {
  @scala.inline
  def apply(placeholder: String = null, sendButton: String = null, toggleButton: String = null): ChatMessages = {
    val __obj = js.Dynamic.literal()
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (sendButton != null) __obj.updateDynamic("sendButton")(sendButton.asInstanceOf[js.Any])
    if (toggleButton != null) __obj.updateDynamic("toggleButton")(toggleButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessages]
  }
}

