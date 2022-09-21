package typings.googleapis.runMod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runV1alpha1 {
  
  @JSImport("googleapis/build/src/apis/run", "run_v1alpha1.Resource$Namespaces")
  @js.native
  open class ResourceNamespaces protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.ResourceNamespaces {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/run", "run_v1alpha1.Resource$Namespaces$Jobs")
  @js.native
  open class ResourceNamespacesJobs protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.ResourceNamespacesJobs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/run", "run_v1alpha1.Run")
  @js.native
  open class Run protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.Run {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
