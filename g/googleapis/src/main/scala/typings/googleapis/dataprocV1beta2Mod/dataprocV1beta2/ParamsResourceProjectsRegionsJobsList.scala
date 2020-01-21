package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsRegionsJobsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. If set, the returned jobs list includes only jobs that were
    * submitted to the named cluster.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * Optional. A filter constraining the jobs to list. Filters are
    * case-sensitive and have the following syntax:field = value AND field =
    * value ...where field is status.state or labels.[KEY], and [KEY] is a
    * label key. value can be * to match all values. status.state can be either
    * ACTIVE or NON_ACTIVE. Only the logical AND operator is supported;
    * space-separated items are treated as having an implicit AND
    * operator.Example filter:status.state = ACTIVE AND labels.env = staging
    * AND labels.starred = *
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Optional. Specifies enumerated categories of jobs to list. (default =
    * match ALL jobs).If filter is provided, jobStateMatcher will be ignored.
    */
  var jobStateMatcher: js.UndefOr[String] = js.native
  /**
    * Optional. The number of results to return in each response.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional. The page token, returned by a previous call, to request the
    * next page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The ID of the Google Cloud Platform project that the job
    * belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Required. The Cloud Dataproc region in which to handle the request.
    */
  var region: js.UndefOr[String] = js.native
}

