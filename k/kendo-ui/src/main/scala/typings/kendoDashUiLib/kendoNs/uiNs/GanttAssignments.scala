package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttAssignments extends js.Object {
  var dataResourceIdField: js.UndefOr[java.lang.String] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var dataTaskIdField: js.UndefOr[java.lang.String] = js.undefined
  var dataValueField: js.UndefOr[java.lang.String] = js.undefined
}

object GanttAssignments {
  @scala.inline
  def apply(
    dataResourceIdField: java.lang.String = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    dataTaskIdField: java.lang.String = null,
    dataValueField: java.lang.String = null
  ): GanttAssignments = {
    val __obj = js.Dynamic.literal()
    if (dataResourceIdField != null) __obj.updateDynamic("dataResourceIdField")(dataResourceIdField)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataTaskIdField != null) __obj.updateDynamic("dataTaskIdField")(dataTaskIdField)
    if (dataValueField != null) __obj.updateDynamic("dataValueField")(dataValueField)
    __obj.asInstanceOf[GanttAssignments]
  }
}

