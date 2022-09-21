package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idsV1 {
  
  @JSImport("googleapis", "ids_v1.Ids")
  @js.native
  open class Ids protected ()
    extends typings.googleapis.idsV1Mod.idsV1.Ids {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "ids_v1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.idsV1Mod.idsV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "ids_v1.Resource$Projects$Locations")
  @js.native
  open class ResourceProjectsLocations protected ()
    extends typings.googleapis.idsV1Mod.idsV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "ids_v1.Resource$Projects$Locations$Endpoints")
  @js.native
  open class ResourceProjectsLocationsEndpoints protected ()
    extends typings.googleapis.idsV1Mod.idsV1.ResourceProjectsLocationsEndpoints {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "ids_v1.Resource$Projects$Locations$Operations")
  @js.native
  open class ResourceProjectsLocationsOperations protected ()
    extends typings.googleapis.idsV1Mod.idsV1.ResourceProjectsLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
}
