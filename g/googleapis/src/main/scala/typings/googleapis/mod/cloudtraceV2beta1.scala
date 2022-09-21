package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudtraceV2beta1 {
  
  @JSImport("googleapis", "cloudtrace_v2beta1.Cloudtrace")
  @js.native
  open class Cloudtrace protected ()
    extends typings.googleapis.cloudtraceV2beta1Mod.cloudtraceV2beta1.Cloudtrace {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudtrace_v2beta1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.cloudtraceV2beta1Mod.cloudtraceV2beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudtrace_v2beta1.Resource$Projects$Tracesinks")
  @js.native
  open class ResourceProjectsTracesinks protected ()
    extends typings.googleapis.cloudtraceV2beta1Mod.cloudtraceV2beta1.ResourceProjectsTracesinks {
    def this(context: APIRequestContext) = this()
  }
}
