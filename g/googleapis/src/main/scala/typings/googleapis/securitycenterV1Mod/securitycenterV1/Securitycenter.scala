package typings.googleapis.securitycenterV1Mod.securitycenterV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
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
@JSImport("googleapis/build/src/apis/securitycenter/v1", "securitycenter_v1.Securitycenter")
@js.native
class Securitycenter protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var organizations: ResourceOrganizations = js.native
}

