package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backend extends StObject {
  
  /** Specifies how to determine whether the backend of a load balancer can handle additional traffic or is fully loaded. For usage guidelines, see Connection balancing mode. */
  var balancingMode: js.UndefOr[String] = js.undefined
  
  /**
    * A multiplier applied to the backend's target capacity of its balancing mode. The default value is 1, which means the group serves up to 100% of its configured capacity (depending on
    * balancingMode). A setting of 0 means the group is completely drained, offering 0% of its available capacity. The valid ranges are 0.0 and [0.1,1.0]. You cannot configure a setting
    * larger than 0 and smaller than 0.1. You cannot configure a setting of 0 when there is only one backend attached to the backend service. Not supported by: - Internal TCP/UDP Load
    * Balancing - Network Load Balancing
    */
  var capacityScaler: js.UndefOr[Double] = js.undefined
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /** This field designates whether this is a failover backend. More than one failover backend can be configured for a given BackendService. */
  var failover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The fully-qualified URL of an instance group or network endpoint group (NEG) resource. The type of backend that a backend service supports depends on the backend service's
    * loadBalancingScheme. - When the loadBalancingScheme for the backend service is EXTERNAL (except Network Load Balancing), INTERNAL_SELF_MANAGED, or INTERNAL_MANAGED , the backend can
    * be either an instance group or a NEG. The backends on the backend service must be either all instance groups or all NEGs. You cannot mix instance group and NEG backends on the same
    * backend service. - When the loadBalancingScheme for the backend service is EXTERNAL for Network Load Balancing or INTERNAL for Internal TCP/UDP Load Balancing, the backend must be
    * an instance group. NEGs are not supported. For regional services, the backend must be in the same region as the backend service. You must use the *fully-qualified* URL (starting
    * with https://www.googleapis.com/) to specify the instance group or NEG. Partial URLs are not supported.
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend's
    * balancingMode is RATE. Not supported by: - Internal TCP/UDP Load Balancing - Network Load Balancing
    */
  var maxConnections: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend's
    * balancingMode is RATE. Not supported by: - Internal TCP/UDP Load Balancing - Network Load Balancing.
    */
  var maxConnectionsPerEndpoint: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend's
    * balancingMode is RATE. Not supported by: - Internal TCP/UDP Load Balancing - Network Load Balancing.
    */
  var maxConnectionsPerInstance: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines a maximum number of HTTP requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend's
    * balancingMode is CONNECTION.
    */
  var maxRate: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is
    * CONNECTION.
    */
  var maxRatePerEndpoint: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is
    * CONNECTION.
    */
  var maxRatePerInstance: js.UndefOr[Double] = js.undefined
  
  var maxUtilization: js.UndefOr[Double] = js.undefined
}
object Backend {
  
  inline def apply(): Backend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Backend] (val x: Self) extends AnyVal {
    
    inline def setBalancingMode(value: String): Self = StObject.set(x, "balancingMode", value.asInstanceOf[js.Any])
    
    inline def setBalancingModeUndefined: Self = StObject.set(x, "balancingMode", js.undefined)
    
    inline def setCapacityScaler(value: Double): Self = StObject.set(x, "capacityScaler", value.asInstanceOf[js.Any])
    
    inline def setCapacityScalerUndefined: Self = StObject.set(x, "capacityScaler", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFailover(value: Boolean): Self = StObject.set(x, "failover", value.asInstanceOf[js.Any])
    
    inline def setFailoverUndefined: Self = StObject.set(x, "failover", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
    
    inline def setMaxConnectionsPerEndpoint(value: Double): Self = StObject.set(x, "maxConnectionsPerEndpoint", value.asInstanceOf[js.Any])
    
    inline def setMaxConnectionsPerEndpointUndefined: Self = StObject.set(x, "maxConnectionsPerEndpoint", js.undefined)
    
    inline def setMaxConnectionsPerInstance(value: Double): Self = StObject.set(x, "maxConnectionsPerInstance", value.asInstanceOf[js.Any])
    
    inline def setMaxConnectionsPerInstanceUndefined: Self = StObject.set(x, "maxConnectionsPerInstance", js.undefined)
    
    inline def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
    
    inline def setMaxRate(value: Double): Self = StObject.set(x, "maxRate", value.asInstanceOf[js.Any])
    
    inline def setMaxRatePerEndpoint(value: Double): Self = StObject.set(x, "maxRatePerEndpoint", value.asInstanceOf[js.Any])
    
    inline def setMaxRatePerEndpointUndefined: Self = StObject.set(x, "maxRatePerEndpoint", js.undefined)
    
    inline def setMaxRatePerInstance(value: Double): Self = StObject.set(x, "maxRatePerInstance", value.asInstanceOf[js.Any])
    
    inline def setMaxRatePerInstanceUndefined: Self = StObject.set(x, "maxRatePerInstance", js.undefined)
    
    inline def setMaxRateUndefined: Self = StObject.set(x, "maxRate", js.undefined)
    
    inline def setMaxUtilization(value: Double): Self = StObject.set(x, "maxUtilization", value.asInstanceOf[js.Any])
    
    inline def setMaxUtilizationUndefined: Self = StObject.set(x, "maxUtilization", js.undefined)
  }
}
