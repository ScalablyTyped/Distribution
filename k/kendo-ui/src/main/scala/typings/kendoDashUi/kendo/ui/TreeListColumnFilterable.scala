package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListColumnFilterable extends js.Object {
  var ui: js.UndefOr[String | js.Function] = js.undefined
}

object TreeListColumnFilterable {
  @scala.inline
  def apply(ui: String | js.Function = null): TreeListColumnFilterable = {
    val __obj = js.Dynamic.literal()
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListColumnFilterable]
  }
}

