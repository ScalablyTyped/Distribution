package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxDraggable extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var hint: js.UndefOr[js.Function | String | JQuery] = js.undefined
  var placeholder: js.UndefOr[js.Function | String | JQuery] = js.undefined
}

object ListBoxDraggable {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    hint: js.Function | String | JQuery = null,
    placeholder: js.Function | String | JQuery = null
  ): ListBoxDraggable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBoxDraggable]
  }
}

