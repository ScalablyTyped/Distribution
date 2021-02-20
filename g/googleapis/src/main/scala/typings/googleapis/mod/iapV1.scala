package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iapV1 {
  
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
  
  @JSImport("googleapis", "iap_v1.Resource$V1")
  @js.native
  class ResourceV1 protected ()
    extends typings.googleapis.iapV1Mod.iapV1.ResourceV1 {
    def this(context: APIRequestContext) = this()
  }
}
