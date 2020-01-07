package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "adexchangebuyer_v1_3")
@js.native
object adexchangebuyer_v1_3 extends js.Object {
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
  @js.native
  class Adexchangebuyer protected ()
    extends typings.googleapis.buildSrcApisAdexchangebuyerV1Dot3Mod.adexchangebuyer_v1_3.Adexchangebuyer {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Accounts protected ()
    extends typings.googleapis.buildSrcApisAdexchangebuyerV1Dot3Mod.adexchangebuyer_v1_3.Resource$Accounts {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Billinginfo protected ()
    extends typings.googleapis.buildSrcApisAdexchangebuyerV1Dot3Mod.adexchangebuyer_v1_3.Resource$Billinginfo {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Budget protected ()
    extends typings.googleapis.buildSrcApisAdexchangebuyerV1Dot3Mod.adexchangebuyer_v1_3.Resource$Budget {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Creatives protected ()
    extends typings.googleapis.buildSrcApisAdexchangebuyerV1Dot3Mod.adexchangebuyer_v1_3.Resource$Creatives {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Directdeals protected ()
    extends typings.googleapis.buildSrcApisAdexchangebuyerV1Dot3Mod.adexchangebuyer_v1_3.Resource$Directdeals {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Performancereport protected ()
    extends typings.googleapis.buildSrcApisAdexchangebuyerV1Dot3Mod.adexchangebuyer_v1_3.Resource$Performancereport {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Pretargetingconfig protected ()
    extends typings.googleapis.buildSrcApisAdexchangebuyerV1Dot3Mod.adexchangebuyer_v1_3.Resource$Pretargetingconfig {
    def this(context: APIRequestContext) = this()
  }
  
}

