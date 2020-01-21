package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a filter view.
  */
@js.native
trait SchemaAddFilterViewResponse extends js.Object {
  /**
    * The newly added filter view.
    */
  var filter: js.UndefOr[SchemaFilterView] = js.native
}

object SchemaAddFilterViewResponse {
  @scala.inline
  def apply(filter: SchemaFilterView = null): SchemaAddFilterViewResponse = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddFilterViewResponse]
  }
}

