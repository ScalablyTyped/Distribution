package typings.grpcGrpcJs

import typings.grpcGrpcJs.channelMod.Channel
import typings.grpcGrpcJs.filterMod.BaseFilter
import typings.grpcGrpcJs.filterMod.FilterFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compressionFilterMod {
  
  @JSImport("@grpc/grpc-js/build/src/compression-filter", "CompressionFilter")
  @js.native
  class CompressionFilter () extends BaseFilter {
    
    var receiveCompression: js.Any = js.native
    
    var sendCompression: js.Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/compression-filter", "CompressionFilterFactory")
  @js.native
  class CompressionFilterFactory protected () extends FilterFactory[CompressionFilter] {
    def this(channel: Channel) = this()
    
    val channel: js.Any = js.native
  }
}
