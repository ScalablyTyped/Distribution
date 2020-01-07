package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "iap_v1beta1")
@js.native
object iap_v1beta1 extends js.Object {
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
  @js.native
  class Iap protected ()
    extends typings.googleapis.buildSrcApisIapV1beta1Mod.iap_v1beta1.Iap {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$V1beta1 protected ()
    extends typings.googleapis.buildSrcApisIapV1beta1Mod.iap_v1beta1.Resource$V1beta1 {
    def this(context: APIRequestContext) = this()
  }
  
}

