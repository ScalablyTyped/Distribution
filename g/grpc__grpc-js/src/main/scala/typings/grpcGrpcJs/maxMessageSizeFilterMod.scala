package typings.grpcGrpcJs

import typings.grpcGrpcJs.callStreamMod.Call
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.filterMod.BaseFilter
import typings.grpcGrpcJs.filterMod.FilterFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxMessageSizeFilterMod {
  
  @JSImport("@grpc/grpc-js/build/src/max-message-size-filter", "MaxMessageSizeFilter")
  @js.native
  class MaxMessageSizeFilter protected () extends BaseFilter {
    def this(options: ChannelOptions, callStream: Call) = this()
    
    val callStream: js.Any = js.native
    
    var maxReceiveMessageSize: js.Any = js.native
    
    var maxSendMessageSize: js.Any = js.native
    
    val options: js.Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/max-message-size-filter", "MaxMessageSizeFilterFactory")
  @js.native
  class MaxMessageSizeFilterFactory protected () extends FilterFactory[MaxMessageSizeFilter] {
    def this(options: ChannelOptions) = this()
    
    val options: js.Any = js.native
  }
}
