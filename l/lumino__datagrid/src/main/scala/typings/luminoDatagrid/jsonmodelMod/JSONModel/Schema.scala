package typings.luminoDatagrid.jsonmodelMod.JSONModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object when specifies the schema for a data model.
  *
  * #### Notes
  * This is based on the JSON Table Schema specification:
  * https://specs.frictionlessdata.io/table-schema/
  */
trait Schema extends js.Object {
  /**
    * The fields which describe the data model columns.
    *
    * Primary key fields are rendered as row header columns.
    */
  val fields: js.Array[Field]
  /**
    * The values to treat as "missing" data.
    *
    * Missing values are automatically converted to `null`.
    */
  val missingValues: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The field names which act as primary keys.
    *
    * Primary key fields are rendered as row header columns.
    */
  val primaryKey: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Schema {
  @scala.inline
  def apply(
    fields: js.Array[Field],
    missingValues: js.Array[String] = null,
    primaryKey: String | js.Array[String] = null
  ): Schema = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    if (missingValues != null) __obj.updateDynamic("missingValues")(missingValues.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
}

