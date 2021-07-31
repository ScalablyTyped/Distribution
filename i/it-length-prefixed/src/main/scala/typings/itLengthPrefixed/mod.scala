package typings.itLengthPrefixed

import typings.bl.mod.^
import typings.itLengthPrefixed.anon.PartialDecoderOptions
import typings.itLengthPrefixed.anon.PartiallengthEncoderLengt
import typings.node.Buffer
import typings.std.AsyncGenerator
import typings.std.AsyncIterator
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
  
  @JSImport("it-length-prefixed", "int32BEDecode")
  @js.native
  val int32BEDecode: LengthDecoderFunction = js.native
  
  @JSImport("it-length-prefixed", "int32BEEncode")
  @js.native
  val int32BEEncode: LengthEncoderFunction = js.native
  
  @JSImport("it-length-prefixed", "varintDecode")
  @js.native
  val varintDecode: LengthDecoderFunction = js.native
  
  @JSImport("it-length-prefixed", "varintEncode")
  @js.native
  val varintEncode: LengthEncoderFunction = js.native
  
  @js.native
  trait Decoder extends StObject {
    
    def apply(): AsyncGenerator[^ | Buffer, ^, js.Any] = js.native
    def apply(options: PartialDecoderOptions): AsyncGenerator[^ | Buffer, ^, js.Any] = js.native
    
    var MAX_DATA_LENGTH: Double = js.native
    
    var MAX_LENGTH_LENGTH: Double = js.native
    
    def fromReader(reader: AsyncIterator[Buffer, js.Any, Unit]): AsyncGenerator[^ | Buffer, ^, js.Any] = js.native
    def fromReader(reader: AsyncIterator[Buffer, js.Any, Unit], options: PartialDecoderOptions): AsyncGenerator[^ | Buffer, ^, js.Any] = js.native
  }
  
  @js.native
  trait DecoderOptions[T] extends StObject {
    
    def lengthDecoder(data: ^): Double = js.native
    def lengthDecoder(data: Buffer): Double = js.native
    @JSName("lengthDecoder")
    var lengthDecoder_Original: LengthDecoderFunction = js.native
    
    var maxDataLength: Double = js.native
    
    var maxLengthLength: Double = js.native
    
    def onData(data: ^): T = js.native
    def onData(data: Buffer): T = js.native
  }
  
  @js.native
  trait Encoder extends StObject {
    
    def apply(): AsyncGenerator[^ | Buffer, ^, js.Any] = js.native
    def apply(options: PartiallengthEncoderLengt): AsyncGenerator[^ | Buffer, ^, js.Any] = js.native
    
    var DEFAULT_POOL_SIZE: Double = js.native
    
    var MIN_POOL_SIZE: Double = js.native
    
    def single(chunk: ^): ^ = js.native
    def single(chunk: ^, options: PartiallengthEncoderLengt): ^ = js.native
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
