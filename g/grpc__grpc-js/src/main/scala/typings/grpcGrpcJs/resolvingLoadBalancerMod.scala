package typings.grpcGrpcJs

import typings.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancer
import typings.grpcGrpcJs.serviceConfigMod.ServiceConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/resolving-load-balancer", JSImport.Namespace)
@js.native
object resolvingLoadBalancerMod extends js.Object {
  @js.native
  class ResolvingLoadBalancer protected () extends LoadBalancer {
    def this(target: String, channelControlHelper: ChannelControlHelper) = this()
    /**
      * Wrapper class that behaves like a `LoadBalancer` and also handles name
      * resolution internally.
      * @param target The address of the backend to connect to.
      * @param channelControlHelper `ChannelControlHelper` instance provided by
      *     this load balancer's owner.
      * @param defaultServiceConfig The default service configuration to be used
      *     if none is provided by the name resolver. A `null` value indicates
      *     that the default behavior should be the default unconfigured behavior.
      *     In practice, that means using the "pick first" load balancer
      *     implmentation
      */
    def this(target: String, channelControlHelper: ChannelControlHelper, defaultServiceConfig: ServiceConfig) = this()
    /**
      * The backoff timer for handling name resolution failures.
      */
    val backoffTimeout: js.Any = js.native
    var channelControlHelper: js.Any = js.native
    /**
      * Indicates whether we should attempt to resolve again after the backoff
      * timer runs out.
      */
    var continueResolving: js.Any = js.native
    /**
      * This resolving load balancer's current connectivity state.
      */
    var currentState: js.Any = js.native
    var defaultServiceConfig: js.Any = js.native
    var handleResolutionFailure: js.Any = js.native
    var innerBalancerPicker: js.Any = js.native
    /**
      * The most recently reported connectivity state of the `innerLoadBalancer`.
      */
    var innerBalancerState: js.Any = js.native
    /**
      * ChannelControlHelper for the innerLoadBalancer.
      */
    val innerChannelControlHelper: js.Any = js.native
    /**
      * Current internal load balancer used for handling calls.
      * Invariant: innerLoadBalancer === null => pendingReplacementLoadBalancer === null.
      */
    var innerLoadBalancer: js.Any = js.native
    /**
      * The resolver class constructed for the target address.
      */
    var innerResolver: js.Any = js.native
    /**
      * The load balancer instance that will be used in place of the current
      * `innerLoadBalancer` once either that load balancer loses its connection
      * or this one establishes a connection. For use when a new name resolution
      * result comes in with a different load balancing configuration, and the
      * current `innerLoadBalancer` is still connected.
      */
    var pendingReplacementLoadBalancer: js.Any = js.native
    /**
      * The service config object from the last successful resolution, if
      * available. A value of undefined indicates that there has not yet
      * been a successful resolution. A value of null indicates that the last
      * successful resolution explicitly provided a null service config.
      */
    var previousServiceConfig: js.Any = js.native
    /**
      * The picker associated with the replacementBalancerState. Starts as an
      * UnavailablePicker for type simplicity. This should get updated as soon as
      * the pendingReplacementLoadBalancer gets constructed.
      */
    var replacementBalancerPicker: js.Any = js.native
    /**
      * The most recent reported state of the pendingReplacementLoadBalancer.
      * Starts at IDLE for type simplicity. This should get updated as soon as the
      * pendingReplacementLoadBalancer gets constructed.
      */
    var replacementBalancerState: js.Any = js.native
    /**
      * ChannelControlHelper for the pendingReplacementLoadBalancer.
      */
    val replacementChannelControlHelper: js.Any = js.native
    /**
      * Stop using the current innerLoadBalancer and replace it with the
      * pendingReplacementLoadBalancer. Must only be called if both of
      * those are currently not null.
      */
    var switchOverReplacementBalancer: js.Any = js.native
    var target: js.Any = js.native
    var updateResolution: js.Any = js.native
    var updateState: js.Any = js.native
  }
  
}

