package typings.googleapis.v1b3Mod.dataflowV1b3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsJobsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains this job.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Cloud Platform project that the job belongs to.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. This field is now in the Job message.
    */
  var replaceJobId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaJob] = js.undefined
  
  /**
    * The level of information requested in response.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsJobsCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsJobsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsJobsCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsJobsCreateMutableBuilder[Self <: ParamsResourceProjectsJobsCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setReplaceJobId(value: String): Self = StObject.set(x, "replaceJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceJobIdUndefined: Self = StObject.set(x, "replaceJobId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaJob): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
