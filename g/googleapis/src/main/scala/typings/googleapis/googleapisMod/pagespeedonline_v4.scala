package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "pagespeedonline_v4")
@js.native
object pagespeedonline_v4 extends js.Object {
  /**
    * PageSpeed Insights API
    *
    * Analyzes the performance of a web page and provides tailored suggestions to
    * make that page faster.
    *
    * @example
    * const {google} = require('googleapis');
    * const pagespeedonline = google.pagespeedonline('v4');
    *
    * @namespace pagespeedonline
    * @type {Function}
    * @version v4
    * @variation v4
    * @param {object=} options Options for Pagespeedonline
    */
  @js.native
  class Pagespeedonline protected ()
    extends typings.googleapis.buildSrcApisPagespeedonlineV4Mod.pagespeedonline_v4.Pagespeedonline {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Pagespeedapi protected ()
    extends typings.googleapis.buildSrcApisPagespeedonlineV4Mod.pagespeedonline_v4.Resource$Pagespeedapi {
    def this(context: APIRequestContext) = this()
  }
  
}

