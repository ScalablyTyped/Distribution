package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SetNetworkPolicyRequest enables/disables network policy for a cluster.
  */
trait SchemaSetNetworkPolicyRequest extends StObject {
  
  /**
    * Deprecated. The name of the cluster. This field has been deprecated and
    * replaced by the name field.
    */
  var clusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The name (project, location, cluster id) of the cluster to set networking
    * policy. Specified in the format
    * &#39;projects/x/locations/x/clusters/ *&#39;.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration options for the NetworkPolicy feature.
    */
  var networkPolicy: js.UndefOr[SchemaNetworkPolicy] = js.undefined
  
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://developers.google.com/console/help/new/#projectnumber).
    * This field has been deprecated and replaced by the name field.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field has been deprecated and replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaSetNetworkPolicyRequest {
  
  inline def apply(): SchemaSetNetworkPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetNetworkPolicyRequest]
  }
  
  extension [Self <: SchemaSetNetworkPolicyRequest](x: Self) {
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkPolicy(value: SchemaNetworkPolicy): Self = StObject.set(x, "networkPolicy", value.asInstanceOf[js.Any])
    
    inline def setNetworkPolicyUndefined: Self = StObject.set(x, "networkPolicy", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
