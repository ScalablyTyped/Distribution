package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudtasksV2beta2 {
  
  @JSImport("googleapis", "cloudtasks_v2beta2.Cloudtasks")
  @js.native
  open class Cloudtasks protected ()
    extends typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudtasks_v2beta2.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.v2beta2Mod.cloudtasksV2beta2.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudtasks_v2beta2.Resource$Projects$Locations")
  @js.native
  open class ResourceProjectsLocations protected ()
    extends typings.googleapis.v2beta2Mod.cloudtasksV2beta2.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudtasks_v2beta2.Resource$Projects$Locations$Queues")
  @js.native
  open class ResourceProjectsLocationsQueues protected ()
    extends typings.googleapis.v2beta2Mod.cloudtasksV2beta2.ResourceProjectsLocationsQueues {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudtasks_v2beta2.Resource$Projects$Locations$Queues$Tasks")
  @js.native
  open class ResourceProjectsLocationsQueuesTasks protected ()
    extends typings.googleapis.v2beta2Mod.cloudtasksV2beta2.ResourceProjectsLocationsQueuesTasks {
    def this(context: APIRequestContext) = this()
  }
}
