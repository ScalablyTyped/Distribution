package typings.grpcGrpcJs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/stream-decoder", JSImport.Namespace)
@js.native
object streamDecoderMod extends js.Object {
  @js.native
  class StreamDecoder () extends js.Object {
    var readCompressFlag: js.Any = js.native
    var readMessageRemaining: js.Any = js.native
    var readMessageSize: js.Any = js.native
    var readPartialMessage: js.Any = js.native
    var readPartialSize: js.Any = js.native
    var readSizeRemaining: js.Any = js.native
    var readState: js.Any = js.native
    def write(data: Buffer): js.Array[Buffer] = js.native
  }
  
}

