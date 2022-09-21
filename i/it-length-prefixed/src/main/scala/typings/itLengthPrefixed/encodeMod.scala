package typings.itLengthPrefixed

import typings.itLengthPrefixed.mod.LengthEncoderFunction
import typings.itStreamTypes.mod.Transform
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodeMod {
  
  object encode {
    
    inline def apply(): Transform[Uint8ArrayList | js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform[Uint8ArrayList | js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
    inline def apply(options: EncoderOptions): Transform[Uint8ArrayList | js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transform[Uint8ArrayList | js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
    
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
    
    extension [Self <: EncoderOptions](x: Self) {
      
      inline def setLengthEncoder(value: LengthEncoderFunction): Self = StObject.set(x, "lengthEncoder", value.asInstanceOf[js.Any])
      
      inline def setLengthEncoderUndefined: Self = StObject.set(x, "lengthEncoder", js.undefined)
    }
  }
}
