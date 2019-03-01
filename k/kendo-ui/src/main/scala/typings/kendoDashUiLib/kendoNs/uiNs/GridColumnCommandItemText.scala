package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnCommandItemText extends js.Object {
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  var edit: js.UndefOr[java.lang.String] = js.undefined
  var update: js.UndefOr[java.lang.String] = js.undefined
}

object GridColumnCommandItemText {
  @scala.inline
  def apply(cancel: java.lang.String = null, edit: java.lang.String = null, update: java.lang.String = null): GridColumnCommandItemText = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (edit != null) __obj.updateDynamic("edit")(edit)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[GridColumnCommandItemText]
  }
}

