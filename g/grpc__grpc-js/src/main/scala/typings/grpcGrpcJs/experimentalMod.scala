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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/experimental", JSImport.Namespace)
@js.native
object experimentalMod extends js.Object {
  
  def createGoogleDefaultCredentials(): ChannelCredentials = js.native
  
  def getFirstUsableConfig(configs: js.Array[LoadBalancingConfig]): LoadBalancingConfig | Null = js.native
  
  def registerLoadBalancerType(typeName: String, loadBalancerType: LoadBalancerConstructor): Unit = js.native
  
  def registerResolver(scheme: String, resolverClass: ResolverConstructor): Unit = js.native
  
  def subchannelAddressToString(address: SubchannelAddress): String = js.native
  
  def trace(severity: LogVerbosity, tracer: String, text: String): Unit = js.native
  
  def uriToString(uri: GrpcUri): String = js.native
  
  @js.native
  class BackoffTimeout protected ()
    extends typings.grpcGrpcJs.backoffTimeoutMod.BackoffTimeout {
    def this(callback: js.Function0[Unit]) = this()
    def this(callback: js.Function0[Unit], options: BackoffOptions) = this()
  }
  
  @js.native
  abstract class BaseFilter ()
    extends typings.grpcGrpcJs.filterMod.BaseFilter
  
  @js.native
  class ChildLoadBalancerHandler protected ()
    extends typings.grpcGrpcJs.loadBalancerChildHandlerMod.ChildLoadBalancerHandler {
    def this(channelControlHelper: ChannelControlHelper) = this()
  }
  
  @js.native
  class FilterStackFactory protected ()
    extends typings.grpcGrpcJs.filterStackMod.FilterStackFactory {
    def this(factories: js.Array[FilterFactory[Filter]]) = this()
  }
  
  @js.native
  object PickResultType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.grpcGrpcJs.pickerMod.PickResultType with Double] = js.native
    
    /* 0 */ val COMPLETE: typings.grpcGrpcJs.pickerMod.PickResultType.COMPLETE with Double = js.native
    
    /* 3 */ val DROP: typings.grpcGrpcJs.pickerMod.PickResultType.DROP with Double = js.native
    
    /* 1 */ val QUEUE: typings.grpcGrpcJs.pickerMod.PickResultType.QUEUE with Double = js.native
    
    /* 2 */ val TRANSIENT_FAILURE: typings.grpcGrpcJs.pickerMod.PickResultType.TRANSIENT_FAILURE with Double = js.native
  }
  
  @js.native
  class QueuePicker protected ()
    extends typings.grpcGrpcJs.pickerMod.QueuePicker {
    def this(loadBalancer: LoadBalancer) = this()
  }
  
  @js.native
  class UnavailablePicker ()
    extends typings.grpcGrpcJs.pickerMod.UnavailablePicker {
    def this(status: StatusObject) = this()
  }
}
