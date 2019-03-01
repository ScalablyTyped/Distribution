package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridMessages extends js.Object {
  var columnFields: js.UndefOr[java.lang.String] = js.undefined
  var fieldMenu: js.UndefOr[PivotGridMessagesFieldMenu] = js.undefined
  var measureFields: js.UndefOr[java.lang.String] = js.undefined
  var rowFields: js.UndefOr[java.lang.String] = js.undefined
}

object PivotGridMessages {
  @scala.inline
  def apply(
    columnFields: java.lang.String = null,
    fieldMenu: PivotGridMessagesFieldMenu = null,
    measureFields: java.lang.String = null,
    rowFields: java.lang.String = null
  ): PivotGridMessages = {
    val __obj = js.Dynamic.literal()
    if (columnFields != null) __obj.updateDynamic("columnFields")(columnFields)
    if (fieldMenu != null) __obj.updateDynamic("fieldMenu")(fieldMenu)
    if (measureFields != null) __obj.updateDynamic("measureFields")(measureFields)
    if (rowFields != null) __obj.updateDynamic("rowFields")(rowFields)
    __obj.asInstanceOf[PivotGridMessages]
  }
}

