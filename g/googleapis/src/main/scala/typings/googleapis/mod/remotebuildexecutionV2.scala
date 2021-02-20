package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remotebuildexecutionV2 {
  
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
  @JSImport("googleapis", "remotebuildexecution_v2.Remotebuildexecution")
  @js.native
  class Remotebuildexecution protected ()
    extends typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "remotebuildexecution_v2.Resource$Actionresults")
  @js.native
  class ResourceActionresults protected ()
    extends typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.ResourceActionresults {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "remotebuildexecution_v2.Resource$Actions")
  @js.native
  class ResourceActions protected ()
    extends typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.ResourceActions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "remotebuildexecution_v2.Resource$Blobs")
  @js.native
  class ResourceBlobs protected ()
    extends typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.ResourceBlobs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "remotebuildexecution_v2.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "remotebuildexecution_v2.Resource$V2")
  @js.native
  class ResourceV2 protected ()
    extends typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.ResourceV2 {
    def this(context: APIRequestContext) = this()
  }
}
