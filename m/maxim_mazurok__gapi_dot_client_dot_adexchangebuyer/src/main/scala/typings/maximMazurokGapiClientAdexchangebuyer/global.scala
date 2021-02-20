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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object adexchangebuyer {
        
        @JSGlobal("gapi.client.adexchangebuyer.accounts")
        @js.native
        val accounts: AccountsResource = js.native
        
        @JSGlobal("gapi.client.adexchangebuyer.billingInfo")
        @js.native
        val billingInfo: BillingInfoResource = js.native
        
        @JSGlobal("gapi.client.adexchangebuyer.budget")
        @js.native
        val budget: BudgetResource = js.native
        
        @JSGlobal("gapi.client.adexchangebuyer.creatives")
        @js.native
        val creatives: CreativesResource = js.native
        
        @JSGlobal("gapi.client.adexchangebuyer.marketplacedeals")
        @js.native
        val marketplacedeals: MarketplacedealsResource = js.native
        
        @JSGlobal("gapi.client.adexchangebuyer.marketplacenotes")
        @js.native
        val marketplacenotes: MarketplacenotesResource = js.native
        
        @JSGlobal("gapi.client.adexchangebuyer.marketplaceprivateauction")
        @js.native
        val marketplaceprivateauction: MarketplaceprivateauctionResource = js.native
        
        @JSGlobal("gapi.client.adexchangebuyer.performanceReport")
        @js.native
        val performanceReport: PerformanceReportResource = js.native
        
        @JSGlobal("gapi.client.adexchangebuyer.pretargetingConfig")
        @js.native
        val pretargetingConfig: PretargetingConfigResource = js.native
        
        @JSGlobal("gapi.client.adexchangebuyer.products")
        @js.native
        val products: ProductsResource = js.native
        
        @JSGlobal("gapi.client.adexchangebuyer.proposals")
        @js.native
        val proposals: ProposalsResource = js.native
        
        @JSGlobal("gapi.client.adexchangebuyer.pubprofiles")
        @js.native
        val pubprofiles: PubprofilesResource = js.native
      }
      
      /** Load Ad Exchange Buyer API v1.4 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: adexchangebuyer, version: v1Dot4): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: adexchangebuyer, version: v1Dot4, callback: js.Function0[_]): Unit = js.native
    }
  }
}
