package typings.lz4

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.lz4.lz4Strings.data
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lz4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("lz4", "createDecoderStream")
  @js.native
  open class createDecoderStream () extends Decoder {
    def this(options: DecoderOptions) = this()
  }
  @JSImport("lz4", "createDecoderStream")
  @js.native
  val createDecoderStream: DecoderConstructor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("lz4", "createEncoderStream")
  @js.native
  open class createEncoderStream () extends Encoder {
    def this(options: EncoderOptions) = this()
  }
  @JSImport("lz4", "createEncoderStream")
  @js.native
  val createEncoderStream: EncoderConstructor = js.native
  
  inline def decode(input: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def decode(input: Buffer, options: DecoderOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def decodeBlock(input: Buffer, output: Buffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeBlock")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def decodeBlock(input: Buffer, output: Buffer, startIdx: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeBlock")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], startIdx.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def decodeBlock(input: Buffer, output: Buffer, startIdx: Double, endIdx: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeBlock")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], startIdx.asInstanceOf[js.Any], endIdx.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def decodeBlock(input: Buffer, output: Buffer, startIdx: Unit, endIdx: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeBlock")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], startIdx.asInstanceOf[js.Any], endIdx.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def encode(input: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def encode(input: Buffer, options: EncoderOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encodeBlock(input: Buffer, output: Buffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeBlock")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def encodeBlock(input: Buffer, output: Buffer, startIdx: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeBlock")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], startIdx.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def encodeBlock(input: Buffer, output: Buffer, startIdx: Double, endIdx: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeBlock")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], startIdx.asInstanceOf[js.Any], endIdx.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def encodeBlock(input: Buffer, output: Buffer, startIdx: Unit, endIdx: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeBlock")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], startIdx.asInstanceOf[js.Any], endIdx.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def encodeBlockHC(input: Buffer, output: Buffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeBlockHC")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def encodeBlockHC(input: Buffer, output: Buffer, compressionLevel: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeBlockHC")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], compressionLevel.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def encodeBound(inputSize: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBound")(inputSize.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @js.native
  trait Decoder extends Transform {
    
    def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("off")
    def off_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
  }
  
  @js.native
  trait DecoderConstructor
    extends StObject
       with Instantiable0[Decoder]
       with Instantiable1[/* options */ DecoderOptions, Decoder] {
    
    def apply(): Decoder = js.native
    def apply(options: DecoderOptions): Decoder = js.native
  }
  
  trait DecoderOptions extends StObject {
    
    /**
      * Use JS LZ4 implementation instead of the native one.
      * @default false
      */
    var useJS: js.UndefOr[Boolean] = js.undefined
  }
  object DecoderOptions {
    
    inline def apply(): DecoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecoderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecoderOptions] (val x: Self) extends AnyVal {
      
      inline def setUseJS(value: Boolean): Self = StObject.set(x, "useJS", value.asInstanceOf[js.Any])
      
      inline def setUseJSUndefined: Self = StObject.set(x, "useJS", js.undefined)
    }
  }
  
  @js.native
  trait Encoder extends Transform {
    
    def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("off")
    def off_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ Buffer, Unit]): this.type = js.native
  }
  
  @js.native
  trait EncoderConstructor
    extends StObject
       with Instantiable0[Encoder]
       with Instantiable1[/* options */ EncoderOptions, Encoder] {
    
    def apply(): Encoder = js.native
    def apply(options: EncoderOptions): Encoder = js.native
  }
  
  trait EncoderOptions extends StObject {
    
    /**
      * Add compressed blocks checksum.
      * @default false
      */
    var blockChecksum: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var blockIndependence: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Chunk size to use.
      * @default 4Mb
      */
    var blockMaxSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Use dictionary.
      * @default false
      */
    var dict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Dictionary id.
      * @default 0
      */
    var dictId: js.UndefOr[Double] = js.undefined
    
    /**
      * Use high compression.
      * @default false
      */
    var highCompression: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Add full LZ4 stream checksum.
      * @default true
      */
    var streamChecksum: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Add full LZ4 stream size.
      * @default false
      */
    var streamSize: js.UndefOr[Boolean] = js.undefined
  }
  object EncoderOptions {
    
    inline def apply(): EncoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncoderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncoderOptions] (val x: Self) extends AnyVal {
      
      inline def setBlockChecksum(value: Boolean): Self = StObject.set(x, "blockChecksum", value.asInstanceOf[js.Any])
      
      inline def setBlockChecksumUndefined: Self = StObject.set(x, "blockChecksum", js.undefined)
      
      inline def setBlockIndependence(value: Boolean): Self = StObject.set(x, "blockIndependence", value.asInstanceOf[js.Any])
      
      inline def setBlockIndependenceUndefined: Self = StObject.set(x, "blockIndependence", js.undefined)
      
      inline def setBlockMaxSize(value: Double): Self = StObject.set(x, "blockMaxSize", value.asInstanceOf[js.Any])
      
      inline def setBlockMaxSizeUndefined: Self = StObject.set(x, "blockMaxSize", js.undefined)
      
      inline def setDict(value: Boolean): Self = StObject.set(x, "dict", value.asInstanceOf[js.Any])
      
      inline def setDictId(value: Double): Self = StObject.set(x, "dictId", value.asInstanceOf[js.Any])
      
      inline def setDictIdUndefined: Self = StObject.set(x, "dictId", js.undefined)
      
      inline def setDictUndefined: Self = StObject.set(x, "dict", js.undefined)
      
      inline def setHighCompression(value: Boolean): Self = StObject.set(x, "highCompression", value.asInstanceOf[js.Any])
      
      inline def setHighCompressionUndefined: Self = StObject.set(x, "highCompression", js.undefined)
      
      inline def setStreamChecksum(value: Boolean): Self = StObject.set(x, "streamChecksum", value.asInstanceOf[js.Any])
      
      inline def setStreamChecksumUndefined: Self = StObject.set(x, "streamChecksum", js.undefined)
      
      inline def setStreamSize(value: Boolean): Self = StObject.set(x, "streamSize", value.asInstanceOf[js.Any])
      
      inline def setStreamSizeUndefined: Self = StObject.set(x, "streamSize", js.undefined)
    }
  }
}
