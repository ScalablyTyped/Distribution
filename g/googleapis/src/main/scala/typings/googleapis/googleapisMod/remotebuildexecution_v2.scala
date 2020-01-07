package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "remotebuildexecution_v2")
@js.native
object remotebuildexecution_v2 extends js.Object {
  /**
    * Remote Build Execution API
    *
    * Supplies a Remote Execution API service for tools such as bazel.
    *
    * @example
    * const {google} = require('googleapis');
    * const remotebuildexecution = google.remotebuildexecution('v2');
    *
    * @namespace remotebuildexecution
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Remotebuildexecution
    */
  @js.native
  class Remotebuildexecution protected ()
    extends typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2.Remotebuildexecution {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Actionresults protected ()
    extends typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2.Resource$Actionresults {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Actions protected ()
    extends typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2.Resource$Actions {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Blobs protected ()
    extends typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2.Resource$Blobs {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Operations protected ()
    extends typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2.Resource$Operations {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$V2 protected ()
    extends typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2.Resource$V2 {
    def this(context: APIRequestContext) = this()
  }
  
}

