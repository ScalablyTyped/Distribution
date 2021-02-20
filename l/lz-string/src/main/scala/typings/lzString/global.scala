package typings.lzString

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object LZString {
    
    @JSGlobal("LZString.compress")
    @js.native
    def compress(input: String): String = js.native
    
    @JSGlobal("LZString.compressToBase64")
    @js.native
    def compressToBase64(input: String): String = js.native
    
    @JSGlobal("LZString.compressToEncodedURIComponent")
    @js.native
    def compressToEncodedURIComponent(input: String): String = js.native
    
    @JSGlobal("LZString.compressToUTF16")
    @js.native
    def compressToUTF16(input: String): String = js.native
    
    @JSGlobal("LZString.compressToUint8Array")
    @js.native
    def compressToUint8Array(uncompressed: String): Uint8Array = js.native
    
    @JSGlobal("LZString.decompress")
    @js.native
    def decompress(compressed: String): String = js.native
    
    @JSGlobal("LZString.decompressFromBase64")
    @js.native
    def decompressFromBase64(input: String): String = js.native
    
    @JSGlobal("LZString.decompressFromEncodedURIComponent")
    @js.native
    def decompressFromEncodedURIComponent(compressed: String): String = js.native
    
    @JSGlobal("LZString.decompressFromUTF16")
    @js.native
    def decompressFromUTF16(compressed: String): String = js.native
    
    @JSGlobal("LZString.decompressFromUint8Array")
    @js.native
    def decompressFromUint8Array(compressed: Uint8Array): String = js.native
  }
}
