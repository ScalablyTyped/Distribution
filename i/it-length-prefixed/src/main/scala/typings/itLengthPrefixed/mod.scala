package typings.itLengthPrefixed

import typings.itLengthPrefixed.decodeMod.DecoderOptions
import typings.itLengthPrefixed.encodeMod.EncoderOptions
import typings.itReader.mod.Reader_
import typings.itStreamTypes.mod.Source
import typings.itStreamTypes.mod.Transform
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object decode {
    
    inline def apply(): Transform[Uint8ArrayList | js.typedarray.Uint8Array, Uint8ArrayList] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform[Uint8ArrayList | js.typedarray.Uint8Array, Uint8ArrayList]]
    inline def apply(options: DecoderOptions): Transform[Uint8ArrayList | js.typedarray.Uint8Array, Uint8ArrayList] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transform[Uint8ArrayList | js.typedarray.Uint8Array, Uint8ArrayList]]
    
    @JSImport("it-length-prefixed", "decode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("it-length-prefixed", "decode.fromReader")
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
  
  object encode {
    
    inline def apply(): Transform[Uint8ArrayList | js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform[Uint8ArrayList | js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
    inline def apply(options: EncoderOptions): Transform[Uint8ArrayList | js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transform[Uint8ArrayList | js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
    
    @JSImport("it-length-prefixed", "encode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("it-length-prefixed", "encode.single")
    @js.native
    def single: js.Function2[
        /* chunk */ js.typedarray.Uint8Array | Uint8ArrayList, 
        /* options */ js.UndefOr[EncoderOptions], 
        Uint8ArrayList
      ] = js.native
    inline def single_=(
      x: js.Function2[
          /* chunk */ js.typedarray.Uint8Array | Uint8ArrayList, 
          /* options */ js.UndefOr[EncoderOptions], 
          Uint8ArrayList
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("single")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LengthDecoderFunction extends StObject {
    
    def apply(data: Uint8ArrayList): Double = js.native
    
    var bytes: Double = js.native
  }
  
  @js.native
  trait LengthEncoderFunction extends StObject {
    
    def apply(value: Double): Uint8ArrayList | js.typedarray.Uint8Array = js.native
    
    var bytes: Double = js.native
  }
}
