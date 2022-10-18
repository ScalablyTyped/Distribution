package typings.grpcGrpcJs

import org.scalablytyped.runtime.StringDictionary
import typings.grpcGrpcJs.buildSrcCallStreamMod.StatusObject
import typings.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.buildSrcLoadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancer
import typings.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancingConfig
import typings.grpcGrpcJs.buildSrcResolverMod.ConfigSelector
import typings.grpcGrpcJs.buildSrcSubchannelAddressMod.SubchannelAddress
import typings.grpcGrpcJs.buildSrcUriParserMod.GrpcUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcResolvingLoadBalancerMod {
  
  @JSImport("@grpc/grpc-js/build/src/resolving-load-balancer", "ResolvingLoadBalancer")
  @js.native
  open class ResolvingLoadBalancer protected ()
    extends StObject
       with LoadBalancer {
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
    def this(
      target: GrpcUri,
      channelControlHelper: ChannelControlHelper,
      channelOptions: ChannelOptions,
      onSuccessfulResolution: ResolutionCallback,
      onFailedResolution: ResolutionFailureCallback
    ) = this()
    
    /**
      * The backoff timer for handling name resolution failures.
      */
    /* private */ val backoffTimeout: Any = js.native
    
    /* private */ val channelControlHelper: Any = js.native
    
    /* private */ val channelOptions: Any = js.native
    
    /* private */ var childLoadBalancer: Any = js.native
    
    /**
      * Indicates whether we should attempt to resolve again after the backoff
      * timer runs out.
      */
    /* private */ var continueResolving: Any = js.native
    
    /**
      * This resolving load balancer's current connectivity state.
      */
    /* private */ var currentState: Any = js.native
    
    /* private */ val defaultServiceConfig: Any = js.native
    
    /**
      * The load balancer unrefs all of its subchannels and stops calling methods
      * of its channel control helper.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * If the load balancer is currently in the IDLE state, start connecting.
      */
    /* CompleteClass */
    override def exitIdle(): Unit = js.native
    
    /**
      * Get the type name for this load balancer type. Must be constant across an
      * entire load balancer implementation class and must match the name that the
      * balancer implementation class was registered with.
      */
    /* CompleteClass */
    override def getTypeName(): String = js.native
    
    /* private */ var handleResolutionFailure: Any = js.native
    
    /**
      * The resolver class constructed for the target address.
      */
    /* private */ var innerResolver: Any = js.native
    
    /* private */ var latestChildPicker: Any = js.native
    
    /* private */ var latestChildState: Any = js.native
    
    /* private */ val onFailedResolution: Any = js.native
    
    /* private */ val onSuccessfulResolution: Any = js.native
    
    /**
      * The service config object from the last successful resolution, if
      * available. A value of null indicates that we have not yet received a valid
      * service config from the resolver.
      */
    /* private */ var previousServiceConfig: Any = js.native
    
    /**
      * If the load balancer is currently in the CONNECTING or TRANSIENT_FAILURE
      * state, reset the current connection backoff timeout to its base value and
      * transition to CONNECTING if in TRANSIENT_FAILURE.
      */
    /* CompleteClass */
    override def resetBackoff(): Unit = js.native
    
    /* private */ val target: Any = js.native
    
    def updateAddressList(addressList: js.Array[SubchannelAddress]): scala.Nothing = js.native
    def updateAddressList(addressList: js.Array[SubchannelAddress], lbConfig: LoadBalancingConfig): scala.Nothing = js.native
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
    
    /* private */ var updateResolution: Any = js.native
    
    /* private */ var updateState: Any = js.native
  }
  
  type ResolutionCallback = js.Function1[/* configSelector */ ConfigSelector, Unit]
  
  type ResolutionFailureCallback = js.Function1[/* status */ StatusObject, Unit]
}
