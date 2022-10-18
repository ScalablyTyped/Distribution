package typings.grpcGrpcJs

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcStreamDecoderMod {
  
  @JSImport("@grpc/grpc-js/build/src/stream-decoder", "StreamDecoder")
  @js.native
  open class StreamDecoder () extends StObject {
    
    /* private */ var readCompressFlag: Any = js.native
    
    /* private */ var readMessageRemaining: Any = js.native
    
    /* private */ var readMessageSize: Any = js.native
    
    /* private */ var readPartialMessage: Any = js.native
    
    /* private */ var readPartialSize: Any = js.native
    
    /* private */ var readSizeRemaining: Any = js.native
    
    /* private */ var readState: Any = js.native
    
    def write(data: Buffer): js.Array[Buffer] = js.native
  }
}
