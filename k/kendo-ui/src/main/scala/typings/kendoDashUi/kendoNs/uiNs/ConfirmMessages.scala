package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmMessages extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var okText: js.UndefOr[String] = js.undefined
}

object ConfirmMessages {
  @scala.inline
  def apply(cancel: String = null, okText: String = null): ConfirmMessages = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (okText != null) __obj.updateDynamic("okText")(okText)
    __obj.asInstanceOf[ConfirmMessages]
  }
}

