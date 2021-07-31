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
    
    @scala.inline
    def apply[T](decode: Buffer => T): Decode[T] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode))
      __obj.asInstanceOf[Decode[T]]
    }
    
    @scala.inline
    implicit class DecodeMutableBuilder[Self <: Decode[?], T] (val x: Self & Decode[T]) extends AnyVal {
      
      @scala.inline
      def setDecode(value: Buffer => T): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    }
  }
  
  trait DecodeEncode[Return] extends StObject {
    
    def decode(data: Buffer): Return
    
    def encode(data: js.Any): Buffer
  }
  object DecodeEncode {
    
    @scala.inline
    def apply[Return](decode: Buffer => Return, encode: js.Any => Buffer): DecodeEncode[Return] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[DecodeEncode[Return]]
    }
    
    @scala.inline
    implicit class DecodeEncodeMutableBuilder[Self <: DecodeEncode[?], Return] (val x: Self & DecodeEncode[Return]) extends AnyVal {
      
      @scala.inline
      def setDecode(value: Buffer => Return): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncode(value: js.Any => Buffer): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  trait Encode extends StObject {
    
    def encode(data: js.Any): Buffer
  }
  object Encode {
    
    @scala.inline
    def apply(encode: js.Any => Buffer): Encode = {
      val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Encode]
    }
    
    @scala.inline
    implicit class EncodeMutableBuilder[Self <: Encode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncode(value: js.Any => Buffer): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
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
    
    @scala.inline
    def apply(): PartialOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOpts]
    }
    
    @scala.inline
    implicit class PartialOptsMutableBuilder[Self <: PartialOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLengthDecoder(value: LengthDecoderFunction): Self = StObject.set(x, "lengthDecoder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthDecoderUndefined: Self = StObject.set(x, "lengthDecoder", js.undefined)
      
      @scala.inline
      def setLengthEncoder(value: LengthEncoderFunction): Self = StObject.set(x, "lengthEncoder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthEncoderUndefined: Self = StObject.set(x, "lengthEncoder", js.undefined)
      
      @scala.inline
      def setMaxDataLength(value: Double): Self = StObject.set(x, "maxDataLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDataLengthUndefined: Self = StObject.set(x, "maxDataLength", js.undefined)
      
      @scala.inline
      def setMaxLengthLength(value: Double): Self = StObject.set(x, "maxLengthLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthLengthUndefined: Self = StObject.set(x, "maxLengthLength", js.undefined)
      
      @scala.inline
      def setMinPoolSize(value: Double): Self = StObject.set(x, "minPoolSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPoolSizeUndefined: Self = StObject.set(x, "minPoolSize", js.undefined)
      
      @scala.inline
      def setPoolSize(value: Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
    }
  }
  
  trait Read[Return] extends StObject {
    
    def read(): Return
    
    def write(d: Buffer): Unit
  }
  object Read {
    
    @scala.inline
    def apply[Return](read: () => Return, write: Buffer => Unit): Read[Return] = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Read[Return]]
    }
    
    @scala.inline
    implicit class ReadMutableBuilder[Self <: Read[?], Return] (val x: Self & Read[Return]) extends AnyVal {
      
      @scala.inline
      def setRead(value: () => Return): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWrite(value: Buffer => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
