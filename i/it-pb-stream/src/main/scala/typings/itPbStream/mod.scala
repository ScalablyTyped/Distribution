package typings.itPbStream

import typings.itLengthPrefixed.mod.LengthDecoderFunction
import typings.itLengthPrefixed.mod.LengthEncoderFunction
import typings.itPbStream.anon.Decode
import typings.itPbStream.anon.DecodeEncode
import typings.itPbStream.anon.Encode
import typings.itPbStream.anon.Read
import typings.itStreamTypes.mod.Duplex
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-pb-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pbStream(duplex: Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]]): ProtobufStream = ^.asInstanceOf[js.Dynamic].applyDynamic("pbStream")(duplex.asInstanceOf[js.Any]).asInstanceOf[ProtobufStream]
  inline def pbStream(
    duplex: Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]],
    opts: js.Object
  ): ProtobufStream = (^.asInstanceOf[js.Dynamic].applyDynamic("pbStream")(duplex.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ProtobufStream]
  
  type Decoder[T] = js.Function1[/* data */ js.typedarray.Uint8Array | Uint8ArrayList, T]
  
  type Encoder[T] = js.Function1[/* data */ T, js.typedarray.Uint8Array]
  
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
    
    extension [Self <: Opts](x: Self) {
      
      inline def setLengthDecoder(value: LengthDecoderFunction): Self = StObject.set(x, "lengthDecoder", value.asInstanceOf[js.Any])
      
      inline def setLengthEncoder(value: LengthEncoderFunction): Self = StObject.set(x, "lengthEncoder", value.asInstanceOf[js.Any])
      
      inline def setMaxDataLength(value: Double): Self = StObject.set(x, "maxDataLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthLength(value: Double): Self = StObject.set(x, "maxLengthLength", value.asInstanceOf[js.Any])
      
      inline def setMinPoolSize(value: Double): Self = StObject.set(x, "minPoolSize", value.asInstanceOf[js.Any])
      
      inline def setPoolSize(value: Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProtobufStream extends StObject {
    
    def pb[T](proto: DecodeEncode[T]): Read[T] = js.native
    
    def read(): js.Promise[Uint8ArrayList] = js.native
    def read(bytes: Double): js.Promise[Uint8ArrayList] = js.native
    
    def readLP(): js.Promise[Uint8ArrayList] = js.native
    
    def readPB[T](proto: Decode[T]): js.Promise[T] = js.native
    
    def unwrap(): Duplex[Uint8ArrayList, js.typedarray.Uint8Array, js.Promise[Unit]] = js.native
    
    def write(input: js.typedarray.Uint8Array): Unit = js.native
    def write(input: Uint8ArrayList): Unit = js.native
    
    def writeLP(input: js.typedarray.Uint8Array): Unit = js.native
    def writeLP(input: Uint8ArrayList): Unit = js.native
    
    def writePB(data: js.typedarray.Uint8Array, proto: Encode): Unit = js.native
    def writePB(data: Uint8ArrayList, proto: Encode): Unit = js.native
  }
}
