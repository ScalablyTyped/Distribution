package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remotebuildexecutionV1alpha {
  
  /**
    * Remote Build Execution API
    *
    * Supplies a Remote Execution API service for tools such as bazel.
    *
    * @example
    * const {google} = require('googleapis');
    * const remotebuildexecution = google.remotebuildexecution('v1alpha');
    *
    * @namespace remotebuildexecution
    * @type {Function}
    * @version v1alpha
    * @variation v1alpha
    * @param {object=} options Options for Remotebuildexecution
    */
  @JSImport("googleapis", "remotebuildexecution_v1alpha.Remotebuildexecution")
  @js.native
  class Remotebuildexecution protected ()
    extends typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "remotebuildexecution_v1alpha.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "remotebuildexecution_v1alpha.Resource$Projects$Instances")
  @js.native
  class ResourceProjectsInstances protected ()
    extends typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.ResourceProjectsInstances {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "remotebuildexecution_v1alpha.Resource$Projects$Instances$Workerpools")
  @js.native
  class ResourceProjectsInstancesWorkerpools protected ()
    extends typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.ResourceProjectsInstancesWorkerpools {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "remotebuildexecution_v1alpha.Resource$Projects$Operations")
  @js.native
  class ResourceProjectsOperations protected ()
    extends typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.ResourceProjectsOperations {
    def this(context: APIRequestContext) = this()
  }
}
