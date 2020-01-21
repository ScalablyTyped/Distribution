package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Duplicates a particular filter view.
  */
@js.native
trait SchemaDuplicateFilterViewRequest extends js.Object {
  /**
    * The ID of the filter being duplicated.
    */
  var filterId: js.UndefOr[Double] = js.native
}

object SchemaDuplicateFilterViewRequest {
  @scala.inline
  def apply(filterId: Int | Double = null): SchemaDuplicateFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (filterId != null) __obj.updateDynamic("filterId")(filterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDuplicateFilterViewRequest]
  }
}

