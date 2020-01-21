package typings.googleapis.mod.iapV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Identity-Aware Proxy API
  *
  * Controls access to cloud applications running on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const iap = google.iap('v1');
  *
  * @namespace iap
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Iap
  */
@JSImport("googleapis", "iap_v1.Iap")
@js.native
class Iap protected ()
  extends typings.googleapis.iapV1Mod.iapV1.Iap {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

