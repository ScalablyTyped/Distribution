package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerResource extends js.Object {
  var dataColorField: js.UndefOr[java.lang.String] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var dataTextField: js.UndefOr[java.lang.String] = js.undefined
  var dataValueField: js.UndefOr[java.lang.String] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var valuePrimitive: js.UndefOr[scala.Boolean] = js.undefined
}

object SchedulerResource {
  @scala.inline
  def apply(
    dataColorField: java.lang.String = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    dataTextField: java.lang.String = null,
    dataValueField: java.lang.String = null,
    field: java.lang.String = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    title: java.lang.String = null,
    valuePrimitive: js.UndefOr[scala.Boolean] = js.undefined
  ): SchedulerResource = {
    val __obj = js.Dynamic.literal()
    if (dataColorField != null) __obj.updateDynamic("dataColorField")(dataColorField)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField)
    if (dataValueField != null) __obj.updateDynamic("dataValueField")(dataValueField)
    if (field != null) __obj.updateDynamic("field")(field)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (name != null) __obj.updateDynamic("name")(name)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(valuePrimitive)) __obj.updateDynamic("valuePrimitive")(valuePrimitive)
    __obj.asInstanceOf[SchedulerResource]
  }
}

