package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownTreeMessages extends js.Object {
  var clear: js.UndefOr[String] = js.undefined
  var deleteTag: js.UndefOr[String] = js.undefined
  var singleTag: js.UndefOr[String] = js.undefined
}

object DropDownTreeMessages {
  @scala.inline
  def apply(clear: String = null, deleteTag: String = null, singleTag: String = null): DropDownTreeMessages = {
    val __obj = js.Dynamic.literal()
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (deleteTag != null) __obj.updateDynamic("deleteTag")(deleteTag.asInstanceOf[js.Any])
    if (singleTag != null) __obj.updateDynamic("singleTag")(singleTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownTreeMessages]
  }
}

