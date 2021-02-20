package typings.googleapis.visionV1Mod.visionV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsProductsetsCreate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The project in which the ProductSet should be created.  Format is
    * `projects/PROJECT_ID/locations/LOC_ID`.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * A user-supplied resource id for this ProductSet. If set, the server will
    * attempt to use this value as the resource id. If it is already in use, an
    * error is returned with code ALREADY_EXISTS. Must be at most 128
    * characters long. It cannot contain the character `/`.
    */
  var productSetId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProductSet] = js.native
}
object ParamsResourceProjectsLocationsProductsetsCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsProductsetsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProductsetsCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsProductsetsCreateMutableBuilder[Self <: ParamsResourceProjectsLocationsProductsetsCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setProductSetId(value: String): Self = StObject.set(x, "productSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductSetIdUndefined: Self = StObject.set(x, "productSetId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaProductSet): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
