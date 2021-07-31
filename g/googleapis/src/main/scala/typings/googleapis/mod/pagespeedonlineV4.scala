package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagespeedonlineV4 {
  
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
  @JSImport("googleapis", "pagespeedonline_v4.Pagespeedonline")
  @js.native
  class Pagespeedonline protected ()
    extends typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.Pagespeedonline {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "pagespeedonline_v4.Resource$Pagespeedapi")
  @js.native
  class ResourcePagespeedapi protected ()
    extends typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.ResourcePagespeedapi {
    def this(context: APIRequestContext) = this()
  }
}
