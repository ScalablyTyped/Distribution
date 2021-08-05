package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReplicasList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Maximum count of results to be returned. Acceptable values are 0 to 100,
    * inclusive. (Default: 50)
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Set this to the nextPageToken value returned by a previous list request
    * to obtain the next page of results from the previous list request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The replica pool name for this request.
    */
  var poolName: js.UndefOr[String] = js.undefined
  
  /**
    * The project ID for this request.
    */
  var projectName: js.UndefOr[String] = js.undefined
  
  /**
    * The zone where the replica pool lives.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceReplicasList {
  
  inline def apply(): ParamsResourceReplicasList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReplicasList]
  }
  
  extension [Self <: ParamsResourceReplicasList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPoolName(value: String): Self = StObject.set(x, "poolName", value.asInstanceOf[js.Any])
    
    inline def setPoolNameUndefined: Self = StObject.set(x, "poolName", js.undefined)
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
