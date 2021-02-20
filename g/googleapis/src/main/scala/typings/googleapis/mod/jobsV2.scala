package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobsV2 {
  
  /**
    * Cloud Talent Solution API
    *
    * Cloud Talent Solution provides the capability to create, read, update, and
    * delete job postings, as well as search jobs based on keywords and filters.
    *
    * @example
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v2');
    *
    * @namespace jobs
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Jobs
    */
  @JSImport("googleapis", "jobs_v2.Jobs")
  @js.native
  class Jobs protected ()
    extends typings.googleapis.jobsV2Mod.jobsV2.Jobs {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "jobs_v2.Resource$Companies")
  @js.native
  class ResourceCompanies protected ()
    extends typings.googleapis.jobsV2Mod.jobsV2.ResourceCompanies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "jobs_v2.Resource$Companies$Jobs")
  @js.native
  class ResourceCompaniesJobs protected ()
    extends typings.googleapis.jobsV2Mod.jobsV2.ResourceCompaniesJobs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "jobs_v2.Resource$Jobs")
  @js.native
  class ResourceJobs protected ()
    extends typings.googleapis.jobsV2Mod.jobsV2.ResourceJobs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "jobs_v2.Resource$V2")
  @js.native
  class ResourceV2 protected ()
    extends typings.googleapis.jobsV2Mod.jobsV2.ResourceV2 {
    def this(context: APIRequestContext) = this()
  }
}
