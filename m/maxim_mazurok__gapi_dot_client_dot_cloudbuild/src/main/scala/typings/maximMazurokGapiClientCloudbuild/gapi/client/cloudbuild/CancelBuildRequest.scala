package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelBuildRequest extends StObject {
  
  /** Required. ID of the build. */
  var id: js.UndefOr[String] = js.native
  
  /** The name of the `Build` to retrieve. Format: `projects/{project}/locations/{location}/builds/{build}` */
  var name: js.UndefOr[String] = js.native
  
  /** Required. ID of the project. */
  var projectId: js.UndefOr[String] = js.native
}
object CancelBuildRequest {
  
  @scala.inline
  def apply(): CancelBuildRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelBuildRequest]
  }
  
  @scala.inline
  implicit class CancelBuildRequestMutableBuilder[Self <: CancelBuildRequest] (val x: Self) extends AnyVal {
    
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
