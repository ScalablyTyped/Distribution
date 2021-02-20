package typings.grpcGrpcJs

import typings.grpcGrpcJs.backoffTimeoutMod.BackoffOptions
import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.constantsMod.LogVerbosity
import typings.grpcGrpcJs.filterMod.Filter
import typings.grpcGrpcJs.filterMod.FilterFactory
import typings.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancer
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancerConstructor
import typings.grpcGrpcJs.loadBalancingConfigMod.LoadBalancingConfig
import typings.grpcGrpcJs.resolverMod.ResolverConstructor
import typings.grpcGrpcJs.subchannelMod.SubchannelAddress
import typings.grpcGrpcJs.uriParserMod.GrpcUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalMod {
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "BackoffTimeout")
  @js.native
  class BackoffTimeout protected ()
    extends typings.grpcGrpcJs.backoffTimeoutMod.BackoffTimeout {
    def this(callback: js.Function0[Unit]) = this()
    def this(callback: js.Function0[Unit], options: BackoffOptions) = this()
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "BaseFilter")
  @js.native
  abstract class BaseFilter ()
    extends typings.grpcGrpcJs.filterMod.BaseFilter
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "ChildLoadBalancerHandler")
  @js.native
  class ChildLoadBalancerHandler protected ()
    extends typings.grpcGrpcJs.loadBalancerChildHandlerMod.ChildLoadBalancerHandler {
    def this(channelControlHelper: ChannelControlHelper) = this()
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "FilterStackFactory")
  @js.native
  class FilterStackFactory protected ()
    extends typings.grpcGrpcJs.filterStackMod.FilterStackFactory {
    def this(factories: js.Array[FilterFactory[Filter]]) = this()
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "PickResultType")
  @js.native
  object PickResultType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.grpcGrpcJs.pickerMod.PickResultType with Double] = js.native
    
    /* 0 */ val COMPLETE: typings.grpcGrpcJs.pickerMod.PickResultType.COMPLETE with Double = js.native
    
    /* 3 */ val DROP: typings.grpcGrpcJs.pickerMod.PickResultType.DROP with Double = js.native
    
    /* 1 */ val QUEUE: typings.grpcGrpcJs.pickerMod.PickResultType.QUEUE with Double = js.native
    
    /* 2 */ val TRANSIENT_FAILURE: typings.grpcGrpcJs.pickerMod.PickResultType.TRANSIENT_FAILURE with Double = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "QueuePicker")
  @js.native
  class QueuePicker protected ()
    extends typings.grpcGrpcJs.pickerMod.QueuePicker {
    def this(loadBalancer: LoadBalancer) = this()
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "UnavailablePicker")
  @js.native
  class UnavailablePicker ()
    extends typings.grpcGrpcJs.pickerMod.UnavailablePicker {
    def this(status: StatusObject) = this()
  }
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "createGoogleDefaultCredentials")
  @js.native
  def createGoogleDefaultCredentials(): ChannelCredentials = js.native
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "getFirstUsableConfig")
  @js.native
  def getFirstUsableConfig(configs: js.Array[LoadBalancingConfig]): LoadBalancingConfig | Null = js.native
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "registerLoadBalancerType")
  @js.native
  def registerLoadBalancerType(typeName: String, loadBalancerType: LoadBalancerConstructor): Unit = js.native
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "registerResolver")
  @js.native
  def registerResolver(scheme: String, resolverClass: ResolverConstructor): Unit = js.native
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "subchannelAddressToString")
  @js.native
  def subchannelAddressToString(address: SubchannelAddress): String = js.native
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "trace")
  @js.native
  def trace(severity: LogVerbosity, tracer: String, text: String): Unit = js.native
  
  @JSImport("@grpc/grpc-js/build/src/experimental", "uriToString")
  @js.native
  def uriToString(uri: GrpcUri): String = js.native
}
