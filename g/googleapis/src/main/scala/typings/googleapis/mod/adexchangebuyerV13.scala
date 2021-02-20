package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adexchangebuyerV13 {
  
  /**
    * Ad Exchange Buyer API
    *
    * Accesses your bidding-account information, submits creatives for
    * validation, finds available direct deals, and retrieves performance
    * reports.
    *
    * @example
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.3');
    *
    * @namespace adexchangebuyer
    * @type {Function}
    * @version v1.3
    * @variation v1.3
    * @param {object=} options Options for Adexchangebuyer
    */
  @JSImport("googleapis", "adexchangebuyer_v1_3.Adexchangebuyer")
  @js.native
  class Adexchangebuyer protected ()
    extends typings.googleapis.v13Mod.adexchangebuyerV13.Adexchangebuyer {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_3.Resource$Accounts")
  @js.native
  class ResourceAccounts protected ()
    extends typings.googleapis.v13Mod.adexchangebuyerV13.ResourceAccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_3.Resource$Billinginfo")
  @js.native
  class ResourceBillinginfo protected ()
    extends typings.googleapis.v13Mod.adexchangebuyerV13.ResourceBillinginfo {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_3.Resource$Budget")
  @js.native
  class ResourceBudget protected ()
    extends typings.googleapis.v13Mod.adexchangebuyerV13.ResourceBudget {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_3.Resource$Creatives")
  @js.native
  class ResourceCreatives protected ()
    extends typings.googleapis.v13Mod.adexchangebuyerV13.ResourceCreatives {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_3.Resource$Directdeals")
  @js.native
  class ResourceDirectdeals protected ()
    extends typings.googleapis.v13Mod.adexchangebuyerV13.ResourceDirectdeals {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_3.Resource$Performancereport")
  @js.native
  class ResourcePerformancereport protected ()
    extends typings.googleapis.v13Mod.adexchangebuyerV13.ResourcePerformancereport {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_3.Resource$Pretargetingconfig")
  @js.native
  class ResourcePretargetingconfig protected ()
    extends typings.googleapis.v13Mod.adexchangebuyerV13.ResourcePretargetingconfig {
    def this(context: APIRequestContext) = this()
  }
}
