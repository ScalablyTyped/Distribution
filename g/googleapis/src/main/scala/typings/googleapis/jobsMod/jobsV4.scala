package typings.googleapis.jobsMod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobsV4 {
  
  @JSImport("googleapis/build/src/apis/jobs", "jobs_v4.Jobs")
  @js.native
  open class Jobs protected ()
    extends typings.googleapis.jobsV4Mod.jobsV4.Jobs {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis/build/src/apis/jobs", "jobs_v4.Resource$Projects")
  @js.native
  open class ResourceProjects protected ()
    extends typings.googleapis.jobsV4Mod.jobsV4.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/jobs", "jobs_v4.Resource$Projects$Operations")
  @js.native
  open class ResourceProjectsOperations protected ()
    extends typings.googleapis.jobsV4Mod.jobsV4.ResourceProjectsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/jobs", "jobs_v4.Resource$Projects$Tenants")
  @js.native
  open class ResourceProjectsTenants protected ()
    extends typings.googleapis.jobsV4Mod.jobsV4.ResourceProjectsTenants {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/jobs", "jobs_v4.Resource$Projects$Tenants$Clientevents")
  @js.native
  open class ResourceProjectsTenantsClientevents protected ()
    extends typings.googleapis.jobsV4Mod.jobsV4.ResourceProjectsTenantsClientevents {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/jobs", "jobs_v4.Resource$Projects$Tenants$Companies")
  @js.native
  open class ResourceProjectsTenantsCompanies protected ()
    extends typings.googleapis.jobsV4Mod.jobsV4.ResourceProjectsTenantsCompanies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/jobs", "jobs_v4.Resource$Projects$Tenants$Jobs")
  @js.native
  open class ResourceProjectsTenantsJobs protected ()
    extends typings.googleapis.jobsV4Mod.jobsV4.ResourceProjectsTenantsJobs {
    def this(context: APIRequestContext) = this()
  }
}
