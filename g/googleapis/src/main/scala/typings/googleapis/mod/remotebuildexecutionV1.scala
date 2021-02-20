package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remotebuildexecutionV1 {
  
  /**
    * Remote Build Execution API
    *
    * Supplies a Remote Execution API service for tools such as bazel.
    *
    * @example
    * const {google} = require('googleapis');
    * const remotebuildexecution = google.remotebuildexecution('v1');
    *
    * @namespace remotebuildexecution
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Remotebuildexecution
    */
  @JSImport("googleapis", "remotebuildexecution_v1.Remotebuildexecution")
  @js.native
  class Remotebuildexecution protected ()
    extends typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.Remotebuildexecution {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "remotebuildexecution_v1.Resource$Media")
  @js.native
  class ResourceMedia protected ()
    extends typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.ResourceMedia {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "remotebuildexecution_v1.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "remotebuildexecution_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "remotebuildexecution_v1.Resource$Projects$Operations")
  @js.native
  class ResourceProjectsOperations protected ()
    extends typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.ResourceProjectsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "remotebuildexecution_v1.Resource$V1")
  @js.native
  class ResourceV1 protected ()
    extends typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.ResourceV1 {
    def this(context: APIRequestContext) = this()
  }
}
