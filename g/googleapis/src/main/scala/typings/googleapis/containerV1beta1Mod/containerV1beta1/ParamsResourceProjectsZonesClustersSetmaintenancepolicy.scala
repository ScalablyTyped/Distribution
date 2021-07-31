package typings.googleapis.containerV1beta1Mod.containerV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsZonesClustersSetmaintenancepolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The name of the cluster to update.
    */
  var clusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The Google Developers Console [project ID or project
    * number](https://support.google.com/cloud/answer/6158840).
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSetMaintenancePolicyRequest] = js.undefined
  
  /**
    * The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsZonesClustersSetmaintenancepolicy {
  
  @scala.inline
  def apply(): ParamsResourceProjectsZonesClustersSetmaintenancepolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsZonesClustersSetmaintenancepolicy]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsZonesClustersSetmaintenancepolicyMutableBuilder[Self <: ParamsResourceProjectsZonesClustersSetmaintenancepolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaSetMaintenancePolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
