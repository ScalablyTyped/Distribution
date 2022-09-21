package typings.googleapis.dnsV2Mod.dnsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedZonePrivateVisibilityConfigGKECluster extends StObject {
  
  /**
    * The resource name of the cluster to bind this ManagedZone to. This should be specified in the format like: projects/x/locations/x/clusters/x. This is referenced from GKE projects.locations.clusters.get API: https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters/get
    */
  var gkeClusterName: js.UndefOr[String | Null] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaManagedZonePrivateVisibilityConfigGKECluster {
  
  inline def apply(): SchemaManagedZonePrivateVisibilityConfigGKECluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZonePrivateVisibilityConfigGKECluster]
  }
  
  extension [Self <: SchemaManagedZonePrivateVisibilityConfigGKECluster](x: Self) {
    
    inline def setGkeClusterName(value: String): Self = StObject.set(x, "gkeClusterName", value.asInstanceOf[js.Any])
    
    inline def setGkeClusterNameNull: Self = StObject.set(x, "gkeClusterName", null)
    
    inline def setGkeClusterNameUndefined: Self = StObject.set(x, "gkeClusterName", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
