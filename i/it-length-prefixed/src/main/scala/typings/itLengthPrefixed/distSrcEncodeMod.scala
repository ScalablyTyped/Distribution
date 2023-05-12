package typings.itLengthPrefixed

import typings.itLengthPrefixed.mod.LengthEncoderFunction
import typings.itStreamTypes.mod.Source
import typings.std.AsyncGenerator
import typings.std.Generator
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEncodeMod {
  
  object encode {
    
    inline def apply(source: js.Iterable[Uint8ArrayList | js.typedarray.Uint8Array]): Generator[js.typedarray.Uint8Array, Unit, Unit] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[Generator[js.typedarray.Uint8Array, Unit, Unit]]
    inline def apply(source: js.Iterable[Uint8ArrayList | js.typedarray.Uint8Array], options: EncoderOptions): Generator[js.typedarray.Uint8Array, Unit, Unit] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Generator[js.typedarray.Uint8Array, Unit, Unit]]
    inline def apply(source: Source[Uint8ArrayList | js.typedarray.Uint8Array]): AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit]]
    inline def apply(source: Source[Uint8ArrayList | js.typedarray.Uint8Array], options: EncoderOptions): AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit]]
    
    @JSImport("it-length-prefixed/dist/src/encode", "encode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("it-length-prefixed/dist/src/encode", "encode.single")
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
  
  trait EncoderOptions extends StObject {
    
    var lengthEncoder: js.UndefOr[LengthEncoderFunction] = js.undefined
  }
  object EncoderOptions {
    
    inline def apply(): EncoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncoderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncoderOptions] (val x: Self) extends AnyVal {
      
      inline def setLengthEncoder(value: LengthEncoderFunction): Self = StObject.set(x, "lengthEncoder", value.asInstanceOf[js.Any])
      
      inline def setLengthEncoderUndefined: Self = StObject.set(x, "lengthEncoder", js.undefined)
    }
  }
}
