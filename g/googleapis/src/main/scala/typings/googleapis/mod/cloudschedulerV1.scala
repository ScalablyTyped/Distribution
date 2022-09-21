package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudschedulerV1 {
  
  @JSImport("googleapis", "cloudscheduler_v1.Cloudscheduler")
  @js.native
  open class Cloudscheduler protected ()
    extends typings.googleapis.cloudschedulerV1Mod.cloudschedulerV1.Cloudscheduler {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudscheduler_v1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.cloudschedulerV1Mod.cloudschedulerV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudscheduler_v1.Resource$Projects$Locations")
  @js.native
  open class ResourceProjectsLocations protected ()
    extends typings.googleapis.cloudschedulerV1Mod.cloudschedulerV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudscheduler_v1.Resource$Projects$Locations$Jobs")
  @js.native
  open class ResourceProjectsLocationsJobs protected ()
    extends typings.googleapis.cloudschedulerV1Mod.cloudschedulerV1.ResourceProjectsLocationsJobs {
    def this(context: APIRequestContext) = this()
  }
}
