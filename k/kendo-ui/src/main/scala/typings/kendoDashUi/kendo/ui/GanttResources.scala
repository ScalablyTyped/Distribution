package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttResources extends js.Object {
  var dataColorField: js.UndefOr[String] = js.undefined
  var dataFormatField: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var dataTextField: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
}

object GanttResources {
  @scala.inline
  def apply(
    dataColorField: String = null,
    dataFormatField: String = null,
    dataSource: js.Any | DataSource = null,
    dataTextField: String = null,
    field: String = null
  ): GanttResources = {
    val __obj = js.Dynamic.literal()
    if (dataColorField != null) __obj.updateDynamic("dataColorField")(dataColorField.asInstanceOf[js.Any])
    if (dataFormatField != null) __obj.updateDynamic("dataFormatField")(dataFormatField.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttResources]
  }
}

