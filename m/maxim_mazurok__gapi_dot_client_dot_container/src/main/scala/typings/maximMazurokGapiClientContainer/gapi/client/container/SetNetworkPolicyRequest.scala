package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetNetworkPolicyRequest extends StObject {
  
  /** Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field. */
  var clusterId: js.UndefOr[String] = js.native
  
  /** The name (project, location, cluster id) of the cluster to set networking policy. Specified in the format `projects/∗/locations/∗/clusters/ *`. */
  var name: js.UndefOr[String] = js.native
  
  /** Required. Configuration options for the NetworkPolicy feature. */
  var networkPolicy: js.UndefOr[NetworkPolicy] = js.native
  
  /**
    * Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced
    * by the name field.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and
    * replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.native
}
object SetNetworkPolicyRequest {
  
  @scala.inline
  def apply(): SetNetworkPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetNetworkPolicyRequest]
  }
  
  @scala.inline
  implicit class SetNetworkPolicyRequestMutableBuilder[Self <: SetNetworkPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetworkPolicy(value: NetworkPolicy): Self = StObject.set(x, "networkPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkPolicyUndefined: Self = StObject.set(x, "networkPolicy", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
