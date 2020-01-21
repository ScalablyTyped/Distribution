package typings.googleapis.mod.adexchangebuyerV14

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

