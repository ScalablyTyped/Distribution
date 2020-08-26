package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the properties of a Table row.
  */
@js.native
trait SchemaUpdateTableRowPropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `tableRowProperties` is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    * For example to update the minimum row height, set `fields` to
    * `&quot;min_row_height&quot;`.  If &#39;&quot;min_row_height&quot;&#39; is
    * included in the field mask but the property is left unset, the minimum
    * row height will default to 0.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The list of zero-based indices specifying which rows to update. If no
    * indices are provided, all rows in the table will be updated.
    */
  var rowIndices: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The table row properties to update.
    */
  var tableRowProperties: js.UndefOr[SchemaTableRowProperties] = js.native
}

object SchemaUpdateTableRowPropertiesRequest {
  @scala.inline
  def apply(): SchemaUpdateTableRowPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateTableRowPropertiesRequest]
  }
  @scala.inline
  implicit class SchemaUpdateTableRowPropertiesRequestOps[Self <: SchemaUpdateTableRowPropertiesRequest] (val x: Self) extends AnyVal {
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
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setRowIndicesVarargs(value: Double*): Self = this.set("rowIndices", js.Array(value :_*))
    @scala.inline
    def setRowIndices(value: js.Array[Double]): Self = this.set("rowIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndices: Self = this.set("rowIndices", js.undefined)
    @scala.inline
    def setTableRowProperties(value: SchemaTableRowProperties): Self = this.set("tableRowProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableRowProperties: Self = this.set("tableRowProperties", js.undefined)
  }
  
}

