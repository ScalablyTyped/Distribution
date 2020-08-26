package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Arguments to delete operations.
  */
@js.native
trait SchemaDelete extends js.Object {
  /**
    * Required. The primary keys of the rows within table to delete. Delete is
    * idempotent. The transaction will succeed even if some or all rows do not
    * exist.
    */
  var keySet: js.UndefOr[SchemaKeySet] = js.native
  /**
    * Required. The table whose rows will be deleted.
    */
  var table: js.UndefOr[String] = js.native
}

object SchemaDelete {
  @scala.inline
  def apply(): SchemaDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDelete]
  }
  @scala.inline
  implicit class SchemaDeleteOps[Self <: SchemaDelete] (val x: Self) extends AnyVal {
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
    def setKeySet(value: SchemaKeySet): Self = this.set("keySet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeySet: Self = this.set("keySet", js.undefined)
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
  }
  
}

