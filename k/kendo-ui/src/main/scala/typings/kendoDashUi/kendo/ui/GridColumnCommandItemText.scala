package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnCommandItemText extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var edit: js.UndefOr[String] = js.undefined
  var update: js.UndefOr[String] = js.undefined
}

object GridColumnCommandItemText {
  @scala.inline
  def apply(cancel: String = null, edit: String = null, update: String = null): GridColumnCommandItemText = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(edit.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnCommandItemText]
  }
}

