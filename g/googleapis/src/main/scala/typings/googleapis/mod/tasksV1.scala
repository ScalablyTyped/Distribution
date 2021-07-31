package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tasksV1 {
  
  @JSImport("googleapis", "tasks_v1.Resource$Tasklists")
  @js.native
  class ResourceTasklists protected ()
    extends typings.googleapis.tasksV1Mod.tasksV1.ResourceTasklists {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tasks_v1.Resource$Tasks")
  @js.native
  class ResourceTasks protected ()
    extends typings.googleapis.tasksV1Mod.tasksV1.ResourceTasks {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Tasks API
    *
    * Manages your tasks and task lists.
    *
    * @example
    * const {google} = require('googleapis');
    * const tasks = google.tasks('v1');
    *
    * @namespace tasks
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Tasks
    */
  @JSImport("googleapis", "tasks_v1.Tasks")
  @js.native
  class Tasks protected ()
    extends typings.googleapis.tasksV1Mod.tasksV1.Tasks {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
