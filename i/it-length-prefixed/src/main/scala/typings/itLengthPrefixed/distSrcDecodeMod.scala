package typings.itLengthPrefixed

import typings.itLengthPrefixed.mod.LengthDecoderFunction
import typings.itReader.mod.Reader_
import typings.itStreamTypes.mod.Source
import typings.itStreamTypes.mod.Transform
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDecodeMod {
  
  @JSImport("it-length-prefixed/dist/src/decode", "MAX_DATA_LENGTH")
  @js.native
  val MAX_DATA_LENGTH: Double = js.native
  
  @JSImport("it-length-prefixed/dist/src/decode", "MAX_LENGTH_LENGTH")
  @js.native
  val MAX_LENGTH_LENGTH: /* 8 */ Double = js.native
  
  object decode {
    
    inline def apply(): Transform[Uint8ArrayList | js.typedarray.Uint8Array, Uint8ArrayList] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform[Uint8ArrayList | js.typedarray.Uint8Array, Uint8ArrayList]]
    inline def apply(options: DecoderOptions): Transform[Uint8ArrayList | js.typedarray.Uint8Array, Uint8ArrayList] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transform[Uint8ArrayList | js.typedarray.Uint8Array, Uint8ArrayList]]
    
    @JSImport("it-length-prefixed/dist/src/decode", "decode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("it-length-prefixed/dist/src/decode", "decode.fromReader")
    @js.native
    def fromReader: js.Function2[
        /* reader */ Reader_, 
        /* options */ js.UndefOr[DecoderOptions], 
        Source[Uint8ArrayList]
      ] = js.native
    inline def fromReader_=(
      x: js.Function2[
          /* reader */ Reader_, 
          /* options */ js.UndefOr[DecoderOptions], 
          Source[Uint8ArrayList]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromReader")(x.asInstanceOf[js.Any])
  }
  
  trait DecoderOptions extends StObject {
    
    var lengthDecoder: js.UndefOr[LengthDecoderFunction] = js.undefined
    
    var maxDataLength: js.UndefOr[Double] = js.undefined
    
    var maxLengthLength: js.UndefOr[Double] = js.undefined
    
    var onData: js.UndefOr[js.Function1[/* data */ Uint8ArrayList, Unit]] = js.undefined
    
    var onLength: js.UndefOr[js.Function1[/* length */ Double, Unit]] = js.undefined
  }
  object DecoderOptions {
    
    inline def apply(): DecoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecoderOptions]
    }
    
    extension [Self <: DecoderOptions](x: Self) {
      
      inline def setLengthDecoder(value: LengthDecoderFunction): Self = StObject.set(x, "lengthDecoder", value.asInstanceOf[js.Any])
      
      inline def setLengthDecoderUndefined: Self = StObject.set(x, "lengthDecoder", js.undefined)
      
      inline def setMaxDataLength(value: Double): Self = StObject.set(x, "maxDataLength", value.asInstanceOf[js.Any])
      
      inline def setMaxDataLengthUndefined: Self = StObject.set(x, "maxDataLength", js.undefined)
      
      inline def setMaxLengthLength(value: Double): Self = StObject.set(x, "maxLengthLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthLengthUndefined: Self = StObject.set(x, "maxLengthLength", js.undefined)
      
      inline def setOnData(value: /* data */ Uint8ArrayList => Unit): Self = StObject.set(x, "onData", js.Any.fromFunction1(value))
      
      inline def setOnDataUndefined: Self = StObject.set(x, "onData", js.undefined)
      
      inline def setOnLength(value: /* length */ Double => Unit): Self = StObject.set(x, "onLength", js.Any.fromFunction1(value))
      
      inline def setOnLengthUndefined: Self = StObject.set(x, "onLength", js.undefined)
    }
  }
  
  trait ReadResult extends StObject {
    
    var buffer: Uint8ArrayList
    
    var chunk: js.UndefOr[Uint8ArrayList] = js.undefined
    
    var data: js.UndefOr[Uint8ArrayList] = js.undefined
    
    var mode: String
    
    var state: js.UndefOr[ReadState] = js.undefined
  }
  object ReadResult {
    
    inline def apply(buffer: Uint8ArrayList, mode: String): ReadResult = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadResult]
    }
    
    extension [Self <: ReadResult](x: Self) {
      
      inline def setBuffer(value: Uint8ArrayList): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setChunk(value: Uint8ArrayList): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      inline def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
      
      inline def setData(value: Uint8ArrayList): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setState(value: ReadState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait ReadState extends StObject {
    
    var dataLength: Double
  }
  object ReadState {
    
    inline def apply(dataLength: Double): ReadState = {
      val __obj = js.Dynamic.literal(dataLength = dataLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadState]
    }
    
    extension [Self <: ReadState](x: Self) {
      
      inline def setDataLength(value: Double): Self = StObject.set(x, "dataLength", value.asInstanceOf[js.Any])
    }
  }
}
