package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreate extends StandardParameters {
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
    * The cloud project
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchCreatePerfSamplesRequest] = js.native
  /**
    * A sample series id
    */
  var sampleSeriesId: js.UndefOr[String] = js.native
  /**
    * A tool results step ID.
    */
  var stepId: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreate {
  @scala.inline
  def apply(): ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreate]
  }
  @scala.inline
  implicit class ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreateOps[Self <: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesBatchcreate] (val x: Self) extends AnyVal {
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
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaBatchCreatePerfSamplesRequest): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
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

