package typings.googleapis.mod.securitycenterV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends typings.googleapis.securitycenterV1Mod.securitycenterV1.Securitycenter {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
