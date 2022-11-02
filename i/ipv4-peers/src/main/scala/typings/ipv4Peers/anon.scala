package typings.ipv4Peers

import typings.ipv4Peers.mod.Peer
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Decode extends StObject
  
  trait Encode extends StObject {
    
    def decode(buffer: Buffer): js.Array[Peer]
    def decode(buffer: Buffer, offset: Double): js.Array[Peer]
    def decode(buffer: Buffer, offset: Double, end: Double): js.Array[Peer]
    def decode(buffer: Buffer, offset: Unit, end: Double): js.Array[Peer]
    @JSName("decode")
    var decode_Original: js.Function3[
        /* buffer */ Buffer, 
        /* offset */ js.UndefOr[Double], 
        /* end */ js.UndefOr[Double], 
        js.Array[Peer]
      ]
    
    def encode(peers: js.Array[Peer]): Buffer
    def encode(peers: js.Array[Peer], buffer: Unit, offset: Double): Buffer
    def encode(peers: js.Array[Peer], buffer: Buffer): Buffer
    def encode(peers: js.Array[Peer], buffer: Buffer, offset: Double): Buffer
    @JSName("encode")
    var encode_Original: js.Function3[
        /* peers */ js.Array[Peer], 
        /* buffer */ js.UndefOr[Buffer], 
        /* offset */ js.UndefOr[Double], 
        Buffer
      ]
    
    def encodingLength(peers: js.Array[Peer]): Double
    @JSName("encodingLength")
    var encodingLength_Original: js.Function1[/* peers */ js.Array[Peer], Double]
    
    def idLength(): Decode
    def idLength(idLength: Double): Decode
    @JSName("idLength")
    var idLength_Original: js.Function1[/* idLength */ js.UndefOr[Double], Decode]
  }
  object Encode {
    
    inline def apply(
      decode: (/* buffer */ Buffer, /* offset */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => js.Array[Peer],
      encode: (/* peers */ js.Array[Peer], /* buffer */ js.UndefOr[Buffer], /* offset */ js.UndefOr[Double]) => Buffer,
      encodingLength: /* peers */ js.Array[Peer] => Double,
      idLength: /* idLength */ js.UndefOr[Double] => Decode
    ): Encode = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction3(decode), encode = js.Any.fromFunction3(encode), encodingLength = js.Any.fromFunction1(encodingLength), idLength = js.Any.fromFunction1(idLength))
      __obj.asInstanceOf[Encode]
    }
    
    extension [Self <: Encode](x: Self) {
      
      inline def setDecode(
        value: (/* buffer */ Buffer, /* offset */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => js.Array[Peer]
      ): Self = StObject.set(x, "decode", js.Any.fromFunction3(value))
      
      inline def setEncode(
        value: (/* peers */ js.Array[Peer], /* buffer */ js.UndefOr[Buffer], /* offset */ js.UndefOr[Double]) => Buffer
      ): Self = StObject.set(x, "encode", js.Any.fromFunction3(value))
      
      inline def setEncodingLength(value: /* peers */ js.Array[Peer] => Double): Self = StObject.set(x, "encodingLength", js.Any.fromFunction1(value))
      
      inline def setIdLength(value: /* idLength */ js.UndefOr[Double] => Decode): Self = StObject.set(x, "idLength", js.Any.fromFunction1(value))
    }
  }
}
