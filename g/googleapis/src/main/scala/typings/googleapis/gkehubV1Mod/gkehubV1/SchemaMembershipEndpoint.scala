package typings.googleapis.gkehubV1Mod.gkehubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembershipEndpoint extends StObject {
  
  /**
    * Optional. Specific information for a GDC Edge Appliance cluster.
    */
  var applianceCluster: js.UndefOr[SchemaApplianceCluster] = js.undefined
  
  /**
    * Optional. Specific information for a Google Edge cluster.
    */
  var edgeCluster: js.UndefOr[SchemaEdgeCluster] = js.undefined
  
  /**
    * Optional. Specific information for a GKE-on-GCP cluster.
    */
  var gkeCluster: js.UndefOr[SchemaGkeCluster] = js.undefined
  
  /**
    * Output only. Useful Kubernetes-specific metadata.
    */
  var kubernetesMetadata: js.UndefOr[SchemaKubernetesMetadata] = js.undefined
  
  /**
    * Optional. The in-cluster Kubernetes Resources that should be applied for a correctly registered cluster, in the steady state. These resources: * Ensure that the cluster is exclusively registered to one and only one Hub Membership. * Propagate Workload Pool Information available in the Membership Authority field. * Ensure proper initial configuration of default Hub Features.
    */
  var kubernetesResource: js.UndefOr[SchemaKubernetesResource] = js.undefined
  
  /**
    * Optional. Specific information for a GKE Multi-Cloud cluster.
    */
  var multiCloudCluster: js.UndefOr[SchemaMultiCloudCluster] = js.undefined
  
  /**
    * Optional. Specific information for a GKE On-Prem cluster. An onprem user-cluster who has no resourceLink is not allowed to use this field, it should have a nil "type" instead.
    */
  var onPremCluster: js.UndefOr[SchemaOnPremCluster] = js.undefined
}
object SchemaMembershipEndpoint {
  
  inline def apply(): SchemaMembershipEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipEndpoint]
  }
  
  extension [Self <: SchemaMembershipEndpoint](x: Self) {
    
    inline def setApplianceCluster(value: SchemaApplianceCluster): Self = StObject.set(x, "applianceCluster", value.asInstanceOf[js.Any])
    
    inline def setApplianceClusterUndefined: Self = StObject.set(x, "applianceCluster", js.undefined)
    
    inline def setEdgeCluster(value: SchemaEdgeCluster): Self = StObject.set(x, "edgeCluster", value.asInstanceOf[js.Any])
    
    inline def setEdgeClusterUndefined: Self = StObject.set(x, "edgeCluster", js.undefined)
    
    inline def setGkeCluster(value: SchemaGkeCluster): Self = StObject.set(x, "gkeCluster", value.asInstanceOf[js.Any])
    
    inline def setGkeClusterUndefined: Self = StObject.set(x, "gkeCluster", js.undefined)
    
    inline def setKubernetesMetadata(value: SchemaKubernetesMetadata): Self = StObject.set(x, "kubernetesMetadata", value.asInstanceOf[js.Any])
    
    inline def setKubernetesMetadataUndefined: Self = StObject.set(x, "kubernetesMetadata", js.undefined)
    
    inline def setKubernetesResource(value: SchemaKubernetesResource): Self = StObject.set(x, "kubernetesResource", value.asInstanceOf[js.Any])
    
    inline def setKubernetesResourceUndefined: Self = StObject.set(x, "kubernetesResource", js.undefined)
    
    inline def setMultiCloudCluster(value: SchemaMultiCloudCluster): Self = StObject.set(x, "multiCloudCluster", value.asInstanceOf[js.Any])
    
    inline def setMultiCloudClusterUndefined: Self = StObject.set(x, "multiCloudCluster", js.undefined)
    
    inline def setOnPremCluster(value: SchemaOnPremCluster): Self = StObject.set(x, "onPremCluster", value.asInstanceOf[js.Any])
    
    inline def setOnPremClusterUndefined: Self = StObject.set(x, "onPremCluster", js.undefined)
  }
}
