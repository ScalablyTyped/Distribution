package typings.ipPacket

import typings.ipPacket.mod.DecodedPacket
import typings.ipPacket.mod.Options
import typings.ipPacket.mod.Packet
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Configure extends StObject
  
  trait Decode extends StObject {
    
    def configure(options: Options): Configure
    @JSName("configure")
    var configure_Original: js.Function1[/* options */ Options, Configure]
    
    def decode(buffer: Buffer): DecodedPacket
    def decode(buffer: Buffer, start: Double): DecodedPacket
    @JSName("decode")
    var decode_Original: js.Function2[/* buffer */ Buffer, /* start */ js.UndefOr[Double], DecodedPacket]
    
    def encode(packet: Packet): Buffer
    def encode(packet: Packet, buffer: Unit, offset: Double): Buffer
    def encode(packet: Packet, buffer: Buffer): Buffer
    def encode(packet: Packet, buffer: Buffer, offset: Double): Buffer
    @JSName("encode")
    var encode_Original: js.Function3[
        /* packet */ Packet, 
        /* buffer */ js.UndefOr[Buffer], 
        /* offset */ js.UndefOr[Double], 
        Buffer
      ]
    
    def encodingLength(packet: Packet): Double
    @JSName("encodingLength")
    var encodingLength_Original: js.Function1[/* packet */ Packet, Double]
  }
  object Decode {
    
    inline def apply(
      configure: /* options */ Options => Configure,
      decode: (/* buffer */ Buffer, /* start */ js.UndefOr[Double]) => DecodedPacket,
      encode: (/* packet */ Packet, /* buffer */ js.UndefOr[Buffer], /* offset */ js.UndefOr[Double]) => Buffer,
      encodingLength: /* packet */ Packet => Double
    ): Decode = {
      val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure), decode = js.Any.fromFunction2(decode), encode = js.Any.fromFunction3(encode), encodingLength = js.Any.fromFunction1(encodingLength))
      __obj.asInstanceOf[Decode]
    }
    
    extension [Self <: Decode](x: Self) {
      
      inline def setConfigure(value: /* options */ Options => Configure): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
      
      inline def setDecode(value: (/* buffer */ Buffer, /* start */ js.UndefOr[Double]) => DecodedPacket): Self = StObject.set(x, "decode", js.Any.fromFunction2(value))
      
      inline def setEncode(
        value: (/* packet */ Packet, /* buffer */ js.UndefOr[Buffer], /* offset */ js.UndefOr[Double]) => Buffer
      ): Self = StObject.set(x, "encode", js.Any.fromFunction3(value))
      
      inline def setEncodingLength(value: /* packet */ Packet => Double): Self = StObject.set(x, "encodingLength", js.Any.fromFunction1(value))
    }
  }
}
