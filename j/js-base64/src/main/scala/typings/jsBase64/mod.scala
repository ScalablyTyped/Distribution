package typings.jsBase64

import typings.jsBase64.mod.global.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Base64 extends StObject {
    
    var VERSION: String = js.native
    
    def atob(base64: String): String = js.native
    
    def btoa(s: String): String = js.native
    
    def btou(s: String): String = js.native
    
    def decode(base64: String): String = js.native
    
    def encode(s: String): String = js.native
    def encode(s: String, uriSafe: Boolean): String = js.native
    
    def encodeURI(s: String): String = js.native
    
    def encodeURL(s: String): String = js.native
    @JSName("encodeURL")
    var encodeURL_Original: js.Function1[/* s */ String, String] = js.native
    
    def extendBuiltins(): Unit = js.native
    
    def extendString(): Unit = js.native
    
    def extendUint8Array(): Unit = js.native
    
    def fromBase64(base64: String): String = js.native
    
    def fromUint8Array(uint8Array: Uint8Array): String = js.native
    def fromUint8Array(uint8Array: Uint8Array, uriSafe: Boolean): String = js.native
    
    def toBase64(s: String): String = js.native
    def toBase64(s: String, uriSafe: Boolean): String = js.native
    
    def toUint8Array(s: String): Uint8Array = js.native
    
    def utob(s: String): String = js.native
  }
  @JSImport("js-base64", "Base64")
  @js.native
  val Base64: typings.jsBase64.mod.Base64 = js.native
  
  @JSImport("js-base64", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  @JSImport("js-base64", "atob")
  @js.native
  val atob: js.Function1[/* base64 */ String, String] = js.native
  
  @JSImport("js-base64", "btoa")
  @js.native
  val btoa: js.Function1[/* s */ String, String] = js.native
  
  @JSImport("js-base64", "btou")
  @js.native
  val btou: js.Function1[/* s */ String, String] = js.native
  
  @JSImport("js-base64", "decode")
  @js.native
  val decode: js.Function1[/* base64 */ String, String] = js.native
  
  @JSImport("js-base64", "encode")
  @js.native
  val encode: js.Function2[/* s */ String, /* uriSafe */ js.UndefOr[Boolean], String] = js.native
  
  @JSImport("js-base64", "encodeURI")
  @js.native
  val encodeURI: js.Function1[/* s */ String, String] = js.native
  
  @JSImport("js-base64", "encodeURL")
  @js.native
  val encodeURL: /* import warning: importer.ImportType#apply Failed type conversion: js-base64.js-base64.Base64['encodeURI'] */ js.Any = js.native
  
  @JSImport("js-base64", "extendBuiltins")
  @js.native
  val extendBuiltins: js.Function0[Unit] = js.native
  
  @JSImport("js-base64", "extendString")
  @js.native
  val extendString: js.Function0[Unit] = js.native
  
  @JSImport("js-base64", "extendUint8Array")
  @js.native
  val extendUint8Array: js.Function0[Unit] = js.native
  
  @JSImport("js-base64", "fromBase64")
  @js.native
  val fromBase64: js.Function1[/* base64 */ String, String] = js.native
  
  @JSImport("js-base64", "fromUint8Array")
  @js.native
  val fromUint8Array: js.Function2[/* uint8Array */ Uint8Array, /* uriSafe */ js.UndefOr[Boolean], String] = js.native
  
  inline def noConflict(): typings.jsBase64.mod.Base64 = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[typings.jsBase64.mod.Base64]
  
  @JSImport("js-base64", "toBase64")
  @js.native
  val toBase64: js.Function2[/* s */ String, /* uriSafe */ js.UndefOr[Boolean], String] = js.native
  
  @JSImport("js-base64", "toUint8Array")
  @js.native
  val toUint8Array: js.Function1[/* s */ String, Uint8Array] = js.native
  
  @JSImport("js-base64", "utob")
  @js.native
  val utob: js.Function1[/* s */ String, String] = js.native
  
  object global {
    
    @js.native
    trait String extends StObject {
      
      def fromBase64(): java.lang.String = js.native
      
      def toBase64(): java.lang.String = js.native
      def toBase64(uriSafe: Boolean): java.lang.String = js.native
      
      def toBase64URI(): java.lang.String = js.native
      
      def toBase64URL(): java.lang.String = js.native
      
      def toUint8Array(): Uint8Array = js.native
    }
    
    @js.native
    trait Uint8Array extends StObject {
      
      def toBase64(): java.lang.String = js.native
      def toBase64(uriSafe: Boolean): java.lang.String = js.native
      
      def toBase64URI(): java.lang.String = js.native
      
      def toBase64URL(): java.lang.String = js.native
    }
  }
}
