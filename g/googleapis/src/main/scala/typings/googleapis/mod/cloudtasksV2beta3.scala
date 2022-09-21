package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudtasksV2beta3 {
  
  @JSImport("googleapis", "cloudtasks_v2beta3.Cloudtasks")
  @js.native
  open class Cloudtasks protected ()
    extends typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudtasks_v2beta3.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.v2beta3Mod.cloudtasksV2beta3.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudtasks_v2beta3.Resource$Projects$Locations")
  @js.native
  open class ResourceProjectsLocations protected ()
    extends typings.googleapis.v2beta3Mod.cloudtasksV2beta3.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudtasks_v2beta3.Resource$Projects$Locations$Queues")
  @js.native
  open class ResourceProjectsLocationsQueues protected ()
    extends typings.googleapis.v2beta3Mod.cloudtasksV2beta3.ResourceProjectsLocationsQueues {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudtasks_v2beta3.Resource$Projects$Locations$Queues$Tasks")
  @js.native
  open class ResourceProjectsLocationsQueuesTasks protected ()
    extends typings.googleapis.v2beta3Mod.cloudtasksV2beta3.ResourceProjectsLocationsQueuesTasks {
    def this(context: APIRequestContext) = this()
  }
}
