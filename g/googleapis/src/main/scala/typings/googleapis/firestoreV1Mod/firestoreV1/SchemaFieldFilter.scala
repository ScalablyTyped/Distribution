package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter on a specific field.
  */
@js.native
trait SchemaFieldFilter extends js.Object {
  /**
    * The field to filter by.
    */
  var field: js.UndefOr[SchemaFieldReference] = js.native
  /**
    * The operator to filter by.
    */
  var op: js.UndefOr[String] = js.native
  /**
    * The value to compare to.
    */
  var value: js.UndefOr[SchemaValue] = js.native
}

object SchemaFieldFilter {
  @scala.inline
  def apply(): SchemaFieldFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldFilter]
  }
  @scala.inline
  implicit class SchemaFieldFilterOps[Self <: SchemaFieldFilter] (val x: Self) extends AnyVal {
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
    def setField(value: SchemaFieldReference): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setOp(value: String): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOp: Self = this.set("op", js.undefined)
    @scala.inline
    def setValue(value: SchemaValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

