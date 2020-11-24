package typings.maximMazurokGapiClientAdexchangebuyer

import typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer.AccountsResource
import typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer.BillingInfoResource
import typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer.BudgetResource
import typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer.CreativesResource
import typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer.MarketplacedealsResource
import typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer.MarketplacenotesResource
import typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer.MarketplaceprivateauctionResource
import typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer.PerformanceReportResource
import typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer.PretargetingConfigResource
import typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer.ProductsResource
import typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer.ProposalsResource
import typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer.PubprofilesResource
import typings.maximMazurokGapiClientAdexchangebuyer.maximMazurokGapiClientAdexchangebuyerStrings.adexchangebuyer
import typings.maximMazurokGapiClientAdexchangebuyer.maximMazurokGapiClientAdexchangebuyerStrings.v1Dot4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Ad Exchange Buyer API v1.4 */
      def load(name: adexchangebuyer, version: v1Dot4): js.Thenable[Unit] = js.native
      def load(name: adexchangebuyer, version: v1Dot4, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object adexchangebuyer extends js.Object {
        
        val accounts: AccountsResource = js.native
        
        val billingInfo: BillingInfoResource = js.native
        
        val budget: BudgetResource = js.native
        
        val creatives: CreativesResource = js.native
        
        val marketplacedeals: MarketplacedealsResource = js.native
        
        val marketplacenotes: MarketplacenotesResource = js.native
        
        val marketplaceprivateauction: MarketplaceprivateauctionResource = js.native
        
        val performanceReport: PerformanceReportResource = js.native
        
        val pretargetingConfig: PretargetingConfigResource = js.native
        
        val products: ProductsResource = js.native
        
        val proposals: ProposalsResource = js.native
        
        val pubprofiles: PubprofilesResource = js.native
      }
    }
  }
}
