package typings.googleapis.mod.youtubereportingV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("googleapis", "youtubereporting_v1.Youtubereporting")
@js.native
class Youtubereporting protected ()
  extends typings.googleapis.youtubereportingV1Mod.youtubereportingV1.Youtubereporting {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
