package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Seller extends js.Object {
  
  /** The unique id for the seller. The seller fills in this field. The seller account id is then available to buyer in the product. */
  var accountId: js.UndefOr[String] = js.native
  
  /** Optional sub-account id for the seller. */
  var subAccountId: js.UndefOr[String] = js.native
}
object Seller {
  
  @scala.inline
  def apply(): Seller = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Seller]
  }
  
  @scala.inline
  implicit class SellerOps[Self <: Seller] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setSubAccountId(value: String): Self = this.set("subAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubAccountId: Self = this.set("subAccountId", js.undefined)
  }
}
