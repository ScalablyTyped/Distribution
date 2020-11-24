package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.3", "adexchangebuyer_v1_3.Adexchangebuyer")
@js.native
class Adexchangebuyer protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var accounts: ResourceAccounts = js.native
  
  var billingInfo: ResourceBillinginfo = js.native
  
  var budget: ResourceBudget = js.native
  
  var context: APIRequestContext = js.native
  
  var creatives: ResourceCreatives = js.native
  
  var directDeals: ResourceDirectdeals = js.native
  
  var performanceReport: ResourcePerformancereport = js.native
  
  var pretargetingConfig: ResourcePretargetingconfig = js.native
}
