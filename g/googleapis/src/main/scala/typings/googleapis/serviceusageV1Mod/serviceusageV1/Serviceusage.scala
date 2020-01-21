package typings.googleapis.serviceusageV1Mod.serviceusageV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service Usage API
  *
  * Enables services that service consumers want to use on Google Cloud
  * Platform, lists the available or enabled services, or disables services
  * that service consumers no longer use.
  *
  * @example
  * const {google} = require('googleapis');
  * const serviceusage = google.serviceusage('v1');
  *
  * @namespace serviceusage
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Serviceusage
  */
@JSImport("googleapis/build/src/apis/serviceusage/v1", "serviceusage_v1.Serviceusage")
@js.native
class Serviceusage protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var operations: ResourceOperations = js.native
  var services: ResourceServices = js.native
}

