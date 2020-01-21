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
  def apply(keySet: SchemaKeySet = null, table: String = null): SchemaDelete = {
    val __obj = js.Dynamic.literal()
    if (keySet != null) __obj.updateDynamic("keySet")(keySet.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDelete]
  }
}

