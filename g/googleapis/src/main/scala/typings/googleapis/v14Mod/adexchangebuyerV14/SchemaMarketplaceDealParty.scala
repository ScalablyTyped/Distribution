package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMarketplaceDealParty extends js.Object {
  /**
    * The buyer/seller associated with the deal. One of buyer/seller is
    * specified for a deal-party.
    */
  var buyer: js.UndefOr[SchemaBuyer] = js.native
  /**
    * The buyer/seller associated with the deal. One of buyer/seller is
    * specified for a deal party.
    */
  var seller: js.UndefOr[SchemaSeller] = js.native
}

object SchemaMarketplaceDealParty {
  @scala.inline
  def apply(buyer: SchemaBuyer = null, seller: SchemaSeller = null): SchemaMarketplaceDealParty = {
    val __obj = js.Dynamic.literal()
    if (buyer != null) __obj.updateDynamic("buyer")(buyer.asInstanceOf[js.Any])
    if (seller != null) __obj.updateDynamic("seller")(seller.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMarketplaceDealParty]
  }
}

