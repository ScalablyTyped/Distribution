package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownTreeMessages extends js.Object {
  var clear: js.UndefOr[java.lang.String] = js.undefined
  var deleteTag: js.UndefOr[java.lang.String] = js.undefined
  var singleTag: js.UndefOr[java.lang.String] = js.undefined
}

object DropDownTreeMessages {
  @scala.inline
  def apply(
    clear: java.lang.String = null,
    deleteTag: java.lang.String = null,
    singleTag: java.lang.String = null
  ): DropDownTreeMessages = {
    val __obj = js.Dynamic.literal()
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (deleteTag != null) __obj.updateDynamic("deleteTag")(deleteTag)
    if (singleTag != null) __obj.updateDynamic("singleTag")(singleTag)
    __obj.asInstanceOf[DropDownTreeMessages]
  }
}

