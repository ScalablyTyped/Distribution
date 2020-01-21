package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a filter view being duplicated.
  */
@js.native
trait SchemaDuplicateFilterViewResponse extends js.Object {
  /**
    * The newly created filter.
    */
  var filter: js.UndefOr[SchemaFilterView] = js.native
}

object SchemaDuplicateFilterViewResponse {
  @scala.inline
  def apply(filter: SchemaFilterView = null): SchemaDuplicateFilterViewResponse = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDuplicateFilterViewResponse]
  }
}

