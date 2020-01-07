package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "pagespeedonline_v1")
@js.native
object pagespeedonline_v1 extends js.Object {
  /**
    * PageSpeed Insights API
    *
    * Analyzes the performance of a web page and provides tailored suggestions to
    * make that page faster.
    *
    * @example
    * const {google} = require('googleapis');
    * const pagespeedonline = google.pagespeedonline('v1');
    *
    * @namespace pagespeedonline
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Pagespeedonline
    */
  @js.native
  class Pagespeedonline protected ()
    extends typings.googleapis.buildSrcApisPagespeedonlineV1Mod.pagespeedonline_v1.Pagespeedonline {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Pagespeedapi protected ()
    extends typings.googleapis.buildSrcApisPagespeedonlineV1Mod.pagespeedonline_v1.Resource$Pagespeedapi {
    def this(context: APIRequestContext) = this()
  }
  
}

