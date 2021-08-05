package typings.libp2pNoise

import typings.buffer.mod.Buffer
import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.handshakeMod.MessageBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encoderMod {
  
  @JSImport("libp2p-noise/dist/src/encoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode0(input: bytes): MessageBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode0")(input.asInstanceOf[js.Any]).asInstanceOf[MessageBuffer]
  
  inline def decode1(input: bytes): MessageBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode1")(input.asInstanceOf[js.Any]).asInstanceOf[MessageBuffer]
  
  inline def decode2(input: bytes): MessageBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode2")(input.asInstanceOf[js.Any]).asInstanceOf[MessageBuffer]
  
  inline def encode0(message: MessageBuffer): bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("encode0")(message.asInstanceOf[js.Any]).asInstanceOf[bytes]
  
  inline def encode1(message: MessageBuffer): bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("encode1")(message.asInstanceOf[js.Any]).asInstanceOf[bytes]
  
  inline def encode2(message: MessageBuffer): bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("encode2")(message.asInstanceOf[js.Any]).asInstanceOf[bytes]
  
  object uint16BEDecode {
    
    inline def apply(data: typings.bl.mod.^): Double = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def apply(data: Buffer): Double = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("libp2p-noise/dist/src/encoder", "uint16BEDecode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libp2p-noise/dist/src/encoder", "uint16BEDecode.bytes")
    @js.native
    def bytes: Double = js.native
    inline def bytes_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytes")(x.asInstanceOf[js.Any])
  }
  
  object uint16BEEncode {
    
    inline def apply(value: Double, target: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], target.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @JSImport("libp2p-noise/dist/src/encoder", "uint16BEEncode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libp2p-noise/dist/src/encoder", "uint16BEEncode.bytes")
    @js.native
    def bytes: Double = js.native
    inline def bytes_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytes")(x.asInstanceOf[js.Any])
  }
}
