package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BiddersResource extends js.Object {
  
  var accounts: AccountsResource = js.native
  
  var filterSets: FilterSetsResource = js.native
}
object BiddersResource {
  
  @scala.inline
  def apply(accounts: AccountsResource, filterSets: FilterSetsResource): BiddersResource = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], filterSets = filterSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiddersResource]
  }
  
  @scala.inline
  implicit class BiddersResourceOps[Self <: BiddersResource] (val x: Self) extends AnyVal {
    
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
    def setAccounts(value: AccountsResource): Self = this.set("accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSets(value: FilterSetsResource): Self = this.set("filterSets", value.asInstanceOf[js.Any])
  }
}
