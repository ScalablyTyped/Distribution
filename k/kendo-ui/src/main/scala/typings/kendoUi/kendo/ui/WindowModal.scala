package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowModal extends js.Object {
  var preventScroll: js.UndefOr[Boolean] = js.undefined
}

object WindowModal {
  @scala.inline
  def apply(preventScroll: js.UndefOr[Boolean] = js.undefined): WindowModal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preventScroll)) __obj.updateDynamic("preventScroll")(preventScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowModal]
  }
}

