package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttAssignments extends js.Object {
  var dataResourceIdField: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var dataTaskIdField: js.UndefOr[String] = js.undefined
  var dataValueField: js.UndefOr[String] = js.undefined
}

object GanttAssignments {
  @scala.inline
  def apply(
    dataResourceIdField: String = null,
    dataSource: js.Any | DataSource = null,
    dataTaskIdField: String = null,
    dataValueField: String = null
  ): GanttAssignments = {
    val __obj = js.Dynamic.literal()
    if (dataResourceIdField != null) __obj.updateDynamic("dataResourceIdField")(dataResourceIdField)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataTaskIdField != null) __obj.updateDynamic("dataTaskIdField")(dataTaskIdField)
    if (dataValueField != null) __obj.updateDynamic("dataValueField")(dataValueField)
    __obj.asInstanceOf[GanttAssignments]
  }
}

