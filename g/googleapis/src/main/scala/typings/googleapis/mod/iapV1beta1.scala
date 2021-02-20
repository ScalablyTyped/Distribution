package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iapV1beta1 {
  
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
  @JSImport("googleapis", "iap_v1beta1.Iap")
  @js.native
  class Iap protected ()
    extends typings.googleapis.iapV1beta1Mod.iapV1beta1.Iap {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "iap_v1beta1.Resource$V1beta1")
  @js.native
  class ResourceV1beta1 protected ()
    extends typings.googleapis.iapV1beta1Mod.iapV1beta1.ResourceV1beta1 {
    def this(context: APIRequestContext) = this()
  }
}
