package typings.googleapis.googleapisMod.compute_beta

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
  * const compute = google.compute('beta');
  *
  * @namespace compute
  * @type {Function}
  * @version beta
  * @variation beta
  * @param {object=} options Options for Compute
  */
@JSImport("googleapis", "compute_beta.Compute")
@js.native
class Compute protected ()
  extends typings.googleapis.buildSrcApisComputeBetaMod.compute_beta.Compute {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

