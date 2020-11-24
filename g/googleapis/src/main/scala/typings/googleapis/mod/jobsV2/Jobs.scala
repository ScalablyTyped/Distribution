package typings.googleapis.mod.jobsV2

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
@JSImport("googleapis", "jobs_v2.Jobs")
@js.native
class Jobs protected ()
  extends typings.googleapis.jobsV2Mod.jobsV2.Jobs {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
