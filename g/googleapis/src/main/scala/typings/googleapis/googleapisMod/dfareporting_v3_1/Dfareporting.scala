package typings.googleapis.googleapisMod.dfareporting_v3_1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DCM/DFA Reporting And Trafficking API
  *
  * Manages your DoubleClick Campaign Manager ad campaigns and reports.
  *
  * @example
  * const {google} = require('googleapis');
  * const dfareporting = google.dfareporting('v3.1');
  *
  * @namespace dfareporting
  * @type {Function}
  * @version v3.1
  * @variation v3.1
  * @param {object=} options Options for Dfareporting
  */
@JSImport("googleapis", "dfareporting_v3_1.Dfareporting")
@js.native
class Dfareporting protected ()
  extends typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1.Dfareporting {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

