package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SetNetworkPolicyRequest enables/disables network policy for a cluster.
  */
@js.native
trait SchemaSetNetworkPolicyRequest extends StObject {
  
  /**
    * Deprecated. The name of the cluster. This field has been deprecated and
    * replaced by the name field.
    */
  var clusterId: js.UndefOr[String] = js.native
  
  /**
    * The name (project, location, cluster id) of the cluster to set networking
    * policy. Specified in the format
    * &#39;projects/x/locations/x/clusters/ *&#39;.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Configuration options for the NetworkPolicy feature.
    */
  var networkPolicy: js.UndefOr[SchemaNetworkPolicy] = js.native
  
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://developers.google.com/console/help/new/#projectnumber).
    * This field has been deprecated and replaced by the name field.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field has been deprecated and replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.native
}
object SchemaSetNetworkPolicyRequest {
  
  @scala.inline
  def apply(): SchemaSetNetworkPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetNetworkPolicyRequest]
  }
  
  @scala.inline
  implicit class SchemaSetNetworkPolicyRequestMutableBuilder[Self <: SchemaSetNetworkPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetworkPolicy(value: SchemaNetworkPolicy): Self = StObject.set(x, "networkPolicy", value.asInstanceOf[js.Any])
    
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
