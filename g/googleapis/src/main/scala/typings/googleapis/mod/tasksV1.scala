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
  open class ResourceTasklists protected ()
    extends typings.googleapis.tasksV1Mod.tasksV1.ResourceTasklists {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tasks_v1.Resource$Tasks")
  @js.native
  open class ResourceTasks protected ()
    extends typings.googleapis.tasksV1Mod.tasksV1.ResourceTasks {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "tasks_v1.Tasks")
  @js.native
  open class Tasks protected ()
    extends typings.googleapis.tasksV1Mod.tasksV1.Tasks {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
