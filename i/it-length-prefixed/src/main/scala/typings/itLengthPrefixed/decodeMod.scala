package typings.itLengthPrefixed

import typings.itLengthPrefixed.distSrcDecodeMod.DecoderOptions
import typings.itReader.mod.Reader_
import typings.itStreamTypes.mod.Source
import typings.itStreamTypes.mod.Transform
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object decodeMod {
  
  @JSImport("it-length-prefixed/decode", "MAX_DATA_LENGTH")
  @js.native
  val MAX_DATA_LENGTH: Double = js.native
  
  @JSImport("it-length-prefixed/decode", "MAX_LENGTH_LENGTH")
  @js.native
  val MAX_LENGTH_LENGTH: /* 8 */ Double = js.native
  
  object decode {
    
    inline def apply(): Transform[Uint8ArrayList | js.typedarray.Uint8Array, Uint8ArrayList] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform[Uint8ArrayList | js.typedarray.Uint8Array, Uint8ArrayList]]
    inline def apply(options: DecoderOptions): Transform[Uint8ArrayList | js.typedarray.Uint8Array, Uint8ArrayList] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transform[Uint8ArrayList | js.typedarray.Uint8Array, Uint8ArrayList]]
    
    @JSImport("it-length-prefixed/decode", "decode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("it-length-prefixed/decode", "decode.fromReader")
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
}
