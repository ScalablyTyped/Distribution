package typings.googleapis.securitycenterV1Mod.securitycenterV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsSourcesFindingsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Unique identifier provided by the client within the parent scope. It must
    * be alphanumeric and less than or equal to 32 characters and greater than
    * 0 characters in length.
    */
  var findingId: js.UndefOr[String] = js.undefined
  
  /**
    * Resource name of the new finding's parent. Its format should be
    * "organizations/[organization_id]/sources/[source_id]".
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFinding] = js.undefined
}
object ParamsResourceOrganizationsSourcesFindingsCreate {
  
  inline def apply(): ParamsResourceOrganizationsSourcesFindingsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsSourcesFindingsCreate]
  }
  
  extension [Self <: ParamsResourceOrganizationsSourcesFindingsCreate](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setFindingId(value: String): Self = StObject.set(x, "findingId", value.asInstanceOf[js.Any])
    
    inline def setFindingIdUndefined: Self = StObject.set(x, "findingId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaFinding): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
