package typings.googleapis.googleapisMod.clouderrorreporting_v1beta1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stackdriver Error Reporting API
  *
  * Groups and counts similar errors from cloud services and applications,
  * reports new errors, and provides access to error groups and their
  * associated errors.
  *
  * @example
  * const {google} = require('googleapis');
  * const clouderrorreporting = google.clouderrorreporting('v1beta1');
  *
  * @namespace clouderrorreporting
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Clouderrorreporting
  */
@JSImport("googleapis", "clouderrorreporting_v1beta1.Clouderrorreporting")
@js.native
class Clouderrorreporting protected ()
  extends typings.googleapis.buildSrcApisClouderrorreportingV1beta1Mod.clouderrorreporting_v1beta1.Clouderrorreporting {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

