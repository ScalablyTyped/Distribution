package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adexchangebuyerV14 {
  
  /**
    * Ad Exchange Buyer API
    *
    * Accesses your bidding-account information, submits creatives for
    * validation, finds available direct deals, and retrieves performance
    * reports.
    *
    * @example
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * @namespace adexchangebuyer
    * @type {Function}
    * @version v1.4
    * @variation v1.4
    * @param {object=} options Options for Adexchangebuyer
    */
  @JSImport("googleapis", "adexchangebuyer_v1_4.Adexchangebuyer")
  @js.native
  class Adexchangebuyer protected ()
    extends typings.googleapis.v14Mod.adexchangebuyerV14.Adexchangebuyer {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_4.Resource$Accounts")
  @js.native
  class ResourceAccounts protected ()
    extends typings.googleapis.v14Mod.adexchangebuyerV14.ResourceAccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_4.Resource$Billinginfo")
  @js.native
  class ResourceBillinginfo protected ()
    extends typings.googleapis.v14Mod.adexchangebuyerV14.ResourceBillinginfo {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_4.Resource$Budget")
  @js.native
  class ResourceBudget protected ()
    extends typings.googleapis.v14Mod.adexchangebuyerV14.ResourceBudget {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_4.Resource$Creatives")
  @js.native
  class ResourceCreatives protected ()
    extends typings.googleapis.v14Mod.adexchangebuyerV14.ResourceCreatives {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_4.Resource$Marketplacedeals")
  @js.native
  class ResourceMarketplacedeals protected ()
    extends typings.googleapis.v14Mod.adexchangebuyerV14.ResourceMarketplacedeals {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_4.Resource$Marketplacenotes")
  @js.native
  class ResourceMarketplacenotes protected ()
    extends typings.googleapis.v14Mod.adexchangebuyerV14.ResourceMarketplacenotes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_4.Resource$Marketplaceprivateauction")
  @js.native
  class ResourceMarketplaceprivateauction protected ()
    extends typings.googleapis.v14Mod.adexchangebuyerV14.ResourceMarketplaceprivateauction {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_4.Resource$Performancereport")
  @js.native
  class ResourcePerformancereport protected ()
    extends typings.googleapis.v14Mod.adexchangebuyerV14.ResourcePerformancereport {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_4.Resource$Pretargetingconfig")
  @js.native
  class ResourcePretargetingconfig protected ()
    extends typings.googleapis.v14Mod.adexchangebuyerV14.ResourcePretargetingconfig {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_4.Resource$Products")
  @js.native
  class ResourceProducts protected ()
    extends typings.googleapis.v14Mod.adexchangebuyerV14.ResourceProducts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_4.Resource$Proposals")
  @js.native
  class ResourceProposals protected ()
    extends typings.googleapis.v14Mod.adexchangebuyerV14.ResourceProposals {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_4.Resource$Pubprofiles")
  @js.native
  class ResourcePubprofiles protected ()
    extends typings.googleapis.v14Mod.adexchangebuyerV14.ResourcePubprofiles {
    def this(context: APIRequestContext) = this()
  }
}
