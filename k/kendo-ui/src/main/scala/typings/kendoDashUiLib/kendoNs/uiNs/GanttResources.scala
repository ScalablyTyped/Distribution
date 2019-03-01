package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttResources extends js.Object {
  var dataColorField: js.UndefOr[java.lang.String] = js.undefined
  var dataFormatField: js.UndefOr[java.lang.String] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var dataTextField: js.UndefOr[java.lang.String] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
}

object GanttResources {
  @scala.inline
  def apply(
    dataColorField: java.lang.String = null,
    dataFormatField: java.lang.String = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    dataTextField: java.lang.String = null,
    field: java.lang.String = null
  ): GanttResources = {
    val __obj = js.Dynamic.literal()
    if (dataColorField != null) __obj.updateDynamic("dataColorField")(dataColorField)
    if (dataFormatField != null) __obj.updateDynamic("dataFormatField")(dataFormatField)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[GanttResources]
  }
}

