package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudbuildV1alpha2 {
  
  @JSImport("googleapis", "cloudbuild_v1alpha2.Cloudbuild")
  @js.native
  open class Cloudbuild protected ()
    extends typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2.Cloudbuild {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudbuild_v1alpha2.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudbuild_v1alpha2.Resource$Projects$Locations")
  @js.native
  open class ResourceProjectsLocations protected ()
    extends typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudbuild_v1alpha2.Resource$Projects$Locations$Operations")
  @js.native
  open class ResourceProjectsLocationsOperations protected ()
    extends typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2.ResourceProjectsLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudbuild_v1alpha2.Resource$Projects$Workerpools")
  @js.native
  open class ResourceProjectsWorkerpools protected ()
    extends typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2.ResourceProjectsWorkerpools {
    def this(context: APIRequestContext) = this()
  }
}
