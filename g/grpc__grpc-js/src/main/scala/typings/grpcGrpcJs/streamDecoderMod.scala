package typings.grpcGrpcJs

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamDecoderMod {
  
  @JSImport("@grpc/grpc-js/build/src/stream-decoder", "StreamDecoder")
  @js.native
  class StreamDecoder () extends StObject {
    
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
