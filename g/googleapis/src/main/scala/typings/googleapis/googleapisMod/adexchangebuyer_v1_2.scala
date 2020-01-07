package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "adexchangebuyer_v1_2")
@js.native
object adexchangebuyer_v1_2 extends js.Object {
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
  @js.native
  class Adexchangebuyer protected ()
    extends typings.googleapis.buildSrcApisAdexchangebuyerV1Dot2Mod.adexchangebuyer_v1_2.Adexchangebuyer {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Accounts protected ()
    extends typings.googleapis.buildSrcApisAdexchangebuyerV1Dot2Mod.adexchangebuyer_v1_2.Resource$Accounts {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Creatives protected ()
    extends typings.googleapis.buildSrcApisAdexchangebuyerV1Dot2Mod.adexchangebuyer_v1_2.Resource$Creatives {
    def this(context: APIRequestContext) = this()
  }
  
}

