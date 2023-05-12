package typings.itPbStream

import typings.itLengthPrefixed.mod.LengthDecoderFunction
import typings.itLengthPrefixed.mod.LengthEncoderFunction
import typings.itPbStream.anon.Decode
import typings.itPbStream.anon.DecodeEncode
import typings.itPbStream.anon.Encode
import typings.itPbStream.anon.PartialOpts
import typings.itStreamTypes.mod.Duplex
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-pb-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pbStream[Stream /* <: Duplex[Any, Any, Any] */](duplex: Stream): ProtobufStream[Stream] = ^.asInstanceOf[js.Dynamic].applyDynamic("pbStream")(duplex.asInstanceOf[js.Any]).asInstanceOf[ProtobufStream[Stream]]
  inline def pbStream[Stream /* <: Duplex[Any, Any, Any] */](duplex: Stream, opts: PartialOpts): ProtobufStream[Stream] = (^.asInstanceOf[js.Dynamic].applyDynamic("pbStream")(duplex.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ProtobufStream[Stream]]
  
  type Decoder[T] = js.Function1[/* data */ js.typedarray.Uint8Array | Uint8ArrayList, T]
  
  type Encoder[T] = js.Function1[/* data */ T, js.typedarray.Uint8Array]
  
  trait MessageStream[T, S] extends StObject {
    
    /**
      * Read a message from the stream
      */
    def read(): js.Promise[T]
    
    /**
      * Unwrap the underlying protobuf stream
      */
    def unwrap(): ProtobufStream[S]
    
    /**
      * Write a message to the stream
      */
    def write(d: T): Unit
  }
  object MessageStream {
    
    inline def apply[T, S](read: () => js.Promise[T], unwrap: () => ProtobufStream[S], write: T => Unit): MessageStream[T, S] = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read), unwrap = js.Any.fromFunction0(unwrap), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[MessageStream[T, S]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageStream[?, ?], T, S] (val x: Self & (MessageStream[T, S])) extends AnyVal {
      
      inline def setRead(value: () => js.Promise[T]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def setUnwrap(value: () => ProtobufStream[S]): Self = StObject.set(x, "unwrap", js.Any.fromFunction0(value))
      
      inline def setWrite(value: T => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  trait Opts extends StObject {
    
    def lengthDecoder(data: Uint8ArrayList): Double
    @JSName("lengthDecoder")
    var lengthDecoder_Original: LengthDecoderFunction
    
    def lengthEncoder(value: Double): Uint8ArrayList | js.typedarray.Uint8Array
    @JSName("lengthEncoder")
    var lengthEncoder_Original: LengthEncoderFunction
    
    var maxDataLength: Double
    
    var maxLengthLength: Double
    
    var minPoolSize: Double
    
    var poolSize: Double
  }
  object Opts {
    
    inline def apply(
      lengthDecoder: LengthDecoderFunction,
      lengthEncoder: LengthEncoderFunction,
      maxDataLength: Double,
      maxLengthLength: Double,
      minPoolSize: Double,
      poolSize: Double
    ): Opts = {
      val __obj = js.Dynamic.literal(lengthDecoder = lengthDecoder.asInstanceOf[js.Any], lengthEncoder = lengthEncoder.asInstanceOf[js.Any], maxDataLength = maxDataLength.asInstanceOf[js.Any], maxLengthLength = maxLengthLength.asInstanceOf[js.Any], minPoolSize = minPoolSize.asInstanceOf[js.Any], poolSize = poolSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Opts] (val x: Self) extends AnyVal {
      
      inline def setLengthDecoder(value: LengthDecoderFunction): Self = StObject.set(x, "lengthDecoder", value.asInstanceOf[js.Any])
      
      inline def setLengthEncoder(value: LengthEncoderFunction): Self = StObject.set(x, "lengthEncoder", value.asInstanceOf[js.Any])
      
      inline def setMaxDataLength(value: Double): Self = StObject.set(x, "maxDataLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthLength(value: Double): Self = StObject.set(x, "maxLengthLength", value.asInstanceOf[js.Any])
      
      inline def setMinPoolSize(value: Double): Self = StObject.set(x, "minPoolSize", value.asInstanceOf[js.Any])
      
      inline def setPoolSize(value: Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProtobufStream[Stream] extends StObject {
    
    /**
      * Returns an object with read/write methods for operating on one specific type of protobuf message
      */
    def pb[T](proto: DecodeEncode[T]): MessageStream[T, Stream] = js.native
    
    /**
      * Read a set number of bytes from the stream
      */
    def read(): js.Promise[Uint8ArrayList] = js.native
    def read(bytes: Double): js.Promise[Uint8ArrayList] = js.native
    
    /**
      * Read the next length-prefixed number of bytes from the stream
      */
    def readLP(): js.Promise[Uint8ArrayList] = js.native
    
    /**
      * Read the next length-prefixed byte array from the stream and decode it as the passed protobuf format
      */
    def readPB[T](proto: Decode[T]): js.Promise[T] = js.native
    
    /**
      * Returns the underlying stream
      */
    def unwrap(): Stream = js.native
    
    /**
      * Write the passed bytes to the stream
      */
    def write(input: js.typedarray.Uint8Array): Unit = js.native
    def write(input: Uint8ArrayList): Unit = js.native
    
    /**
      * Write the passed bytes to the stream prefixed by their length
      */
    def writeLP(input: js.typedarray.Uint8Array): Unit = js.native
    def writeLP(input: Uint8ArrayList): Unit = js.native
    
    /**
      * Encode the passed object as a protobuf message and write it's length-prefixed bytes tot he stream
      */
    def writePB[T](data: T, proto: Encode[T]): Unit = js.native
  }
}
