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
  def apply(field: SchemaFieldReference = null, op: String = null, value: SchemaValue = null): SchemaFieldFilter = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (op != null) __obj.updateDynamic("op")(op.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldFilter]
  }
}

