package typings.grpcGrpcJs

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamDecoderMod {
  
  @JSImport("@grpc/grpc-js/build/src/stream-decoder", "StreamDecoder")
  @js.native
  class StreamDecoder () extends StObject {
    
    /* private */ var readCompressFlag: js.Any = js.native
    
    /* private */ var readMessageRemaining: js.Any = js.native
    
    /* private */ var readMessageSize: js.Any = js.native
    
    /* private */ var readPartialMessage: js.Any = js.native
    
    /* private */ var readPartialSize: js.Any = js.native
    
    /* private */ var readSizeRemaining: js.Any = js.native
    
    /* private */ var readState: js.Any = js.native
    
    def write(data: Buffer): js.Array[Buffer] = js.native
  }
}
