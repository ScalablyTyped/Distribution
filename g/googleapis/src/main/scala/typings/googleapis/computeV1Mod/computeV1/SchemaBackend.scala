package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message containing information of one individual backend.
  */
trait SchemaBackend extends StObject {
  
  /**
    * Specifies the balancing mode for this backend. For global HTTP(S) or
    * TCP/SSL load balancing, the default is UTILIZATION. Valid values are
    * UTILIZATION, RATE (for HTTP(S)) and CONNECTION (for TCP/SSL).  For
    * Internal Load Balancing, the default and only supported mode is
    * CONNECTION.
    */
  var balancingMode: js.UndefOr[String] = js.undefined
  
  /**
    * A multiplier applied to the group&#39;s maximum servicing capacity (based
    * on UTILIZATION, RATE or CONNECTION). Default value is 1, which means the
    * group will serve up to 100% of its configured capacity (depending on
    * balancingMode). A setting of 0 means the group is completely drained,
    * offering 0% of its available Capacity. Valid range is [0.0,1.0].  This
    * cannot be used for internal load balancing.
    */
  var capacityScaler: js.UndefOr[Double] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The fully-qualified URL of an Instance Group or Network Endpoint Group
    * resource. In case of instance group this defines the list of instances
    * that serve traffic. Member virtual machine instances from each instance
    * group must live in the same zone as the instance group itself. No two
    * backends in a backend service are allowed to use same Instance Group
    * resource.  For Network Endpoint Groups this defines list of endpoints.
    * All endpoints of Network Endpoint Group must be hosted on instances
    * located in the same zone as the Network Endpoint Group.  Backend service
    * can not contain mix of Instance Group and Network Endpoint Group
    * backends.  Note that you must specify an Instance Group or Network
    * Endpoint Group resource using the fully-qualified URL, rather than a
    * partial URL.  When the BackendService has load balancing scheme INTERNAL,
    * the instance group must be within the same region as the BackendService.
    * Network Endpoint Groups are not supported for INTERNAL load balancing
    * scheme.
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * The max number of simultaneous connections for the group. Can be used
    * with either CONNECTION or UTILIZATION balancing modes. For CONNECTION
    * mode, either maxConnections or maxConnectionsPerInstance must be set.
    * This cannot be used for internal load balancing.
    */
  var maxConnections: js.UndefOr[Double] = js.undefined
  
  /**
    * The max number of simultaneous connections that a single backend network
    * endpoint can handle. This is used to calculate the capacity of the group.
    * Can be used in either CONNECTION or UTILIZATION balancing modes. For
    * CONNECTION mode, either maxConnections or maxConnectionsPerEndpoint must
    * be set.  This cannot be used for internal load balancing.
    */
  var maxConnectionsPerEndpoint: js.UndefOr[Double] = js.undefined
  
  /**
    * The max number of simultaneous connections that a single backend instance
    * can handle. This is used to calculate the capacity of the group. Can be
    * used in either CONNECTION or UTILIZATION balancing modes. For CONNECTION
    * mode, either maxConnections or maxConnectionsPerInstance must be set.
    * This cannot be used for internal load balancing.
    */
  var maxConnectionsPerInstance: js.UndefOr[Double] = js.undefined
  
  /**
    * The max requests per second (RPS) of the group. Can be used with either
    * RATE or UTILIZATION balancing modes, but required if RATE mode. For RATE
    * mode, either maxRate or maxRatePerInstance must be set.  This cannot be
    * used for internal load balancing.
    */
  var maxRate: js.UndefOr[Double] = js.undefined
  
  /**
    * The max requests per second (RPS) that a single backend network endpoint
    * can handle. This is used to calculate the capacity of the group. Can be
    * used in either balancing mode. For RATE mode, either maxRate or
    * maxRatePerEndpoint must be set.  This cannot be used for internal load
    * balancing.
    */
  var maxRatePerEndpoint: js.UndefOr[Double] = js.undefined
  
  /**
    * The max requests per second (RPS) that a single backend instance can
    * handle. This is used to calculate the capacity of the group. Can be used
    * in either balancing mode. For RATE mode, either maxRate or
    * maxRatePerInstance must be set.  This cannot be used for internal load
    * balancing.
    */
  var maxRatePerInstance: js.UndefOr[Double] = js.undefined
  
  /**
    * Used when balancingMode is UTILIZATION. This ratio defines the CPU
    * utilization target for the group. The default is 0.8. Valid range is
    * [0.0, 1.0].  This cannot be used for internal load balancing.
    */
  var maxUtilization: js.UndefOr[Double] = js.undefined
}
object SchemaBackend {
  
  inline def apply(): SchemaBackend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackend]
  }
  
  extension [Self <: SchemaBackend](x: Self) {
    
    inline def setBalancingMode(value: String): Self = StObject.set(x, "balancingMode", value.asInstanceOf[js.Any])
    
    inline def setBalancingModeUndefined: Self = StObject.set(x, "balancingMode", js.undefined)
    
    inline def setCapacityScaler(value: Double): Self = StObject.set(x, "capacityScaler", value.asInstanceOf[js.Any])
    
    inline def setCapacityScalerUndefined: Self = StObject.set(x, "capacityScaler", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
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
