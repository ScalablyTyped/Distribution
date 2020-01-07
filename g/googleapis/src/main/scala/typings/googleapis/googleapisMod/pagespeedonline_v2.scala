package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "pagespeedonline_v2")
@js.native
object pagespeedonline_v2 extends js.Object {
  /**
    * PageSpeed Insights API
    *
    * Analyzes the performance of a web page and provides tailored suggestions to
    * make that page faster.
    *
    * @example
    * const {google} = require('googleapis');
    * const pagespeedonline = google.pagespeedonline('v2');
    *
    * @namespace pagespeedonline
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Pagespeedonline
    */
  @js.native
  class Pagespeedonline protected ()
    extends typings.googleapis.buildSrcApisPagespeedonlineV2Mod.pagespeedonline_v2.Pagespeedonline {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Pagespeedapi protected ()
    extends typings.googleapis.buildSrcApisPagespeedonlineV2Mod.pagespeedonline_v2.Resource$Pagespeedapi {
    def this(context: APIRequestContext) = this()
  }
  
}

