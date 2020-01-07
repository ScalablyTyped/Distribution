package typings.googleapis.googleapisMod.run_v1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Run API
  *
  * Deploy and manage user provided container images that scale automatically
  * based on HTTP traffic.
  *
  * @example
  * const {google} = require('googleapis');
  * const run = google.run('v1');
  *
  * @namespace run
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Run
  */
@JSImport("googleapis", "run_v1.Run")
@js.native
class Run protected ()
  extends typings.googleapis.buildSrcApisRunV1Mod.run_v1.Run {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

