package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogMessages extends js.Object {
  var close: js.UndefOr[String] = js.undefined
  var promptInput: js.UndefOr[String] = js.undefined
}

object DialogMessages {
  @scala.inline
  def apply(close: String = null, promptInput: String = null): DialogMessages = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (promptInput != null) __obj.updateDynamic("promptInput")(promptInput)
    __obj.asInstanceOf[DialogMessages]
  }
}

