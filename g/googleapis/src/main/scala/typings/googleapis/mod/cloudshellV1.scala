package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudshellV1 {
  
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
  @JSImport("googleapis", "cloudshell_v1.Cloudshell")
  @js.native
  class Cloudshell protected ()
    extends typings.googleapis.cloudshellV1Mod.cloudshellV1.Cloudshell {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudshell_v1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.cloudshellV1Mod.cloudshellV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
}
