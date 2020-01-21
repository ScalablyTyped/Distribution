package typings.googleapis.mod.dfareportingV33

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
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
  * const dfareporting = google.dfareporting('v3.3');
  *
  * @namespace dfareporting
  * @type {Function}
  * @version v3.3
  * @variation v3.3
  * @param {object=} options Options for Dfareporting
  */
@JSImport("googleapis", "dfareporting_v3_3.Dfareporting")
@js.native
class Dfareporting protected ()
  extends typings.googleapis.v33Mod.dfareportingV33.Dfareporting {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

