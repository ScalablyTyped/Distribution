package typings.googleapis.googleapisMod.compute_alpha

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
  * const compute = google.compute('alpha');
  *
  * @namespace compute
  * @type {Function}
  * @version alpha
  * @variation alpha
  * @param {object=} options Options for Compute
  */
@JSImport("googleapis", "compute_alpha.Compute")
@js.native
class Compute protected ()
  extends typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha.Compute {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

