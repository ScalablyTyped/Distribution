package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileManagerDataSourceSchema extends HierarchicalDataSourceSchema {
  @JSName("model")
  var model_FileManagerDataSourceSchema: js.UndefOr[FileManagerDataSourceSchemaModel] = js.undefined
}

object FileManagerDataSourceSchema {
  @scala.inline
  def apply(
    aggregates: js.Any = null,
    data: js.Any = null,
    errors: js.Any = null,
    groups: js.Any = null,
    model: FileManagerDataSourceSchemaModel = null,
    parse: js.Function = null,
    total: js.Any = null,
    `type`: String = null
  ): FileManagerDataSourceSchema = {
    val __obj = js.Dynamic.literal()
    if (aggregates != null) __obj.updateDynamic("aggregates")(aggregates.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileManagerDataSourceSchema]
  }
}

