package typings.googleapis.jobsV3Mod.jobsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsCompaniesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional.  The maximum number of companies to be returned, at most 100.
    * Default is 100 if a non-positive number is provided.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional.  The starting indicator from which to return results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required.  Resource name of the project under which the company is
    * created.  The format is "projects/{project_id}", for example,
    * "projects/api-test-project".
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Optional.  Set to true if the companies requested must have open jobs.
    * Defaults to false.  If true, at most page_size of companies are fetched,
    * among which only those with open jobs are returned.
    */
  var requireOpenJobs: js.UndefOr[Boolean] = js.native
}

