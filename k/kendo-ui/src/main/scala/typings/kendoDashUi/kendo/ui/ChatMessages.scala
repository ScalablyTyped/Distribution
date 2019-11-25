package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatMessages extends js.Object {
  var placeholder: js.UndefOr[String] = js.undefined
}

object ChatMessages {
  @scala.inline
  def apply(placeholder: String = null): ChatMessages = {
    val __obj = js.Dynamic.literal()
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessages]
  }
}

