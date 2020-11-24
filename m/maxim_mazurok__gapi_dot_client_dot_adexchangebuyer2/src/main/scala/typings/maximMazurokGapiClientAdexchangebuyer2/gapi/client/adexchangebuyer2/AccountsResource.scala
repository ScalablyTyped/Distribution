package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsResource extends js.Object {
  
  var clients: ClientsResource = js.native
  
  var creatives: CreativesResource = js.native
  
  var filterSets: FilterSetsResource = js.native
  
  var finalizedProposals: FinalizedProposalsResource = js.native
  
  var products: ProductsResource = js.native
  
  var proposals: ProposalsResource = js.native
  
  var publisherProfiles: PublisherProfilesResource = js.native
}
object AccountsResource {
  
  @scala.inline
  def apply(
    clients: ClientsResource,
    creatives: CreativesResource,
    filterSets: FilterSetsResource,
    finalizedProposals: FinalizedProposalsResource,
    products: ProductsResource,
    proposals: ProposalsResource,
    publisherProfiles: PublisherProfilesResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(clients = clients.asInstanceOf[js.Any], creatives = creatives.asInstanceOf[js.Any], filterSets = filterSets.asInstanceOf[js.Any], finalizedProposals = finalizedProposals.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any], proposals = proposals.asInstanceOf[js.Any], publisherProfiles = publisherProfiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsResource]
  }
  
  @scala.inline
  implicit class AccountsResourceOps[Self <: AccountsResource] (val x: Self) extends AnyVal {
    
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
    def setClients(value: ClientsResource): Self = this.set("clients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatives(value: CreativesResource): Self = this.set("creatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSets(value: FilterSetsResource): Self = this.set("filterSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalizedProposals(value: FinalizedProposalsResource): Self = this.set("finalizedProposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducts(value: ProductsResource): Self = this.set("products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposals(value: ProposalsResource): Self = this.set("proposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherProfiles(value: PublisherProfilesResource): Self = this.set("publisherProfiles", value.asInstanceOf[js.Any])
  }
}
