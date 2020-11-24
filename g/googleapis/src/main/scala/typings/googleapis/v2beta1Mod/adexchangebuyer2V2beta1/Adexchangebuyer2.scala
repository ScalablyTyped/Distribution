package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Ad Exchange Buyer API II
  *
  * Accesses the latest features for managing Authorized Buyers accounts,
  * Real-Time Bidding configurations and auction metrics, and Marketplace
  * programmatic deals.
  *
  * @example
  * const {google} = require('googleapis');
  * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
  *
  * @namespace adexchangebuyer2
  * @type {Function}
  * @version v2beta1
  * @variation v2beta1
  * @param {object=} options Options for Adexchangebuyer2
  */
@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Adexchangebuyer2")
@js.native
class Adexchangebuyer2 protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var accounts: ResourceAccounts = js.native
  
  var bidders: ResourceBidders = js.native
  
  var context: APIRequestContext = js.native
}
