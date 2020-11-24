package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOrderDealsResponse extends js.Object {
  
  /** List of deals for the proposal */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.native
}
object GetOrderDealsResponse {
  
  @scala.inline
  def apply(): GetOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOrderDealsResponse]
  }
  
  @scala.inline
  implicit class GetOrderDealsResponseOps[Self <: GetOrderDealsResponse] (val x: Self) extends AnyVal {
    
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
  }
}
