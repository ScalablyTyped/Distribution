package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePoolsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The name of the replica pool for this request.
    */
  var poolName: js.UndefOr[String] = js.undefined
  
  /**
    * The project ID for this replica pool.
    */
  var projectName: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPoolsDeleteRequest] = js.undefined
  
  /**
    * The zone for this replica pool.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourcePoolsDelete {
  
  @scala.inline
  def apply(): ParamsResourcePoolsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePoolsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourcePoolsDeleteMutableBuilder[Self <: ParamsResourcePoolsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPoolName(value: String): Self = StObject.set(x, "poolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolNameUndefined: Self = StObject.set(x, "poolName", js.undefined)
    
    @scala.inline
    def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaPoolsDeleteRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
