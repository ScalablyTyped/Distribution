package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddOrderDealsResponse extends js.Object {
  
  /** List of deals added (in the same proposal as passed in the request) */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.native
  
  /** The updated revision number for the proposal. */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
}
object AddOrderDealsResponse {
  
  @scala.inline
  def apply(): AddOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOrderDealsResponse]
  }
  
  @scala.inline
  implicit class AddOrderDealsResponseOps[Self <: AddOrderDealsResponse] (val x: Self) extends AnyVal {
    
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
    def setDealsVarargs(value: MarketplaceDeal*): Self = this.set("deals", js.Array(value :_*))
    
    @scala.inline
    def setDeals(value: js.Array[MarketplaceDeal]): Self = this.set("deals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeals: Self = this.set("deals", js.undefined)
    
    @scala.inline
    def setProposalRevisionNumber(value: String): Self = this.set("proposalRevisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposalRevisionNumber: Self = this.set("proposalRevisionNumber", js.undefined)
  }
}
