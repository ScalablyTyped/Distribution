package typings.grpcGrpcJs

import typings.grpcGrpcJs.channelMod.Channel
import typings.grpcGrpcJs.filterMod.BaseFilter
import typings.grpcGrpcJs.filterMod.FilterFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/compression-filter", JSImport.Namespace)
@js.native
object compressionFilterMod extends js.Object {
  @js.native
  class CompressionFilter () extends BaseFilter {
    var receiveCompression: js.Any = js.native
    var sendCompression: js.Any = js.native
  }
  
  @js.native
  class CompressionFilterFactory protected () extends FilterFactory[CompressionFilter] {
    def this(channel: Channel) = this()
    val channel: js.Any = js.native
  }
  
}

