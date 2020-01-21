package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a named range.
  */
@js.native
trait SchemaAddNamedRangeResponse extends js.Object {
  /**
    * The named range to add.
    */
  var namedRange: js.UndefOr[SchemaNamedRange] = js.native
}

object SchemaAddNamedRangeResponse {
  @scala.inline
  def apply(namedRange: SchemaNamedRange = null): SchemaAddNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    if (namedRange != null) __obj.updateDynamic("namedRange")(namedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddNamedRangeResponse]
  }
}

