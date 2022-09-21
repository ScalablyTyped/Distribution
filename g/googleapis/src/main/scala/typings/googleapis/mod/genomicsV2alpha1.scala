package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genomicsV2alpha1 {
  
  @JSImport("googleapis", "genomics_v2alpha1.Genomics")
  @js.native
  open class Genomics protected ()
    extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "genomics_v2alpha1.Resource$Pipelines")
  @js.native
  open class ResourcePipelines protected ()
    extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.ResourcePipelines {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "genomics_v2alpha1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "genomics_v2alpha1.Resource$Projects$Operations")
  @js.native
  open class ResourceProjectsOperations protected ()
    extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.ResourceProjectsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "genomics_v2alpha1.Resource$Projects$Workers")
  @js.native
  open class ResourceProjectsWorkers protected ()
    extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.ResourceProjectsWorkers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "genomics_v2alpha1.Resource$Workers")
  @js.native
  open class ResourceWorkers protected ()
    extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.ResourceWorkers {
    def this(context: APIRequestContext) = this()
  }
}
