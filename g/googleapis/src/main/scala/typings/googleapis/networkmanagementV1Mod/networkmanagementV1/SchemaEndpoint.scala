package typings.googleapis.networkmanagementV1Mod.networkmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEndpoint extends StObject {
  
  /**
    * A [Cloud function](https://cloud.google.com/functions).
    */
  var cloudFunction: js.UndefOr[SchemaCloudFunctionEndpoint] = js.undefined
  
  /**
    * A [Cloud SQL](https://cloud.google.com/sql) instance URI.
    */
  var cloudSqlInstance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A cluster URI for [Google Kubernetes Engine master](https://cloud.google.com/kubernetes-engine/docs/concepts/cluster-architecture).
    */
  var gkeMasterCluster: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A Compute Engine instance URI.
    */
  var instance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IP address of the endpoint, which can be an external or internal IP. An IPv6 address is only allowed when the test's destination is a [global load balancer VIP](/load-balancing/docs/load-balancing-overview).
    */
  var ipAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A Compute Engine network URI.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the network where the endpoint is located. Applicable only to source endpoint, as destination network type can be inferred from the source.
    */
  var networkType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IP protocol port of the endpoint. Only applicable when protocol is TCP or UDP.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Project ID where the endpoint is located. The Project ID can be derived from the URI if you provide a VM instance or network URI. The following are two cases where you must provide the project ID: 1. Only the IP address is specified, and the IP address is within a GCP project. 2. When you are using Shared VPC and the IP address that you provide is from the service project. In this case, the network that the IP address resides in is defined in the host project.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaEndpoint {
  
  inline def apply(): SchemaEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndpoint]
  }
  
  extension [Self <: SchemaEndpoint](x: Self) {
    
    inline def setCloudFunction(value: SchemaCloudFunctionEndpoint): Self = StObject.set(x, "cloudFunction", value.asInstanceOf[js.Any])
    
    inline def setCloudFunctionUndefined: Self = StObject.set(x, "cloudFunction", js.undefined)
    
    inline def setCloudSqlInstance(value: String): Self = StObject.set(x, "cloudSqlInstance", value.asInstanceOf[js.Any])
    
    inline def setCloudSqlInstanceNull: Self = StObject.set(x, "cloudSqlInstance", null)
    
    inline def setCloudSqlInstanceUndefined: Self = StObject.set(x, "cloudSqlInstance", js.undefined)
    
    inline def setGkeMasterCluster(value: String): Self = StObject.set(x, "gkeMasterCluster", value.asInstanceOf[js.Any])
    
    inline def setGkeMasterClusterNull: Self = StObject.set(x, "gkeMasterCluster", null)
    
    inline def setGkeMasterClusterUndefined: Self = StObject.set(x, "gkeMasterCluster", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkType(value: String): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
    
    inline def setNetworkTypeNull: Self = StObject.set(x, "networkType", null)
    
    inline def setNetworkTypeUndefined: Self = StObject.set(x, "networkType", js.undefined)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
