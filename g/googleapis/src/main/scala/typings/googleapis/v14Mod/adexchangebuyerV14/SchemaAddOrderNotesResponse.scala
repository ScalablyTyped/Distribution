package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAddOrderNotesResponse extends js.Object {
  var notes: js.UndefOr[js.Array[SchemaMarketplaceNote]] = js.native
}

object SchemaAddOrderNotesResponse {
  @scala.inline
  def apply(notes: js.Array[SchemaMarketplaceNote] = null): SchemaAddOrderNotesResponse = {
    val __obj = js.Dynamic.literal()
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddOrderNotesResponse]
  }
}

