package typings.itPbStream

import typings.itLengthPrefixed.mod.LengthDecoderFunction
import typings.itLengthPrefixed.mod.LengthEncoderFunction
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Decode[?], T] (val x: Self & Decode[T]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecodeEncode[?], T] (val x: Self & DecodeEncode[T]) extends AnyVal {
      
      inline def setDecode(value: /* data */ js.typedarray.Uint8Array | Uint8ArrayList => T): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: T => js.typedarray.Uint8Array): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  trait Encode[T] extends StObject {
    
    def encode(data: T): js.typedarray.Uint8Array
    @JSName("encode")
    var encode_Original: Encoder[T]
  }
  object Encode {
    
    inline def apply[T](encode: T => js.typedarray.Uint8Array): Encode[T] = {
      val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Encode[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Encode[?], T] (val x: Self & Encode[T]) extends AnyVal {
      
      inline def setEncode(value: T => js.typedarray.Uint8Array): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<it-pb-stream.it-pb-stream.Opts> */
  trait PartialOpts extends StObject {
    
    var lengthDecoder: js.UndefOr[LengthDecoderFunction] = js.undefined
    
    var lengthEncoder: js.UndefOr[LengthEncoderFunction] = js.undefined
    
    var maxDataLength: js.UndefOr[Double] = js.undefined
    
    var maxLengthLength: js.UndefOr[Double] = js.undefined
    
    var minPoolSize: js.UndefOr[Double] = js.undefined
    
    var poolSize: js.UndefOr[Double] = js.undefined
  }
  object PartialOpts {
    
    inline def apply(): PartialOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOpts] (val x: Self) extends AnyVal {
      
      inline def setLengthDecoder(value: LengthDecoderFunction): Self = StObject.set(x, "lengthDecoder", value.asInstanceOf[js.Any])
      
      inline def setLengthDecoderUndefined: Self = StObject.set(x, "lengthDecoder", js.undefined)
      
      inline def setLengthEncoder(value: LengthEncoderFunction): Self = StObject.set(x, "lengthEncoder", value.asInstanceOf[js.Any])
      
      inline def setLengthEncoderUndefined: Self = StObject.set(x, "lengthEncoder", js.undefined)
      
      inline def setMaxDataLength(value: Double): Self = StObject.set(x, "maxDataLength", value.asInstanceOf[js.Any])
      
      inline def setMaxDataLengthUndefined: Self = StObject.set(x, "maxDataLength", js.undefined)
      
      inline def setMaxLengthLength(value: Double): Self = StObject.set(x, "maxLengthLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthLengthUndefined: Self = StObject.set(x, "maxLengthLength", js.undefined)
      
      inline def setMinPoolSize(value: Double): Self = StObject.set(x, "minPoolSize", value.asInstanceOf[js.Any])
      
      inline def setMinPoolSizeUndefined: Self = StObject.set(x, "minPoolSize", js.undefined)
      
      inline def setPoolSize(value: Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
      
      inline def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
    }
  }
}
