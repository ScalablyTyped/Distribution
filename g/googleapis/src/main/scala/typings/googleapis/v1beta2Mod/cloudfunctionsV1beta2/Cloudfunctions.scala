package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Functions API
  *
  * Manages lightweight user-provided functions executed in response to events.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudfunctions = google.cloudfunctions('v1beta2');
  *
  * @namespace cloudfunctions
  * @type {Function}
  * @version v1beta2
  * @variation v1beta2
  * @param {object=} options Options for Cloudfunctions
  */
@JSImport("googleapis/build/src/apis/cloudfunctions/v1beta2", "cloudfunctions_v1beta2.Cloudfunctions")
@js.native
class Cloudfunctions protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var operations: ResourceOperations = js.native
  var projects: ResourceProjects = js.native
}

