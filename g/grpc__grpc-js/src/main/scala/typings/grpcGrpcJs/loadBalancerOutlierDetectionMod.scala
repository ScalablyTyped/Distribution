package typings.grpcGrpcJs

import org.scalablytyped.runtime.StringDictionary
import typings.grpcGrpcJs.anon.PartialFailurePercentageE
import typings.grpcGrpcJs.anon.PartialSuccessRateEjectio
import typings.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancer
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancingConfig
import typings.grpcGrpcJs.subchannelAddressMod.SubchannelAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadBalancerOutlierDetectionMod {
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-outlier-detection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-outlier-detection", "OutlierDetectionLoadBalancer")
  @js.native
  open class OutlierDetectionLoadBalancer protected ()
    extends StObject
       with LoadBalancer {
    def this(channelControlHelper: ChannelControlHelper) = this()
    
    /* private */ var addressMap: Any = js.native
    
    /* private */ var childBalancer: Any = js.native
    
    /**
      * The load balancer unrefs all of its subchannels and stops calling methods
      * of its channel control helper.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* private */ var eject: Any = js.native
    
    /* private */ var ejectionTimer: Any = js.native
    
    /**
      * If the load balancer is currently in the IDLE state, start connecting.
      */
    /* CompleteClass */
    override def exitIdle(): Unit = js.native
    
    /* private */ var getCurrentEjectionPercent: Any = js.native
    
    /**
      * Get the type name for this load balancer type. Must be constant across an
      * entire load balancer implementation class and must match the name that the
      * balancer implementation class was registered with.
      */
    /* CompleteClass */
    override def getTypeName(): String = js.native
    
    /* private */ var isCountingEnabled: Any = js.native
    
    /* private */ var latestConfig: Any = js.native
    
    /**
      * If the load balancer is currently in the CONNECTING or TRANSIENT_FAILURE
      * state, reset the current connection backoff timeout to its base value and
      * transition to CONNECTING if in TRANSIENT_FAILURE.
      */
    /* CompleteClass */
    override def resetBackoff(): Unit = js.native
    
    /* private */ var runChecks: Any = js.native
    
    /* private */ var runFailurePercentageCheck: Any = js.native
    
    /* private */ var runSuccessRateCheck: Any = js.native
    
    /* private */ var startTimer: Any = js.native
    
    /* private */ var switchAllBuckets: Any = js.native
    
    /* private */ var timerStartTime: Any = js.native
    
    /* private */ var uneject: Any = js.native
    
    /**
      * Gives the load balancer a new list of addresses to start connecting to.
      * The load balancer will start establishing connections with the new list,
      * but will continue using any existing connections until the new connections
      * are established
      * @param addressList The new list of addresses to connect to
      * @param lbConfig The load balancing config object from the service config,
      *     if one was provided
      */
    /* CompleteClass */
    override def updateAddressList(
      addressList: js.Array[SubchannelAddress],
      lbConfig: LoadBalancingConfig,
      attributes: StringDictionary[Any]
    ): Unit = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-outlier-detection", "OutlierDetectionLoadBalancingConfig")
  @js.native
  open class OutlierDetectionLoadBalancingConfig protected ()
    extends StObject
       with LoadBalancingConfig {
    def this(
      intervalMs: Double | Null,
      baseEjectionTimeMs: Double | Null,
      maxEjectionTimeMs: Double | Null,
      maxEjectionPercent: Double | Null,
      successRateEjection: PartialSuccessRateEjectio | Null,
      failurePercentageEjection: PartialFailurePercentageE | Null,
      childPolicy: js.Array[LoadBalancingConfig]
    ) = this()
    
    /* private */ val baseEjectionTimeMs: Any = js.native
    
    /* private */ val childPolicy: Any = js.native
    
    def copyWithChildPolicy(childPolicy: js.Array[LoadBalancingConfig]): OutlierDetectionLoadBalancingConfig = js.native
    
    /* private */ val failurePercentageEjection: Any = js.native
    
    def getBaseEjectionTimeMs(): Double = js.native
    
    def getChildPolicy(): js.Array[LoadBalancingConfig] = js.native
    
    def getFailurePercentageEjectionConfig(): FailurePercentageEjectionConfig | Null = js.native
    
    def getIntervalMs(): Double = js.native
    
    /* CompleteClass */
    override def getLoadBalancerName(): String = js.native
    
    def getMaxEjectionPercent(): Double = js.native
    
    def getMaxEjectionTimeMs(): Double = js.native
    
    def getSuccessRateEjectionConfig(): SuccessRateEjectionConfig | Null = js.native
    
    /* private */ val intervalMs: Any = js.native
    
    /* private */ val maxEjectionPercent: Any = js.native
    
    /* private */ val maxEjectionTimeMs: Any = js.native
    
    /* private */ val successRateEjection: Any = js.native
    
    /* CompleteClass */
    override def toJsonObject(): js.Object = js.native
  }
  /* static members */
  object OutlierDetectionLoadBalancingConfig {
    
    @JSImport("@grpc/grpc-js/build/src/load-balancer-outlier-detection", "OutlierDetectionLoadBalancingConfig")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFromJson(obj: Any): OutlierDetectionLoadBalancingConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromJson")(obj.asInstanceOf[js.Any]).asInstanceOf[OutlierDetectionLoadBalancingConfig]
  }
  
  inline def setup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[Unit]
  
  trait FailurePercentageEjectionConfig extends StObject {
    
    val enforcement_percentage: Double
    
    val minimum_hosts: Double
    
    val request_volume: Double
    
    val threshold: Double
  }
  object FailurePercentageEjectionConfig {
    
    inline def apply(enforcement_percentage: Double, minimum_hosts: Double, request_volume: Double, threshold: Double): FailurePercentageEjectionConfig = {
      val __obj = js.Dynamic.literal(enforcement_percentage = enforcement_percentage.asInstanceOf[js.Any], minimum_hosts = minimum_hosts.asInstanceOf[js.Any], request_volume = request_volume.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[FailurePercentageEjectionConfig]
    }
    
    extension [Self <: FailurePercentageEjectionConfig](x: Self) {
      
      inline def setEnforcement_percentage(value: Double): Self = StObject.set(x, "enforcement_percentage", value.asInstanceOf[js.Any])
      
      inline def setMinimum_hosts(value: Double): Self = StObject.set(x, "minimum_hosts", value.asInstanceOf[js.Any])
      
      inline def setRequest_volume(value: Double): Self = StObject.set(x, "request_volume", value.asInstanceOf[js.Any])
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
  
  trait SuccessRateEjectionConfig extends StObject {
    
    val enforcement_percentage: Double
    
    val minimum_hosts: Double
    
    val request_volume: Double
    
    val stdev_factor: Double
  }
  object SuccessRateEjectionConfig {
    
    inline def apply(
      enforcement_percentage: Double,
      minimum_hosts: Double,
      request_volume: Double,
      stdev_factor: Double
    ): SuccessRateEjectionConfig = {
      val __obj = js.Dynamic.literal(enforcement_percentage = enforcement_percentage.asInstanceOf[js.Any], minimum_hosts = minimum_hosts.asInstanceOf[js.Any], request_volume = request_volume.asInstanceOf[js.Any], stdev_factor = stdev_factor.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessRateEjectionConfig]
    }
    
    extension [Self <: SuccessRateEjectionConfig](x: Self) {
      
      inline def setEnforcement_percentage(value: Double): Self = StObject.set(x, "enforcement_percentage", value.asInstanceOf[js.Any])
      
      inline def setMinimum_hosts(value: Double): Self = StObject.set(x, "minimum_hosts", value.asInstanceOf[js.Any])
      
      inline def setRequest_volume(value: Double): Self = StObject.set(x, "request_volume", value.asInstanceOf[js.Any])
      
      inline def setStdev_factor(value: Double): Self = StObject.set(x, "stdev_factor", value.asInstanceOf[js.Any])
    }
  }
}
