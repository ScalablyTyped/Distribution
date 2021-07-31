package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryBuildRequest extends StObject {
  
  /** Required. Build ID of the original build. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The name of the `Build` to retry. Format: `projects/{project}/locations/{location}/builds/{build}` */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. ID of the project. */
  var projectId: js.UndefOr[String] = js.undefined
}
object RetryBuildRequest {
  
  @scala.inline
  def apply(): RetryBuildRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryBuildRequest]
  }
  
  @scala.inline
  implicit class RetryBuildRequestMutableBuilder[Self <: RetryBuildRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
