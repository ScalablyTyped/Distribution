package typings.googleapis.googleapisMod.compute_v1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Compute Engine API
  *
  * Creates and runs virtual machines on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const compute = google.compute('v1');
  *
  * @namespace compute
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Compute
  */
@JSImport("googleapis", "compute_v1.Compute")
@js.native
class Compute protected ()
  extends typings.googleapis.buildSrcApisComputeV1Mod.compute_v1.Compute {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

