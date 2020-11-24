package typings.googleapis.mod.analyticsV24

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Analytics API
  *
  * Views and manages your Google Analytics data.
  *
  * @example
  * const {google} = require('googleapis');
  * const analytics = google.analytics('v2.4');
  *
  * @namespace analytics
  * @type {Function}
  * @version v2.4
  * @variation v2.4
  * @param {object=} options Options for Analytics
  */
@JSImport("googleapis", "analytics_v2_4.Analytics")
@js.native
class Analytics protected ()
  extends typings.googleapis.v24Mod.analyticsV24.Analytics {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
