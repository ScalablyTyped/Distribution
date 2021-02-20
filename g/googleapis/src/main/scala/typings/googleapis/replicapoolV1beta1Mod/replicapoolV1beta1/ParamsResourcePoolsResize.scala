package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePoolsResize extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The desired number of replicas to resize to. If this number is larger
    * than the existing number of replicas, new replicas will be added. If the
    * number is smaller, then existing replicas will be deleted.
    */
  var numReplicas: js.UndefOr[Double] = js.native
  
  /**
    * The name of the replica pool for this request.
    */
  var poolName: js.UndefOr[String] = js.native
  
  /**
    * The project ID for this replica pool.
    */
  var projectName: js.UndefOr[String] = js.native
  
  /**
    * The zone for this replica pool.
    */
  var zone: js.UndefOr[String] = js.native
}
object ParamsResourcePoolsResize {
  
  @scala.inline
  def apply(): ParamsResourcePoolsResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePoolsResize]
  }
  
  @scala.inline
  implicit class ParamsResourcePoolsResizeMutableBuilder[Self <: ParamsResourcePoolsResize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setNumReplicas(value: Double): Self = StObject.set(x, "numReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumReplicasUndefined: Self = StObject.set(x, "numReplicas", js.undefined)
    
    @scala.inline
    def setPoolName(value: String): Self = StObject.set(x, "poolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolNameUndefined: Self = StObject.set(x, "poolName", js.undefined)
    
    @scala.inline
    def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
