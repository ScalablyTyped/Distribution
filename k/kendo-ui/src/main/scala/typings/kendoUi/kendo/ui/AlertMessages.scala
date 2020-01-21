package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertMessages extends js.Object {
  var okText: js.UndefOr[String] = js.undefined
}

object AlertMessages {
  @scala.inline
  def apply(okText: String = null): AlertMessages = {
    val __obj = js.Dynamic.literal()
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertMessages]
  }
}

