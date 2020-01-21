package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets the basic filter associated with a sheet.
  */
@js.native
trait SchemaSetBasicFilterRequest extends js.Object {
  /**
    * The filter to set.
    */
  var filter: js.UndefOr[SchemaBasicFilter] = js.native
}

object SchemaSetBasicFilterRequest {
  @scala.inline
  def apply(filter: SchemaBasicFilter = null): SchemaSetBasicFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSetBasicFilterRequest]
  }
}

