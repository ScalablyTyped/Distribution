package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adds a new protected range.
  */
@js.native
trait SchemaAddProtectedRangeRequest extends js.Object {
  /**
    * The protected range to be added. The protectedRangeId field is optional;
    * if one is not set, an id will be randomly generated. (It is an error to
    * specify the ID of a range that already exists.)
    */
  var protectedRange: js.UndefOr[SchemaProtectedRange] = js.native
}

object SchemaAddProtectedRangeRequest {
  @scala.inline
  def apply(protectedRange: SchemaProtectedRange = null): SchemaAddProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (protectedRange != null) __obj.updateDynamic("protectedRange")(protectedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddProtectedRangeRequest]
  }
}

