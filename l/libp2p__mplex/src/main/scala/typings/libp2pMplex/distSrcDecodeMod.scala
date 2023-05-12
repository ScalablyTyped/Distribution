package typings.libp2pMplex

import typings.libp2pMplex.distSrcMessageTypesMod.Message
import typings.libp2pMplex.libp2pMplexStrings.`0`
import typings.libp2pMplex.libp2pMplexStrings.`1`
import typings.libp2pMplex.libp2pMplexStrings.`2`
import typings.libp2pMplex.libp2pMplexStrings.`3`
import typings.libp2pMplex.libp2pMplexStrings.`4`
import typings.libp2pMplex.libp2pMplexStrings.`5`
import typings.libp2pMplex.libp2pMplexStrings.`6`
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDecodeMod {
  
  @JSImport("@libp2p/mplex/dist/src/decode", "Decoder")
  @js.native
  open class Decoder () extends StObject {
    def this(maxMessageSize: Double) = this()
    def this(maxMessageSize: Double, maxUnprocessedMessageQueueSize: Double) = this()
    def this(maxMessageSize: Unit, maxUnprocessedMessageQueueSize: Double) = this()
    
    /* private */ val _buffer: Any = js.native
    
    /**
      * Attempts to decode the message header from the buffer
      */
    def _decodeHeader(data: Uint8ArrayList): MessageHeader = js.native
    
    /* private */ var _headerInfo: Any = js.native
    
    /* private */ val _maxMessageSize: Any = js.native
    
    /* private */ val _maxUnprocessedMessageQueueSize: Any = js.native
    
    def write(chunk: js.typedarray.Uint8Array): js.Array[Message] = js.native
    def write(chunk: Uint8ArrayList): js.Array[Message] = js.native
  }
  
  @JSImport("@libp2p/mplex/dist/src/decode", "MAX_MSG_QUEUE_SIZE")
  @js.native
  val MAX_MSG_QUEUE_SIZE: Double = js.native
  
  @JSImport("@libp2p/mplex/dist/src/decode", "MAX_MSG_SIZE")
  @js.native
  val MAX_MSG_SIZE: Double = js.native
  
  trait MessageHeader extends StObject {
    
    var id: Double
    
    var length: Double
    
    var offset: Double
    
    var `type`: /* keyof @libp2p/mplex.anon.RecordCODENAME */ `3` | `2` | `4` | `0` | `5` | `6` | `1`
  }
  object MessageHeader {
    
    inline def apply(
      id: Double,
      length: Double,
      offset: Double,
      `type`: /* keyof @libp2p/mplex.anon.RecordCODENAME */ `3` | `2` | `4` | `0` | `5` | `6` | `1`
    ): MessageHeader = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageHeader] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* keyof @libp2p/mplex.anon.RecordCODENAME */ `3` | `2` | `4` | `0` | `5` | `6` | `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadVarIntResult extends StObject {
    
    var offset: Double
    
    var value: Double
  }
  object ReadVarIntResult {
    
    inline def apply(offset: Double, value: Double): ReadVarIntResult = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadVarIntResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadVarIntResult] (val x: Self) extends AnyVal {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
