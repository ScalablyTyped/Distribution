package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePoolsResize
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The desired number of replicas to resize to. If this number is larger
    * than the existing number of replicas, new replicas will be added. If the
    * number is smaller, then existing replicas will be deleted.
    */
  var numReplicas: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the replica pool for this request.
    */
  var poolName: js.UndefOr[String] = js.undefined
  
  /**
    * The project ID for this replica pool.
    */
  var projectName: js.UndefOr[String] = js.undefined
  
  /**
    * The zone for this replica pool.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourcePoolsResize {
  
  inline def apply(): ParamsResourcePoolsResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePoolsResize]
  }
  
  extension [Self <: ParamsResourcePoolsResize](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setNumReplicas(value: Double): Self = StObject.set(x, "numReplicas", value.asInstanceOf[js.Any])
    
    inline def setNumReplicasUndefined: Self = StObject.set(x, "numReplicas", js.undefined)
    
    inline def setPoolName(value: String): Self = StObject.set(x, "poolName", value.asInstanceOf[js.Any])
    
    inline def setPoolNameUndefined: Self = StObject.set(x, "poolName", js.undefined)
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
