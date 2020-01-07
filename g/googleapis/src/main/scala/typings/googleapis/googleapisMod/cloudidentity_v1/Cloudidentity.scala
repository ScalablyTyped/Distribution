package typings.googleapis.googleapisMod.cloudidentity_v1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
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
  extends typings.googleapis.buildSrcApisCloudidentityV1Mod.cloudidentity_v1.Cloudidentity {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

