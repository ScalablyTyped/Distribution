package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the ListFilters method.
  */
@js.native
trait SchemaListFiltersResponse extends js.Object {
  /**
    * List of a user&#39;s filters.
    */
  var filter: js.UndefOr[js.Array[SchemaFilter]] = js.native
}

object SchemaListFiltersResponse {
  @scala.inline
  def apply(filter: js.Array[SchemaFilter] = null): SchemaListFiltersResponse = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListFiltersResponse]
  }
}

