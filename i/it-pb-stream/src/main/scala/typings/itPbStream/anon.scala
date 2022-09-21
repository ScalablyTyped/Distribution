package typings.itPbStream

import typings.itPbStream.mod.Decoder
import typings.itPbStream.mod.Encoder
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Decode[T] extends StObject {
    
    def decode(data: js.typedarray.Uint8Array): T
    def decode(data: Uint8ArrayList): T
    @JSName("decode")
    var decode_Original: Decoder[T]
  }
  object Decode {
    
    inline def apply[T](decode: /* data */ js.typedarray.Uint8Array | Uint8ArrayList => T): Decode[T] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode))
      __obj.asInstanceOf[Decode[T]]
    }
    
    extension [Self <: Decode[?], T](x: Self & Decode[T]) {
      
      inline def setDecode(value: /* data */ js.typedarray.Uint8Array | Uint8ArrayList => T): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    }
  }
  
  trait DecodeEncode[T] extends StObject {
    
    def decode(data: js.typedarray.Uint8Array): T
    def decode(data: Uint8ArrayList): T
    @JSName("decode")
    var decode_Original: Decoder[T]
    
    def encode(data: T): js.typedarray.Uint8Array
    @JSName("encode")
    var encode_Original: Encoder[T]
  }
  object DecodeEncode {
    
    inline def apply[T](
      decode: /* data */ js.typedarray.Uint8Array | Uint8ArrayList => T,
      encode: T => js.typedarray.Uint8Array
    ): DecodeEncode[T] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[DecodeEncode[T]]
    }
    
    extension [Self <: DecodeEncode[?], T](x: Self & DecodeEncode[T]) {
      
      inline def setDecode(value: /* data */ js.typedarray.Uint8Array | Uint8ArrayList => T): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: T => js.typedarray.Uint8Array): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  trait Encode extends StObject {
    
    def encode(data: Any): js.typedarray.Uint8Array
    @JSName("encode")
    var encode_Original: Encoder[Any]
  }
  object Encode {
    
    inline def apply(encode: Any => js.typedarray.Uint8Array): Encode = {
      val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Encode]
    }
    
    extension [Self <: Encode](x: Self) {
      
      inline def setEncode(value: Any => js.typedarray.Uint8Array): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Read[T] extends StObject {
    
    def read(): js.Promise[T] = js.native
    
    def write(d: js.typedarray.Uint8Array): Unit = js.native
    def write(d: Uint8ArrayList): Unit = js.native
  }
}
