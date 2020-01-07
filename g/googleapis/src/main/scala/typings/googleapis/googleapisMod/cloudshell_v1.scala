package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "cloudshell_v1")
@js.native
object cloudshell_v1 extends js.Object {
  /**
    * Cloud Shell API
    *
    * Allows users to start, configure, and connect to interactive shell sessions
    * running in the cloud.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudshell = google.cloudshell('v1');
    *
    * @namespace cloudshell
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Cloudshell
    */
  @js.native
  class Cloudshell protected ()
    extends typings.googleapis.buildSrcApisCloudshellV1Mod.cloudshell_v1.Cloudshell {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Operations protected ()
    extends typings.googleapis.buildSrcApisCloudshellV1Mod.cloudshell_v1.Resource$Operations {
    def this(context: APIRequestContext) = this()
  }
  
}

