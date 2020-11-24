package typings.googleapis.dlpV2Mod.dlpV2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Data Loss Prevention (DLP) API
  *
  * Provides methods for detection, risk analysis, and de-identification of
  * privacy-sensitive fragments in text, images, and Google Cloud Platform
  * storage repositories.
  *
  * @example
  * const {google} = require('googleapis');
  * const dlp = google.dlp('v2');
  *
  * @namespace dlp
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Dlp
  */
@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Dlp")
@js.native
class Dlp protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var infoTypes: ResourceInfotypes = js.native
  
  var organizations: ResourceOrganizations = js.native
  
  var projects: ResourceProjects = js.native
}
