package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGetOrderNotesResponse extends js.Object {
  /**
    * The list of matching notes. The notes for a proposal are ordered from
    * oldest to newest. If the notes span multiple proposals, they will be
    * grouped by proposal, with the notes for the most recently modified
    * proposal appearing first.
    */
  var notes: js.UndefOr[js.Array[SchemaMarketplaceNote]] = js.native
}

object SchemaGetOrderNotesResponse {
  @scala.inline
  def apply(notes: js.Array[SchemaMarketplaceNote] = null): SchemaGetOrderNotesResponse = {
    val __obj = js.Dynamic.literal()
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetOrderNotesResponse]
  }
}

