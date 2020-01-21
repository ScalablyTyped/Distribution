package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptMessages extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var okText: js.UndefOr[String] = js.undefined
}

object PromptMessages {
  @scala.inline
  def apply(cancel: String = null, okText: String = null): PromptMessages = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptMessages]
  }
}

