package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiddersResource extends StObject {
  
  var accounts: AccountsResource
  
  var filterSets: FilterSetsResource
}
object BiddersResource {
  
  inline def apply(accounts: AccountsResource, filterSets: FilterSetsResource): BiddersResource = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], filterSets = filterSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiddersResource]
  }
  
  extension [Self <: BiddersResource](x: Self) {
    
    inline def setAccounts(value: AccountsResource): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setFilterSets(value: FilterSetsResource): Self = StObject.set(x, "filterSets", value.asInstanceOf[js.Any])
  }
}
