package typings.itPbRpc

import typings.bl.mod.^
import typings.buffer.mod.Buffer
import typings.itPbRpc.anon.Decode
import typings.itPbRpc.anon.DecodeEncode
import typings.itPbRpc.anon.Encode
import typings.itPbRpc.anon.PartialOpts
import typings.itPbRpc.anon.Read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("it-pb-rpc", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(duplex: js.Any): WrappedDuplex = js.native
  def apply(duplex: js.Any, opts: PartialOpts): WrappedDuplex = js.native
  
  @js.native
  trait LengthDecoderFunction extends js.Object {
    
    def apply(data: ^): Double = js.native
    def apply(data: Buffer): Double = js.native
    
    var bytes: Double = js.native
  }
  
  @js.native
  trait LengthEncoderFunction extends js.Object {
    
    def apply(value: Double, target: Buffer, offset: Double): Double | Buffer = js.native
    
    var bytes: Double = js.native
  }
  
  @js.native
  trait Opts extends js.Object {
    
    def lengthDecoder(data: ^): Double = js.native
    //decoding opts
    def lengthDecoder(data: Buffer): Double = js.native
    //decoding opts
    @JSName("lengthDecoder")
    var lengthDecoder_Original: LengthDecoderFunction = js.native
    
    def lengthEncoder(value: Double, target: Buffer, offset: Double): Double | Buffer = js.native
    @JSName("lengthEncoder")
    var lengthEncoder_Original: LengthEncoderFunction = js.native
    
    var maxDataLength: Double = js.native
    
    var maxLengthLength: Double = js.native
    
    var minPoolSize: Double = js.native
    
    //encoding opts
    var poolSize: Double = js.native
  }
  
  @js.native
  trait WrappedDuplex extends js.Object {
    
    def pb[Return](proto: DecodeEncode[Return]): Read[Return] = js.native
    
    def read(): js.Promise[^] = js.native
    def read(bytes: Double): js.Promise[^] = js.native
    
    def readLP(): js.Promise[^] = js.native
    
    def readPB[T](proto: Decode[T]): js.Promise[T] = js.native
    
    //return vanilla duplex
    def unwrap(): js.Any = js.native
    
    def write(input: ^): Unit = js.native
    
    def writeLP(input: ^): Unit = js.native
    def writeLP(input: Buffer): Unit = js.native
    
    def writePB(data: ^, proto: Encode): Unit = js.native
    def writePB(data: Buffer, proto: Encode): Unit = js.native
  }
}
