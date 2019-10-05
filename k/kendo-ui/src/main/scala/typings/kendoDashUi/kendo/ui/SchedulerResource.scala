package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerResource extends js.Object {
  var dataColorField: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var dataTextField: js.UndefOr[String] = js.undefined
  var dataValueField: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var valuePrimitive: js.UndefOr[Boolean] = js.undefined
}

object SchedulerResource {
  @scala.inline
  def apply(
    dataColorField: String = null,
    dataSource: js.Any | DataSource = null,
    dataTextField: String = null,
    dataValueField: String = null,
    field: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    title: String = null,
    valuePrimitive: js.UndefOr[Boolean] = js.undefined
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

