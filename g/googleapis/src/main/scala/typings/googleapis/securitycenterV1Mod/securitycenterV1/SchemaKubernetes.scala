package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKubernetes extends StObject {
  
  /**
    * Provides information on any Kubernetes access reviews (i.e. privilege checks) relevant to the finding.
    */
  var accessReviews: js.UndefOr[js.Array[SchemaAccessReview]] = js.undefined
  
  /**
    * Provides Kubernetes role binding information for findings that involve RoleBindings or ClusterRoleBindings.
    */
  var bindings: js.UndefOr[js.Array[SchemaGoogleCloudSecuritycenterV1Binding]] = js.undefined
  
  /**
    * GKE Node Pools associated with the finding. This field will contain NodePool information for each Node, when it is available.
    */
  var nodePools: js.UndefOr[js.Array[SchemaNodePool]] = js.undefined
  
  /**
    * Provides Kubernetes Node information.
    */
  var nodes: js.UndefOr[js.Array[SchemaNode]] = js.undefined
  
  /**
    * Kubernetes Pods associated with the finding. This field will contain Pod records for each container that is owned by a Pod.
    */
  var pods: js.UndefOr[js.Array[SchemaPod]] = js.undefined
  
  /**
    * Provides Kubernetes role information for findings that involve Roles or ClusterRoles.
    */
  var roles: js.UndefOr[js.Array[SchemaRole]] = js.undefined
}
object SchemaKubernetes {
  
  inline def apply(): SchemaKubernetes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKubernetes]
  }
  
  extension [Self <: SchemaKubernetes](x: Self) {
    
    inline def setAccessReviews(value: js.Array[SchemaAccessReview]): Self = StObject.set(x, "accessReviews", value.asInstanceOf[js.Any])
    
    inline def setAccessReviewsUndefined: Self = StObject.set(x, "accessReviews", js.undefined)
    
    inline def setAccessReviewsVarargs(value: SchemaAccessReview*): Self = StObject.set(x, "accessReviews", js.Array(value*))
    
    inline def setBindings(value: js.Array[SchemaGoogleCloudSecuritycenterV1Binding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setBindingsVarargs(value: SchemaGoogleCloudSecuritycenterV1Binding*): Self = StObject.set(x, "bindings", js.Array(value*))
    
    inline def setNodePools(value: js.Array[SchemaNodePool]): Self = StObject.set(x, "nodePools", value.asInstanceOf[js.Any])
    
    inline def setNodePoolsUndefined: Self = StObject.set(x, "nodePools", js.undefined)
    
    inline def setNodePoolsVarargs(value: SchemaNodePool*): Self = StObject.set(x, "nodePools", js.Array(value*))
    
    inline def setNodes(value: js.Array[SchemaNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: SchemaNode*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setPods(value: js.Array[SchemaPod]): Self = StObject.set(x, "pods", value.asInstanceOf[js.Any])
    
    inline def setPodsUndefined: Self = StObject.set(x, "pods", js.undefined)
    
    inline def setPodsVarargs(value: SchemaPod*): Self = StObject.set(x, "pods", js.Array(value*))
    
    inline def setRoles(value: js.Array[SchemaRole]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: SchemaRole*): Self = StObject.set(x, "roles", js.Array(value*))
  }
}
