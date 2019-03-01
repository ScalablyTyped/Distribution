package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListColumnFilterable extends js.Object {
  var ui: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

object TreeListColumnFilterable {
  @scala.inline
  def apply(ui: java.lang.String | js.Function = null): TreeListColumnFilterable = {
    val __obj = js.Dynamic.literal()
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListColumnFilterable]
  }
}

