package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudtasksV2 {
  
  /**
    * Cloud Tasks API
    *
    * Manages the execution of large numbers of distributed requests.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudtasks = google.cloudtasks('v2');
    *
    * @namespace cloudtasks
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Cloudtasks
    */
  @JSImport("googleapis", "cloudtasks_v2.Cloudtasks")
  @js.native
  class Cloudtasks protected ()
    extends typings.googleapis.cloudtasksV2Mod.cloudtasksV2.Cloudtasks {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudtasks_v2.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.cloudtasksV2Mod.cloudtasksV2.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudtasks_v2.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typings.googleapis.cloudtasksV2Mod.cloudtasksV2.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudtasks_v2.Resource$Projects$Locations$Queues")
  @js.native
  class ResourceProjectsLocationsQueues protected ()
    extends typings.googleapis.cloudtasksV2Mod.cloudtasksV2.ResourceProjectsLocationsQueues {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudtasks_v2.Resource$Projects$Locations$Queues$Tasks")
  @js.native
  class ResourceProjectsLocationsQueuesTasks protected ()
    extends typings.googleapis.cloudtasksV2Mod.cloudtasksV2.ResourceProjectsLocationsQueuesTasks {
    def this(context: APIRequestContext) = this()
  }
}
