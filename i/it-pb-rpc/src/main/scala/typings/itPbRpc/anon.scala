package typings.itPbRpc

import typings.buffer.mod.Buffer
import typings.itPbRpc.mod.LengthDecoderFunction
import typings.itPbRpc.mod.LengthEncoderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Decode[T] extends StObject {
    
    def decode(data: Buffer): T
  }
  object Decode {
    
    inline def apply[T](decode: Buffer => T): Decode[T] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode))
      __obj.asInstanceOf[Decode[T]]
    }
    
    extension [Self <: Decode[?], T](x: Self & Decode[T]) {
      
      inline def setDecode(value: Buffer => T): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    }
  }
  
  trait DecodeEncode[Return] extends StObject {
    
    def decode(data: Buffer): Return
    
    def encode(data: js.Any): Buffer
  }
  object DecodeEncode {
    
    inline def apply[Return](decode: Buffer => Return, encode: js.Any => Buffer): DecodeEncode[Return] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[DecodeEncode[Return]]
    }
    
    extension [Self <: DecodeEncode[?], Return](x: Self & DecodeEncode[Return]) {
      
      inline def setDecode(value: Buffer => Return): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: js.Any => Buffer): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  trait Encode extends StObject {
    
    def encode(data: js.Any): Buffer
  }
  object Encode {
    
    inline def apply(encode: js.Any => Buffer): Encode = {
      val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Encode]
    }
    
    extension [Self <: Encode](x: Self) {
      
      inline def setEncode(value: js.Any => Buffer): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<it-pb-rpc.it-pb-rpc.Opts> */
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
    
    extension [Self <: PartialOpts](x: Self) {
      
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
  
  trait Read[Return] extends StObject {
    
    def read(): Return
    
    def write(d: Buffer): Unit
  }
  object Read {
    
    inline def apply[Return](read: () => Return, write: Buffer => Unit): Read[Return] = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Read[Return]]
    }
    
    extension [Self <: Read[?], Return](x: Self & Read[Return]) {
      
      inline def setRead(value: () => Return): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def setWrite(value: Buffer => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
