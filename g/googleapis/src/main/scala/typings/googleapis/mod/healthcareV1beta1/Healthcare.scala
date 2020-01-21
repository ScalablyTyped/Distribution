package typings.googleapis.mod.healthcareV1beta1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Healthcare API
  *
  * Manage, store, and access healthcare data in Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const healthcare = google.healthcare('v1beta1');
  *
  * @namespace healthcare
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Healthcare
  */
@JSImport("googleapis", "healthcare_v1beta1.Healthcare")
@js.native
class Healthcare protected ()
  extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.Healthcare {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

