package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A tool results execution ID.
    */
  var executionId: js.UndefOr[String] = js.native
  /**
    * A tool results history ID.
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * The default page size is 500 samples, and the maximum size is 5000. If
    * the page_size is greater than 5000, the effective page size will be 5000
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional, the next_page_token returned in the previous response
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The cloud project
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * A sample series id
    */
  var sampleSeriesId: js.UndefOr[String] = js.native
  /**
    * A tool results step ID.
    */
  var stepId: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesList {
  @scala.inline
  def apply(): ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesListOps[Self <: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesList] (val x: Self) extends AnyVal {
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
    def setExecutionId(value: String): Self = this.set("executionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionId: Self = this.set("executionId", js.undefined)
    @scala.inline
    def setHistoryId(value: String): Self = this.set("historyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoryId: Self = this.set("historyId", js.undefined)
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
    def setSampleSeriesId(value: String): Self = this.set("sampleSeriesId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleSeriesId: Self = this.set("sampleSeriesId", js.undefined)
    @scala.inline
    def setStepId(value: String): Self = this.set("stepId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepId: Self = this.set("stepId", js.undefined)
  }
  
}

