package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the Annotation store that is being created. The string must
    * match the following regex: `[\p{L}\p{N}_\-\.]{1,256}`.
    */
  var annotationStoreId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The name of the dataset this Annotation store belongs to.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAnnotationStore] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate](x: Self) {
    
    inline def setAnnotationStoreId(value: String): Self = StObject.set(x, "annotationStoreId", value.asInstanceOf[js.Any])
    
    inline def setAnnotationStoreIdUndefined: Self = StObject.set(x, "annotationStoreId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaAnnotationStore): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
