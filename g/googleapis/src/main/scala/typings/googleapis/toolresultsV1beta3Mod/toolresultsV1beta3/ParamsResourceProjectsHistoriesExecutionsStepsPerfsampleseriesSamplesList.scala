package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesListMutableBuilder[Self <: ParamsResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamplesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    @scala.inline
    def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setSampleSeriesId(value: String): Self = StObject.set(x, "sampleSeriesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleSeriesIdUndefined: Self = StObject.set(x, "sampleSeriesId", js.undefined)
    
    @scala.inline
    def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
