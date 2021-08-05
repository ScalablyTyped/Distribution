package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountsResource extends StObject {
  
  var clients: ClientsResource
  
  var creatives: CreativesResource
  
  var filterSets: FilterSetsResource
  
  var finalizedProposals: FinalizedProposalsResource
  
  var products: ProductsResource
  
  var proposals: ProposalsResource
  
  var publisherProfiles: PublisherProfilesResource
}
object AccountsResource {
  
  inline def apply(
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
  
  extension [Self <: AccountsResource](x: Self) {
    
    inline def setClients(value: ClientsResource): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
    
    inline def setCreatives(value: CreativesResource): Self = StObject.set(x, "creatives", value.asInstanceOf[js.Any])
    
    inline def setFilterSets(value: FilterSetsResource): Self = StObject.set(x, "filterSets", value.asInstanceOf[js.Any])
    
    inline def setFinalizedProposals(value: FinalizedProposalsResource): Self = StObject.set(x, "finalizedProposals", value.asInstanceOf[js.Any])
    
    inline def setProducts(value: ProductsResource): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProposals(value: ProposalsResource): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
    
    inline def setPublisherProfiles(value: PublisherProfilesResource): Self = StObject.set(x, "publisherProfiles", value.asInstanceOf[js.Any])
  }
}
