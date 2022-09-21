package typings.grpcGrpcJs

import typings.grpcGrpcJs.callStreamMod.Call
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.filterMod.BaseFilter
import typings.grpcGrpcJs.filterMod.FilterFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxMessageSizeFilterMod {
  
  @JSImport("@grpc/grpc-js/build/src/max-message-size-filter", "MaxMessageSizeFilter")
  @js.native
  open class MaxMessageSizeFilter protected () extends BaseFilter {
    def this(options: ChannelOptions, callStream: Call) = this()
    
    /* private */ val callStream: Any = js.native
    
    /* private */ var maxReceiveMessageSize: Any = js.native
    
    /* private */ var maxSendMessageSize: Any = js.native
    
    /* private */ val options: Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/max-message-size-filter", "MaxMessageSizeFilterFactory")
  @js.native
  open class MaxMessageSizeFilterFactory protected ()
    extends StObject
       with FilterFactory[MaxMessageSizeFilter] {
    def this(options: ChannelOptions) = this()
    
    /* CompleteClass */
    override def createFilter(callStream: Call): MaxMessageSizeFilter = js.native
    
    /* private */ val options: Any = js.native
  }
}
