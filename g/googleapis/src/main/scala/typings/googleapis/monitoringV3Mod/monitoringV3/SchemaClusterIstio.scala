package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClusterIstio extends StObject {
  
  /**
    * The name of the Kubernetes cluster in which this Istio service is defined. Corresponds to the cluster_name resource label in k8s_cluster resources.
    */
  var clusterName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The location of the Kubernetes cluster in which this Istio service is defined. Corresponds to the location resource label in k8s_cluster resources.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the Istio service underlying this service. Corresponds to the destination_service_name metric label in Istio metrics.
    */
  var serviceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The namespace of the Istio service underlying this service. Corresponds to the destination_service_namespace metric label in Istio metrics.
    */
  var serviceNamespace: js.UndefOr[String | Null] = js.undefined
}
object SchemaClusterIstio {
  
  inline def apply(): SchemaClusterIstio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterIstio]
  }
  
  extension [Self <: SchemaClusterIstio](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameNull: Self = StObject.set(x, "clusterName", null)
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameNull: Self = StObject.set(x, "serviceName", null)
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setServiceNamespace(value: String): Self = StObject.set(x, "serviceNamespace", value.asInstanceOf[js.Any])
    
    inline def setServiceNamespaceNull: Self = StObject.set(x, "serviceNamespace", null)
    
    inline def setServiceNamespaceUndefined: Self = StObject.set(x, "serviceNamespace", js.undefined)
  }
}
