package typings.googleapis.servicebrokerV1Mod.servicebrokerV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service Broker API
  *
  * The Google Cloud Platform Service Broker API provides Google hosted
  * implementation of the Open Service Broker API
  * (https://www.openservicebrokerapi.org/).
  *
  * @example
  * const {google} = require('googleapis');
  * const servicebroker = google.servicebroker('v1');
  *
  * @namespace servicebroker
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Servicebroker
  */
@JSImport("googleapis/build/src/apis/servicebroker/v1", "servicebroker_v1.Servicebroker")
@js.native
class Servicebroker protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var v1: ResourceV1 = js.native
}

