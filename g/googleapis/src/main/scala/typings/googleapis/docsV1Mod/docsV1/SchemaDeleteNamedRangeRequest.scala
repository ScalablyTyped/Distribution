package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a NamedRange.
  */
@js.native
trait SchemaDeleteNamedRangeRequest extends js.Object {
  /**
    * The name of the range(s) to delete. All named ranges with the given name
    * will be deleted.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the named range to delete.
    */
  var namedRangeId: js.UndefOr[String] = js.native
}

object SchemaDeleteNamedRangeRequest {
  @scala.inline
  def apply(name: String = null, namedRangeId: String = null): SchemaDeleteNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteNamedRangeRequest]
  }
}

