package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatRenderSuggestedActionsSuggestedActions extends js.Object {
  var title: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ChatRenderSuggestedActionsSuggestedActions {
  @scala.inline
  def apply(title: java.lang.String = null, value: java.lang.String = null): ChatRenderSuggestedActionsSuggestedActions = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChatRenderSuggestedActionsSuggestedActions]
  }
}

