package typings.googleapis.iapV1beta1Mod.iapV1beta1

import typings.googleapisCommon.apiMod.APIRequestContext
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
  * const iap = google.iap('v1beta1');
  *
  * @namespace iap
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Iap
  */
@JSImport("googleapis/build/src/apis/iap/v1beta1", "iap_v1beta1.Iap")
@js.native
class Iap protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var v1beta1: ResourceV1beta1 = js.native
}

