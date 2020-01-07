package typings.googleapis.googleapisMod.jobs_v2

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2.Jobs {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

