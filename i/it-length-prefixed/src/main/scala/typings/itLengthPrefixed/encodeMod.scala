package typings.itLengthPrefixed

import typings.itLengthPrefixed.distSrcEncodeMod.EncoderOptions
import typings.itStreamTypes.mod.Transform
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object encodeMod {
  
  object encode {
    
    inline def apply(): Transform[Uint8ArrayList | js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform[Uint8ArrayList | js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
    inline def apply(options: EncoderOptions): Transform[Uint8ArrayList | js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transform[Uint8ArrayList | js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
    
    @JSImport("it-length-prefixed/encode", "encode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("it-length-prefixed/encode", "encode.single")
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
}
