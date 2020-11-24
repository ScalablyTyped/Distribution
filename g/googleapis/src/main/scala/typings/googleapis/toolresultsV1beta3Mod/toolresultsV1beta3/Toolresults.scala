package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Tool Results API
  *
  * Reads and publishes results from Firebase Test Lab.
  *
  * @example
  * const {google} = require('googleapis');
  * const toolresults = google.toolresults('v1beta3');
  *
  * @namespace toolresults
  * @type {Function}
  * @version v1beta3
  * @variation v1beta3
  * @param {object=} options Options for Toolresults
  */
@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Toolresults")
@js.native
class Toolresults protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
}
