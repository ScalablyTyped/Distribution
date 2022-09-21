package typings.googleapis.jobsMod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobsV3 {
  
  @JSImport("googleapis/build/src/apis/jobs", "jobs_v3.Jobs")
  @js.native
  open class Jobs protected ()
    extends typings.googleapis.jobsV3Mod.jobsV3.Jobs {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis/build/src/apis/jobs", "jobs_v3.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.jobsV3Mod.jobsV3.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/jobs", "jobs_v3.Resource$Projects$Clientevents")
  @js.native
  open class ResourceProjectsClientevents protected ()
    extends typings.googleapis.jobsV3Mod.jobsV3.ResourceProjectsClientevents {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/jobs", "jobs_v3.Resource$Projects$Companies")
  @js.native
  open class ResourceProjectsCompanies protected ()
    extends typings.googleapis.jobsV3Mod.jobsV3.ResourceProjectsCompanies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/jobs", "jobs_v3.Resource$Projects$Jobs")
  @js.native
  open class ResourceProjectsJobs protected ()
    extends typings.googleapis.jobsV3Mod.jobsV3.ResourceProjectsJobs {
    def this(context: APIRequestContext) = this()
  }
}
