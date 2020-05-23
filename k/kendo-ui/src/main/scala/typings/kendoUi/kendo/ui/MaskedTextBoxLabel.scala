package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskedTextBoxLabel extends js.Object {
  var content: js.UndefOr[String | js.Function] = js.undefined
  var floating: js.UndefOr[Boolean] = js.undefined
}

object MaskedTextBoxLabel {
  @scala.inline
  def apply(content: String | js.Function = null, floating: js.UndefOr[Boolean] = js.undefined): MaskedTextBoxLabel = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedTextBoxLabel]
  }
}

