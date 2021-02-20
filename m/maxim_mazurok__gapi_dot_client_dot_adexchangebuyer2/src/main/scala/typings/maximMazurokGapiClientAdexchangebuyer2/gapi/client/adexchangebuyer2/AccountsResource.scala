package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountsResource extends StObject {
  
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
  implicit class AccountsResourceMutableBuilder[Self <: AccountsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClients(value: ClientsResource): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatives(value: CreativesResource): Self = StObject.set(x, "creatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSets(value: FilterSetsResource): Self = StObject.set(x, "filterSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalizedProposals(value: FinalizedProposalsResource): Self = StObject.set(x, "finalizedProposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducts(value: ProductsResource): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposals(value: ProposalsResource): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherProfiles(value: PublisherProfilesResource): Self = StObject.set(x, "publisherProfiles", value.asInstanceOf[js.Any])
  }
}
