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

object ParamsResourceProjectsRegionsJobsList {
  @scala.inline
  def apply(): ParamsResourceProjectsRegionsJobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsRegionsJobsList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsRegionsJobsListOps[Self <: ParamsResourceProjectsRegionsJobsList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterName: Self = this.set("clusterName", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setJobStateMatcher(value: String): Self = this.set("jobStateMatcher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobStateMatcher: Self = this.set("jobStateMatcher", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

