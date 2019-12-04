package typings.atGrpcGrpcDashJs

import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.Call
import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.StatusObject
import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.WriteObject
import typings.atGrpcGrpcDashJs.buildSrcChannelMod.Channel
import typings.atGrpcGrpcDashJs.buildSrcCompressionDashFilterMod.CompressionFilter
import typings.atGrpcGrpcDashJs.buildSrcFilterMod.BaseFilter
import typings.atGrpcGrpcDashJs.buildSrcFilterMod.Filter
import typings.atGrpcGrpcDashJs.buildSrcFilterMod.FilterFactory
import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/compression-filter", JSImport.Namespace)
@js.native
object buildSrcCompressionDashFilterMod extends js.Object {
  @js.native
  class CompressionFilter ()
    extends BaseFilter
       with Filter {
    var receiveCompression: js.Any = js.native
    var sendCompression: js.Any = js.native
    /* InferMemberOverrides */
    override def receiveMessage(message: js.Promise[Buffer]): js.Promise[Buffer] = js.native
    /* InferMemberOverrides */
    override def receiveMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata] = js.native
    /* InferMemberOverrides */
    override def receiveTrailers(status: js.Promise[StatusObject]): js.Promise[StatusObject] = js.native
    /* InferMemberOverrides */
    override def sendMessage(message: js.Promise[WriteObject]): js.Promise[WriteObject] = js.native
    /* InferMemberOverrides */
    override def sendMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata] = js.native
  }
  
  @js.native
  class CompressionFilterFactory protected () extends FilterFactory[CompressionFilter] {
    def this(channel: Channel) = this()
    val channel: js.Any = js.native
    /* CompleteClass */
    override def createFilter(callStream: Call): CompressionFilter = js.native
  }
  
}

