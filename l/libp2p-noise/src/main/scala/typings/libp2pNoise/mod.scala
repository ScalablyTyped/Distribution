package typings.libp2pNoise

import typings.bl.mod.^
import typings.buffer.mod.Buffer
import typings.libp2pNoise.anon.PartialDecoderOptions
import typings.libp2pNoise.anon.PartiallengthEncoderLengt
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-length-prefixed", "decode")
  @js.native
  val decode: Decoder = js.native
  
  @JSImport("it-length-prefixed", "encode")
  @js.native
  val encode: Encoder = js.native
  
  @js.native
  trait Decoder extends StObject {
    
    def apply(): AsyncGenerator[^, ^, js.Any] = js.native
    def apply(options: PartialDecoderOptions): AsyncGenerator[^, ^, js.Any] = js.native
    
    var MAX_DATA_LENGTH: Double = js.native
    
    var MAX_LENGTH_LENGTH: Double = js.native
    
    def fromReader(reader: js.Any): ^ = js.native
    def fromReader(reader: js.Any, options: PartialDecoderOptions): ^ = js.native
  }
  
  trait DecoderOptions extends StObject {
    
    def lengthDecoder(data: ^): Double
    def lengthDecoder(data: Buffer): Double
    @JSName("lengthDecoder")
    var lengthDecoder_Original: LengthDecoderFunction
    
    var maxDataLength: Double
    
    var maxLengthLength: Double
  }
  object DecoderOptions {
    
    inline def apply(lengthDecoder: LengthDecoderFunction, maxDataLength: Double, maxLengthLength: Double): DecoderOptions = {
      val __obj = js.Dynamic.literal(lengthDecoder = lengthDecoder.asInstanceOf[js.Any], maxDataLength = maxDataLength.asInstanceOf[js.Any], maxLengthLength = maxLengthLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecoderOptions]
    }
    
    extension [Self <: DecoderOptions](x: Self) {
      
      inline def setLengthDecoder(value: LengthDecoderFunction): Self = StObject.set(x, "lengthDecoder", value.asInstanceOf[js.Any])
      
      inline def setMaxDataLength(value: Double): Self = StObject.set(x, "maxDataLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthLength(value: Double): Self = StObject.set(x, "maxLengthLength", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Encoder extends StObject {
    
    def apply(): AsyncGenerator[^, Buffer, js.Any] = js.native
    def apply(options: PartiallengthEncoderLengt): AsyncGenerator[^, Buffer, js.Any] = js.native
    
    var DEFAULT_POOL_SIZE: Double = js.native
    
    var MIN_POOL_SIZE: Double = js.native
    
    def single(chunk: Buffer): ^ = js.native
    def single(chunk: Buffer, options: PartiallengthEncoderLengt): ^ = js.native
  }
  
  @js.native
  trait LengthDecoderFunction extends StObject {
    
    def apply(data: ^): Double = js.native
    def apply(data: Buffer): Double = js.native
    
    var bytes: Double = js.native
  }
  
  @js.native
  trait LengthEncoderFunction extends StObject {
    
    def apply(value: Double, target: Buffer, offset: Double): Double | Buffer = js.native
    
    var bytes: Double = js.native
  }
}
