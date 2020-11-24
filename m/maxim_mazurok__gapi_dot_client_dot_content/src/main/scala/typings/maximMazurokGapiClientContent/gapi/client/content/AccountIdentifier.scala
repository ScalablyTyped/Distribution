package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountIdentifier extends js.Object {
  
  /** The aggregator ID, set for aggregators and subaccounts (in that case, it represents the aggregator of the subaccount). */
  var aggregatorId: js.UndefOr[String] = js.native
  
  /** The merchant account ID, set for individual accounts and subaccounts. */
  var merchantId: js.UndefOr[String] = js.native
}
object AccountIdentifier {
  
  @scala.inline
  def apply(): AccountIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountIdentifier]
  }
  
  @scala.inline
  implicit class AccountIdentifierOps[Self <: AccountIdentifier] (val x: Self) extends AnyVal {
    
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
    def setAggregatorId(value: String): Self = this.set("aggregatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregatorId: Self = this.set("aggregatorId", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
  }
}
