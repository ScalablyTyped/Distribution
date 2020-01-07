package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "discovery_v1")
@js.native
object discovery_v1 extends js.Object {
  /**
    * API Discovery Service
    *
    * Provides information about other Google APIs, such as what APIs are
    * available, the resource, and method details for each API.
    *
    * @example
    * const {google} = require('googleapis');
    * const discovery = google.discovery('v1');
    *
    * @namespace discovery
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Discovery
    */
  @js.native
  class Discovery protected ()
    extends typings.googleapis.buildSrcApisDiscoveryV1Mod.discovery_v1.Discovery {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Apis protected ()
    extends typings.googleapis.buildSrcApisDiscoveryV1Mod.discovery_v1.Resource$Apis {
    def this(context: APIRequestContext) = this()
  }
  
}

