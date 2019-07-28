package typings.kendoDashUi.kendoNs.dataNs

import typings.kendoDashUi.TypeofClassModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSchemaWithConstructorModel extends DataSourceSchema {
  @JSName("model")
  var model_DataSourceSchemaWithConstructorModel: js.UndefOr[TypeofClassModel] = js.undefined
}

object DataSourceSchemaWithConstructorModel {
  @scala.inline
  def apply(
    aggregates: js.Any = null,
    data: js.Any = null,
    errors: js.Any = null,
    groups: js.Any = null,
    model: TypeofClassModel = null,
    parse: js.Function = null,
    total: js.Any = null,
    `type`: String = null
  ): DataSourceSchemaWithConstructorModel = {
    val __obj = js.Dynamic.literal()
    if (aggregates != null) __obj.updateDynamic("aggregates")(aggregates)
    if (data != null) __obj.updateDynamic("data")(data)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (model != null) __obj.updateDynamic("model")(model)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (total != null) __obj.updateDynamic("total")(total)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DataSourceSchemaWithConstructorModel]
  }
}

