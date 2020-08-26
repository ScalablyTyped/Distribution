package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUpdatePrivateAuctionProposalRequest extends js.Object {
  /**
    * The externalDealId of the deal to be updated.
    */
  var externalDealId: js.UndefOr[String] = js.native
  /**
    * Optional note to be added.
    */
  var note: js.UndefOr[SchemaMarketplaceNote] = js.native
  /**
    * The current revision number of the proposal to be updated.
    */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  /**
    * The proposed action on the private auction proposal.
    */
  var updateAction: js.UndefOr[String] = js.native
}

object SchemaUpdatePrivateAuctionProposalRequest {
  @scala.inline
  def apply(): SchemaUpdatePrivateAuctionProposalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdatePrivateAuctionProposalRequest]
  }
  @scala.inline
  implicit class SchemaUpdatePrivateAuctionProposalRequestOps[Self <: SchemaUpdatePrivateAuctionProposalRequest] (val x: Self) extends AnyVal {
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
    def setExternalDealId(value: String): Self = this.set("externalDealId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalDealId: Self = this.set("externalDealId", js.undefined)
    @scala.inline
    def setNote(value: SchemaMarketplaceNote): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setProposalRevisionNumber(value: String): Self = this.set("proposalRevisionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProposalRevisionNumber: Self = this.set("proposalRevisionNumber", js.undefined)
    @scala.inline
    def setUpdateAction(value: String): Self = this.set("updateAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateAction: Self = this.set("updateAction", js.undefined)
  }
  
}

