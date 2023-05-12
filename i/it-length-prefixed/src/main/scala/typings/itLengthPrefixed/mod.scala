package typings.itLengthPrefixed

import typings.itLengthPrefixed.distSrcDecodeMod.DecoderOptions
import typings.itLengthPrefixed.distSrcEncodeMod.EncoderOptions
import typings.itReader.mod.Reader_
import typings.itStreamTypes.mod.Source
import typings.std.AsyncGenerator
import typings.std.Generator
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object decode {
    
    inline def apply(source: js.Iterable[Uint8ArrayList | js.typedarray.Uint8Array]): Generator[Uint8ArrayList, Unit, Any] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[Generator[Uint8ArrayList, Unit, Any]]
    inline def apply(source: js.Iterable[Uint8ArrayList | js.typedarray.Uint8Array], options: DecoderOptions): Generator[Uint8ArrayList, Unit, Any] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[Uint8ArrayList, Unit, Any]]
    inline def apply(source: Source[Uint8ArrayList | js.typedarray.Uint8Array]): AsyncGenerator[Uint8ArrayList, Unit, Any] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[Uint8ArrayList, Unit, Any]]
    inline def apply(source: Source[Uint8ArrayList | js.typedarray.Uint8Array], options: DecoderOptions): AsyncGenerator[Uint8ArrayList, Unit, Any] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[Uint8ArrayList, Unit, Any]]
    
    @JSImport("it-length-prefixed", "decode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("it-length-prefixed", "decode.fromReader")
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
  
  object encode {
    
    inline def apply(source: js.Iterable[Uint8ArrayList | js.typedarray.Uint8Array]): Generator[js.typedarray.Uint8Array, Unit, Unit] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[Generator[js.typedarray.Uint8Array, Unit, Unit]]
    inline def apply(source: js.Iterable[Uint8ArrayList | js.typedarray.Uint8Array], options: EncoderOptions): Generator[js.typedarray.Uint8Array, Unit, Unit] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[js.typedarray.Uint8Array, Unit, Unit]]
    inline def apply(source: Source[Uint8ArrayList | js.typedarray.Uint8Array]): AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit]]
    inline def apply(source: Source[Uint8ArrayList | js.typedarray.Uint8Array], options: EncoderOptions): AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit]]
    
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
