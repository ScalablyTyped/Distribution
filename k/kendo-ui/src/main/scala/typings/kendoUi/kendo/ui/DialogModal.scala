package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogModal extends js.Object {
  var preventScroll: js.UndefOr[String] = js.undefined
}

object DialogModal {
  @scala.inline
  def apply(preventScroll: String = null): DialogModal = {
    val __obj = js.Dynamic.literal()
    if (preventScroll != null) __obj.updateDynamic("preventScroll")(preventScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogModal]
  }
}

