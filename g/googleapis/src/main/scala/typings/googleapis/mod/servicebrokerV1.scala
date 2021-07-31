package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicebrokerV1 {
  
  @JSImport("googleapis", "servicebroker_v1.Resource$V1")
  @js.native
  class ResourceV1 protected ()
    extends typings.googleapis.servicebrokerV1Mod.servicebrokerV1.ResourceV1 {
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
  @JSImport("googleapis", "servicebroker_v1.Servicebroker")
  @js.native
  class Servicebroker protected ()
    extends typings.googleapis.servicebrokerV1Mod.servicebrokerV1.Servicebroker {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
