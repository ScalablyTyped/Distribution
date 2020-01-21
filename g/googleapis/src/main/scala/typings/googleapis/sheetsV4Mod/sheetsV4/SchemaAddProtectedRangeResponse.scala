package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a new protected range.
  */
@js.native
trait SchemaAddProtectedRangeResponse extends js.Object {
  /**
    * The newly added protected range.
    */
  var protectedRange: js.UndefOr[SchemaProtectedRange] = js.native
}

object SchemaAddProtectedRangeResponse {
  @scala.inline
  def apply(protectedRange: SchemaProtectedRange = null): SchemaAddProtectedRangeResponse = {
    val __obj = js.Dynamic.literal()
    if (protectedRange != null) __obj.updateDynamic("protectedRange")(protectedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddProtectedRangeResponse]
  }
}

