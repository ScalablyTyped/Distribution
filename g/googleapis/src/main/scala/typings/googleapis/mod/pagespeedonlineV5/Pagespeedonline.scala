package typings.googleapis.mod.pagespeedonlineV5

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PageSpeed Insights API
  *
  * Analyzes the performance of a web page and provides tailored suggestions to
  * make that page faster.
  *
  * @example
  * const {google} = require('googleapis');
  * const pagespeedonline = google.pagespeedonline('v5');
  *
  * @namespace pagespeedonline
  * @type {Function}
  * @version v5
  * @variation v5
  * @param {object=} options Options for Pagespeedonline
  */
@JSImport("googleapis", "pagespeedonline_v5.Pagespeedonline")
@js.native
class Pagespeedonline protected ()
  extends typings.googleapis.v5Mod.pagespeedonlineV5.Pagespeedonline {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
