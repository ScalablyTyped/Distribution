package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsHistoriesExecutionsStepsThumbnailsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * An Execution id.  Required.
    */
  var executionId: js.UndefOr[String] = js.undefined
  
  /**
    * A History id.  Required.
    */
  var historyId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of thumbnails to fetch.  Default value: 50. The server
    * will use this default if the field is not set or has a value of 0.
    * Optional.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A continuation token to resume the query at the next item.  Optional.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A Project id.  Required.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * A Step id.  Required.
    */
  var stepId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsHistoriesExecutionsStepsThumbnailsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsHistoriesExecutionsStepsThumbnailsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsHistoriesExecutionsStepsThumbnailsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsHistoriesExecutionsStepsThumbnailsListMutableBuilder[Self <: ParamsResourceProjectsHistoriesExecutionsStepsThumbnailsList] (val x: Self) extends AnyVal {
    
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
    def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
