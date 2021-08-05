package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReplicasDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The replica pool name for this request.
    */
  var poolName: js.UndefOr[String] = js.undefined
  
  /**
    * The project ID for this request.
    */
  var projectName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the replica for this request.
    */
  var replicaName: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReplicasDeleteRequest] = js.undefined
  
  /**
    * The zone where the replica lives.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceReplicasDelete {
  
  inline def apply(): ParamsResourceReplicasDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReplicasDelete]
  }
  
  extension [Self <: ParamsResourceReplicasDelete](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setPoolName(value: String): Self = StObject.set(x, "poolName", value.asInstanceOf[js.Any])
    
    inline def setPoolNameUndefined: Self = StObject.set(x, "poolName", js.undefined)
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    inline def setReplicaName(value: String): Self = StObject.set(x, "replicaName", value.asInstanceOf[js.Any])
    
    inline def setReplicaNameUndefined: Self = StObject.set(x, "replicaName", js.undefined)
    
    inline def setRequestBody(value: SchemaReplicasDeleteRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
