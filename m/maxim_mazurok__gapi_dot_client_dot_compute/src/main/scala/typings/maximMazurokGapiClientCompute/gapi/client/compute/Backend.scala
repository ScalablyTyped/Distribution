package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backend extends StObject {
  
  /**
    * Specifies the balancing mode for the backend.
    *
    * When choosing a balancing mode, you need to consider the loadBalancingScheme, and protocol for the backend service, as well as the type of backend (instance group or NEG).
    *
    *
    * - If the load balancing mode is CONNECTION, then the load is spread based on how many concurrent connections the backend can handle.
    * You can use the CONNECTION balancing mode if the protocol for the backend service is SSL, TCP, or UDP.
    *
    * If the loadBalancingScheme for the backend service is EXTERNAL (SSL Proxy and TCP Proxy load balancers), you must also specify exactly one of the following parameters:
    * maxConnections (except for regional managed instance groups), maxConnectionsPerInstance, or maxConnectionsPerEndpoint.
    *
    * If the loadBalancingScheme for the backend service is INTERNAL (internal TCP/UDP load balancers), you cannot specify any additional parameters.
    *
    * - If the load balancing mode is RATE, the load is spread based on the rate of HTTP requests per second (RPS).
    * You can use the RATE balancing mode if the protocol for the backend service is HTTP or HTTPS. You must specify exactly one of the following parameters: maxRate (except for regional
    * managed instance groups), maxRatePerInstance, or maxRatePerEndpoint.
    *
    * - If the load balancing mode is UTILIZATION, the load is spread based on the backend utilization of instances in an instance group.
    * You can use the UTILIZATION balancing mode if the loadBalancingScheme of the backend service is EXTERNAL, INTERNAL_SELF_MANAGED, or INTERNAL_MANAGED and the backends are instance
    * groups. There are no restrictions on the backend service protocol.
    */
  var balancingMode: js.UndefOr[String] = js.undefined
  
  /**
    * A multiplier applied to the group's maximum servicing capacity (based on UTILIZATION, RATE or CONNECTION). Default value is 1, which means the group will serve up to 100% of its
    * configured capacity (depending on balancingMode). A setting of 0 means the group is completely drained, offering 0% of its available capacity. Valid range is 0.0 and [0.1,1.0]. You
    * cannot configure a setting larger than 0 and smaller than 0.1. You cannot configure a setting of 0 when there is only one backend attached to the backend service.
    *
    * This cannot be used for internal load balancing.
    */
  var capacityScaler: js.UndefOr[Double] = js.undefined
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /** This field designates whether this is a failover backend. More than one failover backend can be configured for a given BackendService. */
  var failover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The fully-qualified URL of an instance group or network endpoint group (NEG) resource. The type of backend that a backend service supports depends on the backend service's
    * loadBalancingScheme.
    *
    *
    * - When the loadBalancingScheme for the backend service is EXTERNAL, INTERNAL_SELF_MANAGED, or INTERNAL_MANAGED, the backend can be either an instance group or a NEG. The backends on
    * the backend service must be either all instance groups or all NEGs. You cannot mix instance group and NEG backends on the same backend service.
    *
    *
    * - When the loadBalancingScheme for the backend service is INTERNAL, the backend must be an instance group in the same region as the backend service. NEGs are not supported.
    *
    * You must use the fully-qualified URL (starting with https://www.googleapis.com/) to specify the instance group or NEG. Partial URLs are not supported.
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * Defines a target maximum number of simultaneous connections that the backend can handle. Valid for network endpoint group and instance group backends (except for regional managed
    * instance groups). If the backend's balancingMode is UTILIZATION, this is an optional parameter. If the backend's balancingMode is CONNECTION, and backend is attached to a backend
    * service whose loadBalancingScheme is EXTERNAL, you must specify either this parameter, maxConnectionsPerInstance, or maxConnectionsPerEndpoint.
    *
    * Not available if the backend's balancingMode is RATE. If the loadBalancingScheme is INTERNAL, then maxConnections is not supported, even though the backend requires a balancing mode
    * of CONNECTION.
    */
  var maxConnections: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines a target maximum number of simultaneous connections for an endpoint of a NEG. This is multiplied by the number of endpoints in the NEG to implicitly calculate a maximum
    * number of target maximum simultaneous connections for the NEG. If the backend's balancingMode is CONNECTION, and the backend is attached to a backend service whose
    * loadBalancingScheme is EXTERNAL, you must specify either this parameter, maxConnections, or maxConnectionsPerInstance.
    *
    * Not available if the backend's balancingMode is RATE. Internal TCP/UDP load balancing does not support setting maxConnectionsPerEndpoint even though its backends require a balancing
    * mode of CONNECTION.
    */
  var maxConnectionsPerEndpoint: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines a target maximum number of simultaneous connections for a single VM in a backend instance group. This is multiplied by the number of instances in the instance group to
    * implicitly calculate a target maximum number of simultaneous connections for the whole instance group. If the backend's balancingMode is UTILIZATION, this is an optional parameter.
    * If the backend's balancingMode is CONNECTION, and backend is attached to a backend service whose loadBalancingScheme is EXTERNAL, you must specify either this parameter,
    * maxConnections, or maxConnectionsPerEndpoint.
    *
    * Not available if the backend's balancingMode is RATE. Internal TCP/UDP load balancing does not support setting maxConnectionsPerInstance even though its backends require a balancing
    * mode of CONNECTION.
    */
  var maxConnectionsPerInstance: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines a maximum number of HTTP requests per second (RPS) that the backend can handle. Valid for network endpoint group and instance group backends (except for regional managed
    * instance groups). Must not be defined if the backend is a managed instance group that uses autoscaling based on load balancing.
    *
    * If the backend's balancingMode is UTILIZATION, this is an optional parameter. If the backend's balancingMode is RATE, you must specify maxRate, maxRatePerInstance, or
    * maxRatePerEndpoint.
    *
    * Not available if the backend's balancingMode is CONNECTION.
    */
  var maxRate: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines a maximum target for requests per second (RPS) for an endpoint of a NEG. This is multiplied by the number of endpoints in the NEG to implicitly calculate a target maximum
    * rate for the NEG.
    *
    * If the backend's balancingMode is RATE, you must specify either this parameter, maxRate (except for regional managed instance groups), or maxRatePerInstance.
    *
    * Not available if the backend's balancingMode is CONNECTION.
    */
  var maxRatePerEndpoint: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines a maximum target for requests per second (RPS) for a single VM in a backend instance group. This is multiplied by the number of instances in the instance group to implicitly
    * calculate a target maximum rate for the whole instance group.
    *
    * If the backend's balancingMode is UTILIZATION, this is an optional parameter. If the backend's balancingMode is RATE, you must specify either this parameter, maxRate (except for
    * regional managed instance groups), or maxRatePerEndpoint.
    *
    * Not available if the backend's balancingMode is CONNECTION.
    */
  var maxRatePerInstance: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the maximum average backend utilization of a backend VM in an instance group. The valid range is [0.0, 1.0]. This is an optional parameter if the backend's balancingMode is
    * UTILIZATION.
    *
    * This parameter can be used in conjunction with maxRate, maxRatePerInstance, maxConnections (except for regional managed instance groups), or maxConnectionsPerInstance.
    */
  var maxUtilization: js.UndefOr[Double] = js.undefined
}
object Backend {
  
  inline def apply(): Backend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backend]
  }
  
  extension [Self <: Backend](x: Self) {
    
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
