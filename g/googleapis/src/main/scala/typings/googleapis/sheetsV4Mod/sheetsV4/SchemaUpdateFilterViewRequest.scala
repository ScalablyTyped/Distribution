package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates properties of the filter view.
  */
@js.native
trait SchemaUpdateFilterViewRequest extends js.Object {
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root `filter` is implied and should not be specified. A single
    * `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * The new properties of the filter view.
    */
  var filter: js.UndefOr[SchemaFilterView] = js.native
}

object SchemaUpdateFilterViewRequest {
  @scala.inline
  def apply(fields: String = null, filter: SchemaFilterView = null): SchemaUpdateFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateFilterViewRequest]
  }
}

