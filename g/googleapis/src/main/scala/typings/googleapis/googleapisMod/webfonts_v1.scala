package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "webfonts_v1")
@js.native
object webfonts_v1 extends js.Object {
  @js.native
  class Resource$Webfonts protected ()
    extends typings.googleapis.buildSrcApisWebfontsV1Mod.webfonts_v1.Resource$Webfonts {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Google Fonts Developer API
    *
    * Accesses the metadata for all families served by Google Fonts, providing a
    * list of families currently available (including available styles and a list
    * of supported script subsets).
    *
    * @example
    * const {google} = require('googleapis');
    * const webfonts = google.webfonts('v1');
    *
    * @namespace webfonts
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Webfonts
    */
  @js.native
  class Webfonts protected ()
    extends typings.googleapis.buildSrcApisWebfontsV1Mod.webfonts_v1.Webfonts {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

