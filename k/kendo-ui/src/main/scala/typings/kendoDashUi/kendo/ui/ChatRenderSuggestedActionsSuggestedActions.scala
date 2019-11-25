package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatRenderSuggestedActionsSuggestedActions extends js.Object {
  var title: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object ChatRenderSuggestedActionsSuggestedActions {
  @scala.inline
  def apply(title: String = null, value: String = null): ChatRenderSuggestedActionsSuggestedActions = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRenderSuggestedActionsSuggestedActions]
  }
}

