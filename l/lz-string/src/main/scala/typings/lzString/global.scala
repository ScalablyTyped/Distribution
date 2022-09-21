package typings.lzString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object LZString {
    
    @JSGlobal("LZString")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compress(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def compressToBase64(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compressToBase64")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def compressToEncodedURIComponent(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compressToEncodedURIComponent")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def compressToUTF16(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compressToUTF16")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def compressToUint8Array(uncompressed: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("compressToUint8Array")(uncompressed.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def decompress(compressed: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(compressed.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def decompressFromBase64(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressFromBase64")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def decompressFromEncodedURIComponent(compressed: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressFromEncodedURIComponent")(compressed.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def decompressFromUTF16(compressed: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressFromUTF16")(compressed.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def decompressFromUint8Array(compressed: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressFromUint8Array")(compressed.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
