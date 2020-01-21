package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * YouTube Reporting API
  *
  * Schedules reporting jobs containing your YouTube Analytics data and
  * downloads the resulting bulk data reports in the form of CSV files.
  *
  * @example
  * const {google} = require('googleapis');
  * const youtubereporting = google.youtubereporting('v1');
  *
  * @namespace youtubereporting
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Youtubereporting
  */
@JSImport("googleapis/build/src/apis/youtubereporting/v1", "youtubereporting_v1.Youtubereporting")
@js.native
class Youtubereporting protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var jobs: ResourceJobs = js.native
  var media: ResourceMedia = js.native
  var reportTypes: ResourceReporttypes = js.native
}

