package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds a filter view.
  */
@js.native
trait SchemaAddFilterViewRequest extends js.Object {
  /**
    * The filter to add. The filterViewId field is optional; if one is not set,
    * an id will be randomly generated. (It is an error to specify the ID of a
    * filter that already exists.)
    */
  var filter: js.UndefOr[SchemaFilterView] = js.native
}

object SchemaAddFilterViewRequest {
  @scala.inline
  def apply(filter: SchemaFilterView = null): SchemaAddFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddFilterViewRequest]
  }
}

