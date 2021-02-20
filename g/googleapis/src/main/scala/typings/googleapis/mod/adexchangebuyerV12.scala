package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adexchangebuyerV12 {
  
  /**
    * Ad Exchange Buyer API
    *
    * Accesses your bidding-account information, submits creatives for
    * validation, finds available direct deals, and retrieves performance
    * reports.
    *
    * @example
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.2');
    *
    * @namespace adexchangebuyer
    * @type {Function}
    * @version v1.2
    * @variation v1.2
    * @param {object=} options Options for Adexchangebuyer
    */
  @JSImport("googleapis", "adexchangebuyer_v1_2.Adexchangebuyer")
  @js.native
  class Adexchangebuyer protected ()
    extends typings.googleapis.v12Mod.adexchangebuyerV12.Adexchangebuyer {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_2.Resource$Accounts")
  @js.native
  class ResourceAccounts protected ()
    extends typings.googleapis.v12Mod.adexchangebuyerV12.ResourceAccounts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "adexchangebuyer_v1_2.Resource$Creatives")
  @js.native
  class ResourceCreatives protected ()
    extends typings.googleapis.v12Mod.adexchangebuyerV12.ResourceCreatives {
    def this(context: APIRequestContext) = this()
  }
}
