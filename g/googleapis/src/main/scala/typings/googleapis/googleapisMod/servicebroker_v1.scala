package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "servicebroker_v1")
@js.native
object servicebroker_v1 extends js.Object {
  @js.native
  class Resource$V1 protected ()
    extends typings.googleapis.buildSrcApisServicebrokerV1Mod.servicebroker_v1.Resource$V1 {
    def this(context: APIRequestContext) = this()
  }
  
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
  @js.native
  class Servicebroker protected ()
    extends typings.googleapis.buildSrcApisServicebrokerV1Mod.servicebroker_v1.Servicebroker {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
}

