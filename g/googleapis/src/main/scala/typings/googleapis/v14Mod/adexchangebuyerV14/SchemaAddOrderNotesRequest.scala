package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAddOrderNotesRequest extends js.Object {
  /**
    * The list of notes to add.
    */
  var notes: js.UndefOr[js.Array[SchemaMarketplaceNote]] = js.native
}

object SchemaAddOrderNotesRequest {
  @scala.inline
  def apply(notes: js.Array[SchemaMarketplaceNote] = null): SchemaAddOrderNotesRequest = {
    val __obj = js.Dynamic.literal()
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddOrderNotesRequest]
  }
}

