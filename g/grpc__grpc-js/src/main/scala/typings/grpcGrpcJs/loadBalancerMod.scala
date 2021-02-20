package typings.grpcGrpcJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.grpcGrpcJs.channelMod.ConnectivityState
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.loadBalancingConfigMod.LoadBalancingConfig
import typings.grpcGrpcJs.pickerMod.Picker
import typings.grpcGrpcJs.subchannelMod.Subchannel
import typings.grpcGrpcJs.subchannelMod.SubchannelAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadBalancerMod {
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer", "createLoadBalancer")
  @js.native
  def createLoadBalancer(typeName: String, channelControlHelper: ChannelControlHelper): LoadBalancer | Null = js.native
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer", "getFirstUsableConfig")
  @js.native
  def getFirstUsableConfig(configs: js.Array[LoadBalancingConfig]): LoadBalancingConfig | Null = js.native
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer", "isLoadBalancerNameRegistered")
  @js.native
  def isLoadBalancerNameRegistered(typeName: String): Boolean = js.native
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer", "registerAll")
  @js.native
  def registerAll(): Unit = js.native
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer", "registerLoadBalancerType")
  @js.native
  def registerLoadBalancerType(typeName: String, loadBalancerType: LoadBalancerConstructor): Unit = js.native
  
  @js.native
  trait ChannelControlHelper extends StObject {
    
    /**
      * Returns a subchannel connected to the specified address.
      * @param subchannelAddress The address to connect to
      * @param subchannelArgs Extra channel arguments specified by the load balancer
      */
    def createSubchannel(subchannelAddress: SubchannelAddress, subchannelArgs: ChannelOptions): Subchannel = js.native
    
    /**
      * Request new data from the resolver.
      */
    def requestReresolution(): Unit = js.native
    
    /**
      * Passes a new subchannel picker up to the channel. This is called if either
      * the connectivity state changes or if a different picker is needed for any
      * other reason.
      * @param connectivityState New connectivity state
      * @param picker New picker
      */
    def updateState(connectivityState: ConnectivityState, picker: Picker): Unit = js.native
  }
  object ChannelControlHelper {
    
    @scala.inline
    def apply(
      createSubchannel: (SubchannelAddress, ChannelOptions) => Subchannel,
      requestReresolution: () => Unit,
      updateState: (ConnectivityState, Picker) => Unit
    ): ChannelControlHelper = {
      val __obj = js.Dynamic.literal(createSubchannel = js.Any.fromFunction2(createSubchannel), requestReresolution = js.Any.fromFunction0(requestReresolution), updateState = js.Any.fromFunction2(updateState))
      __obj.asInstanceOf[ChannelControlHelper]
    }
    
    @scala.inline
    implicit class ChannelControlHelperMutableBuilder[Self <: ChannelControlHelper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateSubchannel(value: (SubchannelAddress, ChannelOptions) => Subchannel): Self = StObject.set(x, "createSubchannel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRequestReresolution(value: () => Unit): Self = StObject.set(x, "requestReresolution", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdateState(value: (ConnectivityState, Picker) => Unit): Self = StObject.set(x, "updateState", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait LoadBalancer extends StObject {
    
    /**
      * The load balancer unrefs all of its subchannels and stops calling methods
      * of its channel control helper.
      */
    def destroy(): Unit = js.native
    
    /**
      * If the load balancer is currently in the IDLE state, start connecting.
      */
    def exitIdle(): Unit = js.native
    
    /**
      * Get the type name for this load balancer type. Must be constant across an
      * entire load balancer implementation class and must match the name that the
      * balancer implementation class was registered with.
      */
    def getTypeName(): String = js.native
    
    /**
      * If the load balancer is currently in the CONNECTING or TRANSIENT_FAILURE
      * state, reset the current connection backoff timeout to its base value and
      * transition to CONNECTING if in TRANSIENT_FAILURE.
      */
    def resetBackoff(): Unit = js.native
    
    /**
      * Gives the load balancer a new list of addresses to start connecting to.
      * The load balancer will start establishing connections with the new list,
      * but will continue using any existing connections until the new connections
      * are established
      * @param addressList The new list of addresses to connect to
      * @param lbConfig The load balancing config object from the service config,
      *     if one was provided
      */
    def updateAddressList(
      addressList: js.Array[SubchannelAddress],
      lbConfig: LoadBalancingConfig,
      attributes: StringDictionary[js.Any]
    ): Unit = js.native
  }
  object LoadBalancer {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      exitIdle: () => Unit,
      getTypeName: () => String,
      resetBackoff: () => Unit,
      updateAddressList: (js.Array[SubchannelAddress], LoadBalancingConfig, StringDictionary[js.Any]) => Unit
    ): LoadBalancer = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), exitIdle = js.Any.fromFunction0(exitIdle), getTypeName = js.Any.fromFunction0(getTypeName), resetBackoff = js.Any.fromFunction0(resetBackoff), updateAddressList = js.Any.fromFunction3(updateAddressList))
      __obj.asInstanceOf[LoadBalancer]
    }
    
    @scala.inline
    implicit class LoadBalancerMutableBuilder[Self <: LoadBalancer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExitIdle(value: () => Unit): Self = StObject.set(x, "exitIdle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTypeName(value: () => String): Self = StObject.set(x, "getTypeName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetBackoff(value: () => Unit): Self = StObject.set(x, "resetBackoff", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdateAddressList(value: (js.Array[SubchannelAddress], LoadBalancingConfig, StringDictionary[js.Any]) => Unit): Self = StObject.set(x, "updateAddressList", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait LoadBalancerConstructor extends Instantiable1[/* channelControlHelper */ ChannelControlHelper, LoadBalancer]
}
