package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileV1 {
  
  @JSImport("googleapis", "file_v1.File")
  @js.native
  open class File protected ()
    extends typings.googleapis.fileV1Mod.fileV1.File {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "file_v1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.fileV1Mod.fileV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "file_v1.Resource$Projects$Locations")
  @js.native
  open class ResourceProjectsLocations protected ()
    extends typings.googleapis.fileV1Mod.fileV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "file_v1.Resource$Projects$Locations$Backups")
  @js.native
  open class ResourceProjectsLocationsBackups protected ()
    extends typings.googleapis.fileV1Mod.fileV1.ResourceProjectsLocationsBackups {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "file_v1.Resource$Projects$Locations$Instances")
  @js.native
  open class ResourceProjectsLocationsInstances protected ()
    extends typings.googleapis.fileV1Mod.fileV1.ResourceProjectsLocationsInstances {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "file_v1.Resource$Projects$Locations$Instances$Snapshots")
  @js.native
  open class ResourceProjectsLocationsInstancesSnapshots protected ()
    extends typings.googleapis.fileV1Mod.fileV1.ResourceProjectsLocationsInstancesSnapshots {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "file_v1.Resource$Projects$Locations$Operations")
  @js.native
  open class ResourceProjectsLocationsOperations protected ()
    extends typings.googleapis.fileV1Mod.fileV1.ResourceProjectsLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
}
