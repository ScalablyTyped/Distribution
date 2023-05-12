package typings.itLengthPrefixed

import typings.itLengthPrefixed.distSrcDecodeMod.DecoderOptions
import typings.itReader.mod.Reader_
import typings.itStreamTypes.mod.Source
import typings.std.AsyncGenerator
import typings.std.Generator
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
    
    inline def apply(source: js.Iterable[Uint8ArrayList | js.typedarray.Uint8Array]): Generator[Uint8ArrayList, Unit, Any] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[Generator[Uint8ArrayList, Unit, Any]]
    inline def apply(source: js.Iterable[Uint8ArrayList | js.typedarray.Uint8Array], options: DecoderOptions): Generator[Uint8ArrayList, Unit, Any] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[Uint8ArrayList, Unit, Any]]
    inline def apply(source: Source[Uint8ArrayList | js.typedarray.Uint8Array]): AsyncGenerator[Uint8ArrayList, Unit, Any] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[Uint8ArrayList, Unit, Any]]
    inline def apply(source: Source[Uint8ArrayList | js.typedarray.Uint8Array], options: DecoderOptions): AsyncGenerator[Uint8ArrayList, Unit, Any] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[Uint8ArrayList, Unit, Any]]
    
    @JSImport("it-length-prefixed/decode", "decode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("it-length-prefixed/decode", "decode.fromReader")
    @js.native
    def fromReader: js.Function2[
        /* reader */ Reader_, 
        /* options */ js.UndefOr[DecoderOptions], 
        AsyncGenerator[Uint8ArrayList, Unit, Any]
      ] = js.native
    inline def fromReader_=(
      x: js.Function2[
          /* reader */ Reader_, 
          /* options */ js.UndefOr[DecoderOptions], 
          AsyncGenerator[Uint8ArrayList, Unit, Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromReader")(x.asInstanceOf[js.Any])
  }
}
