package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate extends StandardParameters {
  
  /**
    * The ID of the Annotation store that is being created. The string must
    * match the following regex: `[\p{L}\p{N}_\-\.]{1,256}`.
    */
  var annotationStoreId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The name of the dataset this Annotation store belongs to.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAnnotationStore] = js.native
}
object ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreateMutableBuilder[Self <: ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationStoreId(value: String): Self = StObject.set(x, "annotationStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationStoreIdUndefined: Self = StObject.set(x, "annotationStoreId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaAnnotationStore): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
