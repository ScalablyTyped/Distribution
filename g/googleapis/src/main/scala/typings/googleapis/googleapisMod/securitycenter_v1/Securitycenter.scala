package typings.googleapis.googleapisMod.securitycenter_v1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Security Command Center API
  *
  * Cloud Security Command Center API provides access to temporal views of
  * assets and findings within an organization.
  *
  * @example
  * const {google} = require('googleapis');
  * const securitycenter = google.securitycenter('v1');
  *
  * @namespace securitycenter
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Securitycenter
  */
@JSImport("googleapis", "securitycenter_v1.Securitycenter")
@js.native
class Securitycenter protected ()
  extends typings.googleapis.buildSrcApisSecuritycenterV1Mod.securitycenter_v1.Securitycenter {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

