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
  def apply(): SchemaMarketplaceDealParty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMarketplaceDealParty]
  }
  @scala.inline
  implicit class SchemaMarketplaceDealPartyOps[Self <: SchemaMarketplaceDealParty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuyer(value: SchemaBuyer): Self = this.set("buyer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuyer: Self = this.set("buyer", js.undefined)
    @scala.inline
    def setSeller(value: SchemaSeller): Self = this.set("seller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeller: Self = this.set("seller", js.undefined)
  }
  
}

