package typings.googleapis.jobsMod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobsV2 {
  
  @JSImport("googleapis/build/src/apis/jobs", "jobs_v2.Jobs")
  @js.native
  open class Jobs protected ()
    extends typings.googleapis.jobsV2Mod.jobsV2.Jobs {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis/build/src/apis/jobs", "jobs_v2.Resource$Companies")
  @js.native
  open class ResourceCompanies protected ()
    extends typings.googleapis.jobsV2Mod.jobsV2.ResourceCompanies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/jobs", "jobs_v2.Resource$Companies$Jobs")
  @js.native
  open class ResourceCompaniesJobs protected ()
    extends typings.googleapis.jobsV2Mod.jobsV2.ResourceCompaniesJobs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/jobs", "jobs_v2.Resource$Jobs")
  @js.native
  open class ResourceJobs protected ()
    extends typings.googleapis.jobsV2Mod.jobsV2.ResourceJobs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis/build/src/apis/jobs", "jobs_v2.Resource$V2")
  @js.native
  open class ResourceV2 protected ()
    extends typings.googleapis.jobsV2Mod.jobsV2.ResourceV2 {
    def this(context: APIRequestContext) = this()
  }
}
