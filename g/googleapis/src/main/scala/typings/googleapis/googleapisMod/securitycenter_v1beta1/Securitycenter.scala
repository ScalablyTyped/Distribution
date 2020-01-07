package typings.googleapis.googleapisMod.securitycenter_v1beta1

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
  * const securitycenter = google.securitycenter('v1beta1');
  *
  * @namespace securitycenter
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Securitycenter
  */
@JSImport("googleapis", "securitycenter_v1beta1.Securitycenter")
@js.native
class Securitycenter protected ()
  extends typings.googleapis.buildSrcApisSecuritycenterV1beta1Mod.securitycenter_v1beta1.Securitycenter {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

