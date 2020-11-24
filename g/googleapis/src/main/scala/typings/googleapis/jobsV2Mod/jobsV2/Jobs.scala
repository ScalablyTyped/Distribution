package typings.googleapis.jobsV2Mod.jobsV2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("googleapis/build/src/apis/jobs/v2", "jobs_v2.Jobs")
@js.native
class Jobs protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var companies: ResourceCompanies = js.native
  
  var context: APIRequestContext = js.native
  
  var jobs: ResourceJobs = js.native
  
  var v2: ResourceV2 = js.native
}
