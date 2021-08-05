package typings.grpcGrpcJs

import typings.grpcGrpcJs.callStreamMod.Call
import typings.grpcGrpcJs.channelMod.Channel
import typings.grpcGrpcJs.filterMod.BaseFilter
import typings.grpcGrpcJs.filterMod.FilterFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compressionFilterMod {
  
  @JSImport("@grpc/grpc-js/build/src/compression-filter", "CompressionFilter")
  @js.native
  class CompressionFilter () extends BaseFilter {
    
    /* private */ var receiveCompression: js.Any = js.native
    
    /* private */ var sendCompression: js.Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/compression-filter", "CompressionFilterFactory")
  @js.native
  class CompressionFilterFactory protected ()
    extends StObject
       with FilterFactory[CompressionFilter] {
    def this(channel: Channel) = this()
    
    /* private */ val channel: js.Any = js.native
    
    /* CompleteClass */
    override def createFilter(callStream: Call): CompressionFilter = js.native
  }
}
