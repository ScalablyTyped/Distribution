package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobsV3p1beta1 {
  
  /**
    * Cloud Talent Solution API
    *
    * Cloud Talent Solution provides the capability to create, read, update, and
    * delete job postings, as well as search jobs based on keywords and filters.
    *
    * @example
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v3p1beta1');
    *
    * @namespace jobs
    * @type {Function}
    * @version v3p1beta1
    * @variation v3p1beta1
    * @param {object=} options Options for Jobs
    */
  @JSImport("googleapis", "jobs_v3p1beta1.Jobs")
  @js.native
  class Jobs protected ()
    extends typings.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "jobs_v3p1beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.v3p1beta1Mod.jobsV3p1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "jobs_v3p1beta1.Resource$Projects$Clientevents")
  @js.native
  class ResourceProjectsClientevents protected ()
    extends typings.googleapis.v3p1beta1Mod.jobsV3p1beta1.ResourceProjectsClientevents {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "jobs_v3p1beta1.Resource$Projects$Companies")
  @js.native
  class ResourceProjectsCompanies protected ()
    extends typings.googleapis.v3p1beta1Mod.jobsV3p1beta1.ResourceProjectsCompanies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "jobs_v3p1beta1.Resource$Projects$Jobs")
  @js.native
  class ResourceProjectsJobs protected ()
    extends typings.googleapis.v3p1beta1Mod.jobsV3p1beta1.ResourceProjectsJobs {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "jobs_v3p1beta1.Resource$Projects$Operations")
  @js.native
  class ResourceProjectsOperations protected ()
    extends typings.googleapis.v3p1beta1Mod.jobsV3p1beta1.ResourceProjectsOperations {
    def this(context: APIRequestContext) = this()
  }
}
