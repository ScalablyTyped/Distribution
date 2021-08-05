package typings.googleapis.visionV1Mod.visionV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsProductsReferenceimagesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Resource name of the product in which to create the reference image.
    * Format is `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * A user-supplied resource id for the ReferenceImage to be added. If set,
    * the server will attempt to use this value as the resource id. If it is
    * already in use, an error is returned with code ALREADY_EXISTS. Must be at
    * most 128 characters long. It cannot contain the character `/`.
    */
  var referenceImageId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReferenceImage] = js.undefined
}
object ParamsResourceProjectsLocationsProductsReferenceimagesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsProductsReferenceimagesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProductsReferenceimagesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsProductsReferenceimagesCreate](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setReferenceImageId(value: String): Self = StObject.set(x, "referenceImageId", value.asInstanceOf[js.Any])
    
    inline def setReferenceImageIdUndefined: Self = StObject.set(x, "referenceImageId", js.undefined)
    
    inline def setRequestBody(value: SchemaReferenceImage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
