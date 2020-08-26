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
@js.native
trait Schema extends js.Object {
  /**
    * The fields which describe the data model columns.
    *
    * Primary key fields are rendered as row header columns.
    */
  val fields: js.Array[Field] = js.native
  /**
    * The values to treat as "missing" data.
    *
    * Missing values are automatically converted to `null`.
    */
  val missingValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * The field names which act as primary keys.
    *
    * Primary key fields are rendered as row header columns.
    */
  val primaryKey: js.UndefOr[String | js.Array[String]] = js.native
}

object Schema {
  @scala.inline
  def apply(fields: js.Array[Field]): Schema = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  @scala.inline
  implicit class SchemaOps[Self <: Schema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setMissingValuesVarargs(value: String*): Self = this.set("missingValues", js.Array(value :_*))
    @scala.inline
    def setMissingValues(value: js.Array[String]): Self = this.set("missingValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissingValues: Self = this.set("missingValues", js.undefined)
    @scala.inline
    def setPrimaryKeyVarargs(value: String*): Self = this.set("primaryKey", js.Array(value :_*))
    @scala.inline
    def setPrimaryKey(value: String | js.Array[String]): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
  }
  
}

