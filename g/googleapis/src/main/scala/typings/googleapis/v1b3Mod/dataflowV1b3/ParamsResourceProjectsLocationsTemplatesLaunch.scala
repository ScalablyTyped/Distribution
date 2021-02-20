package typings.googleapis.v1b3Mod.dataflowV1b3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsTemplatesLaunch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Path to dynamic template spec file on GCS. The file must be a Json
    * serialized DynamicTemplateFieSpec object.
    */
  @JSName("dynamicTemplate.gcsPath")
  var dynamicTemplateDotgcsPath: js.UndefOr[String] = js.native
  
  /**
    * Cloud Storage path for staging dependencies. Must be a valid Cloud
    * Storage URL, beginning with `gs://`.
    */
  @JSName("dynamicTemplate.stagingLocation")
  var dynamicTemplateDotstagingLocation: js.UndefOr[String] = js.native
  
  /**
    * A Cloud Storage path to the template from which to create the job. Must
    * be valid Cloud Storage URL, beginning with 'gs://'.
    */
  var gcsPath: js.UndefOr[String] = js.native
  
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to
    * which to direct the request.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * Required. The ID of the Cloud Platform project that the job belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLaunchTemplateParameters] = js.native
  
  /**
    * If true, the request is validated but not actually executed. Defaults to
    * false.
    */
  var validateOnly: js.UndefOr[Boolean] = js.native
}
object ParamsResourceProjectsLocationsTemplatesLaunch {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsTemplatesLaunch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTemplatesLaunch]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsTemplatesLaunchMutableBuilder[Self <: ParamsResourceProjectsLocationsTemplatesLaunch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDynamicTemplateDotgcsPath(value: String): Self = StObject.set(x, "dynamicTemplate.gcsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicTemplateDotgcsPathUndefined: Self = StObject.set(x, "dynamicTemplate.gcsPath", js.undefined)
    
    @scala.inline
    def setDynamicTemplateDotstagingLocation(value: String): Self = StObject.set(x, "dynamicTemplate.stagingLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicTemplateDotstagingLocationUndefined: Self = StObject.set(x, "dynamicTemplate.stagingLocation", js.undefined)
    
    @scala.inline
    def setGcsPath(value: String): Self = StObject.set(x, "gcsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsPathUndefined: Self = StObject.set(x, "gcsPath", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaLaunchTemplateParameters): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
