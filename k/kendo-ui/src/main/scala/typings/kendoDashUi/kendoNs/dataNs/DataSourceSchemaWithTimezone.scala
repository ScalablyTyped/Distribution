package typings.kendoDashUi.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSchemaWithTimezone extends DataSourceSchema {
  var timezone: js.UndefOr[String] = js.undefined
}

object DataSourceSchemaWithTimezone {
  @scala.inline
  def apply(
    aggregates: js.Any = null,
    data: js.Any = null,
    errors: js.Any = null,
    groups: js.Any = null,
    model: js.Any = null,
    parse: js.Function = null,
    timezone: String = null,
    total: js.Any = null,
    `type`: String = null
  ): DataSourceSchemaWithTimezone = {
    val __obj = js.Dynamic.literal()
    if (aggregates != null) __obj.updateDynamic("aggregates")(aggregates)
    if (data != null) __obj.updateDynamic("data")(data)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (model != null) __obj.updateDynamic("model")(model)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (total != null) __obj.updateDynamic("total")(total)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DataSourceSchemaWithTimezone]
  }
}

