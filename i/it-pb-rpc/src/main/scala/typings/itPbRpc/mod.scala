package typings.itPbRpc

import typings.buffer.mod.Buffer
import typings.itPbRpc.anon.Decode
import typings.itPbRpc.anon.DecodeEncode
import typings.itPbRpc.anon.Encode
import typings.itPbRpc.anon.PartialOpts
import typings.itPbRpc.anon.Read
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(duplex: js.Any): WrappedDuplex = ^.asInstanceOf[js.Dynamic].apply(duplex.asInstanceOf[js.Any]).asInstanceOf[WrappedDuplex]
  @scala.inline
  def apply(duplex: js.Any, opts: PartialOpts): WrappedDuplex = (^.asInstanceOf[js.Dynamic].apply(duplex.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[WrappedDuplex]
  
  @JSImport("it-pb-rpc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait LengthDecoderFunction extends StObject {
    
    def apply(data: typings.bl.mod.^): Double = js.native
    def apply(data: Buffer): Double = js.native
    
    var bytes: Double = js.native
  }
  
  @js.native
  trait LengthEncoderFunction extends StObject {
    
    def apply(value: Double, target: Buffer, offset: Double): Double | Buffer = js.native
    
    var bytes: Double = js.native
  }
  
  trait Opts extends StObject {
    
    def lengthDecoder(data: typings.bl.mod.^): Double
    //decoding opts
    def lengthDecoder(data: Buffer): Double
    //decoding opts
    @JSName("lengthDecoder")
    var lengthDecoder_Original: LengthDecoderFunction
    
    def lengthEncoder(value: Double, target: Buffer, offset: Double): Double | Buffer
    @JSName("lengthEncoder")
    var lengthEncoder_Original: LengthEncoderFunction
    
    var maxDataLength: Double
    
    var maxLengthLength: Double
    
    var minPoolSize: Double
    
    //encoding opts
    var poolSize: Double
  }
  object Opts {
    
    @scala.inline
    def apply(
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
    implicit class OptsMutableBuilder[Self <: Opts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLengthDecoder(value: LengthDecoderFunction): Self = StObject.set(x, "lengthDecoder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthEncoder(value: LengthEncoderFunction): Self = StObject.set(x, "lengthEncoder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDataLength(value: Double): Self = StObject.set(x, "maxDataLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthLength(value: Double): Self = StObject.set(x, "maxLengthLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPoolSize(value: Double): Self = StObject.set(x, "minPoolSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolSize(value: Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WrappedDuplex extends StObject {
    
    def pb[Return](proto: DecodeEncode[Return]): Read[Return] = js.native
    
    def read(): js.Promise[typings.bl.mod.^] = js.native
    def read(bytes: Double): js.Promise[typings.bl.mod.^] = js.native
    
    def readLP(): js.Promise[typings.bl.mod.^] = js.native
    
    def readPB[T](proto: Decode[T]): js.Promise[T] = js.native
    
    //return vanilla duplex
    def unwrap(): js.Any = js.native
    
    def write(input: typings.bl.mod.^): Unit = js.native
    
    def writeLP(input: typings.bl.mod.^): Unit = js.native
    def writeLP(input: Buffer): Unit = js.native
    
    def writePB(data: typings.bl.mod.^, proto: Encode): Unit = js.native
    def writePB(data: Buffer, proto: Encode): Unit = js.native
  }
}
