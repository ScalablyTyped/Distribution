package typings.googleapis.mod.cloudidentityV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Identity API
  *
  * API for provisioning and managing identity resources.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudidentity = google.cloudidentity('v1');
  *
  * @namespace cloudidentity
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudidentity
  */
@JSImport("googleapis", "cloudidentity_v1.Cloudidentity")
@js.native
class Cloudidentity protected ()
  extends typings.googleapis.cloudidentityV1Mod.cloudidentityV1.Cloudidentity {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

