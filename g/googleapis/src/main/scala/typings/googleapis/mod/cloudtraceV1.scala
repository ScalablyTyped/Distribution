package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudtraceV1 {
  
  @JSImport("googleapis", "cloudtrace_v1.Cloudtrace")
  @js.native
  open class Cloudtrace protected ()
    extends typings.googleapis.cloudtraceV1Mod.cloudtraceV1.Cloudtrace {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudtrace_v1.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.cloudtraceV1Mod.cloudtraceV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudtrace_v1.Resource$Projects$Traces")
  @js.native
  open class ResourceProjectsTraces protected ()
    extends typings.googleapis.cloudtraceV1Mod.cloudtraceV1.ResourceProjectsTraces {
    def this(context: APIRequestContext) = this()
  }
}
